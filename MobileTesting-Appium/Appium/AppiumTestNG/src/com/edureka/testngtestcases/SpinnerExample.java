package com.edureka.testngtestcases;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class SpinnerExample {
public static AppiumDriver driver;
	
	@BeforeClass
	@Parameters({"DeviceName", "PackageName"})
	public void OpenApp(String deviceName, String packageName) throws MalformedURLException, InterruptedException {
		UiAutomator2Options options = new UiAutomator2Options()
				.setPlatformName("Android")
				.setDeviceName(deviceName)
				.setAppPackage(packageName)
				.setAppActivity("io.appium.android.apis.ApiDemos");
		
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723"),options);
	
		Thread.sleep(5000);
	}
	
	@Test
	public void spinnerHandle() {
		WebElement viewButton = driver.findElement(AppiumBy.accessibilityId("Views"));
		viewButton.click();
		
		
	}
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
