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
	
	
	
	
	
	

	
	
	
	
	
	
	
	

	
	
	
}