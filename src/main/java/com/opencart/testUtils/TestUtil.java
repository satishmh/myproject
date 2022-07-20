package com.opencart.testUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.basepackage.BaseClass;
import com.basepackage.PageObjectModule;

public class TestUtil extends PageObjectModule{

	boolean status=true;
	
	public boolean validateLaunch(WebDriver driver, By ele) {
		driver.get("https://www.opencart.com/");	
		boolean status=driver.findElement(LOGO).isDisplayed();
		if(status) {
			System.out.println("Website is launched successfully");
		}else {
			System.out.println("Unable to lanch website");
		}
		return status;
	}
	
}
