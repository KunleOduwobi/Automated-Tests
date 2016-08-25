package functionalTests;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.mustache.Value;

public class Login extends Helper {

	Elements elements = new Elements();

	// Helper helper = new Helper();

	@Test(groups = { "Login.login" })
	public void login() throws InterruptedException {

		// Configure Logger
		Logger logger = Logger.getLogger("Login.login");
		PropertyConfigurator
				.configure("/Users/olukunle/Documents/workspace/PaylaterCopy/log4j.properties");

		// Find Facebook button 
		try {
			String text = GetTextXpath(elements.getFacebookBtnXpath());
			logger.info(text + " found");
		}

		catch (Exception e) {
			logger.error("Facebook button not found");
		}

		// Login with Facebook
		try {
			ClickXpath(elements.getFacebookBtnXpath());
			logger.info("Facebook button clicked");
			Thread.sleep(10000L);
		} catch (Exception e) {
			logger.error("Unable to click Facebook button");
		}

		// Set PIN
		try {
			ClickXpath(elements.getPIN1Xpath());
			ClickXpath(elements.getPIN2Xpath());
			ClickXpath(elements.getPIN3Xpath());
			ClickXpath(elements.getPIN4Xpath());

			logger.info("PIN set");
		} catch (Exception e) {
			logger.error("Unable to set PIN");
		}

		Thread.sleep(1000L);

		// Confirm PIN
		if (getDriver().findElements(By.xpath(elements.getPINPageTitleXpath()))
				.size() != 0) {
			try {
				ClickXpath(elements.getPIN1Xpath());
				ClickXpath(elements.getPIN2Xpath());
				ClickXpath(elements.getPIN3Xpath());
				ClickXpath(elements.getPIN4Xpath());

				logger.info("PIN Confirmed");
			} catch (Exception e) {
				logger.error("Unable to confirm PIN");
			}

			Thread.sleep(5000L);
		}

		// Thread.sleep(2000L);

	}

}
