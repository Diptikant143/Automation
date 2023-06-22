package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePOM {
	
	@FindBy(xpath="//input[@name=\'username\']")
	private WebElement Username;
	
	@FindBy(xpath="//span[text()='LOGIN']")
	private WebElement login1;
	
	@FindBy(xpath="//input[@type=\'password\']")
	private WebElement password;

	
	//constractor

	public LoginPagePOM(WebDriver driver) {
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}

	//getter 
	
	public WebElement getUsername() {
		return Username;
	}

	public WebElement getLogin1() {
		return login1;
	}

	public WebElement getPassword() {
		return password;
	}

		

	
	

}
