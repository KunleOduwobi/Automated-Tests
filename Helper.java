package functionalTests;

import io.appium.java_client.MobileElement;
import io.appium.java_client.SwipeElementDirection;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidKeyCode;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Helper extends SetUp {

	// public Helper() {
	//
	// }

	// WebDriver driver;

	// Helper test
	public void HelperTest() {
		System.out.println("Methods Helper Test Successful!");
	}

	// GET TEXT ATTRIBUTE
	// By Xpath
	public String GetTextXpath(String xpath) {
		return getDriver().findElement(By.xpath(xpath)).getAttribute("text");
	}

	// CLICK
	// By Id
	public void ClickId(String id) {
		getDriver().findElement(By.id(id)).click();
	}

	// By xpath
	public void ClickXpath(String xpathString) {
		getDriver().findElement(By.xpath(xpathString)).click();
	}

	// SEND KEYS
	public void SendKeysXpath(String xpath, String keys) {
		getDriver().findElement(By.xpath(xpath)).sendKeys(keys);
	}

	// SEND KEY EVENT
	// public void SendKeyEvent(){
	// getDriver().sendKeyEvent(AndroidKeyCode.HOME);
	// }

	// SCROLL TO
	public void ScrollAndClick(String location) {
		getDriver().scrollTo(location).click();
	}

	// SWIPE
	// Up
	public void SwipeUp(String location, int duration) {
		MobileElement abc = (MobileElement) driver.findElement(By
				.xpath(location));
		abc.swipe(SwipeElementDirection.UP, duration);
	}

	// Vertical Scroll
	public void ScrollDown(double d) {
		Dimension size = getDriver().manage().window().getSize();
		int y_start = (int) (size.height * 0.60);
		int y_end = (int) (size.height * d);
		int x = size.width / 2;
		getDriver().swipe(x, y_start, x, y_end, 4000);
	}

	// Left
	// appiumDriver.context("NATIVE_APP");
	// Dimension size = appiumDriver.manage().window().getSize();
	// int startx = (int) (size.width * 0.8);
	// int endx = (int) (size.width * 0.20);
	// int starty = size.height / 2;
	// appiumDriver.swipe(startx, starty, endx, starty, 1000);

	// Right
	// appiumDriver.context("NATIVE_APP");
	// Dimension size = appiumDriver.manage().window().getSize();
	// int endx = (int) (size.width * 0.8);
	// int startx = (int) (size.width * 0.20);
	// int starty = size.height / 2;
	// appiumDriver.swipe(startx, starty, endx, starty, 1000);

	// Vertical
	// public void verticalScroll()
	// {
	// Dimension size=driver.manage().window().getSize();
	// int y_start=(int)(size.height*0.60);
	// int y_end=(int)(size.height*0.30);
	// int x=size.width/2;
	// driver.swipe(x,y_start,x,y_end,4000);
	// }

	// TAP, ZOOM
	// MobileElement
	// abc=(MobileElement)driver.findElement(By.className("android.widget.CheckedTextView"));
	// abc.swipe(SwipeElementDirection.UP, 6000);
	// // abc.tap(left, duration);
	// abc.zoom();

	// Scroll
	// try {
	// WebElement element = getDriver().findElement(
	// By.xpath(elements.getMotherMaidenNameXpath()));
	// Actions actions = new Actions(getDriver());
	// actions.moveToElement(element);
	// // actions.click();
	// actions.perform();
	// logger.info("Page scrolled");
	// } catch (Exception e) {
	// logger.error("Unable to scroll page");
	// }

	// Scroll2
	// TouchAction action = new TouchAction(driver).longPress(20,20).moveTo(20,
	// 60).release();
	// action.perform();

}
