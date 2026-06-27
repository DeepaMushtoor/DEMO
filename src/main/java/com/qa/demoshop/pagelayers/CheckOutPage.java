package com.qa.demoshop.pagelayers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.demoshop.utilities.DropDownUtility;
import com.qa.demoshop.utilities.WaitUtility;

public class CheckOutPage extends BrowserInitialization {

	
	
	
	
	private By billingAddressHeader=By.xpath("(//h2[.='Billing address'])[1]");
	private By countryDropdown=By.id("BillingNewAddress_CountryId");
	private By BillingNewAddress_City=By.id("BillingNewAddress_City");
	private By BillingNewAddress_Address1=By.id("BillingNewAddress_Address1");
	private By BillingNewAddress_ZipPostalCode=By.id("BillingNewAddress_ZipPostalCode");
	private By BillingNewAddress_PhoneNumber=By.id("BillingNewAddress_PhoneNumber");
	private By billingAddress_ContinueBtn =By.xpath("(//input[@title='Continue'])[1]");
	private By shippingAddress_ContinueBtn=By.xpath("//input[@onclick='Shipping.save()']");
	private By shippingMethod_ContinueBtn=By.xpath("//input[@onclick='ShippingMethod.save()']");
	private By paymentMethod_ContinueBtn=By.xpath("//input[@onclick='PaymentMethod.save()']");
	private By paymentInformation_ContinueBtn=By.xpath("//input[@onclick='PaymentInfo.save()']");
	private By confirmationOrderBtn=By.xpath("//input[@onclick='ConfirmOrder.save()']");
	
	
	public CheckOutPage(WebDriver driver)
	{
		super(driver);
	}
	public void enterBillingAddress(String country,String city,String address1,String zipcode,String phonenumber)
	{
		WaitUtility.checkElementContainsText(driver, billingAddressHeader,"Billing Address");
		DropDownUtility.selectByVisibleText(driver.findElement(countryDropdown), country);
		driver.findElement(BillingNewAddress_City).sendKeys(city);
		driver.findElement(BillingNewAddress_Address1).sendKeys(address1);
		driver.findElement(BillingNewAddress_ZipPostalCode).sendKeys(zipcode);
		driver.findElement(BillingNewAddress_PhoneNumber).sendKeys(phonenumber);
		driver.findElement(billingAddress_ContinueBtn).click();
		
	}
	public void clickOnShippingAddressContinue()
	{
		WaitUtility.checkElementIsVisible(driver,shippingAddress_ContinueBtn).click();
	}
	public void clickOnShippingMethodContinue()
	{
		WaitUtility.checkElementIsVisible(driver,shippingMethod_ContinueBtn).click();
	}
	public void clickOnPaymentMethodContinue()
	{
		WaitUtility.checkElementIsVisible(driver,paymentMethod_ContinueBtn).click();
	}
	public void paymentInformationContinue()
	{
		WaitUtility.checkElementIsVisible(driver,paymentInformation_ContinueBtn).click();
	}
	public void clickOnConfirmationOrder()
	{
		WaitUtility.checkElementIsVisible(driver,confirmationOrderBtn).click();
	}

	
	
	
}
