package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WelcomePage extends BasePage{

	public WelcomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//h2[normalize-space()='Welcome to our store']")
	private WebElement welcomeToOurStore;
	@FindBy(xpath="//a[normalize-space()='Log out']") 
	private WebElement logOut;
	
	public boolean isDisplayed()
	{
		try
		{
			return(welcomeToOurStore.isDisplayed());
		}
		catch(Exception e)
		{
			return(false);
		}
	}
	
	public void click()
	{
		logOut.click();
	}
	
}
