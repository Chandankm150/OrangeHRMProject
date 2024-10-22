package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends BasePage {
	
	public  AccountPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//img[@alt='client brand banner']")
	WebElement imgconfirm;
	
	@FindBy(xpath="//span[@class='oxd-userdropdown-tab']")
	WebElement profiledropdown;
	
	@FindBy(xpath="//a[normalize-space()='Logout']")
	WebElement linklogout;
	
	
	public boolean isOrangeHRMImageExists()
	{
		try
		{
			return (imgconfirm.isDisplayed());
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	
	public void profiledropdown()
	{
		profiledropdown.click();
	}
	
	public void clicklogout()
	{
		linklogout.click();
	}

}
