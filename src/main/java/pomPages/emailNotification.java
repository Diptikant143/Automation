package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class emailNotification {
	
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
	
	@FindBy(xpath = "(//span[@class=\"mat-option-text\"])[1]")
    private WebElement chooseClient;
	
	@FindBy(xpath="//a[@class='dropdown-toggle btn-icon setting-btn btn-default ml-2 h-34 w-34 flex-shrink-0']")
	private WebElement clickOnHamBurger;

	@FindBy(xpath="(//span[text()='Email Notifications'])[3]")
	private WebElement emailNotification;

	@FindBy(xpath="(//span[text()='Email Configuration'])[2]")
	private WebElement emailConfiguration;
	
	public WebElement getEmailConfiguration() {
		return emailConfiguration;
	}

	public WebElement getEmailNotification() {
		return emailNotification;
	}

	public emailNotification(WebDriver driver) {
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
	public WebElement getClickOnHamBurger() {
		return clickOnHamBurger;
	}
}
