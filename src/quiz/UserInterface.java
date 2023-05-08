package quiz;

/**
 * A simple interface for user interaction.
 */
public interface UserInterface {
	/**
	 * @pre | msg != null
	 */
	public String askInput(String msg);
	public void showMessage(String msg);
}
