package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DataSync_POM {
	
	@FindBy(xpath="//span[text()='Configure New Datasource']")
	private WebElement NewConfig;
	
	@FindBy(xpath="//span[@class='mat-select-placeholder mat-select-min-line ng-tns-c189-15 ng-star-inserted']")
	private WebElement ERP;
	
	@FindBy(xpath="//span[text()=' Oracle Fusion ']")
	private WebElement ERPname;

	@FindBy(xpath="//span[@class=\'mat-select-placeholder mat-select-min-line ng-tns-c189-17 ng-star-inserted\']")
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
	
	@FindBy(xpath="//*[local-name()='svg' and @class='ionicon']")
	private WebElement hamburgerbtn;
	
	@FindBy(xpath="(//span[text()='iMatrix'])[3]")
	private WebElement RCButton1;
	
	@FindBy(xpath="(//span[text()='ERP Status'])[2]")
	private WebElement ESbutton;
	
	@FindBy(xpath="(//button[@class=\'mat-focus-indicator btncolor landingMatCardBtn mat-button mat-button-base\'])[5]")
	private WebElement Syncbutton;
	
	//constractor
	
	public DataSync_POM(WebDriver driver) {
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	
	
	//getter

	public WebElement getNewConfig() {
		return NewConfig;
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


	public WebElement getHamburgerbtn() {
		return hamburgerbtn;
	}


	public WebElement getRCButton1() {
		return RCButton1;
	}


	public WebElement getESbutton() {
		return ESbutton;
	}


	public WebElement getSyncbutton() {
		return Syncbutton;
	}
	
	
	
	

	
	
	
  
	
	
	
	
	
	

}
