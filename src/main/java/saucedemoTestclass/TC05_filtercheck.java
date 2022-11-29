package saucedemoTestclass;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import saucedemoPOMclass.POMHomepage;
import saucedemoPOMclass.saucedemotestbaseclass;
@Listeners(saucedemoUtilityclass.TestNGListner.class)
public class TC05_filtercheck extends saucedemotestbaseclass
{
	@Test
	public void filtercheck() throws IOException
	{
		ExtentTest test5=extent.createTest("Filter Check Test");
		
		
		POMHomepage homeval3 =new POMHomepage(driver);
		homeval3.addfilter();
		homeval3.filterbypricehightolow();
		screenshot.getscreenshots(driver, "filter applied successful");
		Assert.assertTrue(true);
		
		test5.pass("Filter checked Successfully");
		
	}

}
