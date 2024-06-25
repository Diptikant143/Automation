package pomPages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class userPermissionManagement {
	
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
	
	@FindBy(xpath = "//div[@class='mat-form-field-infix ng-tns-c146-8']")
    private WebElement dropdownElement;
	
	@FindBy(xpath = "//span[text()=' TESTSAP26TH ']")
	//@FindBy(xpath = "//span[text()=' TEST30TH ']")
    private WebElement chooseClient;
	
	@FindBy(xpath="//*[@id=\"kt_subheader\"]/div/div[2]/a")
	private WebElement clickOnHamBurger;
	
	@FindBy(xpath="(//span[text()='Setup and Administration'])[3]")
	private WebElement setUpAdmin;
	
	@FindBy(xpath="(//span[text()='User Permission Management'])[2]")
	private WebElement userPermissionManagement;
	
	@FindBy(xpath="//div[@class='mat-select-arrow-wrapper ng-tns-c155-15']")
	private WebElement selectUser;
	
	@FindBy(xpath="//span[text()='irm.saikat ']")
	private WebElement chooseUser;
	
	@FindBy(xpath="//span[text()='Edit Permission']")
	private WebElement editPermissionButton;
	
	@FindBy(xpath="//div[@class='mat-select-arrow-wrapper ng-tns-c155-19']")
	private WebElement userSelectDropdown;
	
	@FindBy(xpath="//div[@class='mat-select-arrow-wrapper ng-tns-c155-21']")
	private WebElement bussinessProcessSelectDropdown;
	
	//@FindBy(xpath="//span[text()=' Order to Cash']")
	//@FindBy(xpath="//span[text()=' Record to Report']")
	//@FindBy(xpath="//span[text()=' Hire to Retire']")
	//@FindBy(xpath="//span[text()=' Information Technology']")
	@FindBy(xpath="//span[text()=' Information Technology']")
	//@FindBy(xpath="//span[text()=' Procure to Pay']")
	private WebElement chooseBussinessProcess;
	
	@FindBy(xpath="//span[text()='Update']")
	private WebElement updateButton;
	
	@FindBy(xpath="//button[text()='OK']")
	private WebElement clickOnOkayButton;
	
	@FindBy(xpath="//div[@class='swal2-html-container']")
	private WebElement successMessage;

	public userPermissionManagement(WebDriver driver) {
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

	public WebElement getSetUpAdmin() {
		return setUpAdmin;
	}

	public void getUserPermissionManagement(WebDriver driver) throws Throwable{
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", userPermissionManagement);
		userPermissionManagement.click();
	}

	public WebElement getSelectUser() {
		return selectUser;
	}

	public void getChooseUser(WebDriver driver)throws Throwable {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", chooseUser);
		chooseUser.click();
	}

	public WebElement getEditPermissionButton() {
		return editPermissionButton;
	}

	public WebElement getUserSelectDropdown() {
		return userSelectDropdown;
	}

	public WebElement getBussinessProcessSelectDropdown() {
		return bussinessProcessSelectDropdown;
	}

	public WebElement getChooseBussinessProcess() {
		return chooseBussinessProcess;
	}

	public WebElement getUpdateButton() {
		return updateButton;
	}

	public void checkSavepopUp(WebDriver driver)throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
        try {
            WebElement popup = wait.until(ExpectedConditions.visibilityOf(successMessage));
            String popupText = popup.getText();

            if (popup.isDisplayed()) {
                if (popupText.contains("User Permission is updated")) {
                    wait.until(ExpectedConditions.elementToBeClickable(clickOnOkayButton)).click();
                } else /*if (popupText.contains("Failed to Load the ERP Source Data")) */{
                    System.out.println("Please mind your user permission");
                }
            } else {
                System.out.println("Popup is not displayed");
            }
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
	}
	
	public void refresh(WebDriver driver)throws Throwable{
		driver.navigate().refresh();
	}

	
}
