package extentreport;


import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReport1 
{
	@Test
	public void Extentreport() throws IOException
	{
		ExtentReports extent = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("ExtentReport.html");
		
//		final File CONF = new File("extentconfig.xml");
//		
//		spark.loadXMLConfig(CONF);
	
		extent.attachReporter(spark);
		
		
		ExtentTest test=extent.createTest("Login Test");
		test.pass("Login Test Stared Successfully");
		test.info("URL Entered");
		test.info("Login credentials entered");
		test.pass("Login test completed successfully");
		
		ExtentTest test1=extent.createTest("Home page Test");
		test1.pass("Home Page Test Stared Successfully");
		test1.info("URL Entered");
		test1.info("Login credentials entered");
		test1.fail("Home page test  not completed successfully");
		
		
		extent.flush();
		
		
	}

}
