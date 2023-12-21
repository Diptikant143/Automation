package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IRemediation {
	@FindBy(xpath="//input[@name='username']")
	private WebElement userNameTextField;
	
	
	
	@FindBy(xpath="//span[text()='LOGIN']")
	private WebElement lohinbtn;
	
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement passwordtextfield;
	

	@FindBy(xpath="//span[text()='LOGIN']")
	private WebElement loginbtn2;
	
	
	@FindBy(xpath="//div[@class=\'topbarProfile d-flex justify-content-between align-items-center\']")

	private WebElement CChange;

	

	@FindBy(xpath="//span[text()=' Change Client ']")

	private WebElement ClientChange;

	

	@FindBy(xpath="//span[text()=' TheDemoCo. ']")

	private WebElement anotherclient;

	

	@FindBy(xpath="(//span[text()='iMatrix'])[1]")

	private WebElement iMatrixbtn;

	

	@FindBy(xpath="//span[text()='IRemediation']")

	private WebElement iremadiation;

	

	@FindBy(xpath="//div[@class=\'mat-select-arrow-wrapper ng-tns-c189-9\']")

	private WebElement controls;

	

	@FindBy(xpath="//span[text()=' Approve Payables Invoices and Create Payables Invoices ']")

	private WebElement controlsname;

	

	@FindBy(xpath="//span[@class='mat-select-placeholder mat-select-min-line ng-tns-c189-11 ng-star-inserted']")

	private WebElement roles;

	

	@FindBy(xpath="//span[text()=' Accounts Payable Manager ']")

	private WebElement role1;

	

	@FindBy(xpath="//span[text()='f 1302 Warehouse Manager ']")

	private WebElement role2;



	public IRemediation(WebDriver driver) {
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



	public WebElement getCChange() {
		return CChange;
	}



	public WebElement getClientChange() {
		return ClientChange;
	}



	public WebElement getAnotherclient() {
		return anotherclient;
	}



	public WebElement getiMatrixbtn() {
		return iMatrixbtn;
	}



	public WebElement getIremadiation() {
		return iremadiation;
	}



	public WebElement getControls() {
		return controls;
	}



	public WebElement getControlsname() {
		return controlsname;
	}



	public WebElement getRoles() {
		return roles;
	}



	public WebElement getRole1() {
		return role1;
	}



	public WebElement getRole2() {
		return role2;
	}
	
	
	
	
	
	
	
	
	
	

}
