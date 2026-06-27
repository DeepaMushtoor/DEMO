package com.qa.demoshop.listeners;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.qa.demoshop.browserfactory.DriverFactory;
import com.qa.demoshop.utilities.ScreenshotUtility;

public class Listener implements ITestListener{

	
	public void onStart(ITestContext context)
	{
		Reporter.log("Execution Started",true);
	}
	public void onTestStart(ITestResult result)
	{
		Reporter.log(result.getName()+"Execution Started",true);
	}
	public void onTestSuccess(ITestResult result)
	{
		Reporter.log(result.getName()+"Passed",true);
	}
	public void onTestFailure(ITestResult result)
	{
		
		
		try {
			ScreenshotUtility.captureScreenshot(DriverFactory.getDriver(), result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Reporter.log(result.getName()+"Failed",true);
	}
	public void onTestSkipped(ITestResult result)
	{
		Reporter.log(result.getName()+"Skipped",true);
	}
	public void onFinish(ITestContext context)
	{
		Reporter.log("Execution Completed",true);
	}
	
	
	
}
