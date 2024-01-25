package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class newUser {
	
	//====================This is for login starts=====================================
	@FindBy(xpath="//input[@name='username']")
	private WebElement userNameTextField;
	
	
	@FindBy(xpath="//span[text()='LOGIN']")
	private WebElement lohinbtn;
	
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement passwordtextfield;
	

	@FindBy(xpath="//span[text()='LOGIN']")
	private WebElement loginbtn2;
	
	
	@FindBy(xpath="//button[@id='details-button']")
	private WebElement clickOnAdvanced;
 
	@FindBy(xpath="//a[@id='proceed-link']")
	private WebElement clickOnUnsafeLink;
	
	@FindBy(xpath = "//div[@class='mat-form-field-infix ng-tns-c146-6']")
    private WebElement dropdownElement;
	
	@FindBy(xpath = "//span[@class='mat-option-text'][1]")
    private WebElement chooseIRM;
	

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

	public WebElement getClickOnAdvanced() {
		return clickOnAdvanced;
	}

	public WebElement getClickOnUnsafeLink() {
		return clickOnUnsafeLink;
	}

	public WebElement getDropdownElement() {
		return dropdownElement;
	}

	public WebElement getChooseIRM() {
		return chooseIRM;
	}
	
	public newUser(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	//====================This is for login ends=====================================
	//====================new user starts============================================
	@FindBy(xpath="//*[@class='ionicon']")
	private WebElement clickOnHamBurgerSign;

	@FindBy(xpath="//*[@id=\"kt_aside_menu_top\"]/ul/li[7]/a/span[2]")
	private WebElement setUpAdmin;
	
	@FindBy(xpath="//*[@id=\"kt_aside_menu_top\"]/ul/li[7]/div/ul/li[5]/a/span")
	private WebElement createNewUser;
	
	@FindBy(xpath="//*[@id=\"mat-input-5\"]")
	private WebElement firstName;
	
	@FindBy(xpath="//*[@id=\"mat-input-6\"]")
	private WebElement lastName;
	
	@FindBy(xpath="//*[@id=\"mat-input-7\"]")
	private WebElement emailId;
	
	@FindBy(xpath="//*[@id=\"mat-input-8\"]")
	private WebElement contactNumber;
	
	@FindBy(xpath="//*[@id=\"mat-input-9\"]")
	private WebElement userName;
	
	@FindBy(xpath="//*[@id=\"mat-input-10\"]")
	private WebElement password;

	@FindBy(xpath="//span[@class=\"mat-select-placeholder mat-select-min-line ng-tns-c155-16 ng-star-inserted\"]")
	private WebElement client;
	
	@FindBy(xpath="//span[text()=' Test_Automation']")
	private WebElement chooseClient;
	
	@FindBy(xpath="//span[text()='Permission Policy']")
	private WebElement permissionPolicy;
	
	@FindBy(xpath="//span[text()=' Test_Automation:Admin']")
	private WebElement choosePermissionPolicy;
	
	@FindBy(xpath="//*[@id=\"mat-input-11\"]")
	private WebElement endDate;
	
	@FindBy(xpath="//*[@id=\"mat-checkbox-1\"]/label/span[1]")
	private WebElement uncheckMail;
	
	@FindBy(xpath="//*[@id=\"button1\"]/span[1]")
	private WebElement createANewUser;
	
	
	@FindBy(xpath="//*[@id=\"kt_subheader\"]/div/div[3]/div")
	private WebElement clickOnIRM;
	
	@FindBy(xpath="(//a[@class=\"p-menuitem-link\"])[2]")
	private WebElement logoutButton;
	
	
	
	/*After submission
	 * @FindBy(xpath="//*[@id=\"swal2-html-container\"]")
	 
	private WebElement UserStatusSavedSuccessfully;
	
	@FindBy(xpath="//*[@id=\"kt_body\"]/div[3]/div/div[6]/button[1]")
	private WebElement okayButton;
	*/
	
	
	
	public WebElement getClickOnIRM() {
		return clickOnIRM;
	}

	public WebElement getLogoutButton() {
		return logoutButton;
	}

	public WebElement getClickOnHamBurgerSign() {
		return clickOnHamBurgerSign;
	}

	public WebElement getSetUpAdmin() {
		return setUpAdmin;
	}

	public WebElement getCreateNewUser() {
		return createNewUser;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getEmailId() {
		return emailId;
	}

	public WebElement getContactNumber() {
		return contactNumber;
	}

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getClient() {
		return client;
	}

	public WebElement getChooseClient() {
		return chooseClient;
	}

	public WebElement getPermissionPolicy() {
		return permissionPolicy;
	}

	public WebElement getChoosePermissionPolicy() {
		return choosePermissionPolicy;
	}

	public WebElement getEndDate() {
		return endDate;
	}

	public WebElement getUncheckMail() {
		return uncheckMail;
	}

	public WebElement getCreateANewUser() {
		return createANewUser;
	}

	
}
