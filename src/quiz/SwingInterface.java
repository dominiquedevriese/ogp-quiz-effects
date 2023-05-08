package quiz;

import javax.swing.JOptionPane;

public class SwingInterface implements UserInterface {

	/**
	 * @pre | msg != null
	 */
	@Override
	public String askInput(String msg) {
		if (msg == null)
			throw new IllegalArgumentException("msg null not allowedb");
		return JOptionPane.showInputDialog(null, msg, "");
	}

	@Override
	public void showMessage(String msg) {
		JOptionPane.showMessageDialog(null, msg);
	}

}
