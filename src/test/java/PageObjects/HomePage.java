package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//a[normalize-space()='Register']")
	public WebElement register;
	@FindBy(xpath="//a[normalize-space()='Log in']")  private WebElement logIn;

	public void clickRegister()
	{
		register.click();
		
	}
	
	public void clickLogin()
	{
		logIn.click();
	}
}
