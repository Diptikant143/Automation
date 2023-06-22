package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DataSyncPOM {
	
	@FindBy(xpath="//div[@class=\'topbarProfile d-flex justify-content-between align-items-center\']")
	private WebElement CChange;
	
	@FindBy(xpath="//span[text()=' Change Client ']")
	private WebElement ClientChange;
	
	@FindBy(xpath="//span[text()=' TheDemoCo. ']")
	private WebElement anotherclient;

	@FindBy(xpath="//span[text()='Configure New Datasource']")
	private WebElement NewConfig;
	
	@FindBy(xpath="//button[text()='OK']")
	private WebElement ok;
	
    @FindBy(xpath="(//button[@class=\'mat-focus-indicator btncolor textOverFlow mat-button mat-button-base\'])[2]")
	private WebElement NewConfig2;
	
	@FindBy(xpath="//span[@class=\'mat-select-placeholder mat-select-min-line ng-tns-c189-12 ng-star-inserted\']")
	private WebElement ERP;
	
	@FindBy(xpath="//span[text()=' Oracle Fusion ']")
	private WebElement ERPname;

	@FindBy(xpath="//span[@class='mat-select-placeholder mat-select-min-line ng-tns-c189-14 ng-star-inserted']")
	private WebElement DatasourceType;
	
	@FindBy(xpath="//span[text()=' SOAP API ']")
	private WebElement API;
	
	@FindBy(xpath="//input[@placeholder=\'Source URL\']")
	private WebElement ERPurl;
	
	@FindBy(xpath="//input[@name='username']")
	private WebElement ERPusername;
	
	@FindBy(xpath="//input[@placeholder=\'Password\']")
	private WebElement ERPpw;
	
	@FindBy(xpath="//input[@name=\'DsName\']")
	private WebElement DSname;
	
	@FindBy(xpath="//span[text()='Create Data Source']")
	private WebElement CreatDS;
	
	@FindBy(xpath="(//button[@type=\'button\'])[4]")
	private WebElement okbutton;
	
	@FindBy(xpath="(//span[text()='iMatrix'])[1]")
	private WebElement iMatrixbtn;
	
	@FindBy(xpath="//span[text()='ERP Status']")
	private WebElement ESbutton;
	
	@FindBy(xpath="(//span[text()='Sync'])[4]")
	private WebElement Syncbutton;
	
	@FindBy(xpath="(//span[@class='mat-slide-toggle-bar'])[1]")
	private WebElement SyncforiMatrix;
	
	@FindBy(xpath="(//span[@class='mat-slide-toggle-bar'])[2]")
	private WebElement SyncforSoD;
	
	@FindBy(xpath="(//span[@class='mat-slide-toggle-bar'])[3]")
	private WebElement SyncforITGC;
	
	@FindBy(xpath="//span[@class=\'mat-select-placeholder mat-select-min-line ng-tns-c189-44 ng-star-inserted\']")
	private WebElement ruleset;
	
	@FindBy(xpath="//span[text()=' fusion_27 controls ']")
	private WebElement controls;

	@FindBy(xpath="//a[text()=' Configure Access GLobal Conditions ']")
	private WebElement globalconditions;
	
	@FindBy(xpath="(//span[@class='mat-slide-toggle-bar'])[4]")
	private WebElement businessprocess;
	
	@FindBy(xpath="(//span[@class='ng-star-inserted'])[1]")
	private WebElement okBP;
	
	@FindBy(xpath="//span[text()='Sync Data']")
	private WebElement sync;
	
	@FindBy(xpath="(//div[@class=\'mat-tab-label-content\'])[3]")
	private WebElement DSjob;
	
	
	@FindBy(xpath="(//span[@class=\'mat-button-wrapper\'])[2]")
	private WebElement refresh;

	
	//constructor
	
	public DataSyncPOM(WebDriver driver) {
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}

	//getter
	

	
	public WebElement getCChange() {
		return CChange;
	}
	
	public WebElement getClientChange() {
		return ClientChange;
	}
	
	public WebElement getAnotherclient() {
		return anotherclient;
	}

	public WebElement getNewConfig() {
		return NewConfig;
	}
	
	public WebElement getOk() {
		return ok;
	}

	public WebElement getNewConfig2() {
		return NewConfig2;
	}

	public WebElement getERP() {
		return ERP;
	}


	public WebElement getERPname() {
		return ERPname;
	}


	public WebElement getDatasourceType() {
		return DatasourceType;
	}


	public WebElement getAPI() {
		return API;
	}


	public WebElement getERPurl() {
		return ERPurl;
	}


	public WebElement getERPusername() {
		return ERPusername;
	}


	public WebElement getERPpw() {
		return ERPpw;
	}


	public WebElement getDSname() {
		return DSname;
	}


	public WebElement getCreatDS() {
		return CreatDS;
	}


	public WebElement getOkbutton() {
		return okbutton;
	}


	public WebElement getiMatrixbtn() {
		return iMatrixbtn;
	}
	

	public WebElement getESbutton() {
		return ESbutton;
	}


	public WebElement getSyncbutton() {
		return Syncbutton;
	}

	public WebElement getSyncforiMatrix() {
		return SyncforiMatrix;
	}

	public WebElement getSyncforSoD() {
		return SyncforSoD;
	}

	public WebElement getSyncforITGC() {
		return SyncforITGC;
	}

	public WebElement getRuleset() {
		return ruleset;
	}

	public WebElement getControls() {
		return controls;
	}

	public WebElement getGlobalconditions() {
		return globalconditions;
	}

	public WebElement getBusinessprocess() {
		return businessprocess;
	}

	public WebElement getOkBP() {
		return okBP;
	}

	public WebElement getSync() {
		return sync;
	}

	public WebElement getDSjob() {
		return DSjob;
	}

	public WebElement getRefresh() {
		return refresh;
	}
	
	
	
	
	

}
