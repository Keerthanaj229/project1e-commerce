package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.HomePage;
import PageObjects.LoginPage;
import PageObjects.WelcomePage;
import TestBase.BaseClass;

public class TC_002_LoginPage extends BaseClass {
     @Test(groups={"regression","master"})
	public void verifyLoginTest()
	{
    	 
		HomePage hp= new HomePage(driver);
		hp.clickLogin();
		LoginPage lp= new LoginPage(driver);
		logger.info("entering loginCredentials");
		lp.setEmail(p.getProperty("email"));
		lp.setpwd(p.getProperty("password"));
		lp.click();
		logger.info("clicked on login button");
		logger.info("verifying welcomePage--");
		WelcomePage wp= new WelcomePage(driver);
		boolean welpage = wp.isDisplayed();
		Assert.assertEquals(welpage, true);
		logger.info("**** Finished TC_002_LoginTest  ****");
		
		
	}
	
}
