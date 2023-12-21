package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SodMatrix {
	
	
	@FindBy(xpath="//input[@name='username']")
	private WebElement userNameTextField;
	
	
	@FindBy(xpath="//span[text()='LOGIN']")
	private WebElement lohinbtn;
	
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement passwordtextfield;
	

	@FindBy(xpath="//span[text()='LOGIN']")
	private WebElement loginbtn2;
     
	
	@FindBy(xpath="//div[@class='topbarProfile d-flex justify-content-between align-items-center']")
	private WebElement logo1;
	
	
	@FindBy(xpath="//span[text()=' Change Client ']")
	private WebElement client;
	
	
	@FindBy(xpath="//span[text()=' TheDemoCo. ']")
	private WebElement Demo;
	
	
	

	@FindBy(xpath="(//span[text()='iMatrix'])[1]")
	private WebElement iMatrix1;
	
	
	@FindBy(xpath="(//span[text()='iMatrix'])[1]")
	private WebElement iMatrix2;
	
	
	@FindBy(xpath="//span[text()='SoD Matrix']")
	private WebElement SoDMatrix;
	
	
	@FindBy(xpath="(//span[text()=' Edit '])[2]")
	private WebElement controls;
	
	@FindBy(xpath="(//div[@class='mat-chip-list-wrapper'])[1]")
	private WebElement sod;
	
	
	@FindBy(xpath="(//span[@class='mat-option-text'])[5]")
	private WebElement sod1;
	
	

	@FindBy(xpath="//span[@class='mat-chip-remove mat-chip-trailing-icon ng-star-inserted']")
	private WebElement Manage;
	
	
	@FindBy(xpath="//span[text()=' Manage Employee and Manage Payroll ']")
	private WebElement Newsod;
	
	
	@FindBy(xpath="//mat-icon[text()='cancel']")
	private WebElement Icon;
	

	@FindBy(xpath="//input[@id='mat-chip-list-input-0']")
	private WebElement Inputtextbox;
	
	
	@FindBy(xpath="//input[@id='mat-chip-list-input-3']")
	private WebElement Entitlement;
	

	@FindBy(xpath="//span[text()=' Manage Payroll Batch Processes ']")
	private WebElement Process;
	
	
	@FindBy(xpath="//mat-icon[text()='cancel']")
	private WebElement Cancel;
	
	
	

	public SodMatrix(WebDriver driver) {
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


	public WebElement getLogo1() {
		return logo1;
	}


	public WebElement getClient() {
		return client;
	}


	public WebElement getDemo() {
		return Demo;
	}


	public WebElement getiMatrix1() {
		return iMatrix1;
	}


	public WebElement getiMatrix2() {
		return iMatrix2;
	}


	public WebElement getSoDMatrix() {
		return SoDMatrix;
	}


	public WebElement getControls() {
		return controls;
	}


	public WebElement getSod() {
		return sod;
	}


	public WebElement getSod1() {
		return sod1;
	}


	public WebElement getManage() {
		return Manage;
	}


	public WebElement getNewsod() {
		return Newsod;
	}


	public WebElement getIcon() {
		return Icon;
	}


	public WebElement getInputtextbox() {
		return Inputtextbox;
	}


	public WebElement getEntitlement() {
		return Entitlement;
	}


	public WebElement getProcess() {
		return Process;
	}


	public WebElement getCancel() {
		return Cancel;
	}


	
	
	
	
	
	
	
	

}
