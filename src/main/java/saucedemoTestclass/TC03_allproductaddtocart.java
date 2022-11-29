package saucedemoTestclass;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import saucedemoPOMclass.POMHomepage;
import saucedemoPOMclass.saucedemotestbaseclass;
@Listeners(saucedemoUtilityclass.TestNGListner.class)
public class TC03_allproductaddtocart extends saucedemotestbaseclass
{
	
	 @Test
		public void allproductaddtocart() throws IOException
		{
		 ExtentTest test3=extent.createTest("All Product add to cart Test");
			
			
	    	 POMHomepage homeval2 =new POMHomepage(driver);
	    	 homeval2.addcart();
	    	 String actualresult= homeval2.gettextcart();
	 		 String exceptedresult = "6";
	 		
	 		Assert.assertEquals(actualresult, exceptedresult);	
	 		screenshot.getscreenshots(driver, "allproductaddtocart");
	 		test3.pass("All Product Added Cart Successfully");
		}

}
