
package quiz;

public class LogInterfaceWrapper implements UserInterface {
	private Logger log;
	private UserInterface ui;

	public LogInterfaceWrapper(UserInterface ui, Logger log) {
		this.ui = ui;
		this.log = log;
	}

	/**
	 * @pre | msg != null
	 */
	@Override
	public String askInput(String msg) {
		log.logMessage("Input asked: '" + msg + "'");
		return ui.askInput(msg);
	}

	@Override
	public void showMessage(String msg) {
		log.logMessage("Message shown: '" + msg + "'");
		ui.showMessage(msg);
	}

}
