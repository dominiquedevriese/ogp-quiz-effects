package quiz;

import java.util.Random;

public class GuessNumber implements Question {
	UserInterface ui;

	public GuessNumber(UserInterface ui) {
		this.ui = ui;
	}

	@Override
	public void askQuestion() {
		Random r = new Random();
		int x = r.nextInt(9) + 1;
		while (true) {
			String antwoord = ui.askInput("Ik denk aan een getal tussen 1 en 10. Welk is het?");
			if (antwoord == null)
				return;
			int mx = Integer.parseInt(antwoord);
			if (mx == x) {
				ui.showMessage("Juist!");
				return;
			} else if (mx > x) {
				ui.showMessage("Lager...");
			} else {
				ui.showMessage("Hoger...");
			}
		}
	}

}
