package com.qa.demoshop.tests;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.demoshop.base.BasePage;
import com.qa.demoshop.dataproviders.RegisterDataProvider;
import com.qa.demoshop.utilities.FakeDataGenerator;

public class RegisterTest extends BasePage{
	
	
	@Test(priority=0)
	
	public void verifyRegisterPage()
	{
		home.clickRegisterLink();
		Assert.assertEquals(register.getRegisterHeader(), "Register");
		System.out.println("Verified Register Page");
	//Assert.assertEquals(false, true);
	}
	
	@Test(priority=1)
	public void registerShopper()
	{
		String randomEmail="varun"+RandomStringUtils.randomAlphanumeric(5)+"@gmail.com";
		home.clickRegisterLink();
		register.registerUser("FEMALE","admin", "adminer", randomEmail, "admin@88", "admin@88");
		Assert.assertEquals(register.getSuccessMsg(), "Your registration completed");
		System.out.println(register.getSuccessMsg());
		
	}
	
	@Test(priority=3,dataProvider="registerdata",dataProviderClass=RegisterDataProvider.class,enabled=false)
	public void registerMultipleShopper(String gender,String fn,String ln,String email,String pass,String cpass)
	{
		home.clickRegisterLink();
		register.registerUser(gender,fn,ln,email,pass,cpass);
		Assert.assertEquals(register.getSuccessMsg(), "Your registration completed");
		System.out.println(register.getSuccessMsg());
	}
	
	@Test(enabled=false)
	public void mouseHoveringOnComputer() throws InterruptedException
	{
		//example to perform MouseHoveringActions
		home.performMouseHoveringOnComputer();
		Thread.sleep(2000);
	}
	@Test(enabled=false)
	public void generateFakeData()
	{
		
		System.out.println(FakeDataGenerator.getFirstName());
		System.out.println(FakeDataGenerator.getLasttName());
		System.out.println(FakeDataGenerator.getEmail());
		String pass=FakeDataGenerator.getPassword();
		System.out.println(pass);
		System.out.println(pass);
	}
	
	
}
