package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class sodDashboard {

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
	
	@FindBy(xpath = "//div[@class='mat-form-field-infix ng-tns-c146-8']")
    private WebElement dropdownElement;
	
	@FindBy(xpath = "//span[text()=' Test_Fusion_001 ']")
	//@FindBy(xpath = "//span[text()=' TEST30TH ']")
    private WebElement chooseClient;
	
	@FindBy(xpath="//*[@id=\"kt_subheader\"]/div/div[2]/a")
	private WebElement clickOnHamBurger;

    @FindBy(xpath="//*[text()='SoD Analysis']")
	private WebElement clickOnSoDAnalysisTab;
    
    @FindBy(xpath="(//*[@id='h2'])[1]")
	private WebElement clickOnCountChartSoDRulesViolated;
    
    @FindBy(xpath="(//i[@class='p-sortable-column-icon pi pi-fw pi-sort-alt'])[1]")
	private WebElement clickOnCountChartSoDRulesViolatedSortingAssending;
    
    @FindBy(xpath="//i[@class='p-sortable-column-icon pi pi-fw pi-sort-amount-up-alt']")
	private WebElement clickOnCountChartSoDRulesViolatedSortingDeAssending;
    
    @FindBy(xpath="(//input[@class='p-inputtext p-component p-element ng-star-inserted'])[1]")
	private WebElement clickOnCountChartSoDRulesViolatedSearching;
    
    @FindBy(xpath="(//*[@class='p-multiselect-trigger-icon pi pi-chevron-down'])[2]")
	private WebElement clickOnCountChartSoDRulesViolatedMultiSelectedDropDown;
    
    @FindBy(xpath="(//*[@class='p-button-icon pi pi-file-excel'])[2]")
	private WebElement clickOnCountChartSoDRulesViolatedExcelSheetDownload;

    public WebElement getClickOnCountChartSoDRulesViolated() {
		return clickOnCountChartSoDRulesViolated;
	}

	public sodDashboard(WebDriver driver) {
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
    
        public WebElement getClickOnHamBurger() {
            return clickOnHamBurger;
        }

        public WebElement getClickOnSoDAnalysisTab() {
            return clickOnSoDAnalysisTab;
        }

		public WebElement getClickOnCountChartSoDRulesViolatedSortingAssending() {
			return clickOnCountChartSoDRulesViolatedSortingAssending;
		}

		public WebElement getClickOnCountChartSoDRulesViolatedSortingDeAssending() {
			return clickOnCountChartSoDRulesViolatedSortingDeAssending;
		}

		public WebElement getClickOnCountChartSoDRulesViolatedSearching() {
			return clickOnCountChartSoDRulesViolatedSearching;
		}

		public WebElement getClickOnCountChartSoDRulesViolatedMultiSelectedDropDown() {
			return clickOnCountChartSoDRulesViolatedMultiSelectedDropDown;
		}

		public WebElement getClickOnCountChartSoDRulesViolatedExcelSheetDownload() {
			return clickOnCountChartSoDRulesViolatedExcelSheetDownload;
		}
        
        
}
