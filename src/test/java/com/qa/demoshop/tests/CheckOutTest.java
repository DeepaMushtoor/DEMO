package com.qa.demoshop.tests;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.demoshop.base.BasePage;

import io.qameta.allure.Allure;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

public class CheckOutTest extends BasePage {
	static Logger log=LogManager.getLogger(CheckOutTest.class);

	@Test(enabled=false)
	public void verifyRegisterPage()
	{
		home.clickRegisterLink();
		Assert.assertEquals(register.getRegisterHeader(), "Register");
		System.out.println("Verified Register Page");
		
	}
	
	@Test
	public void registerShopper()
	{
		String randomEmail="varun"+RandomStringUtils.randomAlphanumeric(5)+"@gmail.com";
		home.clickRegisterLink();
		register.registerUser("FEMALE","admin", "adminer",randomEmail , "admin@88", "admin@88");
		Assert.assertEquals(register.getSuccessMsg(), "Your registration completed");
		System.out.println(register.getSuccessMsg());
	}
	@Test(enabled=false)
	public void checkout()
	{
		home.clickOnBooks();
		books.clickAddToCartOfFirstProduct();
		home.clickShoppingCartLink();
		cartPage.selectCountryVisibleText("India");
		cartPage.clickOnTermsOfService();
		cartPage.clickOnCheckOut();
		System.out.println("Executed");
		
	}
	
	@Test(priority=0)
	@Epic("e-commerce")
	@Story("valid checkout")
	@Feature("checkout")
	@Description("'User Valid checkout")
	@Severity(SeverityLevel.CRITICAL)
	@Owner("Deepa")
	public void checkoutProduct()
	{
		String randomEmail="varun"+RandomStringUtils.randomAlphanumeric(5)+"@gmail.com";
		home.clickRegisterLink();
		register.registerUser("MALE", "VARUN", "Y", randomEmail, "123456@", "123456@");
		log.info("==[USER IS REGISTERED]==");
		Allure.step("USER REGISTERED SUCCESSFULLY");
		home.clickOnBooks();
		books.clickAddToCartOfFirstProduct();
		log.info("CLICK ON CHECKOUT BUTTON SUCCESSFULLY");
		Allure.step("CLICK ON CHECKOUT BUTTON SUCCESSFULLY");
		home.clickShoppingCartLink();
		cartPage.selectCountryVisibleText("India");
		cartPage.clickOnTermsOfService();
		cartPage.clickOnCheckOut();
		log.info("PRODUCT ADDED TO CART SUCCESSFULLY");
		Allure.step("PRODUCT ADDED TO CART SUCCESSFULLY");
		checkout.enterBillingAddress("India", "Banglore","raj","560010", "9148191889");
		checkout.clickOnShippingAddressContinue();
		log.info(" SHIPPING ADDED SUCCESSFULLY");
		Allure.step("SHIPPING  ADDED  SUCCESSFULLY");
		checkout.clickOnShippingMethodContinue();
		checkout.clickOnPaymentMethodContinue();
		checkout.paymentInformationContinue();
		checkout.clickOnConfirmationOrder();
		Assert.assertEquals(thankyou.getSuccessMessage(), "Your order has been successfully processed!");
		log.info("Order is Confirmed");
		Allure.step("Order is Confirmed");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
}
