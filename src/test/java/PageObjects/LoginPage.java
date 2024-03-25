package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath="//input[@id='Email']")  private WebElement email;
	@FindBy(xpath="//input[@id='Password']") private WebElement password;
	@FindBy(xpath="//button[normalize-space()='Log in']") private WebElement logIn;
	
	public void setEmail(String mail)
	{
		email.sendKeys(mail);
		
	}
	public void setpwd(String pwd)
	{
		password.sendKeys(pwd);
	}
	public void click()
	{
		logIn.click();
	}
}
