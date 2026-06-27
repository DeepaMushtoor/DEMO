package com.qa.demoshop.tests;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.demoshop.base.BasePage;

public class GuestWithoutRegister extends BasePage{
	
	@Test
	public void guestCheckout()
	{
	home.clickOnBooks();
	books.clickAddToCartOfFirstProduct();
	home.clickShoppingCartLink();
	cartPage.selectCountryVisibleText("India");
	cartPage.clickOnTermsOfService();
	cartPage.clickOnCheckOut();
	guestRegister.clickOncheckoutRegister();
	String randomEmail="varun"+RandomStringUtils.randomAlphanumeric(5)+"@gmail.com";
	guestRegister.enterBillingAddressWithoutRegister("varun", "y", randomEmail, "India", "Banglore","raj","560010", "9148191889");
	checkout.clickOnShippingAddressContinue();
	checkout.clickOnShippingMethodContinue();
	checkout.clickOnPaymentMethodContinue();
	checkout.paymentInformationContinue();
	checkout.clickOnConfirmationOrder();
	Assert.assertEquals(thankyou.getSuccessMessage(), "Your order has been successfully processed!");
	System.out.println("===[Order is Confirmed]==");
	
	}
	
	
}
