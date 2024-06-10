package com.appium.testcases;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class BasicInteractions {

	//public static AppiumDriver driver;
	public static AndroidDriver<AndroidElement> driver;
	
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
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
		Thread.sleep(5000);
		
		// To navigate back to the app
		driver.pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		Thread.sleep(3000);
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc='Media']")).click();
		driver.pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		Thread.sleep(3000);
		AndroidElement OSElement = driver.findElementByAccessibilityId("OS");
		OSElement.click();
		Thread.sleep(3000);
		AndroidElement SMSReceipient = driver.findElementByAccessibilityId("SMS Messaging");
		SMSReceipient.click();
		Thread.sleep(3000);
		AndroidElement smsmessage = driver.findElementById("io.appium.android.apis:id/sms_recipient");
		smsmessage.sendKeys("Geetha");
		Thread.sleep(3000);
		driver.pressKey(new KeyEvent(AndroidKey.SPACE));
		driver.pressKey(new KeyEvent(AndroidKey.A));
		
		//To hide the keyborad opened
		driver.hideKeyboard();
		driver.quit();
		System.out.println("Execution completed");
	}

}
