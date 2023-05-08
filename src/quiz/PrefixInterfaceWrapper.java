package quiz;

public class PrefixInterfaceWrapper implements UserInterface {
	private UserInterface ui;
	private String prefix;

	public PrefixInterfaceWrapper(UserInterface ui, String prefix) {
		this.ui = ui;
		this.prefix = prefix;
	}

	/**
	 * @pre | msg != null
	 */
	@Override
	public String askInput(String msg) {
		return ui.askInput(prefix + msg);
	}

	@Override
	public void showMessage(String msg) {
		ui.showMessage(prefix + msg);
	}

}