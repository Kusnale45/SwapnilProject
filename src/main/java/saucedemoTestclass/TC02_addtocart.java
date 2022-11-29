package saucedemoTestclass;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import saucedemoPOMclass.POMHomepage;
import saucedemoPOMclass.saucedemotestbaseclass;
@Listeners(saucedemoUtilityclass.TestNGListner.class)
public class TC02_addtocart extends saucedemotestbaseclass
{
	@Test
	public void addtocartfun() throws IOException
	{
		ExtentTest test2=extent.createTest("Add to cart Test");
		
		
		POMHomepage homeval =new POMHomepage(driver);
		homeval.clickbagpack();
		String actualresult= homeval.gettextcart();
		String exceptedresult = "1";
		
		Assert.assertEquals(actualresult, exceptedresult);
		screenshot.getscreenshots(driver, "addtocart");
		test2.pass("Product added to cart Successfully");
	}

}
