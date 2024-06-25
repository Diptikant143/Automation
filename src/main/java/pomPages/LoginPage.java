package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(xpath="//input[@name='username']")
	private WebElement userNameTextField;
	
	
	@FindBy(xpath="//span[text()='LOGIN']")
	private WebElement lohinbtn;
	
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement passwordtextfield;
	

	@FindBy(xpath="//span[text()='LOGIN']")
	private WebElement loginbtn2;
	
	@FindBy(xpath="//button[@class='secondary-button small-link']")
	private WebElement clickOnAdvanced;
 
	@FindBy(xpath="//a[@id='proceed-link']")
	private WebElement clickOnUnsafeLink;
	
	@FindBy(xpath = "//div[@class='mat-form-field-infix ng-tns-c146-8']")
	//class="mat-select-trigger ng-tns-c155-8"
	//class="mat-select-placeholder mat-select-min-line ng-tns-c155-8 ng-star-inserted"
    private WebElement dropdownElement;
	
	@FindBy(xpath = "//span[@class='mat-option-text'][1]")
    private WebElement chooseIRM;
	
	
	@FindBy(xpath="//*[@id=\"kt_subheader\"]/div/div[3]/div")
	private WebElement clickOnIRM;
	
	@FindBy(xpath="(//a[@class=\"p-menuitem-link\"])[2]")
	private WebElement logoutButton;
	
	
	
	public WebElement getClickOnIRM() {
		return clickOnIRM;
	}

	public WebElement getLogoutButton() {
		return logoutButton;
	}

	public LoginPage(WebDriver driver) {
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

	public WebElement getClickOnAdvanced() {
		return clickOnAdvanced;
	}

	public WebElement getClickOnUnsafeLink() {
		return clickOnUnsafeLink;
	}

	public WebElement getDropdownElement() {
		return dropdownElement;
	}


	public WebElement getChooseIRM() {
		return chooseIRM;
	}
		
}