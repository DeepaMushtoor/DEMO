package com.qa.demoshop.base;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.qa.demoshop.browserfactory.DriverFactory;
import com.qa.demoshop.pagelayers.BooksPage;
import com.qa.demoshop.pagelayers.CheckOutPage;
import com.qa.demoshop.pagelayers.GuestRegister;
import com.qa.demoshop.pagelayers.HomePage;
import com.qa.demoshop.pagelayers.LoginPage;
import com.qa.demoshop.pagelayers.RegisterPage;
import com.qa.demoshop.pagelayers.ShoppingCartPage;
import com.qa.demoshop.pagelayers.ThankYouPage;
import com.qa.demoshop.utilities.PropertyUtility;

public class BasePage {

	WebDriver driver;
	public HomePage home;
	public RegisterPage register;
	public BooksPage books;
	public ShoppingCartPage cartPage;
	public CheckOutPage checkout;
	public ThankYouPage thankyou;
	public GuestRegister guestRegister;
	public LoginPage login;
	
	@Parameters("browser")
	@BeforeMethod
	public void setUp(@Optional String browser) throws IOException
	{
		
		
		if(browser==null||browser.isEmpty())
		{
			browser=PropertyUtility.getProperty("browserName");
		}
		driver=DriverFactory.initDriver(browser,Boolean.parseBoolean(PropertyUtility.getProperty("headless")));
		driver.manage().window().maximize();
		driver.get(PropertyUtility.getProperty("testUrl"));
		home=new HomePage(driver);
		register=new RegisterPage(driver);
		books=new BooksPage(driver);
		cartPage=new ShoppingCartPage(driver);
		 checkout=new CheckOutPage(driver);
		 thankyou=new ThankYouPage(driver);
		 guestRegister=new GuestRegister(driver);
		 login =new LoginPage(driver);
		 
		
	}
	@AfterMethod
	public void tearDown()
	{
		DriverFactory.quitDriver();
	}
	
	
	
}
