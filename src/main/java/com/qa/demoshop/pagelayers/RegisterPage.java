package com.qa.demoshop.pagelayers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.demoshop.utilities.WaitUtility;

public class RegisterPage {

	private By gender_male=By.id("gender-male");
	private By gender_female=By.id("gender-female");
	private By firstName_TF=By.id("FirstName");
	private By lastName_TF=By.id("LastName");
	private By email_TF=By.id("Email");
	private By password_TF=By.id("Password");
	private By confirmPassword_TF=By.id("ConfirmPassword");
	private By registerButton=By.id("register-button");
	private By successMsg=By.xpath("//div[@class='result']");
	private By registerHeader=By.xpath("//div[@class='page-title']/h1");
	private WebDriver driver;
	public RegisterPage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void registerUser(String gender,String firstName,String lastName,String email,String password,String confirmPassword )
	{
		if(gender.equals("MALE"))
				{
			WaitUtility.checkElementIsVisible(driver,gender_male).click();
			
				}
		else if(gender.equals("FEMALE"))
		{
			WaitUtility.checkElementIsVisible(driver,gender_female).click();
		}
		driver.findElement(firstName_TF).sendKeys(firstName);
		driver.findElement(lastName_TF).sendKeys(lastName);
		driver.findElement(email_TF).sendKeys(email);
		driver.findElement(password_TF).sendKeys(password);
		driver.findElement(confirmPassword_TF).sendKeys(confirmPassword);
		driver.findElement(registerButton).click();
		
	}
	public String getSuccessMsg()
	{
		return WaitUtility.checkElementIsVisible(driver,successMsg).getText();
	}
	public String getRegisterHeader()
	{
		return WaitUtility.checkElementIsVisible(driver, registerHeader).getText();
	}
	
	
	
	
}
