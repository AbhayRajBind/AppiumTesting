package com.mobileAndroide;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class LaunchApplication {
	static AndroidDriver<MobileElement>driver;
	
	@BeforeSuite
	public void launchApp() throws MalformedURLException {
		
		DesiredCapabilities caps=	new DesiredCapabilities();
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		caps.setCapability(MobileCapabilityType.VERSION, "13");
		caps.setCapability(MobileCapabilityType.APP, "D:\\My APK\\app.apk");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "vivo Y20G");
		caps.setCapability(MobileCapabilityType.UDID, "9623264487000K6");
		   
	 
	URL ur=new URL("http://127.0.0.1:4723/wd/hub");
	
	driver=	new AndroidDriver<MobileElement>(ur,caps);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	}
	
	@Test
public void start() { 
	System.out.println("Mobile application successfully launched ");
	driver.findElement(By.id("com.trackninja:id/tvSignInWithEmail")).click();
	driver.findElement(By.id("com.trackninja:id/etWikiEmail")).sendKeys("abahyrajbind2802@gmail.com");
	driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.trackninja:id/etWikiPassword\"]")).sendKeys("Abhay@123");
	driver.findElement(By.id("com.trackninja:id/btnLogin")).click();
//	driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.trackninja:id/etSignUpEmail\"]")).sendKeys("abhayrajbind2802@gmail.com");
//	driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.trackninja:id/etSignUpPassword\"]")).sendKeys("Abhay@123");
//	driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.trackninja:id/etSignUpConfirmPassword\"]")).sendKeys("Abhay@123");
//	driver.findElement(By.id("com.trackninja:id/btnSignUp")).click();
//	
}

     @AfterSuite
	public void stopServer() {
		driver.close();
	}
}
