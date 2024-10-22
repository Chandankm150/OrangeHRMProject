package testCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.AccountPage;
import pageObject.loginPage;
import testBase.BaseClass;
import utilities.DataProviders;

public class TC03_DDT_test extends BaseClass {
	
	
	@Test(dataProvider="LoginData", dataProviderClass=DataProviders.class, groups = "DataDriven")
	public void verify_login_DDT(String UserName, String Password,String exp ) 
	{

		logger.info("&&Started_TC03_DDT_test    &&");
		try {
			
		
		
		loginPage lp=new loginPage(driver); 
		lp.setusername(UserName);
		Thread.sleep(2000);
		lp.setpassword(Password);
		Thread.sleep(2000);
		lp.clicklogin();
		
		AccountPage macc=new AccountPage(driver);
		boolean targetpage= macc.isOrangeHRMImageExists();
		
		
		if(exp.equalsIgnoreCase("Valid"))
		{
			if(targetpage==true)
			{
				macc.profiledropdown();
				macc.clicklogout();
				Assert.assertTrue(true);
				
			}
			else
			{
				Assert.assertTrue(false);
			}
		}
		
		
		if(exp.equalsIgnoreCase("Invalid"))
		{
			if(targetpage==true)
			{
				macc.profiledropdown();
				macc.clicklogout();
				Assert.assertTrue(false);
				
			}
			else
			{
				Assert.assertTrue(true);
			}
		}
		}catch (Exception e) {
			Assert.fail("An exception occurred: " + e.getMessage());
		}
		
		logger.info("&$ Finished _TC03_DDT_test    &&");
	}
	

}
