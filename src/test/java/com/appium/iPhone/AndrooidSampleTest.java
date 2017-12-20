package com.appium.iPhone;

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
	}
}
