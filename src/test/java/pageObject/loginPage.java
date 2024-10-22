package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginPage extends BasePage{
	public  loginPage(WebDriver driver)
	{
		super(driver);
	}
	
	
	//locators
	@FindBy(xpath="//input[@placeholder='Username']")
	WebElement txt_userName;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement txt_password;	

	@FindBy(xpath="//button[@type='submit']")
	WebElement btn_login;	
	
	
	@FindBy(xpath="//a[@class='oxd-main-menu-item active']")   //span[normalize-space()='Claim']
	WebElement confirmMessage;
	
	
	@FindBy(xpath="//span[normalize-space()='Claim']")     //button[normalize-space()='Assign Claim']
	WebElement btn_claim;
	
	@FindBy(xpath="//span[@class='oxd-topbar-body-nav-tab-item']")     //a[normalize-space()='Expense Types']
	WebElement btn_configuration;
	
	@FindBy(xpath="//a[normalize-space()='Expense Types']")     //input[@class='oxd-input oxd-input--focus']
	WebElement btn_expenseType;
	
	@FindBy(xpath="//button[normalize-space()='Add']")     //input[@class='oxd-input oxd-input--focus']
	WebElement btn_addExpense;
	
	@FindBy(xpath="//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']")     //textarea[@class='oxd-textarea oxd-textarea--focus oxd-textarea--resize-vertical']
	WebElement txt_expenseName;
	
	@FindBy(xpath="//textarea[@class='oxd-textarea oxd-textarea--active oxd-textarea--resize-vertical']")     //button[@type='submit']
	WebElement txt_expensedescription;
	
	@FindBy(xpath="//button[@type='submit']")     //button[@type='submit']
	WebElement btn_Save;
	
	public void setusername(String username)
	{
		txt_userName.sendKeys("Admin");
	}
	
	public void setpassword(String password)
	{
		txt_password.sendKeys("admin123");
	}
	
	public void clicklogin()
	{
		btn_login.click();
	}
	
	
	public void clickclaim()
	{
		btn_claim.click();
	}
	
	public void clickconfiguration()
	{
		btn_configuration.click();
	}
	
	public void clickexpenseType()
	{
		btn_expenseType.click();
	}
	
	
	public void clickAddexpense()
	{
		btn_addExpense.click();
	}
	
	public void setexpensename(String expensename)
	{
		txt_expenseName.sendKeys("Anil");
	}
	
	public void setexpensedescription(String description)
	{
		txt_expensedescription.sendKeys("sample data of automation testing");
	}
	
	public void clickexpensesave()
	{
		btn_Save.click();
	}
	
	public String getconfirmmessage() {
	
	try{
		
		return (confirmMessage.getText());
	}catch (Exception e) {
		return(e.getMessage());
	}
	
	
	
	
	}
}
