package quiz;
import java.util.Random;

public class QuizApplication {

	public static void main(String[] args) {
		Random r = new Random();
		int counter = 1;
		while(true) {
			String prefix = String.valueOf(counter++);
			prefix += ": ";
			int i = r.nextInt(2);
			UserInterface ui = new SwingInterface();
			UserInterface ui2 = new PrefixInterfaceWrapper(new LogInterfaceWrapper(ui, new SystemOutLogger()), prefix);
			Question[] questions = new Question[] {
					new MainConcept(ui2),
					new GuessNumber(ui2)
			};
			questions[i].askQuestion();
		}
	}
}