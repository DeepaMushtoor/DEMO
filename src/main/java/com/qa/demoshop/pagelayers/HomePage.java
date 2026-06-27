package com.qa.demoshop.pagelayers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.demoshop.utilities.MouseActionUtility;
import com.qa.demoshop.utilities.WaitUtility;

public class HomePage {

	private By registerLink=By.xpath("//a[@href='/register']");
	private By computerHeader=By.xpath("(//a[@href='/computers'])[1]");
	private By booksTab=By.xpath("(//a[@href='/books'])[1]");
	private By shoppingCartLink=By.xpath("//span[.='Shopping cart']");
	private WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void clickRegisterLink()
	{
		WaitUtility.checkElementIsVisible(driver,registerLink).click();
	}
	public void clickShoppingCartLink()
	{
		WaitUtility.checkElementIsVisible(driver,shoppingCartLink).click();
	}
	public void clickOnBooks()
	{
		WaitUtility.checkElementIsVisible(driver,booksTab).click();
	}
	
	public void performMouseHoveringOnComputer()
	{//EXAMPLE TO PERFORM MOUSE ACTIONS
		MouseActionUtility.mouseHowering(driver, WaitUtility.checkElementIsVisible(driver, computerHeader));
	}
	
	
}
