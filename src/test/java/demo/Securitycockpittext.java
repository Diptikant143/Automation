package demo;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import GenericUtils.BaseClass;
import GenericUtils.ListnerImplementationClass;
import pomPages.securitycockpitpom;

@Listeners(ListnerImplementationClass.class)
public class Securitycockpittext extends BaseClass {

	@Test
	public void Security() throws Throwable{
		ListnerImplementationClass.test.log(Status.INFO, "LOGIN");
		ListnerImplementationClass.test.assignAuthor("DIPTIKANTA");
		ListnerImplementationClass.test.assignDevice("windows 64");
		securitycockpitpom cock=new securitycockpitpom(driver);
		Thread.sleep(1000);
		cock.getClickOnAdvanced().click();
		cock.getClickOnUnsafeLink().click();
		cock.getUserNameTextField().sendKeys(USERNAME);
		cock.getLohinbtn().click();		
		cock.getPasswordtextfield().sendKeys(PASSWORD);
		cock.getLohinbtn().click();
		cock.getDropdownElement().click();
		cock.getChooseClient().click();
		cock.getLohinbtn().click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		cock.getClickOnhamburgur().click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		cock.getClickOnsetup().click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		cock.getSecurityCockpit(driver);
		cock.getClickOnhamburgur().click();
		cock.getClickonuserdownarrey().click();
		cock.getClickonuseropoup().click();
		cock.getClickonuserexceldownload().click();
		cock.getClickonibutton().click();
		cock.getClickonCross().click();
	}
}