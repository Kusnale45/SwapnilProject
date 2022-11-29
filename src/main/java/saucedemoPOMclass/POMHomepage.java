package saucedemoPOMclass;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class POMHomepage 
{
	   WebDriver driver;
	   Select filters;
	
       @FindBy(xpath="//button[text()='Open Menu']")
        private WebElement Menu;
       public void clickmenu()
       {
    	   Menu.click();
       }

       @FindBy(xpath="//a[@class='shopping_cart_link']")
        private WebElement cart;
       public void clickcart()
       {
    	   cart.click();
       }
       
       public String gettextcart()
       {
    	   return cart.getText();
       }
       
       @FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']")
       WebElement bagpack;
       public void clickbagpack()
       {
    	   bagpack.click();
       }
       
       @FindBy(xpath="//button[text()='Add to cart']")
         private List<WebElement> addtocart;
       public void addcart()
       {
    	   for(WebElement allproducts : addtocart)
    	   {
    		   allproducts.click();
    	   }
       }
    
       
       @FindBy(xpath="//a[text()='Logout']")
       WebElement Logout;
       public void clicklogout()
       {
    	   Logout.click();
       }
       
       @FindBy(xpath="//select[@class='product_sort_container']")
       WebElement filter;
       public void addfilter()
       {
    	   filter.click();
       }
       
       public void filterbypricehightolow()
       {
    	   
    	   filters.selectByValue("hilo");  
       }
       
       public POMHomepage(WebDriver driver)
       {
    	   
    	   this.driver=driver;
    	   PageFactory.initElements(driver, this);
    	   
    	   filters = new Select(filter);
       }
}
