package saucedemoUtilityclass;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;


public class utilityclass 
{
	public void getscreenshots(WebDriver driver,String name) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot)driver; 
		File actual= ts.getScreenshotAs(OutputType.FILE);
		File excepted = new File("./Screenshots/"+name+".jpg");
		FileHandler.copy(actual, excepted);	
	}
}
