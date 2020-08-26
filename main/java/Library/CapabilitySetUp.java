package Library;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.google.common.collect.ImmutableMap;
import com.prolifics.ProlificsSeleniumAPI;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class CapabilitySetUp {
	private AndroidDriver<WebElement> driver;
	
	public AndroidDriver<WebElement> SetMobileCaps(ProlificsSeleniumAPI oPSelFW) throws Exception
	{

	String driversPath = System.getProperty("user.dir") + File.separator + "Resources" + File.separator;
	String chromeDriverPath = driversPath + "chromedriver.exe";
	DesiredCapabilities caps = new DesiredCapabilities();
	caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	caps.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
	caps.setCapability("chromedriverExecutable", chromeDriverPath);
	caps.setCapability("appium:chromeOptions", ImmutableMap.of("w3c", false));
	caps.setCapability(MobileCapabilityType.UDID, "emulator-5554");
	// Open URL in Chrome Browser
	driver = new AndroidDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
	//URL("http://0.0.0.0:4723/wd/hub")
	//http://localhost:4723/wd/hub
	oPSelFW.reportStepDetails("Launching Unata Web Application on Chrome Browser ", "Successfully launched Unata shop mobile web in qa environment", "Pass");
	
	oPSelFW.reportStepDetails("Mobile Capabilities should be set ", "Mobile Capabilities for Pixel XL set Successufully", "Pass");
	return driver;
	
	}
}
