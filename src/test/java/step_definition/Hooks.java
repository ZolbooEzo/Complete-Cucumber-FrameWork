package step_definition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import util.BaseClass;
import util.CommonMethods;

public class Hooks {

	@Before
	public void start() {
		BaseClass.getDriver();
	}

	@After
	public void end(Scenario scenario) {
		byte[] pic;
		if (scenario.isFailed()) {
			pic = CommonMethods.takeScreenshot("failed/" + scenario.getName());
		} else {
			pic = CommonMethods.takeScreenshot("passed/" + scenario.getName());
		}

		scenario.attach(pic, "image/png", scenario.getName());
		BaseClass.closeDriver();
	}
}
