package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SoDDashboardPom {
	
	@FindBy(xpath="//div[@class=\'topbarProfile d-flex justify-content-between align-items-center\']")
	private WebElement CChange;
	
	@FindBy(xpath="//span[text()=' Change Client ']")
	private WebElement ClientChange;
	
	@FindBy(xpath="//span[text()=' TheDemoCo. ']")
	private WebElement anotherclient;
	
	@FindBy(xpath="(//span[text()='iMatrix'])[1]")
	private WebElement iMatrixbtn;
	
	@FindBy(xpath="//span[text()='SoD Analysis Dashboard']")
	private WebElement SAD;
	
	@FindBy(xpath="//mat-icon[text()='refresh']")
	private WebElement refresh;
	
	@FindBy(xpath="(//a[@role=\'button\'])[5]")
	private WebElement assesment;
	
	@FindBy(xpath="//span[text()=' DID-DO ANALYSIS ']")
	private WebElement diddo;
	
	@FindBy(xpath="//span[@class=\'mat-select-placeholder mat-select-min-line ng-tns-c189-31 ng-star-inserted\']")
	private WebElement ccode;
	
	@FindBy(xpath="(//span[@class=\'mat-option-text\'])[1]")
	private WebElement ccodevalue;



	

	
	//Contractor
	
	public SoDDashboardPom(WebDriver driver) {
		PageFactory.initElements(driver,this);
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


	public WebElement getiMatrixbtn() {
		return iMatrixbtn;
	}


	public WebElement getSAD() {
		return SAD;
	}


	public WebElement getRefresh() {
		return refresh;
	}


	public WebElement getAssesment() {
		return assesment;
	}


	public WebElement getDiddo() {
		return diddo;
	}


	public WebElement getCcode() {
		return ccode;
	}


	public WebElement getCcodevalue() {
		return ccodevalue;
	}
	
	
	
	
}
