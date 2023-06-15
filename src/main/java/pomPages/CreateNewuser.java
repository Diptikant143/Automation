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
	
	
	@FindBy(xpath="(//span[text()='Setup and Administration'])[1]")

	private WebElement Setup;

	

	@FindBy(xpath="//span[text()='Create New User']")

	private WebElement NewUser;

	

	@FindBy(xpath="//input[@formcontrolname=\'firstName\']")

	private WebElement firstName;

	

	@FindBy(xpath="//input[@formcontrolname=\'lastName\']")

	private WebElement lastName;

	

	@FindBy(xpath="//input[@formcontrolname=\'emailID\']")

	private WebElement email;

	

	@FindBy(xpath="//input[@formcontrolname=\'contactNumber\']")

	private WebElement Num;

	

	@FindBy(xpath="//input[@formcontrolname=\'username\']")

	private WebElement UserName;

	

	@FindBy(xpath="//input[@formcontrolname='password']")

	private WebElement PassWord;

	

	@FindBy(xpath="//span[text()='Choose Customer']")

	private WebElement Clint;

	

	@FindBy(xpath="//span[text()=' iRM Super Admin']")

	private WebElement chooseclint;

	

	@FindBy(xpath="//span[text()='Permission Policy']")

	private WebElement Permision;

	

	@FindBy(xpath="//span[text()=' iRM Super Admin:root policy']")

	private WebElement choosePermision;

	

	@FindBy(xpath="//input[@formcontrolname=\'endDate\']")

	private WebElement enddate;

	

	@FindBy(xpath="//mat-checkbox[@id=\'mat-checkbox-1\']")

	private WebElement checkbox;

	
	
	public CreateNewuser(WebDriver driver) {
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



	public WebElement getSetup() {
		return Setup;
	}



	public WebElement getNewUser() {
		return NewUser;
	}



	public WebElement getFirstName() {
		return firstName;
	}



	public WebElement getLastName() {
		return lastName;
	}



	public WebElement getEmail() {
		return email;
	}



	public WebElement getNum() {
		return Num;
	}



	public WebElement getUserName() {
		return UserName;
	}



	public WebElement getPassWord() {
		return PassWord;
	}



	public WebElement getClint() {
		return Clint;
	}



	public WebElement getChooseclint() {
		return chooseclint;
	}



	public WebElement getPermision() {
		return Permision;
	}



	public WebElement getChoosePermision() {
		return choosePermision;
	}



	public WebElement getEnddate() {
		return enddate;
	}



	public WebElement getCheckbox() {
		return checkbox;
	}

	
	
	
	
	
	

}
