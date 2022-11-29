package saucedemoPOMclass;



import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import saucedemoUtilityclass.utilityclass;
@Listeners(saucedemoUtilityclass.Listnersclass.class)
public class saucedemotestbaseclass 
{
	Logger log= Logger.getLogger("SauceDemoProject");
	
	public ExtentReports extent = new ExtentReports();
	ExtentSparkReporter spark = new ExtentSparkReporter("SauceDemoReport.html");
 
	public static WebDriver driver;
	public utilityclass screenshot = new utilityclass();
	
	@Parameters("Browsername")
	@BeforeClass
	public void setup1(String Browsername)
	{
		
		PropertyConfigurator.configure("log4j.properties");
		
		
		if(Browsername.equals("Chrome"))
		{
		System.setProperty("webdriver.chrome.driver", 
				"./Drivers/chromedriver.exe");
		       driver = new ChromeDriver();
		}
		else if(Browsername.equals("Edge"))
		{
			System.setProperty("webdriver.edge.driver", 
					"./Drivers/msedgedriver.exe");
       			driver = new EdgeDriver();	
		}
		else
		{
			System.setProperty("webdriver.gecko.driver", 
					"./Drivers/geckodriver.exe");
       			driver = new FirefoxDriver();
		}
		
		log.info("browser is opened");
		driver.manage().window().maximize();
		log.info("browser is maximized");
		driver.get("https://www.saucedemo.com/");
		log.info("URl is Opened");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);	
		log.info("Wait is applied");
	}
	
	@BeforeMethod
	public void setup2()
	{
		spark.config().setDocumentTitle("SauceDemoTestReport");
		extent.attachReporter(spark);
		
		POMLoginclass loginact = new POMLoginclass(driver);
		loginact.clickusername();
		
		loginact.sendkeysusername();
		log.info("User name Entered");
		loginact.sendkeyspassword();
		log.info("Password is enterd");
		loginact.clicklogin();
		log.info("Login button is clicked");
		log.info("Went to Home Page");
	}

	@AfterMethod
	public void teardown1()
	{
		extent.flush();
		
		POMHomepage  homeact = new POMHomepage(driver);
		homeact.clickmenu();
		log.info("clicked on menu button");
		homeact.clicklogout();
		log.info("Clicked on logout button");
	    log.info("Logout successfully");
	}
	
	@AfterClass
	public void teardown2()
	{
		
		driver.quit();
		log.info("Broswer closed");
	}
	
}
