package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(xpath="//input[@name='username']")
	private WebElement userNameTextField;
	
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement propasswordTextField;
	
	
	@FindBy(xpath="//span[@class='mat-button-wrapper']")
	private WebElement Loginbtn;
	

	@FindBy(xpath="//span[@class='mat-select-placeholder mat-select-min-line ng-tns-c189-7 ng-star-inserted']")
	private WebElement clientbtn;
	
	
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		// TODO Auto-generated constructor stub
	}



	public WebElement getUserNameTextField() {
		return userNameTextField;
	}



	public WebElement getPropasswordTextField() {
		return propasswordTextField;
	}



	public WebElement getLoginbtn() {
		return Loginbtn;
	}



	public WebElement getClientbtn() {
		return clientbtn;
	}
	
	
	
	
}