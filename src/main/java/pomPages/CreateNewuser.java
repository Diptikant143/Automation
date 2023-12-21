package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewuser {
	
	@FindBy(xpath="//input[@name='username']")
	private WebElement userNameTextField;
	
	
	@FindBy(xpath="//span[text()='LOGIN']")
	private WebElement lohinbtn;
	
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement passwordtextfield;
	

	@FindBy(xpath="//span[text()='LOGIN']")
	private WebElement loginbtn2;
	
	
	@FindBy(xpath="//button[@id=\'details-button\']")
	private WebElement clickOnAdvanced;
 
	@FindBy(xpath="//a[@id='proceed-link']")
	private WebElement clickOnUnsafeLink;

	
	@FindBy(xpath = "//div[@class='mat-form-field-infix ng-tns-c146-6']")
    private WebElement dropdownElement;
	
	@FindBy(xpath = "//span[@class='mat-option-text'][1]")
    private WebElement chooseIRM;
	
	public CreateNewuser(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public WebElement getUserNameTextField() {
		return userNameTextField;
	}
}
