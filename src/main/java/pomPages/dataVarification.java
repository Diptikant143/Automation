package pomPages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class dataVarification {
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
	
	@FindBy(xpath = "//div[@class='mat-select-trigger ng-tns-c155-8']")
    private WebElement dropdownElement;
	
	//@FindBy(xpath = "//span[text()=' TESTSAP26TH ']")
	@FindBy(xpath = "//span[text()=' TEST30TH ']")
    private WebElement chooseClient;
	
	@FindBy(xpath = "//*[text()=' Rules Considered ']")
    private WebElement countOfInstances;
	
	public dataVarification(WebDriver driver) {
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
	public void scrollToExecutiveChart(WebDriver driver) throws Throwable{
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", countOfInstances);
		countOfInstances.click();
	}
	
}
