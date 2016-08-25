package functionalTests;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SetUp {

	public static AndroidDriver driver;
	
	public static AndroidDriver getDriver() {
        return driver;
      }

//	 AppiumServer server = new AppiumServer();

	@BeforeTest
	// Launch app
	public void setUp() throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		File app = new File(
				"/Users/olukunle/Documents/workspace/PaylaterCopy/apps/paylater_v1.06b_staging.apk");
//		 server.startServer();

		DesiredCapabilities caps = new DesiredCapabilities();

		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME,
				MobilePlatform.ANDROID);
		caps.setCapability("platformVersion", "5.0");
		caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "100");
		// caps.setCapability(MobileCapabilityType.BROWSER_NAME, "chrome");
		caps.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());

		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),
				caps);

		// Configure Logger
		Logger logger = Logger.getLogger("SetUp");
		PropertyConfigurator
				.configure("/Users/olukunle/Documents/workspace/PaylaterCopy/log4j.properties");

		logger.info("App launched");

		// Get Log4j details
//		Package p = Layout.class.getPackage();
//		System.out.println(p);
//		System.out.println("Implementation title:   "
//				+ p.getImplementationTitle());
//		System.out.println("Implementation vendor:  "
//				+ p.getImplementationVendor());
//		System.out.println("Implementation version: "
//				+ p.getImplementationVersion());

		// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(3000L);
	}

	// // Close App
	// @AfterTest
	// public void shutDown() {
	// driver.quit();
	// // server.stopServer();
	//
	// }

}
