package pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
	
	public CartPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath="//div[@class='table-responsive']/table/tbody/tr[1]/td[3]")
	private WebElement price_of_samasaungPhone;
	
	@FindBy(xpath = "//div[@class='table-responsive']/table/tbody/tr[2]/td[3]")
	private WebElement price_of_Dell_laptop;
	
	
	@FindBy(xpath = "//div[@class='table-responsive']/table/tbody/tr[3]/td[3]")
	private WebElement price_of_Asus_monitor;
	
	
	
	public int priceOfSamsaungGalaxyS6()
	{
		String priceOfSamsaungPhone =  price_of_samasaungPhone.getText();
		int priceOfPhone = Integer.parseInt(priceOfSamsaungPhone);
		return priceOfPhone ;
	}
	
	public int priceOfDelli78GB()
	{
		String priceOfDellLaptop =  price_of_Dell_laptop.getText();
		int priceOfLaptop = Integer.parseInt(priceOfDellLaptop);
		return priceOfLaptop;
	}

	public int priceOfAsusFullHD()
	{
		String priceOfAsusMonitor =  price_of_Asus_monitor.getText();
		int priceOfMonitor = Integer.parseInt(priceOfAsusMonitor);
		return priceOfMonitor;
	}
	
	@FindBy(xpath = "//div[@class='col-lg-1']/div/div/h3")
	private WebElement Total;
	
	public int getTotal()
	{
		String total = Total.getText();
		int TotalAmount = Integer.parseInt(total);
		return TotalAmount;
		
	}
	
	@FindBy(xpath = "//button[contains(text(),'Place Order')]")
	private WebElement PlaceOrder;
	
	public void clickOnPlaceOrder()
	{
		PlaceOrder.click();
		
	}
	


	
	
}
