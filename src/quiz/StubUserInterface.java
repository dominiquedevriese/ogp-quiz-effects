package quiz;

public class StubUserInterface implements UserInterface {
	private String[] inputs;
	private int inputcounter;
	private String[] outputs;
	private int outputcounter = 0;

	private static int MAXOUTS = 10;
	
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

	@Override
	public void showMessage(String msg) {
		outputs[outputcounter++] = msg;
	}
	
	public String[] getOutputs() {
		return outputs.clone();
	}
	
	public int getNumberOfOutput() {
		return outputcounter;
	}
}
