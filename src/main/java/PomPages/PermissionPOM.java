package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PermissionPOM {

	
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


	
	//constractor
	
	public PermissionPOM(WebDriver driver) {
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}

	//getter

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
