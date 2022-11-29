package saucedemoTestclass;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import saucedemoPOMclass.saucedemotestbaseclass;
@Listeners(saucedemoUtilityclass.TestNGListner.class)
public class TC01_loginfun extends saucedemotestbaseclass
{
	@Test
	public void loginfunctionality() throws IOException
	{
		ExtentTest test1=extent.createTest("Login Test");
		
		String Exceptedresult="Swag Labs1";
		String Actualresult=driver.getTitle();		
		Assert.assertEquals(Exceptedresult, Actualresult);
		screenshot.getscreenshots(driver, "Homepage");
		
		test1.pass("Login Test Stared Successfully");
		
	}

}
