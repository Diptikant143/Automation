package demo;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import GenericUtils.BaseClass;
import GenericUtils.ListnerImplementationClass;
import pomPages.PermissionManagement;
@Listeners(ListnerImplementationClass.class)
public class Permission extends BaseClass{
	
	
	
	@Test
	public void Permission () throws Throwable {
		
		ListnerImplementationClass.test.log(Status.INFO, "PERMISSION STARTS HERE");
		ListnerImplementationClass.test.assignAuthor("Saikat");
		ListnerImplementationClass.test.assignDevice("windows 64");
		
		PermissionManagement per=new PermissionManagement(driver);
		Robot robot = new Robot();
		ListnerImplementationClass.test.log(Status.INFO, "LOGIN STARTS HERE");
		per.getClickOnAdvanced().click();
		per.getClickOnUnsafeLink().click();
		per.getUserNameTextField().sendKeys(USERNAME);
		per.getLohinbtn().click();
		per.getPasswordtextfield().sendKeys(PASSWORD);
		per.getLoginbtn2().click();
		per.getDropdownElement().click();
		per.getChooseIRM().click();
		per.getLoginbtn2().click();
		ListnerImplementationClass.test.log(Status.INFO, "LOGIN END HERE");
		ListnerImplementationClass.test.log(Status.INFO, "PERMISSION MANAGEMENT STARTS HERE");
		per.getClickOnHamBurgerSign().click();
		per.getSetUpAdmin().click();
		robot.keyPress(KeyEvent.VK_END);
		robot.keyRelease(KeyEvent.VK_END);
		per.getPermissionManagement().click();
		per.getChooseACustomer().click();
		per.getSelectYourClient().click();
		//Assert.assertEquals(" Test_Automation ", "driver.find_element_by_xpath("//span[text()=' Test_Automation ']")");
		per.getPolicyName().sendKeys("Admin");
		per.getChooseACatagory().click();
		per.getChooseTheCatagory().sendKeys("Country Head");
		per.getChooseAsCountryHead().click();
		//robot.keyPress(KeyEvent.VK_TAB);
		//robot.keyRelease(KeyEvent.VK_TAB);
		per.getSelectAModule().click();
		per.getChooseImatrix().click();
		per.getDefaultPage().click();
		per.getChooseDefaultPage().click();
		//per.getClickOnCreatePolicy().click();
		//Thread.sleep(1000);
		//per.getClickOkay().click();
		ListnerImplementationClass.test.log(Status.INFO, "PERMISSION MANAGEMENT END HERE");
		
		ListnerImplementationClass.test.log(Status.INFO, "PERMISSION ENDS HERE");
	}

}
