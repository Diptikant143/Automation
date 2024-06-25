package pomPages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


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
	
	@FindBy(css="highcharts-v7ohyl7-0 .highcharts-background")
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
	
	@FindBy(xpath="(//*[@class=\"highcharts-label highcharts-data-label highcharts-data-label-color-0\"])[1]")
	private WebElement HighRiskRatedPassedCheckITGC;
	
	@FindBy(xpath="//th[@class='p-element p-sortable-column p-resizable-column ng-star-inserted'][normalize-space()='Control ID']//i[@class='p-sortable-column-icon pi pi-fw pi-sort-alt']")
	private WebElement HighRiskRatedPassedCheckITGCSorting;
	
	@FindBy(xpath="//*[@class='p-sortable-column-icon pi pi-fw pi-sort-amount-up-alt']")
	private WebElement HighRiskRatedPassedCheckITGCDecendingSorting;
	
	@FindBy(xpath="(//input[@class='p-inputtext p-component p-element ng-star-inserted'])[16]")
	private WebElement HighRiskRatedPassedCheckITGCInput;
	
	@FindBy(xpath="(//button[@class='p-element p-button-outlined p-button p-component'])[2]")
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
	
	@FindBy(xpath="(//div[@class='card__inner--control'])[1]")
	private WebElement ClickonITACControls;
	
	
	@FindBy(xpath="(//i[@class='p-sortable-column-icon pi pi-fw pi-sort-alt'])[17]")
	private WebElement ClickAscendingorder;
	
	
	@FindBy(xpath="(//button[@class='p-element p-button-outlined p-button p-component'])[2]")
	private WebElement Clickonclearbutton;
	
	
	@FindBy(xpath="//i[@class='p-sortable-column-icon pi pi-fw pi-sort-amount-up-alt']")
	private WebElement ClickonITACControls1;
	
	
	@FindBy(xpath="(//input[@class='p-inputtext p-component p-element ng-star-inserted'])[17]")
	private WebElement ClickonSearchbox;
	
	
	@FindBy(xpath="(//button[@class='p-element p-button-outlined p-button p-component'])[2]")
	private WebElement Clickonclearsearch;
	
	@FindBy(xpath="(//span[@class='p-button-icon pi pi-file-excel'])[2]")
	private WebElement Clickonexceldownload;
	
	
	@FindBy(xpath="(//input[@type='text'])[19]")
	private WebElement Clickonconrolfamilysearchbox;
	
	@FindBy(xpath="(//button[@label='Clear'])[2]")
	private WebElement Clickonconrolfamilyclearbutton;
	
	@FindBy(xpath="(//span[@class='p-dropdown-trigger-icon pi pi-chevron-down'])[2]")
	private WebElement ITACControlspageDropDown;
	
	@FindBy(xpath="//img[@src='assets/media/grid/close-outline.svg']")
	private WebElement Clickoncrossbutton;
	
	@FindBy(xpath="(//div[@class='card__inner--control'])[2]")
	private WebElement ClickonfailedITACcontrol;
	
	@FindBy(xpath="(//h1[text()='8'])[2]")
	private WebElement ClickonfailedITACcontrolAssending;
	
	@FindBy(xpath="(//input[@type='text'])[18]")
	private WebElement ClickonfailedITACcontrolfirstsearchbox;
	
	@FindBy(xpath="(//div[@class='p-paginator-rpp-options p-dropdown p-component'])[2]")
	private WebElement ClickonfailedITACcontrolpagination;
	
	@FindBy(xpath="(//button[@label='Clear'])[2]")
	private WebElement ClickonfailedITACcontrolclearbutton;
	
	@FindBy(xpath="(//input[@class='p-inputtext p-component p-element ng-star-inserted'])[20]")
	private WebElement ClickonfailedITACcontrolriskratingsearchbox;
	
	@FindBy(xpath="(//input[@class='p-inputtext p-component p-element ng-star-inserted'])[16]")
	private WebElement ClickonfailedITACcontrolriskdescriptionsearchbox;
	
	@FindBy(xpath="(//span[text()='Clear'])[2]")
	private WebElement ClickonfailedITACcontrolriskdescriptionClear;
	
	@FindBy(xpath="//img[@src='assets/media/grid/close-outline.svg']")
	private WebElement ClickonfailedITACcontrolriskCross;

	@FindBy(xpath="(//span[text()='Clear'])[2]")
	private WebElement ClickonfailedITACcontrolriskClear;
	
	@FindBy(xpath="/html[1]/body[1]/app-layout[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/app-get-itgc-generation[1]/mat-tab-group[1]/div[1]/mat-tab-body[2]/div[1]/div[1]/div[2]/app-itgc-object-wrapper[1]/div[1]/div[2]/div[1]/div[1]/div[1]/app-itac-barcharttwo-object[1]/highcharts-chart[1]/div[3]/*[name()='svg'][1]/*[name()='g'][8]/*[name()='g'][1]/*[name()='text'][1]")
	private WebElement riskRatingAccordingToFamilyOrdertoCash;
	
	@FindBy(xpath="(//input[@type='text'])[13]")
	private WebElement riskRatingAccordingToFamilyOrdertoCashSearch;
	
	@FindBy(xpath="//th[@class='p-element p-sortable-column p-resizable-column ng-star-inserted'][normalize-space()='Control ID']//i[@class='p-sortable-column-icon pi pi-fw pi-sort-alt']")
	private WebElement riskRatingAccordingToFamilyOrdertoCashSorting;
	
	@FindBy(xpath="//*[@class='p-sortable-column-icon pi pi-fw pi-sort-amount-up-alt']")
	private WebElement riskRatingAccordingToFamilyOrdertoCashSortingDesc;
	
	@FindBy(xpath="(//*[@class='imgAlign ng-star-inserted'])[2]")
	private WebElement riskRatingAccordingToFamilyOrdertoCashMaximze;
	
	@FindBy(xpath="//*[@class='mat-icon notranslate canclebutton material-icons mat-ligature-font mat-icon-no-color']")
	private WebElement riskRatingAccordingToFamilyOrdertoCashCrossButton;
	
	@FindBy(xpath="(//button[@class='highcharts-a11y-proxy-button'])[2]")
	private WebElement mediumLegends;
	
	@FindBy(xpath="(//*[@class='mat-icon notranslate mat-menu-trigger material-icons mat-ligature-font mat-icon-no-color'])[1]")
	private WebElement downloadriskRatingAccordingToFamily;
	
	@FindBy(xpath="//*[text()='Image']")
	private WebElement downloadImage;
	
	@FindBy(xpath="(//*[text()='2'])[1]")
	private WebElement controlDistributionBasedOnMonitoredRiskRatingHigh;
	
	@FindBy(xpath="(//i[@class='p-sortable-column-icon pi pi-fw pi-sort-alt'])[12]")
	private WebElement controlDistributionBasedOnMonitoredRiskRatingHighSortAesc;
	
	@FindBy(xpath="//*[@class='p-sortable-column-icon pi pi-fw pi-sort-amount-up-alt']")
	private WebElement controlDistributionBasedOnMonitoredRiskRatingHighSortDesc;
	
	@FindBy(xpath="(//input[@class='p-inputtext p-component p-element ng-star-inserted'])[12]")
	private WebElement controlDistributionBasedOnMonitoredRiskRatingHighText;
	
	@FindBy(xpath="(//*[@class='imgAlign ng-star-inserted'])[2]")
	private WebElement controlDistributionBasedOnMonitoredRiskRatingHighMaximize;
	
	@FindBy(xpath="(//span[@class='p-dropdown-trigger-icon pi pi-chevron-down'])[2]")
	private WebElement controlDistributionBasedOnMonitoredRiskRatingHighPagination;
	
	@FindBy(xpath="(//span[@class='p-dropdown-trigger-icon pi pi-chevron-down'])[2]")
	private WebElement controlDistributionBasedOnMonitoredRiskRatingHighCross;
	
	@FindBy(xpath="(//input[@class='p-inputtext p-component p-element ng-star-inserted'])[1]")
	private WebElement listOfITACControlsSearchBox;
	
	@FindBy(xpath="//span[@class='p-dropdown-trigger-icon pi pi-chevron-down']")
	private WebElement listOfITACControlsPagination;

	@FindBy(xpath="(//*[@class='highcharts-a11y-proxy-button'])[2]")
	private WebElement clickOnHigh;
	
	public ItgcItac(WebDriver driver) {
		PageFactory.initElements(driver,this);	
		}

		public WebElement getClickOnHigh() {
			return clickOnHigh;
		}

	public WebElement getClickonfailedITACcontrolriskClear() {
			return ClickonfailedITACcontrolriskClear;
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

	public WebElement getAccessGovernenceYellow() {
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

	public WebElement getClickonconrolfamilysearchbox() {
		return Clickonconrolfamilysearchbox;
	}

	public WebElement getClickonconrolfamilyclearbutton() {
		return Clickonconrolfamilyclearbutton;
	}

	public WebElement getITACControlspageDropDown() {
		return ITACControlspageDropDown;
	}

	public WebElement getClickoncrossbutton() {
		return Clickoncrossbutton;
	}

	public WebElement getClickonfailedITACcontrol() {
		return ClickonfailedITACcontrol;
	}

	public WebElement getClickonfailedITACcontrolfirstsearchbox() {
		return ClickonfailedITACcontrolfirstsearchbox;
	}

	public WebElement getClickonfailedITACcontrolpagination() {
		return ClickonfailedITACcontrolpagination;
	}

	public WebElement getClickonfailedITACcontrolclearbutton() {
		return ClickonfailedITACcontrolclearbutton;
	}

	public WebElement getClickonfailedITACcontrolriskratingsearchbox() {
		return ClickonfailedITACcontrolriskratingsearchbox;
	}

	public WebElement getClickonfailedITACcontrolriskdescriptionsearchbox() {
		return ClickonfailedITACcontrolriskdescriptionsearchbox;
	}

	public WebElement getClickonfailedITACcontrolriskdescriptionClear() {
		return ClickonfailedITACcontrolriskdescriptionClear;
	}

	public WebElement getClickonfailedITACcontrolriskCross() {
		return ClickonfailedITACcontrolriskCross;
	}

	public WebElement getClickonfailedITACcontrolAssending() {
		return ClickonfailedITACcontrolAssending;
	}

	public WebElement getRiskRatingAccordingToFamilyOrdertoCash() {
		return riskRatingAccordingToFamilyOrdertoCash;
	}

	public WebElement getRiskRatingAccordingToFamilyOrdertoCashSearch() {
		return riskRatingAccordingToFamilyOrdertoCashSearch;
	}

	public WebElement getRiskRatingAccordingToFamilyOrdertoCashSorting() {
		return riskRatingAccordingToFamilyOrdertoCashSorting;
	}

	public WebElement getRiskRatingAccordingToFamilyOrdertoCashSortingDesc() {
		return riskRatingAccordingToFamilyOrdertoCashSortingDesc;
	}

	public WebElement getRiskRatingAccordingToFamilyOrdertoCashMaximze() {
		return riskRatingAccordingToFamilyOrdertoCashMaximze;
	}

	public WebElement getRiskRatingAccordingToFamilyOrdertoCashCrossButton() {
		return riskRatingAccordingToFamilyOrdertoCashCrossButton;
	}

	public WebElement getMediumLegends() {
		return mediumLegends;
	}

	public WebElement getDownloadriskRatingAccordingToFamily() {
		return downloadriskRatingAccordingToFamily;
	}

	public WebElement getDownloadImage() {
		return downloadImage;
	}

	public WebElement getControlDistributionBasedOnMonitoredRiskRatingHigh() {
		return controlDistributionBasedOnMonitoredRiskRatingHigh;
	}

	public WebElement getControlDistributionBasedOnMonitoredRiskRatingHighSortAesc() {
		return controlDistributionBasedOnMonitoredRiskRatingHighSortAesc;
	}

	public WebElement getControlDistributionBasedOnMonitoredRiskRatingHighSortDesc() {
		return controlDistributionBasedOnMonitoredRiskRatingHighSortDesc;
	}

	public WebElement getControlDistributionBasedOnMonitoredRiskRatingHighText() {
		return controlDistributionBasedOnMonitoredRiskRatingHighText;
	}

	public WebElement getControlDistributionBasedOnMonitoredRiskRatingHighMaximize() {
		return controlDistributionBasedOnMonitoredRiskRatingHighMaximize;
	}

	public WebElement getControlDistributionBasedOnMonitoredRiskRatingHighPagination() {
		return controlDistributionBasedOnMonitoredRiskRatingHighPagination;
	}

	public WebElement getControlDistributionBasedOnMonitoredRiskRatingHighCross() {
		return controlDistributionBasedOnMonitoredRiskRatingHighCross;
	}

	public WebElement getListOfITACControlsSearchBox() {
		return listOfITACControlsSearchBox;
	}

	public WebElement getListOfITACControlsPagination() {
		return listOfITACControlsPagination;
	}

	

	
}
