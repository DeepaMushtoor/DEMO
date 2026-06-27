package com.qa.demoshop.pagelayers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.demoshop.utilities.DropDownUtility;
import com.qa.demoshop.utilities.WaitUtility;

public class ShoppingCartPage {
private By countryDropDown =By.id("CountryId");
private By checkout=By.id("checkout");
private By termsOfServics=By.id("termsofservice");
private WebDriver driver;

public ShoppingCartPage(WebDriver driver)
{
	this.driver=driver;
}
public void selectCountryVisibleText(String countryName)
{
	DropDownUtility.selectByVisibleText(WaitUtility.checkElementIsVisible(driver,countryDropDown),countryName);
}
public void clickOnCheckOut()
{
	WaitUtility.checkElementIsVisible(driver, checkout).click();
}
public void clickOnTermsOfService()
{
	WaitUtility.checkElementIsVisible(driver, termsOfServics).click();
}
		

}
