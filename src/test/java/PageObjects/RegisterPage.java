package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage {

	WebDriver driver;
	public RegisterPage(WebDriver driver)
	{
	  super(driver);
		// TODO Auto-generated constructor stub
	}

	
@FindBy(xpath="//input[@id='LastName']")  private WebElement lastName;
@FindBy(xpath="//input[@id='FirstName']")  private WebElement firstName;
@FindBy(xpath="//input[@id='Email']")  private WebElement email;
@FindBy(xpath="//input[@id='Password']")  private WebElement password;
@FindBy(xpath="//input[@id='ConfirmPassword']")  private WebElement confirmPassword;
@FindBy(xpath="//button[@id='register-button']")  private WebElement register;
@FindBy(xpath="//div[@class='result']")  private WebElement confirmation;

public void setFirstname(String fname )
{
	firstName.sendKeys(fname);
}
public void setLastname(String lname )
{
	lastName.sendKeys(lname);
}
public void setemail(String emailID )
{
	email.sendKeys(emailID);
}
public void setpwd(String pwd )
{
	password.sendKeys(pwd);
}
public void setCpwd(String cpwd )
{
	confirmPassword.sendKeys(cpwd);
}


public void clickRegister()
{
	register.click();
}

public String getConfirmation()
{
	return(confirmation.getText());
}
}
