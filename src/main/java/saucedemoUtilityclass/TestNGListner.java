package saucedemoUtilityclass;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListner implements ITestListener
{
	
	public void onTestStart(ITestResult result)
	{
		System.out.println("Test has been started -> "+ result.getName());
	}

	public void onStart(ITestResult result)
	{
		System.out.println("Test has been started -> "+ result.getName());
	}
	
	public void onFinish(ITestResult result)
	{
		System.out.println("Test has been finished -> "+ result.getName());
	}
	
	public void onTestFailure(ITestResult result)
	{
		System.out.println("Test has been failed -> "+ result.getName());
	}
	
	public void onTestSkipped(ITestResult result)
	{
		System.out.println("Test has been skipped -> "+ result.getName());
	}
	
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("Test has been succeded -> "+ result.getName());
	}
}
