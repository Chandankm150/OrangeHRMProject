package testCase;

import org.testng.annotations.Test;

import pageObject.loginPage;
import testBase.BaseClass;

public class TC02_ExpenseType_Test extends BaseClass {
	
	
	@Test (groups = {"regression","Master"})
	public void verify_expent_type() throws InterruptedException
	{
		loginPage lp=new loginPage(driver); 
		logger.info("$$Login startes$$");
		lp.setusername(p.getProperty("UserName"));
		Thread.sleep(2000);
		logger.info("$$Entered the user name$$");
		lp.setpassword(p.getProperty("Password"));
		Thread.sleep(2000);
		logger.info("$$Entered the password$$");
		lp.clicklogin();
		Thread.sleep(2000);
		logger.info("$$loged in successfully  $$");
		
		lp.clickclaim();
		logger.info("$$claim clicked successfully  $$");
		lp.clickconfiguration();
		logger.info("$$configuration clicked successfully  $$");
		lp.clickexpenseType();
		logger.info("$$expense clicked successfully  $$");
		lp.clickAddexpense();
		logger.info("$$Addexpense clicked successfully  $$");
		
		lp.setexpensename(p.getProperty("ExpenseName"));
		logger.info("$$Entered the expense type name$$");
		
		lp.setexpensedescription(p.getProperty("ExpenseDescription"));
		logger.info("$$Entered the expense description$$");
		
		Thread.sleep(2000);
		lp.clickexpensesave();
		logger.info("$$save successfilly$$");
	}

}
