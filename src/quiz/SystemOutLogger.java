package quiz;

public class SystemOutLogger implements Logger {

	@Override
	public void logMessage(String msg) {
		System.out.println(msg);
	}

}
