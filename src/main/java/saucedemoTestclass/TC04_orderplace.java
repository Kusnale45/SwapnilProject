package saucedemoTestclass;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import saucedemoPOMclass.POMHomepage;
import saucedemoPOMclass.POMcartpage;
import saucedemoPOMclass.saucedemotestbaseclass;
@Listeners(saucedemoUtilityclass.TestNGListner.class)
public class TC04_orderplace extends saucedemotestbaseclass
{
	
	@Test
	public void orderplace() throws IOException
	{
		ExtentTest test4=extent.createTest("Order Test");
		
		
		POMHomepage homeval3 =new POMHomepage(driver);
		POMcartpage cartval = new POMcartpage(driver);
		homeval3.addcart();
		homeval3.clickcart();
		cartval.clickcheckout();
		cartval.sendkeysfirstname();
		cartval.sendkeyslastname();
		cartval.sendkeyszipcode();
		cartval.clickcontinue();
		cartval.clickfinish();
		
		String actualresult= driver.getTitle();
		String exceptedresult = "Swag Labs";
	
		Assert.assertEquals(actualresult, exceptedresult);
		screenshot.getscreenshots(driver, "order successful");
		cartval.clickbackhome();
		test4.pass("Order Placed Successfully");
	}

}
