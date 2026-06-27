package com.qa.demoshop.pagelayers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.demoshop.utilities.WaitUtility;

public class LoginPage {
	private WebDriver driver;
	private By loginLink=By.xpath("//a[@href='/login']");
	private By loginButton=By.xpath("//INPUT[@class='button-1 login-button']");
	
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void clickOnLoginLink()
	{
		WaitUtility.checkElementIsVisible(driver,loginLink).click();
	}
	public void clickOnLoginButton()
	{
		WaitUtility.checkElementIsVisible(driver,loginButton).click();
	}
	
	
	
	
}
