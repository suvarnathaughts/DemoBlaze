package pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PlaceOrderPage {
	
	
	public PlaceOrderPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@id='name']")
	private WebElement Name;
	
	public void enterName(String name)
	{
		Name.sendKeys(name);
	}
	
	@FindBy(xpath="//input[@id='country']")
	private WebElement Country;
	

	public void enterCountry(String country)
	{
		Country.sendKeys(country);
	}
	
	@FindBy(xpath="//input[@id='city']")
	private WebElement City;
	

	public void enterCity(String city)
	{
		City.sendKeys(city);
	}
	
	@FindBy(xpath="//input[@id='card']")
	private WebElement CreditCard;
	

	public void enterCreditCard(String creditcard)
	{
		CreditCard.sendKeys(creditcard);
	}
	
	@FindBy(xpath= "//input[@id='month']")
	private WebElement Month;
	

	public void enterMonth(String month)
	{
		Month.sendKeys(month);
	}
	
	@FindBy(xpath= "//input[@id='year']")
	private WebElement Year;
	

	public void enterYear(String year)
	{
		Year.sendKeys(year);
	}
	
	@FindBy(xpath= "//button[contains(text(),'Purchase')]")
	private WebElement PurchaseButton;
	

	public void clickOnPurchase()
	{
		PurchaseButton.click();
	}
	
    
    @FindBy(xpath="//p[@class='lead text-muted ']")
    private WebElement DetailsAfterPurchase;
    
    public String getDetails()
    {
    	String Details = DetailsAfterPurchase.getText();
    	
    	return Details;
    }
    
   

}
