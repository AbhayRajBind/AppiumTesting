package com.mobileAndroide;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.remote.MobileCapabilityType;

public class MyMobile {
	
	
	public void launchMobileBrowser() throws MalformedURLException {
		DesiredCapabilities caps=new DesiredCapabilities();
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "");
		caps.setCapability(MobileCapabilityType.APP,"");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "");
		caps.setCapability(MobileCapabilityType.VERSION, "");
		caps.setCapability(MobileCapabilityType.UDID, "");
		
		URL ur=	new URL("http://127.0.0.1:4723/wd/hub");
		
	}

}
