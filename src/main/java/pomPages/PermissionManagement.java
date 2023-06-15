package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;




public class PermissionManagement {
	
	@FindBy(xpath="//input[@name='username']")
	private WebElement userNameTextField;
	
	
	
	@FindBy(xpath="//span[text()='LOGIN']")
	private WebElement lohinbtn;
	
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement passwordtextfield;
	

	@FindBy(xpath="//span[text()='LOGIN']")
	private WebElement loginbtn2;
	
	





	@FindBy(xpath="(//span[text()='Setup and Administration'])[1]")

	private WebElement Setup;

	

	@FindBy(xpath="//span[text()='Permission Management']")

	private WebElement PermissionManagement;

	

	@FindBy(xpath="//span[@class=\'mat-select-placeholder mat-select-min-line ng-tns-c189-7 ng-star-inserted\']")

	private WebElement Choosecustomer;

	

	@FindBy(xpath="//span[text()=' iRM Super Admin ']")

	private WebElement Customer;

	

	@FindBy(xpath="//input[@placeholder=\'Ex. Administrator\']")

	private WebElement PolicyName;

	

	@FindBy(xpath="//span[@class=\'mat-select-placeholder mat-select-min-line ng-tns-c189-12 ng-star-inserted\']")

	private WebElement Catagory;

	

	@FindBy(xpath="//span[text()='Manager']")

	private WebElement Catagory1;

	

	@FindBy(xpath="//span[text()='Create Policy ']")

	private WebElement CreatePolicy;






	
	
	
	public PermissionManagement(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}









	public WebElement getUserNameTextField() {
		return userNameTextField;
	}









	public WebElement getLohinbtn() {
		return lohinbtn;
	}









	public WebElement getPasswordtextfield() {
		return passwordtextfield;
	}









	public WebElement getLoginbtn2() {
		return loginbtn2;
	}









	public WebElement getSetup() {
		return Setup;
	}









	public WebElement getPermissionManagement() {
		return PermissionManagement;
	}









	public WebElement getChoosecustomer() {
		return Choosecustomer;
	}









	public WebElement getCustomer() {
		return Customer;
	}









	public WebElement getPolicyName() {
		return PolicyName;
	}









	public WebElement getCatagory() {
		return Catagory;
	}









	public WebElement getCatagory1() {
		return Catagory1;
	}









	public WebElement getCreatePolicy() {
		return CreatePolicy;
	}

	
	
	
	
	
	

}
