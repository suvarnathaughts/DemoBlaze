package pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {
	
	
	public LogInPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy (xpath="//input[@id='loginusername']")
	private WebElement Username;
	
	@FindBy (xpath="//input[@id='loginpassword']")
	private WebElement Password;
	
	@FindBy (xpath="//button[contains(text(),'Log in')]")
	private WebElement LogInButton;
	
	public void enterUserName(String username)
	{
		Username.sendKeys(username);
	}
	public void enterPassword(String password)
	{
		Password.sendKeys(password);
	}
	public void clickOnLoginButton()
	{
		LogInButton.click();
	}

}
