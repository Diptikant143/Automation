package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;




public class PermissionManagement {
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
	
	@FindBy(xpath = "//div[@class='mat-form-field-infix ng-tns-c146-8']")
    private WebElement dropdownElement;
	
	@FindBy(xpath = "//span[@class='mat-option-text'][1]")
    private WebElement chooseIRM;
	
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
	//====================This is for login ends=====================================
	//====================This is for permission management starts===================
	
	@FindBy(xpath="//*[@class='ionicon']")
	private WebElement clickOnHamBurgerSign;
	
	@FindBy(xpath="//*[@id=\"kt_aside_menu_top\"]/ul/li[7]/a/span[2]")
	private WebElement setUpAdmin;
	
	@FindBy(xpath="//*[@id=\"kt_aside_menu_top\"]/ul/li[7]/div/ul/li[6]/a/span")
	private WebElement permissionManagement;
	
	@FindBy(xpath="//*[@id=\"mat-select-value-3\"]/span")
	private WebElement chooseACustomer;
	
	@FindBy(xpath="//span[text()=' TestFusion11 ']")
	private WebElement selectYourClient;
	
	@FindBy(xpath="//*[@id=\"mat-input-5\"]")
	private WebElement policyName;
	
	@FindBy(xpath="//*[@id=\"mat-select-value-9\"]/span")
	private WebElement chooseACatagory;
	
	@FindBy(xpath="//*[@id=\"mat-select-8-panel\"]/mat-select-filter/form/div/input")
	private WebElement chooseTheCatagory;
	
	@FindBy(xpath="(//span[@class=\"mat-option-text\"])[3]")
	private WebElement chooseAsCountryHead;
	
	@FindBy(xpath="/html[1]/body[1]/app-layout[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/app-permission-management[1]/app-pm-body[1]/app-pm-body-table[1]/div[2]/div[1]/div[1]/div[3]/mat-form-field[1]/div[1]/div[1]/div[1]/mat-select[1]/div[1]/div[1]/span[1]")
	private WebElement selectAModule;
	
	@FindBy(xpath="//span[text()='SMTP Email Notifications']")
	private WebElement chooseImatrix;
	
	@FindBy(xpath="//span[@class=\"mat-select-placeholder mat-select-min-line ng-tns-c155-22 ng-star-inserted\"]")
	private WebElement defaultPage;
	
	@FindBy(xpath="//span[text()='Email Configuration']")
	private WebElement chooseDefaultPage;
	
	@FindBy(xpath="//*[@id=\"kt_content\"]/div[2]/div/app-permission-management/app-pm-body/app-pm-body-table/div[2]/div/div[2]/button/span[1]")
	private WebElement clickOnCreatePolicy;
	
	@FindBy(xpath="//button[@class=\"swal2-confirm swal2-styled swal2-default-outline\"]")
	private WebElement clickOkay;
	
	@FindBy(xpath="//*[@id=\"kt_subheader\"]/div/div[3]/div")
	private WebElement clickOnIRM;
	
	@FindBy(xpath="(//a[@class=\"p-menuitem-link\"])[2]")
	private WebElement logoutButton;
	
	@FindBy(xpath="(//span[@class=\"mat-button-wrapper\"])[1]")
	private WebElement clickOnNewPolicy;
	

	
	
	public WebElement getClickOnNewPolicy() {
		return clickOnNewPolicy;
	}

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

	public WebElement getPermissionManagement() {
		return permissionManagement;
	}

	public WebElement getChooseACustomer() {
		return chooseACustomer;
	}

	public WebElement getSelectYourClient() {
		return selectYourClient;
	}

	public WebElement getPolicyName() {
		return policyName;
	}

	public WebElement getChooseACatagory() {
		return chooseACatagory;
	}

	public WebElement getChooseTheCatagory() {
		return chooseTheCatagory;
	}

	public WebElement getChooseAsCountryHead() {
		return chooseAsCountryHead;
	}

	public WebElement getSelectAModule() {
		return selectAModule;
	}

	public WebElement getChooseImatrix() {
		return chooseImatrix;
	}

	public WebElement getDefaultPage() {
		return defaultPage;
	}

	public WebElement getChooseDefaultPage() {
		return chooseDefaultPage;
	}

	public WebElement getClickOnCreatePolicy() {
		return clickOnCreatePolicy;
	}

	public WebElement getClickOkay() {
		return clickOkay;
	}
	
	//====================This is for permission management ends=====================
}
