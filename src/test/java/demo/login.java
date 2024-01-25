package demo;

import org.testng.annotations.Test;

import org.testng.annotations.Listeners;


import com.aventstack.extentreports.Status;

import GenericUtils.BaseClass;

import GenericUtils.ListnerImplementationClass;
import pomPages.LoginPage;
@Listeners(ListnerImplementationClass.class)
public class login extends BaseClass{
	
	
	@Test
	public void LoginPage() throws InterruptedException  {
		
		ListnerImplementationClass.test.log(Status.INFO, "LOGIN");
		LoginPage lo=new LoginPage(driver);
		ListnerImplementationClass.test.assignAuthor("Saikat");
		ListnerImplementationClass.test.assignDevice("windows 64");
		
		
		lo.getClickOnAdvanced().click();
		
		lo.getClickOnUnsafeLink().click();

		lo.getUserNameTextField().sendKeys(USERNAME);
		lo.getLohinbtn().click();
		lo.getPasswordtextfield().sendKeys(PASSWORD);
		lo.getLoginbtn2().click();

		lo.getDropdownElement().click();
		lo.getChooseIRM().click();
		lo.getLoginbtn2().click();
		lo.getClickOnIRM().click();
		lo.getLogoutButton().click();
		ListnerImplementationClass.test.log(Status.INFO, "LOGIN SUCESSFULLY");
}

}
