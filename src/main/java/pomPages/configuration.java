package pomPages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class configuration {
	@FindBy(xpath="//input[@name='username']")
	private WebElement userNameTextField;
	
	@FindBy(xpath="//span[text()='LOGIN']")
	private WebElement lohinbtn;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement passwordtextfield;
	
	@FindBy(xpath="//button[@class='secondary-button small-link']")
	private WebElement clickOnAdvanced;
 
	@FindBy(xpath="//a[@id='proceed-link']")
	private WebElement clickOnUnsafeLink;
	
	@FindBy(xpath = "//div[@class='mat-select-trigger ng-tns-c155-8']")
    private WebElement dropdownElement;
	
	//@FindBy(xpath = "(//span[@class=\"mat-option-text\"])[5]")
    //private WebElement chooseClient;
	
	@FindBy(xpath = "(//span[@class=\"mat-option-text\"])[1]")
    private WebElement chooseClient;
	
	@FindBy(xpath="//*[@id=\"kt_subheader\"]/div/div[3]/div")
	private WebElement clickOnIRM;
	
	@FindBy(xpath="//a[@class=\"dropdown-toggle btn-icon setting-btn btn-default ml-2 h-34 w-34 flex-shrink-0\"]")
	private WebElement clickOnHamBurger;
	
	@FindBy(xpath="//div[@id='kt_aside_menu_top']//a[@class='menu-link menu-toggle']//span[@class='menu-text'][normalize-space()='Setup and Administration']")
	private WebElement setUpAdmin;
	
	
	@FindBy(xpath="/html[1]/body[1]/app-layout[1]/div[1]/div[1]/div[1]/div[1]/app-subheader-wrapper[1]/app-subheader6[1]/div[1]/div[1]/div[2]/div[1]/app-dropdown-menu1[1]/div[1]/ul[1]/li[4]/div[1]/ul[1]/li[8]/a[1]/span[1]")
	private WebElement configuration;
	
	@FindBy(xpath="(//div[@class=\"mat-step-text-label ng-star-inserted\"])[2]")
	private WebElement dataSourceDetails;
	
	@FindBy(xpath="//*[@id=\"mat-expansion-panel-header-1\"]")
	private WebElement dataSourceDetailsClick;
	
	@FindBy(xpath="//input[@id='mat-input-6']")
	private WebElement erpUserName;
	
	@FindBy(xpath="//input[@id='mat-input-7']")
	private WebElement erpURL;
	
	@FindBy(xpath="//input[@id='mat-input-8']")
	private WebElement erpPassword;
	
	@FindBy(xpath="//input[@id='mat-input-9']")
	private WebElement BIPReportPath;
	
	@FindBy(xpath="(//span[@class=\"mat-button-wrapper\"])[1]")
	private WebElement savedetails;
	
	@FindBy(xpath="//body[@id='kt_body']/div[3]/div/div[2]")
	private WebElement displaySuccess;
	
	@FindBy(xpath="//button[text()='OK']")
	private WebElement clickOnOkayButton;
	
	@FindBy(xpath="(//div[@class='mat-step-text-label ng-star-inserted'])[3]")
	private WebElement dataSynchronization;
	
	@FindBy(xpath="(//*[text()='Data Synchronization for User(s) and Role(s) Exclusion'])[2]")
	private WebElement dataSynchronization1;
	
	@FindBy(xpath="(//input[@name=\"username\"])[2]")
	private WebElement erpUsername1;
	
	@FindBy(xpath="(//input[@name=\"SourceURL\"])[2]")
	private WebElement sourceUrl;
	
	@FindBy(xpath="(//input[@name=\"password\"])[2]")
	private WebElement sourcePassword;
	
	@FindBy(xpath="(//input[@name=\"reportPath\"])[2]")
	private WebElement reportPath;
	
	@FindBy(xpath="//button[@class=\"mat-focus-indicator btnColor btnPosition2 mat-raised-button mat-button-base\"]")
	private WebElement getDataExclusion;
	
	@FindBy(xpath="//div[contains(text(),'User(s) Exclusion')]")
	               //*[@class="\mat-step-header mat-primary ng-tns-c342-11 mat-vertical-stepper-header ng-star-inserted\"]
	private WebElement userExclusion;
	
	@FindBy(xpath="(//*[text()='User(s) Exclusion'])[2]")
	private WebElement userExclusionDropDown;
	
	@FindBy(xpath="//span[normalize-space()='Add User(s) for Exclusion']")
	private WebElement addUserExclution;
	//===========================Choose 1st dropdwon as global level exclution======================================
	@FindBy(xpath="(//span[@class=\"mat-checkbox-inner-container mat-checkbox-inner-container-no-side-margin\"])[1]")
	private WebElement firstCheckBox;
	
	@FindBy(xpath="(//span[@class=\"p-dropdown-label p-inputtext p-placeholder ng-star-inserted\"])[1]")
	private WebElement chooseExclutionDropDown;
	
	@FindBy(xpath="(//li[@class=\"p-ripple p-element p-dropdown-item\"])[1]")
	private WebElement globalLevelExclusion;
	//===========================Choose 1st dropdwon as bussiness level exclution======================================
	@FindBy(xpath="(//span[@class=\"mat-checkbox-inner-container mat-checkbox-inner-container-no-side-margin\"])[2]")
	private WebElement secoendCheckBox;
	
	@FindBy(xpath="(//div[@class=\"p-dropdown-trigger\"])[2]")
	private WebElement chooseExclutionDropDown2;
	
	@FindBy(xpath="(//li[@class=\"p-ripple p-element p-dropdown-item\"])[2]")
	private WebElement bussinessLevelExclusion;
	
	@FindBy(xpath="//tbody/tr[2]/td[6]/p-multiselect[1]/div[1]/div[2]/div[1]")
	private WebElement selectBussinessProcess;
	
	@FindBy(xpath="//span[normalize-space()='Procure to Pay']")
	private WebElement selectAsProcureToPay;
	
	@FindBy(xpath="//span[normalize-space()='Record to Report']")
	private WebElement selectAsRecordToReport;
	//===========================Choose 1st dropdwon as Rule level exclution======================================
	@FindBy(xpath="(//span[@class='mat-checkbox-inner-container mat-checkbox-inner-container-no-side-margin'])[3]")
	private WebElement thirdCheckBox;
	
	@FindBy(xpath="(//div[@class=\"p-dropdown-trigger\"])[3]")
	private WebElement chooseExclutionDropDown3;
	
	@FindBy(xpath="//span[normalize-space()='Rule Level']")
	private WebElement ruleLevelExclusion;
	
	@FindBy(xpath="//tbody/tr[3]/td[7]/p-multiselect[1]/div[1]/div[2]/div[1]")
	private WebElement selectBussinessProcess1;
	
	@FindBy(xpath="//span[contains(text(),'Adjust Project Costs and Perform Project Capitaliz')]")
	private WebElement adjustProjectCostsAndPerformProjectCapitaliz;
	
	@FindBy(xpath="//span[normalize-space()='Approve Payables Invoices and Create Payments']")
	private WebElement approvePayablesInvoicesAndCreatePayments;
	
	@FindBy(xpath="//span[normalize-space()='Save User(s) for Exclusion']")
	private WebElement saveUserExclusionButton;
	
	@FindBy(xpath="//div[@class='mat-step-text-label ng-star-inserted'][normalize-space()='Role(s) Exclusion']")
	private WebElement rolesExclution;

	@FindBy(xpath="/html[1]/body[1]/app-layout[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/app-config[1]/div[2]/mat-tab-group[1]/div[1]/mat-tab-body[1]/div[1]/app-fusion-tab[1]/div[1]/section[1]/mat-vertical-stepper[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/mat-expansion-panel[1]/mat-expansion-panel-header[1]/span[1]/mat-panel-title[1]")
	private WebElement userUolesExclution;

	@FindBy(xpath="//span[normalize-space()='Add Role(s) for Exclusion']")
	private WebElement addRoleExclusion;
	//===============================Global level exclusion========================================//

	@FindBy(xpath="(//span[@class='mat-checkbox-inner-container mat-checkbox-inner-container-no-side-margin'])[1]")
	private WebElement firstCheckBox1;

	@FindBy(xpath="//tbody/tr[1]/td[2]/p-dropdown[1]/div[1]/span[1]")
	private WebElement chooseExclusion;

	@FindBy(xpath="//span[normalize-space()='Global Level']")
	private WebElement chooseGlobalLevel;

	//===============================Bussiness level exclusion========================================//

	@FindBy(xpath="(//span[@class='mat-checkbox-inner-container mat-checkbox-inner-container-no-side-margin'])[2]")
	private WebElement secoendCheckBox1;

	@FindBy(xpath="//tbody/tr[2]/td[2]/p-dropdown[1]/div[1]/span[1]")
	private WebElement chooseExclusion2;

	@FindBy(xpath="//span[normalize-space()='Business Process Level']")
	private WebElement chooseBussinessProcessLevel;
	
	@FindBy(xpath="/html[1]/body[1]/app-layout[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/app-config[1]/div[2]/mat-tab-group[1]/div[1]/mat-tab-body[1]/div[1]/app-fusion-tab[1]/div[1]/section[1]/mat-vertical-stepper[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/mat-expansion-panel[1]/div[1]/div[1]/p-dialog[1]/div[1]/div[1]/div[3]/p-table[1]/div[1]/div[2]/table[1]/tbody[1]/tr[2]/td[4]/p-multiselect[1]/div[1]/div[2]/div[1]")
	private WebElement chooseBussinessExclusion;

	@FindBy(xpath="//li[@aria-label='Procure to Pay']")
	private WebElement chooseprocureToPay;

	@FindBy(xpath="//span[normalize-space()='Record to Report']")
	private WebElement chooseRecordToReport;

	//===============================Rule level exclusion========================================//

	@FindBy(xpath="(//span[@class='mat-checkbox-inner-container mat-checkbox-inner-container-no-side-margin'])[3]")
	private WebElement secoendCheckBox3;

	@FindBy(xpath="//tbody/tr[3]/td[2]/p-dropdown[1]/div[1]/span[1]")
	private WebElement chooseRoleExclusion;

	@FindBy(xpath="//li[@aria-label='Rule Level']")
	private WebElement chooseRoleLevel;

	@FindBy(xpath="/html[1]/body[1]/app-layout[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/app-config[1]/div[2]/mat-tab-group[1]/div[1]/mat-tab-body[1]/div[1]/app-fusion-tab[1]/div[1]/section[1]/mat-vertical-stepper[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/mat-expansion-panel[1]/div[1]/div[1]/p-dialog[1]/div[1]/div[1]/div[3]/p-table[1]/div[1]/div[2]/table[1]/tbody[1]/tr[3]/td[5]/p-multiselect[1]/div[1]/div[2]/div[1]")
	private WebElement chooseRoleExclusionDropdown;

	@FindBy(xpath="//span[contains(text(),'Adjust Project Costs and Perform Project Capitaliz')]")
	private WebElement adjustProjectCostsAndPerformProjectCapitaliz1;

	@FindBy(xpath="//span[normalize-space()='Approve Payables Invoices and Create Payments']")
	private WebElement approvePayablesInvoicesAndCreatePayments1;

	@FindBy(xpath="//span[normalize-space()='Save Role(s) for Exclusion']")
	private WebElement saveRoleExclusion;

	@FindBy(xpath="//div[contains(text(),'SoD Reports Output Format')]")
	private WebElement SoDReportsOutputFormat;

	@FindBy(xpath="/html[1]/body[1]/app-layout[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/app-config[1]/div[2]/mat-tab-group[1]/div[1]/mat-tab-body[1]/div[1]/app-fusion-tab[1]/div[1]/section[1]/mat-vertical-stepper[1]/div[6]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/mat-expansion-panel[1]/mat-expansion-panel-header[1]/span[1]/mat-panel-title[1]")
	private WebElement SoDReportsOutputFormatDropDown;

	@FindBy(xpath="(//span[@class='mat-slide-toggle-bar'])[2]")
	private WebElement omrcFormant;

	@FindBy(xpath="(//span[@class='mat-slide-toggle-bar'])[4]")
	private WebElement bussinessProcessWiseReports;

	@FindBy(xpath="//div[contains(text(),'Apply Limit on instance(s) for Rule(s)')]")
	private WebElement applyLimitOnInstaceForRules;

	@FindBy(xpath="/html[1]/body[1]/app-layout[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/app-config[1]/div[2]/mat-tab-group[1]/div[1]/mat-tab-body[1]/div[1]/app-fusion-tab[1]/div[1]/section[1]/mat-vertical-stepper[1]/div[7]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/mat-expansion-panel[1]/mat-expansion-panel-header[1]/span[1]/mat-panel-title[1]")
	private WebElement applyLimitOnInstaceForRulesDropDwon;

	@FindBy(xpath="/html[1]/body[1]/app-layout[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/app-config[1]/div[2]/mat-tab-group[1]/div[1]/mat-tab-body[1]/div[1]/app-fusion-tab[1]/div[1]/section[1]/mat-vertical-stepper[1]/div[7]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/mat-expansion-panel[1]/mat-expansion-panel-header[1]/span[1]/mat-panel-title[1]")
	private WebElement maxSODExceprionPerControl;

	@FindBy(xpath="//div[contains(text(),'False Positive(s) Flagging')]")
	private WebElement falsePositive;

	@FindBy(xpath="(//span[@class='mat-slide-toggle-bar'])[7]")
	private WebElement applyGlobalAccessCondition;

	@FindBy(xpath="(//span[@class='mat-checkbox-inner-container'])[1]")
	private WebElement withInSameBussinessUint;

	@FindBy(xpath="//div[contains(text(),'Approval Workflow')]")
	private WebElement approvalWorkflow;

	@FindBy(xpath="//*[contains(@class, 'mat-expansion-panel-header-title') and contains(text(), 'Approval Workflow')]")
	private WebElement approvalWorkflowDropDown;

	@FindBy(xpath="(//span[@class='mat-slide-toggle-bar'])[8]")
	private WebElement approvalWorkFlowDropDownToggle;

	@FindBy(xpath="//span[@class='mat-expansion-indicator ng-tns-c271-45 ng-trigger ng-trigger-indicatorRotate ng-star-inserted']")
	private WebElement uploadApprovalWorkFlow;

	@FindBy(xpath="//div[@class='positionFile']")
	private WebElement chooseFile;
	
	@FindBy(xpath="//div[contains(text(),'OLAP')]")
	private WebElement olap;
	
	@FindBy(xpath="//mat-panel-title[contains(@class, 'mat-expansion-panel-header-title') and contains(@class, 'ng-tns-c271-49') and not(contains(@class, 'mat-panel-title'))]\r\n"
		)
	private WebElement olapConfigaratuion;
	
	@FindBy(xpath="(//span[@class='mat-slide-toggle-bar'])[9]")
	private WebElement olapConfigaratuionToggle;
	
	
	
	public WebElement getOlapConfigaratuionToggle() {
		return olapConfigaratuionToggle;
	}
	public WebElement getOlapConfigaratuion() {
		return olapConfigaratuion;
	}
	public WebElement getOlap() {
		return olap;
	}
	public WebElement getChooseFile(){
		return chooseFile;
	}

	public WebElement getUploadApprovalWorkFlow(){
		return uploadApprovalWorkFlow;
	}
	public WebElement getApprovalWorkFlowDropDownToggle(){
		return approvalWorkFlowDropDownToggle;
	}
	public WebElement getApprovalWorkflowDropDown(){
		return approvalWorkflowDropDown;
	}
	public WebElement getApprovalWorkflow(){
		return approvalWorkflow;
	}
	public WebElement getWithInSameBussinessUint(){
		return withInSameBussinessUint;
	}
	public WebElement getApplyGlobalAccessCondition(){
		return applyGlobalAccessCondition;
	}

	public WebElement getFalsePositive(){
		return falsePositive;
	}

	public WebElement getMaxSODExceprionPerControl(){
		return maxSODExceprionPerControl;
	}

	public WebElement getApplyLimitOnInstaceForRulesDropDwon(){
		return applyLimitOnInstaceForRulesDropDwon;
	}

	public WebElement getApplyLimitOnInstaceForRules(){
		return applyLimitOnInstaceForRules;
	}

	public WebElement getAddUserExclution() {
		return addUserExclution;
	}
	
	public WebElement getUserExclusionDropDown() {
		return userExclusionDropDown;
	}
	
	public WebElement getUserExclusion() {
		return userExclusion;
	}
	
	public WebElement getGetDataExclusion() {
		return getDataExclusion;
	}
	
	public WebElement getReportPath() {
		return reportPath;
	}
	
	public WebElement getSourcePassword() {
		return sourcePassword;
	}
	
	public WebElement getSourceUrl() {
		return sourceUrl;
	}
	
	public WebElement getErpUsername1() {
		return erpUsername1;
	}
	
	public WebElement getDataSynchronization1() {
		return dataSynchronization1;
	}
	
	public WebElement getDataSynchronization() {
		return dataSynchronization;
	}
	
	public void handleDetailsSavedPopup(WebDriver driver) throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
        try {
            WebElement popup = wait.until(ExpectedConditions.visibilityOf(displaySuccess));
            String popupText = popup.getText();

            if (popup.isDisplayed()) {
                if (popupText.contains("Details Saved Successfully")) {
                    wait.until(ExpectedConditions.elementToBeClickable(clickOnOkayButton)).click();
                } else if (popupText.contains("Failed to Load the ERP Source Data")) {
                    System.out.println("Please mind your input, bip path");
                }
            } else {
                System.out.println("Popup is not displayed");
            }
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
	}
	
	public void handleDetailsSavedPopup1(WebDriver driver) throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
        try {
            WebElement popup = wait.until(ExpectedConditions.visibilityOf(displaySuccess));
            String popupText = popup.getText();

            if (popup.isDisplayed()) {
                if (popupText.contains("ERP Source Data Saved Successfully")) {
                    wait.until(ExpectedConditions.elementToBeClickable(clickOnOkayButton)).click();
                } else if (popupText.contains("Failed to Load the ERP Source Data")) {
                    System.out.println("Please mind your input, bip path");
                }
            } else {
                System.out.println("Popup is not displayed");
            }
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
  }

	
	public WebElement getSavedetails() {
		return savedetails;
	}
	
	public WebElement getBIPReportPath() {
		return BIPReportPath;
	}
	
	public WebElement getErpPassword() {
		return erpPassword;
	}
	
	public WebElement geterpURL() {
		return erpURL;
	}
	
	public WebElement getErpUserName() {
		return erpUserName;
	}
	
	public WebElement getDataSourceDetailsClick() {
		return dataSourceDetailsClick;
	}
	
	public WebElement getDataSourceDetails() {
		return dataSourceDetails;
	}
	
	public void scrollInsideWebElement(WebDriver driver) {
		//Actions actions = new Actions(driver);
		//actions.moveToElement(configuration);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", configuration);
		configuration.click();
	}
	
	public WebElement getSetUpAdmin() {
		return setUpAdmin;
	}

	public WebElement getClickOnHamBurger() {
		return clickOnHamBurger;
	}

	@FindBy(xpath="(//a[@class=\"p-menuitem-link\"])[2]")
	private WebElement logoutButton;
	public WebElement getClickOnIRM() {
		return clickOnIRM;
	}

	public WebElement getLogoutButton() {
		return logoutButton;
	}

	public configuration(WebDriver driver) {
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

	public WebElement getClickOnAdvanced() {
		return clickOnAdvanced;
	}

	public WebElement getClickOnUnsafeLink() {
		return clickOnUnsafeLink;
	}

	public WebElement getDropdownElement() {
		return dropdownElement;
	}

	public WebElement getChooseClient() {
		return chooseClient;
	}

	public WebElement getConfiguration() {
		return configuration;
	}

	public WebElement getErpURL() {
		return erpURL;
	}

	public WebElement getDisplaySuccess() {
		return displaySuccess;
	}

	public WebElement getClickOnOkayButton() {
		return clickOnOkayButton;
	}

	public WebElement getFirstCheckBox() {
		return firstCheckBox;
	}

	public WebElement getChooseExclutionDropDown() {
		return chooseExclutionDropDown;
	}

	public WebElement getGlobalLevelExclusion() {
		return globalLevelExclusion;
	}

	public WebElement getChooseExclutionDropDown2() {
		return chooseExclutionDropDown2;
	}
	public WebElement getBussinessLevelExclusion() {
		return bussinessLevelExclusion;
	}
	public WebElement getSecoendCheckBox() {
		return secoendCheckBox;
	}
	public WebElement getSelectBussinessProcess() {
		return selectBussinessProcess;
	}
	public WebElement getSelectAsProcureToPay() {
		return selectAsProcureToPay;
	}
	public WebElement getSelectAsRecordToReport() {
		return selectAsRecordToReport;
	}
	public WebElement getThirdCheckBox() {
		return thirdCheckBox;
	}
	public WebElement getChooseExclutionDropDown3() {
		return chooseExclutionDropDown3;
	}
	public WebElement getRuleLevelExclusion() {
		return ruleLevelExclusion;
	}
	public WebElement getSelectBussinessProcess1() {
		return selectBussinessProcess1;
	}
	public WebElement getAdjustProjectCostsAndPerformProjectCapitaliz() {
		return adjustProjectCostsAndPerformProjectCapitaliz;
	}
	public WebElement getApprovePayablesInvoicesAndCreatePayments() {
		return approvePayablesInvoicesAndCreatePayments;
	}
	public WebElement getSaveUserExclusionButton() {
		return saveUserExclusionButton;
	}
	public WebElement getRolesExclution() {
		return rolesExclution;
	}
	public WebElement getUserUolesExclution() {
		return userUolesExclution;
	}
	public WebElement getAddRoleExclusion(){
		return addRoleExclusion;
	}
	public WebElement getFirstCheckBox1(){
		return firstCheckBox1;
	}
	public WebElement getChooseExclusion(){
		return chooseExclusion;
	}
	public WebElement getChooseGlobalLevel(){
		return chooseGlobalLevel;
	}
	public WebElement getSecoendCheckBox1(){
		return secoendCheckBox1;
	}
	public WebElement getChooseExclusion2(){
		return chooseExclusion2;
	}
	public WebElement getChooseBussinessProcessLevel(){
		return chooseBussinessProcessLevel;
	}
	public WebElement getChooseBussinessExclusion(){
		return chooseBussinessExclusion;
	}
	public WebElement getChooseprocureToPay(){
		return chooseprocureToPay;
	}
	public WebElement getChooseRecordToReport(){
		return chooseRecordToReport;
	}
	public WebElement getSecoendCheckBox3(){
		return secoendCheckBox3;
	}
	public WebElement getChooseRoleExclusion(){
		return chooseRoleExclusion;
	}
	public WebElement getChooseRoleLevel(){
		return chooseRoleLevel;
	}
	public WebElement getChooseRoleExclusionDropdown(){
		return chooseRoleExclusionDropdown;
	}
	public WebElement getAdjustProjectCostsAndPerformProjectCapitaliz1(){
		return adjustProjectCostsAndPerformProjectCapitaliz1;
	}
	public WebElement getApprovePayablesInvoicesAndCreatePayments1(){
		return approvePayablesInvoicesAndCreatePayments1;
	}
	public WebElement getSaveRoleExclusion(){
		return saveRoleExclusion;
	}
	public WebElement getSoDReportsOutputFormat(){
		return SoDReportsOutputFormat;
	}
	public WebElement getSoDReportsOutputFormatDropDown(){
		return SoDReportsOutputFormatDropDown;
	}
	public WebElement getOmrcFormant(){
		return omrcFormant;
	}
	public WebElement getBussinessProcessWiseReports(){
		return bussinessProcessWiseReports;
	}
}