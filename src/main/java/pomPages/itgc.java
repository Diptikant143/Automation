package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class itgc {
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
	
	@FindBy(xpath = "//div[@class='mat-form-field-infix ng-tns-c146-6']")
    private WebElement dropdownElement;
	
	@FindBy(xpath = "(//span[@class=\"mat-option-text\"])[1]")
    private WebElement chooseClient;
	
	@FindBy(xpath="//a[@class=\"dropdown-toggle btn-icon setting-btn btn-default ml-2 h-34 w-34 flex-shrink-0\"]")
	private WebElement clickOnHamBurger;
	
	@FindBy(xpath = "(//span[text()='ITGC and ITAC'])[3]")
    private WebElement itgcAndItac;
	
	@FindBy(xpath = "(//span[text()='ITGC and ITAC Selection'])[2]")
    private WebElement itgcAndItacSection;
	
	@FindBy(xpath = "(//span[@class='mat-button-wrapper'])[2]")
    private WebElement createNewRuleSet;
	
	@FindBy(xpath = "//span[text()=' ITGC/ITAC ']")
    private WebElement itgcItac;
	
	@FindBy(xpath = "//b[normalize-space()='Choose One']")
    private WebElement chooseOne;
	
	@FindBy(xpath = "//span[text()='ITGC']")
    private WebElement itgc;
	
	@FindBy(xpath = "//span[text()=' Import Excel Rule Set ']")
    private WebElement importExcelRuleSet;
	
	@FindBy(xpath = "//b[normalize-space()='Choose ERP']")
    private WebElement chooseERP;
	
	@FindBy(xpath = "//span[text()='Oracle Fusion']")
    private WebElement oracleFusion;
	
	@FindBy(xpath = "(//div[@class='center ng-star-inserted'])[3]")
    private WebElement chooseFile;
	
	@FindBy(xpath = "//div[@class='p-checkbox-box']")
    private WebElement selectAllCheckBox;
	
	@FindBy(xpath = "//input[@id='mat-input-7']")
    private WebElement rulesetName;
	
	@FindBy(xpath = "//span[text()='Save']")
    private WebElement saveITGCRuleSet;
	
	@FindBy(xpath = "//span[text()=' Saikat ']")
    private WebElement clickOnUsername;
	
	@FindBy(xpath = "//span[text()=' Log Out ']")
    private WebElement logOutButton;
	
	public itgc(WebDriver driver) {
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
	public WebElement getItgcAndItac() {
		return itgcAndItac;
	}
	public WebElement getItgcAndItacSection() {
		return itgcAndItacSection;
	}
	public WebElement getCreateNewRuleSet() {
		return createNewRuleSet;
	}
	public WebElement getItgcItac() {
		return itgcItac;
	}
	public WebElement getChooseOne() {
		return chooseOne;
	}
	public WebElement getItgc() {
		return itgc;
	}
	public void itgcItacPopup(WebDriver driver) throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
        try {
            WebElement popup = wait.until(ExpectedConditions.visibilityOf(chooseOne));
            String popupText = popup.getText();

            if (popup.isDisplayed()) {
                if (popupText.contains("Choose One")) {
                    wait.until(ExpectedConditions.elementToBeClickable(itgc)).click();
                } else{
                    System.out.println("Wrong popup showing");
                }
            } else {
                System.out.println("Popup is not displayed");
            }
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
  }
	public WebElement getImportExcelRuleSet() {
		return importExcelRuleSet;
	}
	public WebElement getChooseERP() {
		return chooseERP;
	}
	public WebElement getOracleFusion() {
		return oracleFusion;
	}
	public void importRuleSetChooseERPPopup(WebDriver driver) throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
        try {
            WebElement popup = wait.until(ExpectedConditions.visibilityOf(chooseERP));
            String popupText = popup.getText();

            if (popup.isDisplayed()) {
                if (popupText.contains("Choose ERP")) {
                    wait.until(ExpectedConditions.elementToBeClickable(oracleFusion)).click();
                } else{
                    System.out.println("Wrong popup showing");
                }
            } else {
                System.out.println("Popup is not displayed");
            }
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
  }
	public WebElement getChooseFile() {
		return chooseFile;
	}
	public WebElement getSelectAllCheckBox() {
		return selectAllCheckBox;
	}
	public WebElement getRulesetName() {
		return rulesetName;
	}
	public WebElement getSaveITGCRuleSet() {
		return saveITGCRuleSet;
	}
	public WebElement getClickOnUsername() {
		return clickOnUsername;
	}
	public WebElement getLogOutButton() {
		return logOutButton;
	}
}
