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
	private WebElement setupbtn;
	
	
	@FindBy(xpath="//span[text()='Permission Management']")
	private WebElement permissionbtn;
	
	
	@FindBy(xpath="//div[@class='mat-select-value ng-tns-c189-7']")
	private WebElement customer;
	
	@FindBy(xpath="//span[text()=' Client_Demo ']")
	private WebElement clientname;
	
	
	@FindBy(xpath="//input[@id='mat-input-3']")
	private WebElement policyname;
	
	
	@FindBy(xpath="//div[@class='mat-select-value ng-tns-c189-12']")
	private WebElement catagoryname;
	
	
	@FindBy(xpath="//span[text()='Country Head']")
	private WebElement countryname;
	
	
	@FindBy(xpath="//span[text()='Create Policy ']")
	private WebElement createpolicy;
	
	
	@FindBy(xpath="//button[text()='OK']")
	private WebElement permissionsaved;
	
	
	
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

	public WebElement getSetupbtn() {
		return setupbtn;
	}

	public WebElement getPermissionbtn() {
		return permissionbtn;
	}

	public WebElement getCustomer() {
		return customer;
	}

	public WebElement getClientname() {
		return clientname;
	}

	public WebElement getPolicyname() {
		return policyname;
	}

	public WebElement getCatagoryname() {
		return catagoryname;
	}

	public WebElement getCountryname() {
		return countryname;
	}

	public WebElement getCreatepolicy() {
		return createpolicy;
	}

	public WebElement getPermissionsaved() {
		return permissionsaved;
	}


	
	
	
	
	
	

}
