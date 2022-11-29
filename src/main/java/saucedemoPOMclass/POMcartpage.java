package saucedemoPOMclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMcartpage 
{
	WebDriver driver;
	
	@FindBy(xpath="//button[text()='Checkout']")
	private WebElement Checkout;
	public void clickcheckout()
	{
		Checkout.click();
	}
	
	@FindBy(xpath="//input[@id='first-name']")
	private WebElement firstname;
	public void sendkeysfirstname()
	{
		firstname.sendKeys("Swapnil");
	}
	
	@FindBy(xpath="//input[@id='last-name']")
	private WebElement lastname;
	public void sendkeyslastname()
	{
		lastname.sendKeys("Kusnale");
	}
	
	@FindBy(xpath="//input[@id='postal-code']")
	private WebElement zipcode;
	public void sendkeyszipcode()
	{
		zipcode.sendKeys("002200");
	}
	
	@FindBy(xpath="//input[@id='continue']")
	private WebElement continueforward;
	public void clickcontinue()
	{
		continueforward.click();
	}
	
	@FindBy(xpath="//button[@id='finish']")
	private WebElement finish;
	public void clickfinish()
	{
		finish.click();
	}
	
	@FindBy(xpath="//button[text()='Back Home']")
	private WebElement backhome;
	public void clickbackhome()
	{
		backhome.click();
	}
	
	
	public POMcartpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	

}
