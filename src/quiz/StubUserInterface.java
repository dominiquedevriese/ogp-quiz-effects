package quiz;

public class StubUserInterface implements UserInterface {
	private static int MAXOUTS = 10;
	private int inputcounter;
	private String[] inputs;
	private int outputcounter = 0;

	private String[] outputs;

	public StubUserInterface(String[] inputs) {
		outputs = new String[MAXOUTS];
		this.inputs = inputs.clone();
	}

	/**
	 * @pre | msg != null
	 */
	@Override
	public String askInput(String msg) {
		return inputs[inputcounter++];
	}

	public int getNumberOfOutput() {
		return outputcounter;
	}

	public String[] getOutputs() {
		return outputs.clone();
	}

	@Override
	public void showMessage(String msg) {
		outputs[outputcounter++] = msg;
	}
}
