package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.HomePage;
import PageObjects.LoginPage;
import PageObjects.WelcomePage;
import TestBase.BaseClass;
import Utilities.ProviderData;

public class TC_003_DataDriventest extends BaseClass {
     @Test(dataProvider="loginData",dataProviderClass=ProviderData.class)
	public void verifyLogin(String mail, String pwd, String exp)
	{   try {
		

		HomePage hp= new HomePage(driver);
		hp.clickLogin();
		LoginPage lp= new LoginPage(driver);
		lp.setEmail(mail);
		lp.setpwd(pwd);
		lp.click();
		
		WelcomePage wp= new WelcomePage(driver);
		Boolean Target=wp.isDisplayed();
		
		if(exp.equalsIgnoreCase("Valid"))
				{
			
		if(Target==true)
		{
			wp.click();
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
			
				}

		if(exp.equalsIgnoreCase("Invalid"))
		{
			if(Target==true)
			{
				wp.click();
				Assert.assertTrue(false);
			}
			else
			{
				Assert.assertTrue(true);
			}
		}
	}
	catch(Exception e)
	{
		Assert.fail("Exception error occured:"+ e.getMessage());
	}
		
		
	}
}
