package com.qa.demoshop.tests;

import org.testng.annotations.Test;

import com.qa.demoshop.base.BasePage;

public class LoginTestLaptop extends BasePage{

	@Test
	public void login()
	{
		login.clickOnLoginLink();
		login.clickOnLoginButton();
	}
	
	
	
}
