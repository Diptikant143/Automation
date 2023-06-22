package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Developer_POM {
	
	@FindBy(xpath="//*[local-name()='svg' and @class='ionicon']")
	private WebElement hambutton;

	@FindBy(xpath="(//span[text()='Developer'])[3]")
	private WebElement devbutton;

	@FindBy(xpath="(//span[text()='Dashboard Designer'])[2]")
	private WebElement devdesigner;
	
	@FindBy(xpath="//span[text()='New Project']")
	private WebElement newproject;
	
	@FindBy(xpath="//input[@name=\'name\']")
	private WebElement projectname;
	
	@FindBy(xpath="//span[text()='OK']")
	private WebElement okbutton;
	
	@FindBy(xpath="//button[text()='OK']")
	private WebElement okbutton2;
	
	@FindBy(xpath="//*[local-name()='svg' and @class='ionicon']")
	private WebElement hambutton2;
	
	@FindBy(xpath="(//td[@class=\'expandOne ng-star-inserted\'])[9]")
	private WebElement selectproject;
	
	@FindBy(xpath="//span[text()='Import Table']")
	private WebElement importtable;
	
	@FindBy(xpath="(//span[text()='ADD'])[1]")
	private WebElement IRMDB;
	
	@FindBy(xpath="//div[@class=\'mat-select-arrow-wrapper ng-tns-c189-21\']")
	private WebElement selecttable;
	
	@FindBy(xpath="//input[@formcontrolname=\'value\']")
	private WebElement searchfortable;
	
	@FindBy(xpath="//span[text()='xx_fusion_sod_new_out']")
	private WebElement DBtable;
	
	@FindBy(xpath="(//input[@type=\"text\"])[5]")
	private WebElement tablename;
	
	@FindBy(xpath="(//button[@type=\"submit\"])[6]")
	private WebElement createtableok;
	
	@FindBy(xpath="(////button[text()='OK']")
	private WebElement aftecreatetablealert;
	
	@FindBy(xpath="(//div[@class=\'mat-tab-label-content\'])[2]")
	private WebElement visualizationtab;
	
	
	//constractor
	
	public Developer_POM(WebDriver driver) {
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}

	
	//getters

	public WebElement getHambutton() {
		return hambutton;
	}


	public WebElement getDevbutton() {
		return devbutton;
	}


	public WebElement getDevdesigner() {
		return devdesigner;
	}


	public WebElement getNewproject() {
		return newproject;
	}


	public WebElement getProjectname() {
		return projectname;
	}


	public WebElement getOkbutton() {
		return okbutton;
	}


	public WebElement getOkbutton2() {
		return okbutton2;
	}
	
	
	public WebElement getHambutton2() {
		return hambutton2;
	}


	public WebElement getSelectproject() {
		return selectproject;
	}


	public WebElement getImporttable() {
		return importtable;
	}


	public WebElement getIRMDB() {
		return IRMDB;
	}


	public WebElement getSelecttable() {
		return selecttable;
	}


	public WebElement getSearchfortable() {
		return searchfortable;
	}


	public WebElement getDBtable() {
		return DBtable;
	}


	public WebElement getTablename() {
		return tablename;
	}


	public WebElement getCreatetableok() {
		return createtableok;
	}


	public WebElement getAftecreatetablealert() {
		return aftecreatetablealert;
	}


	public WebElement getVisualizationtab() {
		return visualizationtab;
	}

	
	

	
	
}
