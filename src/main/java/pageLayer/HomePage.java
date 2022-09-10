package pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//a[@id='login2']")
	private WebElement LogIn;
	public void clickOnLogIn()
	{
		
		LogIn.click();
	}
	
	@FindBy(xpath ="//a[text()='Home ']")
	private WebElement Home;
	public void clickOnHome()
	{
		Home.click();
	}
	
	
	
	@FindBy(xpath = "//a[contains(text(),'Phones')]")
	private WebElement Phones;
	public void clickOnPhones()
	{
		
		Phones.click();
	}
	
	@FindBy(xpath = "//a[contains(text(),'Laptops')]")
	private WebElement Laptops;
	public void clickOnLaptops()
	{
		Laptops.click();
	}
	
	@FindBy(xpath = "//a[contains(text(),'Monitors')]")
	private WebElement Monitors;
	

	public void clickOnMonitors()
     {
	
	Monitors.click();
    }

	
	@FindBy(xpath = "//a[contains(text(),'Add to cart')]")
	private WebElement ADD_to_cart;
	
	public void clickOnAddToCart()
	{
		
		ADD_to_cart.click();
	}
	
	@FindBy(xpath="//a[@id='cartur']")
	private WebElement Cart;
	
	public void clickOnCart()
	{
		Cart.click();
	}
	
	
	
	
	
	
	
	

}
