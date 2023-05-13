package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewuser {
	
	@FindBy(xpath="//input[@name='username']")
	private WebElement userNameTextField;
	@FindBy(xpath="//span[text()='LOGIN']")
	private WebElement lohinbtn;
	
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement passwordtextfield;
	

	@FindBy(xpath="//span[text()='LOGIN']")
	private WebElement loginbtn2;
	
	
	@FindBy(xpath="(//span[text()='Setup and Administration'])[1]")
	private WebElement setup2;
	

	@FindBy(xpath="//span[text()='Create New User']")
	private WebElement createnewuser;
	
	
	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement firstname;
	
	
	@FindBy(xpath="(//input[@type='text'])[3]")
	private WebElement lastname;
	
	
	@FindBy(xpath="(//input[@type='text'])[4]")
	private WebElement emailid;
	
	
	@FindBy(xpath="//input[@type='number']")
	private WebElement contactnumber;
	
	

	@FindBy(xpath="(//input[@type='text'])[5]")
	private WebElement username;
	

	@FindBy(xpath="//input[@type='password']")
	private WebElement password;
	
	@FindBy(xpath="//span[text()='Choose Customer']")
	private WebElement forcustomer;
	
	
	@FindBy(xpath="//span[text()=' Client_Demo']")
	private WebElement testingclient;
	
	
	@FindBy(xpath="//div[@class='mat-select-value ng-tns-c189-14']")
	private WebElement permissionpolicy;
	
	
	@FindBy(xpath="//span[text()=' Client_Demo:TESTAUTOMATION']")
	private WebElement permissionpolicyclient;
	
	
	@FindBy(xpath="//input[@formcontrolname='endDate']")
	private WebElement 	ENDDATE;
	
	@FindBy(xpath="//span[text()='Verify Email']")
	private WebElement 	verifymail;
	
	@FindBy(xpath="(//span[text()='Create New User'])[2]")
	private WebElement 	CREATENEWUSER;

	@FindBy(xpath="//button[text()='OK']")
	private WebElement 	CREATENEWUSERALERTOK;
	
	
	@FindBy(xpath="//div[@role='button']")
	private WebElement iRMBUTTON;
	
	
	@FindBy(xpath="//span[text()=' Log Out ']")
	private WebElement Logoutbtn;
	
	
	public CreateNewuser(WebDriver driver) {
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

	public WebElement getSetup2() {
		return setup2;
	}

	public WebElement getCreatenewuser() {
		return createnewuser;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getEmailid() {
		return emailid;
	}

	public WebElement getContactnumber() {
		return contactnumber;
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getForcustomer() {
		return forcustomer;
	}

	public WebElement getTestingclient() {
		return testingclient;
	}

	public WebElement getPermissionpolicy() {
		return permissionpolicy;
	}

	public WebElement getPermissionpolicyclient() {
		return permissionpolicyclient;
	}

	public WebElement getENDDATE() {
		return ENDDATE;
	}

	public WebElement getVerifymail() {
		return verifymail;
	}

	public WebElement getCREATENEWUSER() {
		return CREATENEWUSER;
	}

	public WebElement getCREATENEWUSERALERTOK() {
		return CREATENEWUSERALERTOK;
	}

	public WebElement getiRMBUTTON() {
		return iRMBUTTON;
	}

	public WebElement getLogoutbtn() {
		return Logoutbtn;
	}

	
	
	
	
	

}
