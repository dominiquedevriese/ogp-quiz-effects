package quiz;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * This unit test demonstrates how effect interfaces allow us to easily unit-test effectful programs.
 * We do so using a stub implementation of the UserInterface interface. 
 */
class MainConceptTest {
	MainConcept t;
	StubUserInterface ui;

	@BeforeEach
	void setUp() throws Exception {
		String[] inputs = new String [] {
				"objecten",
				"modulair programmeren"
		};
		ui = new StubUserInterface(inputs);
		t = new MainConcept(ui);
	}

	@Test
	void testInteraction1() {
		t.askQuestion();
		assertEquals(2,ui.getNumberOfOutput());
		assertEquals("Goed zo!", ui.getOutputs()[1]);
	}

}
