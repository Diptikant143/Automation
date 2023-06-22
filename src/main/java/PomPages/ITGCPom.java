package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ITGCPom {
	
	@FindBy(xpath="//div[@class=\'topbarProfile d-flex justify-content-between align-items-center\']")
	private WebElement CChange;
	
	@FindBy(xpath="//span[text()=' Change Client ']")
	private WebElement ClientChange;
	
	@FindBy(xpath="//span[text()=' TheDemoCo. ']")
	private WebElement anotherclient;
	
	@FindBy(xpath="(//span[text()='ITGC'])[1]")
	private WebElement ITGC;
	
	@FindBy(xpath="//span[text()='ITGC Dashboard']")
	private WebElement ITGCdashboard;
	
	@FindBy(xpath="//span[text()='Create ITGC JOB']")
	private WebElement CreateJob;
	
	@FindBy(xpath="(//button[@class=\'mat-focus-indicator btn mat-button mat-button-base\'])[2]")
	private WebElement fusionERP;
	
	@FindBy(xpath="(//span[@class=\'mat-button-wrapper\'])[6]")
	private WebElement evaluate;
	
	@FindBy(xpath="//div[@class=\'mat-select-arrow ng-tns-c189-41\']")
	private WebElement choosebatch;
	
	@FindBy(xpath="(//span[@class=\'mat-option-text\'])[1]")
	private WebElement batch;
	
	@FindBy(xpath="//input[@name=\'name\']")
	private WebElement batchname;
	
	@FindBy(xpath="//button[@type=\'button\']")
	private WebElement batchok;
	
	@FindBy(xpath="//button[text()='OK']")
	private WebElement ok;
	
	@FindBy(xpath="//mat-icon[text()='refresh']")
	private WebElement refresh;
	
	@FindBy(xpath="//a[text()='TheDemoCo.1']")
	private WebElement assesment;
	
	@FindBy(xpath="//span[text()=' AUTOMATED BUSINESS CONTROL ']")
	private WebElement ABC;
	
	@FindBy(xpath="//span[text()=' IT GENERAL CONTROLS ']")
	private WebElement ITGCtab;
	
	@FindBy(xpath="//span[text()=' ITGC Subjective Control ']")
	private WebElement subcontrol;

	
	//Contractor
	
	public ITGCPom(WebDriver driver) {
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

	public WebElement getITGC() {
		return ITGC;
	}

	public WebElement getITGCdashboard() {
		return ITGCdashboard;
	}

	public WebElement getCreateJob() {
		return CreateJob;
	}

	public WebElement getFusionERP() {
		return fusionERP;
	}

	public WebElement getEvaluate() {
		return evaluate;
	}

	public WebElement getChoosebatch() {
		return choosebatch;
	}

	public WebElement getBatch() {
		return batch;
	}

	public WebElement getBatchname() {
		return batchname;
	}

	public WebElement getBatchok() {
		return batchok;
	}

	public WebElement getOk() {
		return ok;
	}

	public WebElement getRefresh() {
		return refresh;
	}

	public WebElement getAssesment() {
		return assesment;
	}

	public WebElement getABC() {
		return ABC;
	}

	public WebElement getITGCtab() {
		return ITGCtab;
	}

	public WebElement getSubcontrol() {
		return subcontrol;
	}
	
	
	
	


}
