package PageObject;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCart {
	
		WebDriver ldriver;
		
		 public AddToCart(WebDriver rdriver)
		 {
			ldriver=rdriver;
			PageFactory.initElements( rdriver,this);
		
}
		    @FindBy(xpath="//div[@class='VariationHandler__showcaseRoot__DgkEa campaign-showcase']//button[@aria-label='Add to Cart']")
			WebElement txtCart;
          public void clickAddToCart()
{
    	   txtCart.click();
}
          
     	 
     	
     	 
}
