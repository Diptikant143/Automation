package demo;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import GenericUtils.BaseClass;
import GenericUtils.ListnerImplementationClass;
import pomPages.userPermissionManagement;

@Listeners(ListnerImplementationClass.class)

public class userPermissionManagementTest extends BaseClass {
	@Test
	public void userPermissionManagementExit() throws Throwable{
		ListnerImplementationClass.test.log(Status.INFO, "USER PERMISSION MANAGEMENT STARTS HERE");
		ListnerImplementationClass.test.assignAuthor("Saikat");
		ListnerImplementationClass.test.assignDevice("windows 64");
		userPermissionManagement usptest = new userPermissionManagement(driver);
		Robot robot = new Robot();
		ListnerImplementationClass.test.log(Status.INFO, "LOGIN STARTS HERE");
		usptest.getClickOnAdvanced().click();
		usptest.getClickOnUnsafeLink().click();
		usptest.getUserNameTextField().sendKeys(USERNAME);
		usptest.getLohinbtn().click();		
		usptest.getPasswordtextfield().sendKeys(PASSWORD);
		usptest.getLohinbtn().click();
		usptest.getDropdownElement().click();
		usptest.getChooseClient().click();
		usptest.getLohinbtn().click();
		ListnerImplementationClass.test.log(Status.INFO, "LOGIN STARTS HERE");
		ListnerImplementationClass.test.log(Status.INFO, "USERPERMISSION MANAGEMENT STARTS HERE");
		usptest.getClickOnHamBurger().click();
		usptest.getSetUpAdmin().click();
		usptest.getUserPermissionManagement(driver);
		usptest.getClickOnHamBurger().click();
		usptest.getSelectUser().click();
		usptest.getChooseUser(driver);
		usptest.getEditPermissionButton().click();
		usptest.getUserSelectDropdown().click();
		usptest.getChooseUser(driver);
		usptest.getBussinessProcessSelectDropdown().click();
		usptest.getChooseBussinessProcess().click();
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		usptest.getUpdateButton().click();
		usptest.checkSavepopUp(driver);
		usptest.refresh(driver);
		Thread.sleep(10000);
		ListnerImplementationClass.test.log(Status.INFO, "USERPERMISSION MANAGEMENT ENDS HERE");
		ListnerImplementationClass.test.log(Status.INFO, "USER PERMISSION MANAGEMENT ENDS HERE");
	}
}
