package functionalTests;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.thoughtworks.selenium.webdriven.commands.GetBodyText;

public class BankDetails extends Helper {
	Elements elements = new Elements();

	
//	(dependsOnMethods = { "login()" })
	@Test
	public void EnterBankDetails() throws InterruptedException {
		// TODO Auto-generated method stub

		// Configure Logger
		Logger logger = Logger.getLogger("Login");
		PropertyConfigurator
				.configure("/Users/olukunle/Documents/workspace/Paylater/log4j.properties");

		// Enter BVN
		Thread.sleep(3000L);

		// Enter BVN
		try {
			SendKeysXpath(elements.getBVNXpath(), elements.getBVN());
			logger.info("BVN entered");
		} catch (Exception e) {
			logger.error("Unable to enter BVN");
		}

		// // driver.findElement(
		// // By.id(elements.getBVNId())).sendKeys("20160514520");
		// // List banks
		// try{
		// // driver.findElement(By.xpath(elements.getBanksXpath())).click();
		// driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.LinearLayout[2]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.Spinner[1]/android.widget.TextView[1]")).click();
		//
		// }
		// catch (Exception e) {
		// System.out.println("Unable to click Banks list");
		// }
		// Thread.sleep(5000L);
		//
		// // driver.findElement(
		// // By.id(elements.getBanksId())).click();
		//
		// // Select a bank
		// try{
		// // driver.findElement(
		// // By.name(elements.getBankText())).click();
		// driver.findElement(By.xpath("//android.widget.ListView[1]/android.widget.CheckedTextView[4]")).click();
		//
		// }
		// catch (Exception e) {
		// System.out.println("Unable to click a bank");
		// }
		//
		// // Enter Account Name
		// try{
		// // driver.findElement(
		// // By.id(elements.getAccountNameId())).sendKeys("Kunle Oduwobi");
		// driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.LinearLayout[2]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.EditText[1]")).sendKeys("Kunle Oduwobi");
		//
		// }
		// catch (Exception e) {
		// System.out.println("Unable to enter account name");
		// }
		//
		// // Enter Account Number
		// try{
		// driver.findElement(
		// By.id(elements.getAccountNumberId())).sendKeys("1452000000");
		// }
		// catch (Exception e) {
		// System.out.println("Unable to enter account number");
		// }
		//
		// // Click Next
		// try{
		// driver.findElement(
		// By.id(elements.getNextBtnId())).click();
		// }
		// catch (Exception e) {
		// System.out.println("Unable to click Next button");
		// }
		//

	}

}

// wd.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.LinearLayout[2]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.Spinner[1]/android.widget.TextView[1]")).click();
// wd.findElement(By.xpath("//android.widget.ListView[1]/android.widget.CheckedTextView[4]")).click();
// wd.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.LinearLayout[2]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.EditText[1]")).sendKeys("Kunle Oduwobi");
// wd.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.LinearLayout[2]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[3]/android.widget.EditText[1]")).sendKeys("1452000000");