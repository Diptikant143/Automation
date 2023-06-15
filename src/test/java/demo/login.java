package demo;

import org.testng.annotations.IListenersAnnotation;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import GenericUtils.BaseClass;

import GenericUtils.ListnerImplementationClass;
import pomPages.LoginPage;
@Listeners(ListnerImplementationClass.class)
public class login extends BaseClass{
	
	
	@Test
	public void LoginPage() {
		
		ListnerImplementationClass.test.log(Status.INFO, "LOGIN");
		LoginPage lo=new LoginPage(driver);
		lo.getUserNameTextField().sendKeys(USERNAME);
		lo.getLohinbtn().click();
		lo.getPasswordtextfield().sendKeys(PASSWORD);
		lo.getLoginbtn2().click();
		ListnerImplementationClass.test.log(Status.INFO, "LOGIN SUCESSFULLY");


}
}
