package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BuyNowClass {
	WebDriver ldriver;
	
	 public BuyNowClass(WebDriver rdriver)
	 {
	 
		ldriver=rdriver;
		PageFactory.initElements( rdriver,this);
	
}
	    @FindBy(xpath="//input[@id='buy-now-button']")
		WebElement txtBuy;
	    
        public void clickAddToCart()
{
	     txtBuy.click();
}

}
