package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Description {
	WebDriver ldriver;
	
	 public Description(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements( rdriver,this);
	}
	
	 @FindBy(xpath="//div[@class='VariationHandler__showcaseRoot__DgkEa campaign-showcase']//a[@title='Xiaomi 108 cm (43 inches) X Pro 4K Dolby Vision IQ Series Smart Google TV L43M8-5XIN (Black)'][contains(text(),'Xiaomi 108 cm (43 inches) X Pro 4K Dolby Vision IQ')]")
	
	 WebElement textclick;
	 
	 public void DescriptionElement()
		{
		 textclick.click();
}

}
