package demo;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import GenericUtils.BaseClass;
import GenericUtils.ListnerImplementationClass;
import io.github.bonigarcia.wdm.webdriver.WebDriverBrowser;
import pomPages.sodDashboard;
@Listeners(ListnerImplementationClass.class)
public class urlTest extends BaseClass {
	@Test
	public void irmUrlTest() throws Throwable{
		ListnerImplementationClass.test.log(Status.INFO, "ITGC DASHBOARD PAGE STARTS HERE");
		ListnerImplementationClass.test.assignAuthor("Saikat");
		ListnerImplementationClass.test.assignDevice("Windows X64");
		sodDashboard sod = new sodDashboard(driver);
        sod.getClickOnAdvanced().click();
		sod.getClickOnUnsafeLink().click();
		sod.getUserNameTextField().sendKeys(USERNAME);
		sod.getLohinbtn().click();		
		sod.getPasswordtextfield().sendKeys(PASSWORD);
		sod.getLohinbtn().click();
		sod.getDropdownElement().click();
		sod.getChooseClient().click();
		sod.getLohinbtn().click();
		ListnerImplementationClass.test.log(Status.INFO, "LOGIN PAGE ENDS HERE");
		WebDriverWait wait = new WebDriverWait(driver, 10); // 10 seconds timeout
        if(wait.until(ExpectedConditions.urlContains("/irmbi/dashboard?id=1"))) {
        	System.out.println("In Dashboard");
        }else {
        	System.out.println("Not in Dashboard");
        }
        //String currentURL = driver.getCurrentUrl();
        //System.out.println("Current URL after login: " + currentURL);
	}

}
