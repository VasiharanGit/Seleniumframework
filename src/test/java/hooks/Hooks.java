package hooks;

import org.openqa.selenium.OutputType;

import drivers.driverInstance;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import steps.SauceSteps;

public class Hooks{
	driverInstance driver=new driverInstance();
	@Before
	public void beforeScenario(Scenario scr) {
		String name=scr.getName();
		System.out.println("name"+name);
	}
	@After
    public void afterScenario(Scenario scr) {
//		boolean failed=scr.isFailed();
//		System.out.println("Status"+failed);
//		byte[] screenshotas=driverInstance.driver.getScreenshotAs(OutputType.BYTES);
//		scr.attach(screenshotas, "image/png", "Failure Screenshot");
		driverInstance.driver.quit();
	}

}
