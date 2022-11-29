package saucedemoUtilityclass;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listnersclass extends utilityclass implements ITestListener
{
	WebDriver driver;
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("Test is Passed");
	}

	public void onTestFailure(ITestResult result)
	{
		System.out.println("Test is failed and Take Screenshot of current page");
		utilityclass screenshot = new utilityclass();
		try {
			screenshot.getscreenshots(driver, "Failed test case");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	public void onTestStart(ITestResult result)
	{
		System.out.println("Test is started");
	}
	
	public void onTestFinish(ITestResult result)
	{
		System.out.println("Test is Ended");
	}
}
