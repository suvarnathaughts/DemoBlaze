package pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
	
	public ProductPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
    
	@FindBy(xpath = "//a[contains(text(),'Samsung galaxy s6')]")
	private WebElement Phone;
	
	@FindBy(xpath = "//a[contains(text(),'Dell i7 8gb')]")
	private WebElement Laptop;
	
	@FindBy (xpath ="//a[contains(text(),'ASUS Full HD')]")
	private WebElement Monitor;
	
	
	
	public void clickOnSamsaungGalaxyS6()
	{  
       Phone.click();
	}
	
	
	public void clickOnDelli78GB()
	{   
		Laptop.click();
	}
	public void clickOnAsus()
	{
		
		Monitor.click();
		
	}
}
