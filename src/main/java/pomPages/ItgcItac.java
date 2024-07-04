package pomPages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ItgcItac {
	//For ITGC
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
	
	@FindBy(xpath="(//span[text()='ITGC and ITAC'])[3]")
	private WebElement itgcAndItac;

	@FindBy(xpath="(//span[text()='ITGC and ITAC Dashboard'])[2]")
	private WebElement itgcAndItacdashbaord;
	
	@FindBy(xpath="//div[@class='card__inner--control']")
	private WebElement ITGC_Controls;
	
	//For Ascending order
	@FindBy(xpath="//th[@class='p-element p-sortable-column p-resizable-column ng-star-inserted'][normalize-space()='Control ID']//i[@class='p-sortable-column-icon pi pi-fw pi-sort-alt']")
	private WebElement ITGC_Controls_sorting;
	//For Descending Order
	@FindBy(xpath="//i[@class='p-sortable-column-icon pi pi-fw pi-sort-amount-up-alt']")
	private WebElement ITGC_Controls_sorting_Descending_Order;
	
	@FindBy(xpath="(//*[@class='p-inputtext p-component p-element ng-star-inserted'])[16]")
	private WebElement ITGC_Controls_search;
	
	@FindBy(xpath="(//span[@class='p-element p-dropdown-label p-inputtext ng-star-inserted'])[2]")
	                //(//div[@class='p-paginator-rpp-options p-dropdown p-component'])[2]
	private WebElement pagination;
	
	@FindBy(xpath="//button[@class='mat-tooltip-trigger p-element p-button-success mr-2 p-button p-component p-button-icon-only']")              
	private WebElement downloadExcel;
	
	@FindBy(xpath="//*[@id='mat-dialog-0']/app-itgc-count-drilldown/div/div[1]/mat-icon/img")
	private WebElement crossButton;
	
	@FindBy(xpath="(//*[@class='highcharts-text-outline'])[1]")
	private WebElement accessGovernenceYellow;
	
	@FindBy(xpath="(//*[name()='rect'][@class='highcharts-point'])[1]")
	private WebElement accessGovernenceYellowSorting;
	
	@FindBy(xpath="(//*[text()='1'])[2]")
	private WebElement accessGovernenceRed;

	@FindBy(xpath="//*[@id='mat-dialog-1']/app-itgc-itac-generic-drilldown/div/div[1]/button[2]/img")
	private WebElement maximizeButton;
	
	@FindBy(xpath="//*[@id='mat-dialog-1']/app-itgc-itac-generic-drilldown/div/div[1]/mat-icon/img")
	private WebElement crossButton1;
	
	@FindBy(xpath="//img[@alt='flip icon']")
	private WebElement flipFlop;
	
	@FindBy(xpath="(//*[@class='mat-icon notranslate mat-menu-trigger material-icons mat-ligature-font mat-icon-no-color'])[1]")
	private WebElement downloadIcon;
	
	@FindBy(xpath="/html/body/div[2]/div[2]/div/div/div/button")
	private WebElement imageIcon;
	
	@FindBy(xpath="(//button[@class='highcharts-a11y-proxy-button'])[2]")
	private WebElement yellowLegend;
	
	@FindBy(xpath="(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-0'])[1]")
	private WebElement HighRiskRatedPassedCheckITGC;
	
	@FindBy(xpath="//th[@class='p-element p-sortable-column p-resizable-column ng-star-inserted'][normalize-space()='Control ID']//i[@class='p-sortable-column-icon pi pi-fw pi-sort-alt']")
	private WebElement HighRiskRatedPassedCheckITGCSorting;
	
	@FindBy(xpath="//*[@class='p-sortable-column-icon pi pi-fw pi-sort-amount-up-alt']")
	private WebElement HighRiskRatedPassedCheckITGCDecendingSorting;
	
	@FindBy(xpath="(//input[@class='p-inputtext p-component p-element ng-star-inserted'])[16]")
	private WebElement HighRiskRatedPassedCheckITGCInput;
	
	@FindBy(xpath="(//*[@class='p-button-label'])[2]")
	private WebElement HighRiskRatedPassedCheckITGCClear;
	
	@FindBy(xpath="//*[@class='mat-tooltip-trigger p-element p-button-success mr-2 p-button p-component p-button-icon-only']")
	private WebElement HighRiskRatedPassedCheckITGCCExcel;
	
	@FindBy(xpath="//*[@class='mat-icon notranslate canclebutton material-icons mat-ligature-font mat-icon-no-color']")
	private WebElement HighRiskRatedPassedCheckITGCCross;
	
	@FindBy(xpath="//*[text()='Passed']")
	private WebElement passedControls;
	
	@FindBy(xpath="//th[@class='p-element p-sortable-column p-resizable-column ng-star-inserted'][normalize-space()='Control ID']//i[@class='p-sortable-column-icon pi pi-fw pi-sort-alt']")
	private WebElement passedControlsSorting;
	
	@FindBy(xpath="//i[@class='p-sortable-column-icon pi pi-fw pi-sort-amount-up-alt']")
	private WebElement passedControlsSortingDesending;

	@FindBy(xpath="(//*[@class='p-inputtext p-component p-element ng-star-inserted'])[16]")
	private WebElement passedControlsSearchBox;
	
	@FindBy(xpath="(//span[text()='Clear'])[2]")
	private WebElement passedControlsClearButton;
	
	@FindBy(xpath="(//*[@class='mat-icon notranslate mat-menu-trigger material-icons mat-ligature-font mat-icon-no-color'])[2]")
	private WebElement DistributionofCheckITGCControlsImageDownload;

	@FindBy(xpath="//img[@src='assets/media/grid/close-outline.svg']")
	private WebElement crossButton2;
	
	@FindBy(xpath="(//input[@class='p-inputtext p-component p-element ng-star-inserted'])[1]")
	private WebElement listOfITGCControlsSearch;
	
	@FindBy(xpath="//span[@class='p-dropdown-trigger-icon pi pi-chevron-down']")
	private WebElement listOfITGCControlsDropDown;
	
	//@FindBy(xpath="//button[@class='mat-tooltip-trigger p-element p-button-success mr-2 buttonAlign p-button p-component p-button-icon-only']")
	@FindBy(xpath="//span[@class='p-button-icon pi pi-file-excel']")
	private WebElement listOfITGCControlsExcelDownload;
	
	@FindBy(xpath="//span[@class='p-button-label']")
	private WebElement listOfITGCControlsClear;
	
	@FindBy(xpath="(//*[@class='p-sortable-column-icon pi pi-fw pi-sort-alt'])[1]")
	private WebElement listOfITGCControlsSorting;
	
	@FindBy(xpath="//*[@class='p-sortable-column-icon pi pi-fw pi-sort-amount-up-alt']")
	private WebElement listOfITGCControlsSortingDecending;
	
	@FindBy(xpath="(//*[@class='mat-icon notranslate mat-menu-trigger material-icons mat-ligature-font mat-icon-no-color'])[4]")
	private WebElement listOfITGCControlsDownloadIcon;
	
	@FindBy(xpath="//span[text()='Image']")
	private WebElement listOfITGCControlsDownload;
	
	//For ITAC
	
	@FindBy(xpath="//div[text()='ITAC']")
	private WebElement ClickonITAC;
	
	@FindBy(xpath="(//h1[text()='8'])[1]")
	private WebElement ClickonITACControls;
	
	
	@FindBy(xpath="(//i[@class='p-sortable-column-icon pi pi-fw pi-sort-alt'])[17]")
	private WebElement ClickAscendingorder;
	
	
	@FindBy(xpath="(//button[@class='p-element p-button-outlined p-button p-component'])[2]")
	private WebElement Clickonclearbutton;
	
	
	@FindBy(xpath="//i[@class='p-sortable-column-icon pi pi-fw pi-sort-amount-up-alt']")
				   //i[@class='p-sortable-column-icon pi pi-fw pi-sort-amount-up-alt']
	private WebElement ClickonITACControls1;
	
	
	@FindBy(xpath="(//input[@class='p-inputtext p-component p-element ng-star-inserted'])[17]")
	private WebElement ClickonSearchbox;
	
	
	@FindBy(xpath="(//button[@class='p-element p-button-outlined p-button p-component'])[2]")
	private WebElement Clickonclearsearch;
	
	@FindBy(xpath="(//span[@class='p-button-icon pi pi-file-excel'])[2]")
	private WebElement Clickonexceldownload;
	
	@FindBy(xpath="//*[@class='mat-icon notranslate canclebutton material-icons mat-ligature-font mat-icon-no-color']")
	private WebElement clickOnCrossButton;

	@FindBy(xpath="(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined'])[1]")
	private WebElement clickOnPayables;

	@FindBy(xpath="(//i[@class='p-sortable-column-icon pi pi-fw pi-sort-alt'])[17]")
	private WebElement clickOnPayablesAssendingOrder;

	@FindBy(xpath="(//i[@class='p-sortable-column-icon pi pi-fw pi-sort-amount-up-alt'])")
	private WebElement clickOnPayablesdesendingOrder;

	@FindBy(xpath="(//*[@class='p-inputtext p-component p-element ng-star-inserted'])[17]")
	private WebElement clickOnPayablesFirstSearchBox;

	@FindBy(xpath="(//*[@class='p-inputtext p-component p-element ng-star-inserted'])[17]")
	private WebElement clickOnPayablesSecoendSearchBox;

	@FindBy(xpath="(//*[@class='p-button-label'])[2]")
	private WebElement clickOnPayablesClear;

	@FindBy(xpath="(//*[@class='p-dropdown-trigger-icon pi pi-chevron-down'])[2]")
	private WebElement clickOnPayablesPagination;

	@FindBy(xpath="(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined'])[2]")
	private WebElement clickOnProcurement;

	@FindBy(xpath="//button[@class='mat-tooltip-trigger p-element p-button-success mr-2 p-button p-component p-button-icon-only']")
	private WebElement clickOnProcurementExcel;

	@FindBy(xpath="//*[@class='mat-icon notranslate canclebutton material-icons mat-ligature-font mat-icon-no-color']")
	private WebElement clickOnProcurementCross;

	public ItgcItac(WebDriver driver) {
		PageFactory.initElements(driver,this);	
		}

	/*public WebElement getClickOnHigh() {
			return clickOnHigh;
		}

	public WebElement getClickonfailedITACcontrolriskClear() {
			return ClickonfailedITACcontrolriskClear;
		}*/

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

	public WebElement getItgcAndItac() {
		return itgcAndItac;
	}

	public WebElement getItgcAndItacdashbaord() {
		return itgcAndItacdashbaord;
	}

	public WebElement getITGC_Controls() {
		return ITGC_Controls;
	}

	public WebElement getITGC_Controls_search() {
		return ITGC_Controls_search;
	}

	public WebElement getITGC_Controls_sorting() {
		return ITGC_Controls_sorting;
	}

	public WebElement getITGC_Controls_sorting_Descending_Order() {
		return ITGC_Controls_sorting_Descending_Order;
	}

	public WebElement getPagination() {
		return pagination;
	}

	public WebElement getDownloadExcel() {
		return downloadExcel;
	}

	public WebElement getCrossButton() {
		return crossButton;
	}

	public WebElement getAccessGovernenceYellow(){
		return accessGovernenceYellow;
	}

	public WebElement getAccessGovernenceYellowSorting() {
		return accessGovernenceYellowSorting;
	}

	public WebElement getMaximizeButton() {
		return maximizeButton;
	}

	public WebElement getCrossButton1() {
		return crossButton1;
	}

	public WebElement getFlipFlop() {
		return flipFlop;
	}

	public WebElement getDownloadIcon() {
		return downloadIcon;
	}

	public WebElement getImageIcon() {
		return imageIcon;
	}

	public WebElement getYellowLegend() {
		return yellowLegend;
	}

	public WebElement getHighRiskRatedPassedCheckITGC() {
		return HighRiskRatedPassedCheckITGC;
	}

	public WebElement getHighRiskRatedPassedCheckITGCSorting() {
		return HighRiskRatedPassedCheckITGCSorting;
	}

	public WebElement getHighRiskRatedPassedCheckITGCDecendingSorting() {
		return HighRiskRatedPassedCheckITGCDecendingSorting;
	}

	public WebElement getHighRiskRatedPassedCheckITGCInput() {
		return HighRiskRatedPassedCheckITGCInput;
	}

	public WebElement getHighRiskRatedPassedCheckITGCClear() {
		return HighRiskRatedPassedCheckITGCClear;
	}

	public WebElement getHighRiskRatedPassedCheckITGCCExcel() {
		return HighRiskRatedPassedCheckITGCCExcel;
	}

	public WebElement getHighRiskRatedPassedCheckITGCCross() {
		return HighRiskRatedPassedCheckITGCCross;
	}

	public WebElement getPassedControls() {
		return passedControls;
	}

	public WebElement getPassedControlsSorting() {
		return passedControlsSorting;
	}

	public WebElement getPassedControlsSortingDesending() {
		return passedControlsSortingDesending;
	}

	public WebElement getPassedControlsSearchBox() {
		return passedControlsSearchBox;
	}

	public WebElement getPassedControlsClearButton() {
		return passedControlsClearButton;
	}

	public WebElement getDistributionofCheckITGCControlsImageDownload() {
		return DistributionofCheckITGCControlsImageDownload;
	}
	
	public WebElement getCrossButton2() {
		return crossButton2;
	}

	public WebElement getListOfITGCControlsSearch() {
		return listOfITGCControlsSearch;
	}
	
	/*public void scrollToTheLast(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}*/

	public void scrollToTheLast(WebDriver driver) {
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}
	public void scrollToTheFast(WebDriver driver) {
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, -document.body.scrollHeight)");
		}
	public void scrollToTheIeft(WebDriver driver) {
		((JavascriptExecutor) driver).executeScript("document.querySelector('div.container-horizontal-scroll.ng-tns-c728-44.ng-star-inserted').scrollLeft=500");
		}

	public WebElement getListOfITGCControlsDropDown() {
		return listOfITGCControlsDropDown;
	}

	public WebElement getListOfITGCControlsExcelDownload() {
		return listOfITGCControlsExcelDownload;
	}

	public WebElement getListOfITGCControlsClear() {
		return listOfITGCControlsClear;
	}

	public WebElement getListOfITGCControlsSorting() {
		return listOfITGCControlsSorting;
	}

	public WebElement getListOfITGCControlsSortingDecending() {
		return listOfITGCControlsSortingDecending;
	}

	public WebElement getListOfITGCControlsDownloadIcon() {
		return listOfITGCControlsDownloadIcon;
	}

	public WebElement getListOfITGCControlsDownload() {
		return listOfITGCControlsDownload;
	}


	//Common Components
	
	@FindBy(xpath="//i[@class='ki ki-bold-arrow-down icon-sm']")
	private WebElement profileDropDown;
	
	@FindBy(xpath="//span[text()=' Log Out ']")
	private WebElement logOut;

	public WebElement getProfileDropDown() {
		return profileDropDown;
	}

	public WebElement getLogOut() {
		return logOut;
	}

	public WebElement getClickonITAC() {
		return ClickonITAC;
	}

	public WebElement getClickonITACControls() {
		return ClickonITACControls;
	}

	public WebElement getClickAscendingorder() {
		return ClickAscendingorder;
	}

	public WebElement getClickonclearbutton() {
		return Clickonclearbutton;
	}

	public WebElement getClickonITACControls1() {
		return ClickonITACControls1;
	}

	public WebElement getClickonSearchbox() {
		return ClickonSearchbox;
	}

	public WebElement getClickonclearsearch() {
		return Clickonclearsearch;
	}

	public WebElement getClickonexceldownload() {
		return Clickonexceldownload;
	}

	public WebElement getClickOnCrossButton() {
		return clickOnCrossButton;
	}
		
	public WebElement getClickOnPayables() {
		return clickOnPayables;
	}
	
	public WebElement getClickOnPayablesAssendingOrder() {
		return clickOnPayablesAssendingOrder;
	}

	public WebElement getClickOnPayablesdesendingOrder() {
		return clickOnPayablesdesendingOrder;
	}

	public WebElement getClickOnPayablesFirstSearchBox() {
		return clickOnPayablesFirstSearchBox;
	}

	public WebElement getClickOnPayablesSecoendSearchBox() {
		return clickOnPayablesSecoendSearchBox;
	}

	public WebElement getClickOnPayablesClear() {
		return clickOnPayablesClear;
	}

	public WebElement getClickOnPayablesPagination() {
		return clickOnPayablesPagination;
	}

	public WebElement getClickOnProcurement() {
		return clickOnProcurement;
	}

	public WebElement getClickOnProcurementExcel() {
		return clickOnProcurementExcel;
	}

	public WebElement getClickOnProcurementCross() {
		return clickOnProcurementCross;
	}
}
