package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SoDMatrixPOM {
	
	
	@FindBy(xpath="//div[@class=\'topbarProfile d-flex justify-content-between align-items-center\']")
	private WebElement CChange;
	
	@FindBy(xpath="//span[text()=' Change Client ']")
	private WebElement ClientChange;
	
	@FindBy(xpath="//span[text()=' TheDemoCo. ']")
	private WebElement anotherclient;
	
	@FindBy(xpath="(//span[text()='iMatrix'])[1]")
	private WebElement iMatrixbtn;
	
	@FindBy(xpath="//span[text()='SoD Matrix']")
	private WebElement SoDMatrix;
	
	@FindBy(xpath="(//button[@class=\'mat-focus-indicator btn mat-button mat-button-base\'])[2]")
	private WebElement controls;
	
	@FindBy(xpath="(//input[@class=\'mat-chip-input mat-input-element mat-autocomplete-trigger ng-untouched ng-pristine ng-valid\'])[1]")
	private WebElement SoD;
	
	@FindBy(xpath="//span[text()=' Manage Employee and Manage Payroll ']")
	private WebElement chooseSoD;
	
	
	@FindBy(xpath="//span[@class=\'mat-chip-remove mat-chip-trailing-icon ng-star-inserted\']")
	private WebElement forload;

	
	//constructor
	
	public SoDMatrixPOM(WebDriver driver) {
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


	public WebElement getSoDMatrix() {
		return SoDMatrix;
	}


	public WebElement getControls() {
		return controls;
	}


	public WebElement getSoD() {
		return SoD;
	}


	public WebElement getChooseSoD() {
		return chooseSoD;
	}


	public WebElement getForload() {
		return forload;
	}
	
 

	
	
}
