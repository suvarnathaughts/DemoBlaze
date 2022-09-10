package testLayer;

import java.time.Duration;
import java.util.HashMap;
import java.util.TreeSet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageLayer.CartPage;
import pageLayer.HomePage;
import pageLayer.LogInPage;
import pageLayer.PlaceOrderPage;
import pageLayer.ProductPage;

public class BuyProductTest {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoblaze.com/index.html");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		HomePage home = new HomePage(driver);
		LogInPage login = new LogInPage(driver);
		home.clickOnLogIn();
		
		// log in with given credentials
		
		login.enterUserName("sctqaautomation@grr.la");
		login.enterPassword("Spring@123");
		login.clickOnLoginButton();
		
		Thread.sleep(2000);
		
		ProductPage product = new ProductPage(driver);
		
		// click on phone option and select Samsaung Galaxy S6
		
		home.clickOnPhones();
		product.clickOnSamsaungGalaxyS6();
		home.clickOnAddToCart();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
		
		//click on home menu and click on Dell i7 8GB
		
		home.clickOnHome();
		home.clickOnLaptops();
		product.clickOnDelli78GB();
		home.clickOnAddToCart();
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
		
		//click on home menu and click on Asus Full HD
		
		home.clickOnHome();
		home.clickOnMonitors();
		product.clickOnAsus();
		home.clickOnAddToCart();
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
		
		//navigate to cart menu
		home.clickOnCart();
		
		Thread.sleep(2000);
		
		//get price of all items and sort them in ascending order
		
		CartPage cart = new CartPage(driver);
		
		int phonePrice = cart.priceOfSamsaungGalaxyS6();
		int laptopPrice = cart.priceOfDelli78GB();
		int  monitorPrice = cart.priceOfAsusFullHD();
				
		TreeSet ts = new TreeSet();
		ts.add(phonePrice);
		ts.add(laptopPrice);
		ts.add(monitorPrice);
		
		System.out.println(ts);
		
		// add product price and compare it with total 
		int Total = cart.getTotal();
		
		int sumOfAll = phonePrice+laptopPrice+monitorPrice ;
		
		if (sumOfAll==Total )
		{
			System.out.println("Sum of each product price is equal to the Total");
		}
		else
		{
			System.out.println("Sum of each product price is not equal to the Total");
		}
		
		//Click on Place Order and enter info
		
		cart.clickOnPlaceOrder();
		
		PlaceOrderPage order = new PlaceOrderPage(driver);
		Thread.sleep(2000);
		order.enterName("Suvarna");
		order.enterCountry("India");
		order.enterCity("Nashik");
		order.enterCreditCard("1234");
		order.enterMonth("August");
		order.enterYear("2022");
		order.clickOnPurchase();
		
		// get ID and Amount
		
		String details = order.getDetails();
		 String s = details.split(" ")[0];
		 System.out.println(s);
		 String s1 = details.split(" ")[1];
		System.out.println(s1);
		System.out.println();
		System.out.println(details.substring(0, 10));
		System.out.println(details.substring(11, 28));
	    
	   
	   
		
		
		
		
		
}
		


}
