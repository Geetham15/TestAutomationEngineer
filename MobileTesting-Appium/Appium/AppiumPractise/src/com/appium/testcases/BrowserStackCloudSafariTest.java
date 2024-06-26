package com.appium.testcases;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class BrowserStackCloudSafariTest {
	
	public WebDriver driver;
	public static String USERNAME="geetha_xl37yk";
	public static String AUTOMATE_KEY="Tc5WsqMJcayv3k8sc134";
	public static String URL = "https://"+USERNAME+":"+AUTOMATE_KEY+"@hub-cloud.browserstack.com/wd/hub";
	
	@Test
	public void CloudTestcase() throws MalformedURLException, InterruptedException {
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("browser", "safari");
		caps.setCapability("os_version", "16");
		caps.setCapability("device", "iPhone 14 Pro");
		
		//Set name for our Test
		
		caps.setCapability("name", "Cloud Safari Test");
		
		
		//Set the remote driver details
		
		driver = new RemoteWebDriver(new java.net.URL(URL),caps);
		
		driver.get("https://www.amazon.in/");
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		WebElement searchBox = driver.findElement(By.xpath("//input[@name='k']"));
		
		searchBox.sendKeys("Shirts");
		
		WebElement SearchIcon = driver.findElement(By.xpath("//input[@class='nav-input']"));
		SearchIcon.click();
		
		Thread.sleep(6000);
		
		driver.quit();

		
	}
}
