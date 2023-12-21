package demo;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import GenericUtils.BaseClass;
import GenericUtils.ListnerImplementationClass;
import pomPages.CreateNewuser;
import pomPages.LoginPage;
@Listeners(ListnerImplementationClass.class)
public class Newuser extends BaseClass {
	
	
	@Test
	public void Newuser() throws Throwable {
		
		ListnerImplementationClass.test.log(Status.INFO, "NEWUSER");
		ListnerImplementationClass.test.assignAuthor("Saikat");
		ListnerImplementationClass.test.assignDevice("windows 64");
		
		
		ListnerImplementationClass.test.log(Status.INFO, "Login");
		LoginPage lo=new LoginPage(driver);
		lo.getClickOnAdvanced().click();
		lo.getClickOnUnsafeLink().click();
		lo.getUserNameTextField().sendKeys(USERNAME);
		lo.getLohinbtn().click();
		lo.getPasswordtextfield().sendKeys(PASSWORD);
		lo.getLoginbtn2().click();
		lo.getDropdownElement().click();
		lo.getChooseIRM().click();
		lo.getLoginbtn2().click();
		ListnerImplementationClass.test.log(Status.INFO, "Login Ends");
		//lo.getClickOnHamBurgerSign().click();
		
		ListnerImplementationClass.test.log(Status.INFO, "CREATE NEWUSER");
		
	}

}
