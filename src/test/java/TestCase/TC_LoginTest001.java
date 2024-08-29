package TestCase;
import org.testng.annotations.Test;

import PageObject.AddToCart;
import PageObject.BuyNowClass;
import PageObject.Description;
import PageObject.LoginPage;
import PageObject.SearchProduct;
import PageObject.SelectProduct;
public class TC_LoginTest001 extends BaseClass {
	
	@Test
	public void loginTest()
	{
       driver.get(BaseURL);
		
		LoginPage lp= new LoginPage(driver);
		lp.clickSignIn();
		lp.setUserName(username);
		lp.clickContinue();
		lp.setPassward(passward);
		lp.clickSign();
		
		SearchProduct sp=new SearchProduct(driver);
		sp.entryField("LED TV");
		sp.ClickButton();
		
		SelectProduct sp1=new SelectProduct(driver);
		sp1.clickProduct();	
		
		AddToCart ad=new AddToCart(driver);
		ad.clickAddToCart();
		
		Description ds=new Description(driver);
		ds.DescriptionElement();
		
		BuyNowClass by=new BuyNowClass(driver);
		by.clickAddToCart();
				
	}

}
