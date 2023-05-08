package quiz;
import java.util.Scanner;

public class ConsoleInterface implements UserInterface {
	private Scanner s;
	
	public ConsoleInterface() {
		s = new Scanner(System.in);
	}

	/**
	 * @pre | msg != null
	 */
	@Override
	public String askInput(String msg) {
		System.out.println(msg);
		return s.nextLine();
	}

	@Override
	public void showMessage(String msg) {
		System.out.println(msg);
	}

}
