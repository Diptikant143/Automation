package pomPages;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import GenericUtils.JavaUtility;

public class RegisterNewClient {
	
	@FindBy(xpath="//input[@name='username']")
	private WebElement userNameTextField;
	
	
	@FindBy(xpath="//span[text()='LOGIN']")
	private WebElement lohinbtn;
	
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement passwordtextfield;
	

	@FindBy(xpath="//span[text()='LOGIN']")
	private WebElement loginbtn2;
	
	
	@FindBy(xpath="//button[@id='details-button']") ////button[@id=\'details-button\'
	private WebElement clickOnAdvanced;
 
	@FindBy(xpath="//a[@id='proceed-link']")
	private WebElement clickOnUnsafeLink;

	/*@FindBy(xpath="//button[@class=\'secondary-button small-link\']")
	private WebElement AdavanceBTN;*/
	
	@FindBy(xpath = "//div[@class='mat-form-field-infix ng-tns-c146-6']")
    private WebElement dropdownElement;
	
	@FindBy(xpath = "//span[@class='mat-option-text'][1]")
    private WebElement chooseIRM;

	public RegisterNewClient(WebDriver driver) {
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

//We can comment it later
//==============================Starts Register New Client form here=======================================
//==============================Starts Register New Client General=========================================
	@FindBy(xpath="//*[@class='ionicon']")
	private WebElement clickOnHamBurgerSign;
	
	@FindBy(xpath="//*[@id=\"kt_aside_menu_top\"]/ul/li[6]/a/span[2]")
	private WebElement registerNewClientDropdown;
	
	@FindBy(xpath="//*[@id=\"kt_aside_menu_top\"]/ul/li[6]/div/ul/li[2]/a/span")
	private WebElement registerNewClientButton;
	//=====================Client Type=====================================
	@FindBy(xpath="//*[@id=\"cdk-step-content-0-0\"]/form/mat-form-field[1]/div/div[1]/div")
	private WebElement selectClientType1;
	
	@FindBy(xpath="(//span[@class='mat-option-text'])[1]")
	private WebElement selectClientTypeAsTechnicalSuperAdmin;
	////*[@id="mat-option-0"]/span
	//=====================Parent Company=====================================
	@FindBy(xpath="//span[@class='mat-select-placeholder mat-select-min-line ng-tns-c155-13 ng-star-inserted']")
	private WebElement chooseParentCompany;
	
	@FindBy(xpath="(//span[@class='mat-option-text'])[1]")
	private WebElement chooseAsIRMAdmin;
	//=====================Client leagal entity=============================
	@FindBy(xpath="//input[@id='mat-input-5']")
	private WebElement clientLeagalEntity;
	//=====================Head Quarter=====================================
	@FindBy(xpath="//input[@id='mat-input-6']")
	private WebElement headquarter;
	//=====================Employee Range=====================================
	@FindBy(xpath="//div[@class=\"mat-form-field-infix ng-tns-c146-16\"]")
	private WebElement employeeRange;
	
	@FindBy(xpath="(//span[@class='mat-option-text'])[3]")
	private WebElement chooseEmployeeRange;
	//=====================Scope of Entity=====================================
	@FindBy(xpath="//input[@id='mat-input-7']")
	private WebElement scopeEntity;
	//=====================Engadgement Type====================================
	@FindBy(xpath="//div[@class=\"mat-form-field-infix ng-tns-c146-19\"]")
	private WebElement engagementType;
	
	@FindBy(xpath="(//span[@class=\"mat-option-text\"])[1]")
	private WebElement chooseEngagementType;
	//=====================Revenue Range====================================
	@FindBy(xpath="//span[@class=\"mat-select-placeholder mat-select-min-line ng-tns-c155-22 ng-star-inserted\"]")
	private WebElement revenueRange;
	
	@FindBy(xpath="(//span[@class=\"mat-option-text\"])[2]")
	private WebElement chooseRevenueRange;
	//=====================Auditor====================================
	@FindBy(xpath="//div[@class=\"mat-form-field-infix ng-tns-c146-23\"]")
	private WebElement auditor;
	
	@FindBy(xpath="(//span[@class=\"mat-option-text\"])[2]")
	private WebElement chooseAuditor;
	
	//=====================Data Source====================================
	@FindBy(xpath="//span[@class=\"mat-select-placeholder mat-select-min-line ng-tns-c155-26 ng-star-inserted\"]")
	private WebElement dataSource;
	
	@FindBy(xpath="(//*[@class=\"mat-pseudo-checkbox mat-option-pseudo-checkbox ng-star-inserted\"])[2]")
	private WebElement chooseDataSource;
	//=====================Data Source====================================
	@FindBy(xpath="//button[@class=\"mat-focus-indicator mat-stroked-button mat-button-base\"]")
	private WebElement chooseFile;
		
	//@FindBy(xpath="(//*[@class=\"mat-pseudo-checkbox mat-option-pseudo-checkbox ng-star-inserted\"])[2]")
	//private WebElement chooseDataSource;
	//=====================Complaence Requirement====================================
	@FindBy(xpath="//span[@class=\"mat-select-placeholder mat-select-min-line ng-tns-c155-29 ng-star-inserted\"]")
	private WebElement complaenceRequirement;
	
	@FindBy(xpath="(//*[@class=\"mat-pseudo-checkbox mat-option-pseudo-checkbox ng-star-inserted\"])[1]")
	private WebElement chooseComplaenceRequirement;
	
	//=====================click on next button====================================
	@FindBy(xpath="(//span[@class=\"mat-button-wrapper\"])[3]")
	private WebElement clickOnNextButton;
//==============================Starts Register New Client contact==============================================
	//=====================Primary Contact====================================
	@FindBy(xpath="//input[@id=\"mat-input-9\"]")
	private WebElement primaryContact;
	//=====================Designation====================================
	@FindBy(xpath="//input[@id=\"mat-input-10\"]")
	private WebElement designation;
	//=====================Email Address====================================
	@FindBy(xpath="//input[@id=\"mat-input-11\"]")
	private WebElement email;
	//=====================Contact Number====================================
	@FindBy(xpath="//input[@id=\"mat-input-12\"]")
	private WebElement contactNumber;
	//=====================Contact Number====================================
	@FindBy(xpath="(//span[@class=\"mat-button-wrapper\"])[5]")
	private WebElement clickOnNext;
//==============================Starts Register New Client Module================================================
	//=====================Module license====================================
	@FindBy(xpath="//div[@class=\"mat-form-field-infix ng-tns-c146-34\"]")
	private WebElement moduleLicense;
	//=====================choose License====================================
	@FindBy(xpath="(//span[@class=\"mat-option-text\"])[1]")
	private WebElement chooseModuleLicense;
	//=====================cHandle with current date====================================
	@FindBy(xpath="//div[@class=\"mat-form-field-infix ng-tns-c146-36\"]")
	private WebElement clickOnstartingdateField;
	//=====================cHandle with end date=======================================
	@FindBy(xpath="//input[@id=\"mat-input-14\"]")
	private WebElement clickOnendingdateField;
	//=====================cHandle with end date=======================================
	@FindBy(xpath="//span[text()='Add ']")
	private WebElement addButton;
	//=====================IRM setup & Admin=======================================
	@FindBy(xpath="(//span[@class=\"mat-option-text\"])[4]")
	private WebElement irmSetUp;
	//=====================IRM super admin=======================================
	@FindBy(xpath="(//span[@class=\"mat-option-text\"])[9]")
	private WebElement irmSuperAdmin;
	//=====================IMATRIX=======================================
	@FindBy(xpath="(//span[@class=\"mat-option-text\"])[5]")
	private WebElement imatrix;
	//=====================developer=======================================
	@FindBy(xpath="(//span[@class=\"mat-option-text\"])[11]")
	private WebElement developer;
	//=====================SMTP Email=======================================
	@FindBy(xpath="(//span[@class=\"mat-option-text\"])[11]")
	private WebElement smtpEmail;
	//=====================Click on Next button=======================================
	@FindBy(xpath="//*[@id=\"cdk-step-content-0-2\"]/div/button[2]/span[1]")
	private WebElement clickOnNextButton1;
	//=====================Click on Next button=======================================
	@FindBy(xpath="//*[@class=\"mat-select-placeholder mat-select-min-line ng-tns-c155-40 ng-star-inserted\"]")
	private WebElement sourceERP;
	
	@FindBy(xpath="(//span[@class=\"mat-option-text\"])[2]")
	private WebElement chooseSourceERP;
	
	@FindBy(xpath="//*[@id=\"cdk-step-content-0-3\"]/div/button[2]/span[1]")
	private WebElement clickOnNextButton2;
	//=====================deployment type=======================================
	@FindBy(xpath="//*[@id=\"mat-select-value-23\"]/span")
	private WebElement deploymentType;
	
	@FindBy(xpath="//*[@id=\"mat-option-76\"]/span")
	private WebElement chooseDeploymentType;
	
	@FindBy(xpath="//*[@id=\"mat-input-15\"]")
	private WebElement noOfProdInstance;
	
	@FindBy(xpath="//*[@id=\"cdk-step-content-0-4\"]/div/button[2]/span[1]")
	private WebElement clickOnNextButton3;
	//=====================database=======================================
	@FindBy(xpath="//*[@id=\"mat-select-value-25\"]/span")
	private WebElement sourceOfDatabase;
	
	@FindBy(xpath="//span[text()=' MSSQL']")
	private WebElement chooseSourceOfDatabase;
	
	@FindBy(xpath="//*[@id=\"cdk-step-content-0-5\"]/div/button[2]/span[1]")
	private WebElement submit;
	
	//================================Customer Alert==================================
	@FindBy(xpath="//*[@id=\"swal2-html-container\"]")
	private WebElement alert;
	
	@FindBy(xpath="//*[@id=\"kt_body\"]/div[3]/div/div[6]/button[1]")
	private WebElement finalOk;
	
	public WebElement getRegisterNewClientButton() {
		return registerNewClientButton;
	}

	public WebElement getClickOnHamBurgerSign() {
		return clickOnHamBurgerSign;
	}

	public WebElement getRegisterNewClientDropdown() {
		return registerNewClientDropdown;
	}

	public WebElement getSelectClientType() {
		return selectClientType1;
	}

	public WebElement getSelectClientType1() {
		return selectClientType1;
	}

	public WebElement getSelectClientTypeAsTechnicalSuperAdmin() {
		return selectClientTypeAsTechnicalSuperAdmin;
	}

	public WebElement getChooseParentCompany() {
		return chooseParentCompany;
	}

	public WebElement getChooseAsIRMAdmin() {
		return chooseAsIRMAdmin;
	}

	public WebElement getClientLeagalEntity() {
		return clientLeagalEntity;
	}

	public WebElement getHeadquarter() {
		return headquarter;
	}

	public WebElement getEmployeeRange() {
		return employeeRange;
	}

	public WebElement getChooseEmployeeRange() {
		return chooseEmployeeRange;
	}

	public WebElement getScopeEntity() {
		return scopeEntity;
	}

	public WebElement getEngagementType() {
		return engagementType;
	}

	public WebElement getChooseEngagementType() {
		return chooseEngagementType;
	}

	public WebElement getRevenueRange() {
		return revenueRange;
	}

	public WebElement getChooseRevenueRange() {
		return chooseRevenueRange;
	}

	public WebElement getAuditor() {
		return auditor;
	}

	public WebElement getChooseAuditor() {
		return chooseAuditor;
	}

	public WebElement getDataSource() {
		return dataSource;
	}

	public WebElement getChooseDataSource() {
		return chooseDataSource;
	}

	public WebElement getChooseFile() {
		return chooseFile;
	}

	public WebElement getComplaenceRequirement() {
		return complaenceRequirement;
	}

	public WebElement getChooseComplaenceRequirement() {
		return chooseComplaenceRequirement;
	}

	public WebElement getClickOnNextButton() {
		return clickOnNextButton;
	}

	public WebElement getPrimaryContact() {
		return primaryContact;
	}

	public WebElement getDesignation() {
		return designation;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getContactNumber() {
		return contactNumber;
	}

	public WebElement getClickOnNext() {
		return clickOnNext;
	}

	public WebElement getModuleLicense() {
		return moduleLicense;
	}

	public WebElement getChooseModuleLicense() {
		return chooseModuleLicense;
	}

	 public WebElement getClickOnstartingdateField() {
		return clickOnstartingdateField;
	}

	public WebElement getdate(WebDriver driver,String date) {
		 return driver.findElement(By.xpath("//div[contains(.,'"+date+"') and @class='mat-calendar-body-cell-content mat-focus-indicator mat-calendar-body-today']"));
		 //return dt;
	   }
	
	 public void clickoncurrentdate(WebDriver driver) 
	 {
		DateFormat dateFormat = new SimpleDateFormat("dd");
		Date date = new Date();
		String date1= dateFormat.format(date);
		getdate(driver,date1).click(); 
	}

	public WebElement getClickOnendingdateField() {
		return clickOnendingdateField;
	}

	public WebElement getAddButton() {
		return addButton;
	}

	public WebElement getIrmSetUp() {
		return irmSetUp;
	}

	public WebElement getIrmSuperAdmin() {
		return irmSuperAdmin;
	}

	public WebElement getImatrix() {
		return imatrix;
	}

	public WebElement getDeveloper() {
		return developer;
	}

	public WebElement getSmtpEmail() {
		return smtpEmail;
	}

	public WebElement getClickOnNextButton1() {
		return clickOnNextButton1;
	}

	public WebElement getSourceERP() {
		return sourceERP;
	}

	public WebElement getChooseSourceERP() {
		return chooseSourceERP;
	}

	public WebElement getClickOnNextButton2() {
		return clickOnNextButton2;
	}

	public WebElement getDeploymentType() {
		return deploymentType;
	}

	public WebElement getChooseDeploymentType() {
		return chooseDeploymentType;
	}

	public WebElement getNoOfProdInstance() {
		return noOfProdInstance;
	}

	public WebElement getClickOnNextButton3() {
		return clickOnNextButton3;
	}

	public WebElement getSourceOfDatabase() {
		return sourceOfDatabase;
	}

	public WebElement getChooseSourceOfDatabase() {
		return chooseSourceOfDatabase;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public WebElement getAlert() {
		return alert;
	}

	public WebElement getFinalOk() {
		return finalOk;
	}
	
}
	
	


