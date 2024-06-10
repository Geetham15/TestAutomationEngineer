package com.appium.testcases;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class CalculatorExample {

	public static AndroidDriver<AndroidElement> driver;

	@Test
	public void CalculatorTestcase() throws MalformedURLException, InterruptedException {

		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "emulator-5554");
		caps.setCapability("platformVersion", "9");
		caps.setCapability("platformName", "Android");
		caps.setCapability("automationName", "UiAutomator2");
		caps.setCapability("appPackage", "io.appium.android.apis");
		caps.setCapability("appActivity", "io.appium.android.apis.ApiDemos");

		driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), caps);
		Thread.sleep(6000);
		
		WebElement AccessibilityElement = driver.findElementByAccessibilityId("Accessibility");
		AccessibilityElement.click();

		driver.close();
		System.out.println("Execution Completed");
	}
}
