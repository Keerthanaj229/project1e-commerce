package TestCases;


import org.testng.Assert;
import org.testng.annotations.*;

import PageObjects.HomePage;
import PageObjects.RegisterPage;
import TestBase.BaseClass;

public class TC_001_AccountRegistration extends BaseClass {
 
	
	
	@Test(groups= {"sanity","master"})
	public void verifyAccountRegistration()
	{
		logger.info("TC_001_registrationTest started!!!");
		HomePage hm =new HomePage(driver);
		hm.clickRegister();
		logger.info("Registration_clicked action done");
		RegisterPage rp = new RegisterPage(driver);
		logger.info("entering registration details");
		rp.setFirstname(randomString().toUpperCase());
		rp.setLastname(randomString().toUpperCase());
		rp.setemail(randomString()+"@gmail.com");
		String pwwd= AlphaNumeric();
		rp.setpwd(pwwd);
		rp.setCpwd(pwwd);		
		rp.clickRegister();
		logger.info("clicked register");
		String comfirmmsg= rp.getConfirmation();
		logger.info("Validating expected message..");
		if(comfirmmsg.equals("Your registration completed"))
		{ 
			logger.info("TestCase Passed!");
			Assert.assertTrue(true);
		}
		
		else
			
			
		{
			logger.error("TestCaseFailed!!");
			Assert.fail();
		}
			
		logger.info("validation completed");
		logger.info("TC_001_registrationTest completed!!!");
		
	}
	
	
}
