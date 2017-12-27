/* package com.appium.iPhone;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class AndrooidSampleTest {
	@Test
	public void EmulatorTest() throws Exception {
		DesiredCapabilities capabilities=new DesiredCapabilities();
		capabilities.setCapability("automationName", "uiautomator2");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion","8.0");
		capabilities.setCapability("deviceName","Android Emulator");
		capabilities.setCapability("app","/Users/vkamaraju/Desktop/android-debug.apk");
		capabilities.setCapability("appPackage","io.ionic.starter");
		capabilities.setCapability("appActivity","io.ionic.starter.MainActivity");
		AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
		//AndroidDriver driver=new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"),capabilities);
		Thread.sleep(5000);
		driver.quit();
	}
}*/
package com.appium.iPhone;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;


public class AndrooidSampleTest {
	
	//AppiumDriver<MobileElement> driver;
	AndroidDriver <MobileElement> driver;
	@Before
	public void setUp()
	{
		DesiredCapabilities capabilities=new DesiredCapabilities();
		capabilities.setCapability("automationName", "uiautomator2");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion","8.0");
		//capabilities.setCapability("platformVersion","7.1.1");
		//capabilities.setCapability("platformVersion","7.0");
		capabilities.setCapability("deviceName","Android Emulator");	
		capabilities.setCapability("APPIUM_VERSION", "1.7.1");
		capabilities.setCapability("browserName","");	
		capabilities.setCapability("chromedriverExecutable", "/usr/local/bin/chromedriver2");
		capabilities.setCapability("app","/Users/vkamaraju/Desktop/android-debug.apk");
		capabilities.setCapability("appPackage","io.ionic.starter");
		capabilities.setCapability("appActivity","io.ionic.starter.MainActivity");
		
		try {
		  //driver= new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
		   driver= new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//System.out.println("Session is created");
	}
	@Test
	public void getWebView()
	{
		try {
			
		switchContext();	
		driver.findElementByXPath("//div[2]/div/div[1]/div[2]/ion-searchbar/div/input").click();
		driver.findElementByXPath("//div[2]/div/div[1]/div/ion-searchbar/div/input").sendKeys("TYLENOL");
		
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}
		
	}
	
	public void switchContext()
	{
		//System.out.println("Before Switching : "+driver.getContext());
		Set<String> con = driver.getContextHandles();
		for(String c : con)
		{
			//System.out.println("Available Context : "+c);
			if(c.contains("WEBVIEW"))
			{
				driver.context(c);
				break;
			}
		}
	}
	@After
	public void tearDown()
	{
		driver.quit();
	}

}



