package com.login.testscenarios;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.annotations.*;

import com.basepackage.BaseClass;
import com.github.dockerjava.api.model.Driver;
import com.opencart.testUtils.TestUtil;

public class LoginTest extends BaseClass {
	TestUtil testUtil=new TestUtil();
	boolean status;
	
	@Test
	public void loginTest() {
		status=testUtil.validateLaunch(driver, testUtil.LOGO);
	}
	
	
}
