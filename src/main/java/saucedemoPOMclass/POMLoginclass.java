package saucedemoPOMclass;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMLoginclass 
{
	WebDriver driver;
	@FindAll({@FindBy(xpath="//input[@name='user-name1']"),
		@FindBy(id="user-name")
	})
	
    WebElement username;
	
	public void clickusername()
	{
		username.click();
	}
	
	public void sendkeysusername()
	{
		username.sendKeys("standard_user");
	}
	
	@FindBy(xpath="//input[@id='password']")
	WebElement password;
	public void sendkeyspassword()
	{
		password.sendKeys("secret_sauce");
	}
	
	@FindBy(xpath="//input[@id='login-button']")
	WebElement login;
	public void clicklogin()
	{
		login.click();
	}
	
	public String gettitle()
	{
		return driver.getTitle();
	}

	public POMLoginclass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
}
