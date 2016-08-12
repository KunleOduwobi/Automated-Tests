package funtionalTests;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Login extends SetUp{
	
	Elements elements = new Elements();

	@Test
	public void login() throws InterruptedException{
		
		// Configure Logger
				Logger logger = Logger.getLogger("Login");
				PropertyConfigurator
						.configure("/Users/olukunle/Documents/workspace/Paylater/log4j.properties");

				// Login with Facebook
				try {
					driver.findElement(By.id(elements.getFacebookBtnId())).click();
					logger.info("Facebook button clicked");
					Thread.sleep(15000L);
				} catch (Exception e) {
					logger.error("Unable to click Facebook button");
				}

				// Set PIN
				try{
				driver.findElement(By.xpath(elements.getPIN1Xpath())).click();
				driver.findElement(By.xpath(elements.getPIN2Xpath())).click();
				driver.findElement(By.xpath(elements.getPIN3Xpath())).click();
				driver.findElement(By.xpath(elements.getPIN4Xpath())).click();
				
				logger.info("PIN set");
				}
				catch (Exception e){
					logger.error("Unable to set PIN");
				}

				Thread.sleep(2000L);
	
//	Confirm PIN
//	driver.findElement(
//			By.xpath(elements.getPIN1Xpath()))
//			.click();
//	driver.findElement(
//			By.xpath(elements.getPIN2Xpath()))
//			.click();
//	driver.findElement(
//			By.xpath(elements.getPIN3Xpath()))
//			.click();
//	driver.findElement(
//			By.xpath(elements.getPIN4Xpath()))
//			.click();

	Thread.sleep(2000L);
	

	}

}
