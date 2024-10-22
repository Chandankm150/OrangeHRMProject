package testCase;

import org.testng.annotations.Test;

import pageObject.loginPage;
import testBase.BaseClass;

public class TC01_LoginTest extends BaseClass {

	
	
	
	@Test (groups = {"sanity","Master"})
	public void verify_account_login()
	{
		loginPage lp=new loginPage(driver); 
		logger.info("$$Login startes$$");
		lp.setusername(p.getProperty("UserName"));
		logger.info("$$Entered the user name$$");
		lp.setpassword(p.getProperty("Password"));
		logger.info("$$Entered the password$$");
		lp.clicklogin();
		logger.info("$$loged in successfully  $$");
		
	}
}


