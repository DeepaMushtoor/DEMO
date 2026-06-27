package com.qa.demoshop.pagelayers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.demoshop.utilities.DropDownUtility;
import com.qa.demoshop.utilities.WaitUtility;

public class GuestRegister {
	
	
	private By checkoutRegister=By.xpath("//input[@value='Checkout as Guest']");
	private By BillingNewAddress_FirstName=By.id("BillingNewAddress_FirstName");
	private By BillingNewAddress_LastName=By.id("BillingNewAddress_LastName");
	private By BillingNewAddress_Email=By.id("BillingNewAddress_Email");
	private By billingAddressHeader=By.xpath("(//h2[.='Billing address'])[1]");
	private By countryDropdown=By.id("BillingNewAddress_CountryId");
	private By BillingNewAddress_City=By.id("BillingNewAddress_City");
	private By BillingNewAddress_Address1=By.id("BillingNewAddress_Address1");
	private By BillingNewAddress_ZipPostalCode=By.id("BillingNewAddress_ZipPostalCode");
	private By BillingNewAddress_PhoneNumber=By.id("BillingNewAddress_PhoneNumber");
	private By billingAddress_ContinueBtn =By.xpath("(//input[@title='Continue'])[1]");
	private WebDriver driver;
	public GuestRegister(WebDriver driver)
	{
		this.driver=driver;
	}
	public void clickOncheckoutRegister()
	{
		WaitUtility.checkElementIsVisible(driver,checkoutRegister).click();
	}
	public void enterBillingAddressWithoutRegister(String firstName,String lastName,String email ,String country,String city,String address1,String zipcode,String phonenumber)
	{
		
		
		
		
	
		WaitUtility.checkElementContainsText(driver, billingAddressHeader,"Billing Address");
		driver.findElement(BillingNewAddress_FirstName).sendKeys(firstName);
		driver.findElement(BillingNewAddress_LastName).sendKeys(lastName);
		driver.findElement(BillingNewAddress_Email).sendKeys(email);
		DropDownUtility.selectByVisibleText(driver.findElement(countryDropdown), country);
		driver.findElement(BillingNewAddress_City).sendKeys(city);
		driver.findElement(BillingNewAddress_Address1).sendKeys(address1);
		driver.findElement(BillingNewAddress_ZipPostalCode).sendKeys(zipcode);
		driver.findElement(BillingNewAddress_PhoneNumber).sendKeys(phonenumber);
		driver.findElement(billingAddress_ContinueBtn).click();
		
	
	}
	
}
