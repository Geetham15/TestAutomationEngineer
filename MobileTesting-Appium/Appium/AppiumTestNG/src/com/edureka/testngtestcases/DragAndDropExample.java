package com.edureka.testngtestcases;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class DragAndDropExample {
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
	public void DragAndDropTest() throws InterruptedException {
		WebElement viewButton = driver.findElement(AppiumBy.accessibilityId("Views"));
		viewButton.click();
		
		WebElement dragAndDrop = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"Drag and Drop\"]"));
		dragAndDrop.click();
		
		WebElement dragFrom = driver.findElement(AppiumBy.id("io.appium.android.apis:id/drag_dot_1"));
		WebElement dropTo = driver.findElement(AppiumBy.id("io.appium.android.apis:id/drag_dot_2"));
		dragAndDrop(driver, dragFrom, dropTo);
		Thread.sleep(4000);
	}
	
	public static void dragAndDrop(AppiumDriver driver, WebElement DragFrom, WebElement DropTo) {
		Map<String, Object> args = new HashMap<>();
		args.put("elementid", ((RemoteWebElement)DragFrom).getId());
		args.put("endX", DropTo.getLocation().getX());
		args.put("endY", DropTo.getLocation().getY());
		((JavascriptExecutor)driver).executeScript("mobile: dragGesture",args);
	}
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
