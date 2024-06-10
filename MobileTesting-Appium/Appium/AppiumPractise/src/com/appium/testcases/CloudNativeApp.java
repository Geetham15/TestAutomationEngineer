package com.appium.testcases;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import java.net.*;
public class CloudNativeApp {
	
	@Test
	
	public void OpenAPKFile() throws MalformedURLException, InterruptedException
	{
		DesiredCapabilities caps = new DesiredCapabilities();
		
		//Passing the BS detaisl as caps
		
		caps.setCapability("browserstack.user", "geetha_xl37yk");
		caps.setCapability("browserstack.key", "Tc5WsqMJcayv3k8sc134");
		
		caps.setCapability("os_version", "14.0");
		caps.setCapability("device", "Google Pixel 8");
		
		//Set the apk to be launched
		
		caps.setCapability("app","bs://dceec6bf5e6358d2b0ff4a5f1243dc0e12a35b72");
		
		caps.setCapability("name", "Appium Test");
		
		AndroidDriver<AndroidElement> driver;
		
		driver = new AndroidDriver<AndroidElement> (new URL("https://hub.browserstack.com/wd/hub"),caps);
		
		
		driver.findElementByAccessibilityId("Graphics").click();
		
		Thread.sleep(5000);
		
		driver.quit();
		
	}
}
