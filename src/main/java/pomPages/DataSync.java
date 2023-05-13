package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DataSync {
	
	
	@FindBy(xpath="//input[@name='username']")
	private WebElement userNameTextField;
	
	
	@FindBy(xpath="//span[text()='LOGIN']")
	private WebElement lohinbtn;
	
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement passwordtextfield;
	

	@FindBy(xpath="//span[text()='LOGIN']")
	private WebElement loginbtn2;
	
	
	
	@FindBy(xpath="//div[@role='button']")
	private WebElement logo;


	@FindBy(xpath="//span[text()=' Change Client ']")
	private WebElement Changeclient;
     
	@FindBy(xpath="//span[text()=' MicroDemo ']")
	private WebElement MicroDemo;
     
	
	@FindBy(xpath="(//button[@class='mat-focus-indicator btncolor textOverFlow mat-button mat-button-base'])[2]")
	private WebElement NewDatasource;
     
	@FindBy(xpath="//div[@class='mat-select-value ng-tns-c189-12']")
	private WebElement ERP;
	
	
	
	@FindBy(xpath="//span[text()=' Oracle Fusion ']")
	private WebElement OracleFusion;
     
	
	@FindBy(xpath="//div[@class='mat-select-value ng-tns-c189-14']")
	private WebElement Datasourcetype;
	
	

	@FindBy(xpath="//span[text()=' SOAP API ']")
	private WebElement API;
	
	
	@FindBy(xpath="(//input[@type='text'])[3]")
	private WebElement Url;
	
	
	
	@FindBy(xpath="//input[@name='username']")
	private WebElement Erpusername;
	

	@FindBy(xpath="//input[@type='password']")
	private WebElement Erppassword;
	
	

	@FindBy(xpath="(//input[@type='text'])[5]")
	private WebElement DataSourceName;
	
	@FindBy(xpath="//span[text()='Create Data Source']")
	private WebElement CreateDataSource;
	
	
	@FindBy(xpath="(//button[@type='button'])[4]")
	private WebElement sucessfullok;
	
	@FindBy(xpath="(//span[text()='iMatrix'])[1]")
	private WebElement NewiMatrix;
	
	
	@FindBy(xpath="//span[text()='ERP Status']")
	private WebElement ErpStatus;
	
	

	@FindBy(xpath="(//span[text()='Sync'])[6]")
	private WebElement MouseSync;
	
	
	@FindBy(xpath="//span[text()='Sync For Imatrix ']")
	private WebElement Buttonone;
	
	
	@FindBy(xpath="//span[text()='Sync For ITGC ']")
	private WebElement ButtonTwo;
	
	@FindBy(xpath="//span[text()='Perform SOD Analysis ']")
	private WebElement ButtonThree;

	
	@FindBy(xpath="//div[@class='mat-select-value ng-tns-c189-44']")
	private WebElement SelectPolicy;
	
	
	@FindBy(xpath="//span[text()=' 27 controls ']")
	private WebElement Controls;
	
	
	@FindBy(xpath="//a[text()=' Configure Access GLobal Conditions ']")
	private WebElement Link;
	
	

	@FindBy(xpath="//span[text()='Within Same Business Unit ']")
	private WebElement BUTTON;

	@FindBy(xpath="//span[text()='Ok']")
	private WebElement BUTTONOK;
	
	
	@FindBy(xpath="//span[text()='Sync Data']")
	private WebElement BUTTONOKSYNCDATA;
	
	
	@FindBy(xpath="//button[text()='OK']")
	private WebElement BUTTONOKSYNCDATAALERT;
	
	
	@FindBy(xpath="(//div[@class='mat-tab-label-content'])[3]")
	private WebElement jobs;
	
	@FindBy(xpath="//button[@class='mat-focus-indicator mat-tooltip-trigger mat-mini-fab mat-button-base mat-btncolor']")
	private WebElement Refresh;
	
	
	
	
	public DataSync(WebDriver driver) {
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
	
	public WebElement getLogo() {
		return logo;
	}


	public WebElement getChangeclient() {
		return Changeclient;
	}


	public WebElement getMicroDemo() {
		return MicroDemo;
	}


	public WebElement getNewDatasource() {
		return NewDatasource;
	}


	public WebElement getERP() {
		return ERP;
	}


	public WebElement getOracleFusion() {
		return OracleFusion;
	}


	public WebElement getDatasourcetype() {
		return Datasourcetype;
	}


	public WebElement getAPI() {
		return API;
	}


	public WebElement getUrl() {
		return Url;
	}


	public WebElement getErpusername() {
		return Erpusername;
	}


	public WebElement getErppassword() {
		return Erppassword;
	}


	public WebElement getDataSourceName() {
		return DataSourceName;
	}


	public WebElement getCreateDataSource() {
		return CreateDataSource;
	}


	public WebElement getSucessfullok() {
		return sucessfullok;
	}


	public WebElement getNewiMatrix() {
		return NewiMatrix;
	}


	public WebElement getErpStatus() {
		return ErpStatus;
	}


	public WebElement getMouseSync() {
		return MouseSync;
	}


	public WebElement getButtonone() {
		return Buttonone;
	}


	public WebElement getButtonTwo() {
		return ButtonTwo;
	}


	public WebElement getButtonThree() {
		return ButtonThree;
	}


	public WebElement getSelectPolicy() {
		return SelectPolicy;
	}


	public WebElement getControls() {
		return Controls;
	}


	public WebElement getLink() {
		return Link;
	}


	public WebElement getBUTTON() {
		return BUTTON;
	}


	public WebElement getBUTTONOK() {
		return BUTTONOK;
	}


	public WebElement getBUTTONOKSYNCDATA() {
		return BUTTONOKSYNCDATA;
	}


	public WebElement getBUTTONOKSYNCDATAALERT() {
		return BUTTONOKSYNCDATAALERT;
	}


	public WebElement getJobs() {
		return jobs;
	}


	public WebElement getRefresh() {
		return Refresh;
	}
	
	
	

	
	
	
	
	

}
