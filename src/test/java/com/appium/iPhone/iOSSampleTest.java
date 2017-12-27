/* package com.appium.iPhone;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

public class iOSSampleTest {
	@Test
	public void simulatorTest() throws Exception {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("platformName", "iOS");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.2");
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 6");
		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);
		capabilities.setCapability(MobileCapabilityType.APPIUM_VERSION, "1.6.3");
		capabilities.setCapability(MobileCapabilityType.APP, "/Users/vkamaraju/Desktop/tippo3000.app");
		IOSDriver driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.className("XCUIElementTypeTextField")).clear();
		driver.findElement(By.className("XCUIElementTypeTextField")).sendKeys("100");
		driver.findElement(By.name("20%")).click();
		Thread.sleep(1000);
	}
	@After
	public void tearDown()
	{
		driver.quit();
	}
} */
package com.appium.iPhone;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

public class iOSSampleTest {
	
	IOSDriver <MobileElement> driver;
	@Test
	public void simulatorTest() throws Exception {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("platformName", "iOS");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.2");
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 6");
		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);
		capabilities.setCapability(MobileCapabilityType.APPIUM_VERSION, "1.7.1");
		capabilities.setCapability(MobileCapabilityType.APP, "/Users/vkamaraju/Desktop/tippo3000.app");
		driver = new IOSDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.className("XCUIElementTypeTextField")).clear();
		driver.findElement(By.className("XCUIElementTypeTextField")).sendKeys("100");
		driver.findElement(By.name("20%")).click();
		Thread.sleep(1000);
	}
	@After
	public void tearDown()
	{
		driver.quit();
	}
}

