package quiz;
public class MainConcept implements Question {
	private UserInterface ui;
	
	public MainConcept(UserInterface ui) {
		this.ui = ui;
	}
	
	@Override
	public void askQuestion() {
		while(true) {
			String answer = ui.askInput("Wat is het belangrijkste idee in het vak Objectgericht Programmeren?");
			if(answer == null) return;
			switch(answer.toLowerCase()) {
			case "modulair programmeren":
				ui.showMessage("Goed zo!");
				return;
			default: 
				ui.showMessage("Helaas, probeer nog eens...");
				break;
			}
		}
	}

}
