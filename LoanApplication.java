package functionalTests;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.Dimension;
import org.testng.annotations.Test;

public class LoanApplication extends Login {
	Elements elements = new Elements();

	// (dependsOnMethods = { "login()" })
	@Test(dependsOnGroups = { "Login.login" }, groups = { "BankDetails.EnterBankDetails" })
	public void EnterBankDetails() throws InterruptedException {
		// TODO Auto-generated method stub

		// Configure Logger
		Logger logger = Logger.getLogger("BankDetails");
		PropertyConfigurator
				.configure("/Users/olukunle/Documents/workspace/Paylater/log4j.properties");

		Thread.sleep(100L);

		// BANK DETAILS

		// Check if BVN exists
		try {
			String userBVN = GetTextXpath(elements.getBVNXpath());
			logger.info("BVN is: " + userBVN);
		}

		catch (Exception e) {
			logger.info("entering new BVN");
		}

		// Enter BVN
		// if (driver.findElements(By.xpath(elements.getBVNXpath())).size() < 1)
		// {
		try {
			SendKeysXpath(elements.getBVNXpath(), elements.getBVN());
			logger.info("no BVN displayed, entering new BVN...");
		} catch (Exception e) {
			logger.error("Unable to enter BVN");
		}
		// }

		// List banks
		try {
			ClickXpath(elements.getBanksXpath());
			logger.info("Banks listed");
		} catch (Exception e) {
			logger.error("Unable to list banks");
		}
		Thread.sleep(2000L);

		// Select a bank
		try {
			ClickXpath(elements.getBankXpath());
			// String selectedBank = GetTextXpath(elements.getBankXpath());
			logger.info("bank selected");
		} catch (Exception e) {
			logger.error("Unable to select bank");
		}
		// Thread.sleep(1000L);

		// Enter Account Name
		try {
			SendKeysXpath(elements.getAccountNameXpath(), "Kunle Oduwobi");
			logger.info("Account name entered");
		} catch (Exception e) {
			logger.error("Unable to enter account name");
		}

		// Enter Account Number
		try {
			SendKeysXpath(elements.getAccountNumberXpath(), "0074135562");
			logger.info("Account number entered");
		} catch (Exception e) {
			logger.error("Unable to enter account bumber");
		}

		// Submit Bank Details
		try {
			ClickXpath(elements.getNextBtnXpath());
			;
			logger.info("Bank Details Submitted");
		} catch (Exception e) {
			logger.error("Unable to submit Bank Details");
		}
		Thread.sleep(1000L);

		// APPLY FOR LOAN
		// Check if Step1 button exists
		try {
			String step1Btn = GetTextXpath(elements.getStep1Xpath());
			logger.info(step1Btn + " found");
		}

		catch (Exception e) {
			logger.error("Personal Information button not found");
		}

		// Click Step1 button
		try {
			ClickXpath(elements.getStep1Xpath());
			logger.info("Personal Information button clicked");
		} catch (Exception e) {
			logger.error("Unable to click Personal Information button");
		}
		Thread.sleep(1000L);

		// PERSONAL INFORMATION
		// Enter First Name
		try {
			SendKeysXpath(elements.getFirstNameXpath(), elements.getFisrtName());
			logger.info("First Name entered");
		} catch (Exception e) {
			logger.error("Unable to enter First Name");
		}

		// Enter Last Name
		try {
			SendKeysXpath(elements.getLastNameXpath(), elements.getLastName());
			logger.info("Last Name entered");
		} catch (Exception e) {
			logger.error("Unable to enter Last Name");
		}

		// Open Date of Birth Calender
		try {
			ClickXpath(elements.getDoBXpath());
			logger.info("Calender opened");
		} catch (Exception e) {
			logger.error("Unable to open calender");
		}

		// List year
		try {
			ClickXpath(elements.getYearListXpath());
			logger.info("Year listed");
		} catch (Exception e) {
			logger.error("Unable to list year");
		}

		// Select Year
		try {
			ScrollAndClick("1992");
			logger.info("a year selected");
		} catch (Exception e) {
			logger.error("Unable to select a year");
		}
		// getDriver().findElement(By.name("1994")).click();

		// Select Date
		try {
			// getDriver().findElement(By.name("01 August 1992")).click();
			ClickXpath(elements.getDateXpath());
			logger.info("Date selected");

		} catch (Exception e) {
			logger.error("Unable to select a date");
		}

		// Click OK to submit DoB
		try {
			ClickXpath(elements.getCalenderSubmit());
			logger.info("DoB submitted");
		} catch (Exception e) {
			logger.error("Unable to submit DoB");
		}

		// Select Gender
		try {
			ClickXpath(elements.getMaleGender());
			logger.info("Male gender selected");
		} catch (Exception e) {
			logger.error("Unable to select gender");
		}

		// Scroll
		try {
			Thread.sleep(1000);
			ScrollDown(0.10);
			logger.info("Page swiped");
		} catch (Exception e) {
			logger.error("Unable to swipe page");
		}

		// Enter phone number
		try {
			Thread.sleep(3000);
			SendKeysXpath(elements.getPhoneNumberXpath(),
					elements.getPhoneNumber());
			logger.info("Phone number entered");
		} catch (Exception e) {
			logger.error("Unable to enter phone number");
		}

		// Enter email
		try {
			SendKeysXpath(elements.getEmailXpath(), elements.getEmail());
			logger.info("Email entered");
		} catch (Exception e) {
			logger.error("Unable to enter email");
		}

		// List Marital status
		try {
			ClickXpath(elements.getMaritalStatusList());
			logger.info("Marital status listed");
		} catch (Exception e) {
			logger.error("Unable to list marital status");
		}

		// Select Marital Status
		try {
			ClickXpath(elements.getSingle());
			logger.info("Single marital status selected");
		} catch (Exception e) {
			logger.error("Unable to select Marital status");
		}

		// List Number of Children
		try {
			ClickXpath(elements.getChildrenList());
			logger.info("Children listed");
		} catch (Exception e) {
			logger.error("Unable to list number of children");
		}

		// Select number of children
		try {
			ClickXpath(elements.getNumberOfChildren());
			logger.info("No child selected");
		} catch (Exception e) {
			logger.error("Unable to select number of children");
		}

		// Enter Mother's maiden name
		try {
			SendKeysXpath(elements.getMotherMaidenNameXpath(),
					elements.getMotherMaidenName());
			logger.info("Mother maiden name entered");
		} catch (Exception e) {
			logger.error("Unable to enter Mother's maiden name");
		}

		// Click Next Button
		try {
			ClickXpath(elements.getNext());
			logger.info("Next button clicked");
		} catch (Exception e) {
			logger.error("Unable to click Next button");
			Thread.sleep(2000);
		}

		// PERSONAL INFORMATION
//		List level of Education
		try{
			ClickXpath(elements.getEducationXpath());
			logger.info("Level of Education listed");
		}
		catch (Exception e){
			logger.error("Unable to list Level of Education");
		}
		
//		Select Level of Education
		try{
//			ClickXpath(elements.getEducation());
			ScrollAndClick("University");
			logger.info("level of Education selected");
		}
		catch (Exception e){
			logger.error("Unable to select Level of Education");
		}	
		
//		List Employment Status
		try{
			ClickXpath(elements.getEmploymentXpath());
			logger.info("Employment Status listed");
		}
		catch (Exception e){
			logger.error("Unable to list Employment Status");
		}
		
//		Select Employment Status
		try{
			ScrollAndClick("Student");
			logger.info("Employment status selected");
		}
		catch (Exception e){
			logger.error("Unable to select employment status");
		}
		
//		Source of Income
		try{
			SendKeysXpath(elements.getIncomeXpath(), elements.getIncome());
			logger.info("Source of income entered");
		}
		catch (Exception e){
			logger.error("Unable to enter source of income");
		}
		
//		Submit Page
		try{
			ClickXpath(elements.getNext());
			logger.info("Page submitted");
		}
		catch (Exception e){
			logger.error("Unable to click Next button");
		}
		
		
		
		
//		ADDRESS INFORMATION
		/** 
		wd.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.LinearLayout[2]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.Spinner[1]/android.widget.TextView[1]")).click();
		wd.findElement(By.xpath("//android.widget.ListView[1]/android.widget.CheckedTextView[3]")).click();
		wd.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.LinearLayout[2]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.LinearLayout[1]/android.widget.Spinner[1]/android.widget.TextView[1]")).click();
		wd.findElement(By.xpath("//android.widget.ListView[1]/android.widget.CheckedTextView[5]")).click();
		wd.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.LinearLayout[2]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.LinearLayout[1]/android.widget.Spinner[2]/android.widget.TextView[1]")).click();
		wd.findElement(By.xpath("//android.widget.ListView[1]/android.widget.CheckedTextView[5]")).click();
		wd.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.LinearLayout[2]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.Spinner[2]/android.widget.TextView[1]")).click();
		wd.findElement(By.xpath("//android.widget.ListView[1]/android.widget.CheckedTextView[5]")).click();
		wd.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.LinearLayout[2]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.Spinner[3]/android.widget.TextView[1]")).click();
		wd.findElement(By.xpath("//android.widget.ListView[1]/android.widget.CheckedTextView[7]")).click();
		wd.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.LinearLayout[2]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.LinearLayout[2]/android.widget.EditText[1]")).sendKeys("23 Jacob's Street");
		wd.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.LinearLayout[2]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.LinearLayout[3]/android.widget.EditText[1]")).sendKeys("GRA");
		wd.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.LinearLayout[2]/android.widget.LinearLayout[1]/android.widget.Button[2]")).click();
		*/
	}
}

