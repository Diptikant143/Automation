package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class sodSelection {

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
	
	//@FindBy(xpath = "//span[text()=' TEST30TH ']")
	@FindBy(xpath = "//span[text()=' TESTSAP26TH ']")
    private WebElement chooseClient;
	
	@FindBy(xpath="//a[@class=\"dropdown-toggle btn-icon setting-btn btn-default ml-2 h-34 w-34 flex-shrink-0\"]")
	private WebElement clickOnHamBurger;
	
	@FindBy(xpath = "//*[@id=\"kt_aside_menu_top\"]/ul/li[1]")
    private WebElement clickOnIrmMatrix;
	
	@FindBy(xpath = "(//span[@class='menu-text'][normalize-space()='SoD Selection'])[2]")
    private WebElement sodSelection;
	
	@FindBy(xpath = "//span[text()=' Create New Rule Set ']")
    private WebElement createNewRuleSet;
	
	@FindBy(xpath = "//span[normalize-space()='Import Excel Rule Set']")
    private WebElement importExcelRuleSet;
	
	@FindBy(xpath = "//b[normalize-space()='Choose ERP']")
    private WebElement chooseERPPopup;
	
	//@FindBy(xpath = "//span[text()='Oracle Fusion']")
	@FindBy(xpath = "//span[text()='SAP ECC']")
    private WebElement oracleFusion;
	  
	@FindBy(xpath = "(//div[@class='center ng-star-inserted'])[3]")
    private WebElement chooseFile;
	
	@FindBy(xpath = "//div[@class=\"p-checkbox-box\"]")
    private WebElement checkBoxForAll;
	
	@FindBy(xpath = "//input[@name='name']")
    private WebElement ruleSetname;
	
	@FindBy(xpath = "//span[text()='Save']")
    private WebElement saveRule;
	
	@FindBy(xpath = "//div[@class='swal2-html-container']")
    private WebElement varifyPopupMessage;
	
	@FindBy(xpath = "//button[text()='OK']")
    private WebElement varifyPopupMessageOkayButton;
	
	@FindBy(xpath = "//span[text()=' Saikat ']")
    private WebElement clickOnUsername;
	
	@FindBy(xpath = "//span[text()=' Log Out ']")
    private WebElement logOutButton;
	
	public sodSelection(WebDriver driver) {
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
	public WebElement getClickOnUnsafeLink() {
		return clickOnUnsafeLink;
	}
	public WebElement getDropdownElement() {
		return dropdownElement;
	}
	public WebElement getChooseClient() {
		return chooseClient;
	}
	public WebElement getClickOnAdvanced() {
		return clickOnAdvanced;
	}
	public WebElement getClickOnHamBurger() {
		return clickOnHamBurger;
	}
	public WebElement getClickOnIrmMatrix() {
		return clickOnIrmMatrix;
	}
	public WebElement getSodSelection() {
		return sodSelection;
	}
	public WebElement getCreateNewRuleSet() {
		return createNewRuleSet;
	}
	public WebElement getImportExcelRuleSet() {
		return importExcelRuleSet;
	}
	public WebElement getChooseERPPopup() {
		return chooseERPPopup;
	}
	public void varifyChooseErpPopup(WebDriver driver) throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
        try {
            WebElement popup = wait.until(ExpectedConditions.visibilityOf(chooseERPPopup));
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

	//public WebElement getOracleFusion() {
	//	return oracleFusion;
	//}
	
	public WebElement getChooseFile() {
		return chooseFile;
	}

	public WebElement getCheckBoxForAll() {
		return checkBoxForAll;
	}

	public WebElement getRuleSetname() {
		return ruleSetname;
	}

	public WebElement getSaveRule() {
		return saveRule;
	}
	public void sodRuleSetPopup(WebDriver driver) throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
        try {
            WebElement popup = wait.until(ExpectedConditions.visibilityOf(varifyPopupMessage));
            String popupText = popup.getText();

            if (popup.isDisplayed()) {
                if (popupText.contains("SoD Ruleset Created")) {
                    wait.until(ExpectedConditions.elementToBeClickable(varifyPopupMessageOkayButton)).click();
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

	public WebElement getVarifyPopupMessage() {
		return varifyPopupMessage;
	}

	public WebElement getVarifyPopupMessageOkayButton() {
		return varifyPopupMessageOkayButton;
	}
	public WebElement getClickOnUsername() {
		return clickOnUsername;
	}
	public WebElement getLogOutButton() {
		return logOutButton;
	}
	
	
}
