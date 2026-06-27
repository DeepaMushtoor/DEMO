package com.qa.demoshop.browserfactory;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.Reporter;

public class BrowserSetting {
public static ChromeOptions getChromeOptions(boolean headless)
{
	ChromeOptions opts=new ChromeOptions();
	if(headless)
	{
		opts.addArguments("--headless");
		Reporter.log("This is Executing in Headless Mode",true);
	}
	return opts;
}
public static FirefoxOptions getFirefoxOptions(boolean headless)
{
	FirefoxOptions opts=new FirefoxOptions();
	if(headless)
	{
		opts.addArguments("--headless");
		Reporter.log("This is Executing in Headless Mode",true);
		
	}
	return opts;
	
}
public static EdgeOptions getEdgeOptions(boolean headless)
{
	EdgeOptions opts=new EdgeOptions();
	if(headless)
	{
		opts.addArguments("--headless");
		Reporter.log("This is Executing in Headless Mode",true);
		
	}
	return opts;
}

	
	
	
	
	
}
