package steps;

import cucumber.api.java.Before;
import utils.SeleniumDriver;

public class BeforeAction {

	@Before
	public static void setUp() {
		SeleniumDriver.setUpDriver();
	}
}
