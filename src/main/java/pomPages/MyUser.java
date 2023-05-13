package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyUser {
	
	
	@FindBy(xpath="//input[@name='username']")
	private WebElement userNameTextField;
	
	
	@FindBy(xpath="//span[text()='LOGIN']")
	private WebElement lohinbtn;
	
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement passwordtextfield;
	
	@FindBy(xpath="//span[text()='LOGIN']")
	private WebElement loginbtn2;

	
	@FindBy(xpath="//div[@class='mat-select-value ng-tns-c189-7']")
	private WebElement choosecloent;
	
	
	@FindBy(xpath="//span[text()=' Client_Demo ']")
	private WebElement Testing;
	
	
	@FindBy(xpath="//span[text()='LOGIN']")
	private WebElement Login3;
	
	@FindBy(xpath="(//span[text()='iMatrix'])[1]")
	private WebElement iMatrix;
	
	
	
	@FindBy(xpath="//span[text()='SoD Selection']")
	private WebElement sodselection;

	@FindBy(xpath="//span[text()=' Create New Rule Set ']")
	private WebElement createruleset;
     
	
	@FindBy(xpath="//span[text()=' Import Excel Rule Set ']")
	private WebElement importexcelruleset;
	
	@FindBy(xpath="//span[text()='Oracle Fusion']")
	private WebElement orcalecloudfusion;
	
	
	@FindBy(xpath="(//div[@class='center ng-star-inserted'])[3]")
	private WebElement ChooseFile;
	
	

	public MyUser(WebDriver driver) {
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


	public WebElement getChoosecloent() {
		return choosecloent;
	}


	public WebElement getTesting() {
		return Testing;
	}
	
	
	public WebElement getLogin3() {
		return Login3;
	}


	public WebElement getiMatrix() {
		return iMatrix;
	}


	public WebElement getSodselection() {
		return sodselection;
	}


	public WebElement getCreateruleset() {
		return createruleset;
	}


	public WebElement getImportexcelruleset() {
		return importexcelruleset;
	}


	public WebElement getOrcalecloudfusion() {
		return orcalecloudfusion;
	}


	public WebElement getChooseFile() {
		return ChooseFile;
	}

	
	
	
	
	
	
	
	
	

}
