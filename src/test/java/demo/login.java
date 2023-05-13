package demo;

import org.testng.annotations.IListenersAnnotation;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import GenericUtils.BaseClass;

import GenericUtils.ListnerImplementationClass;
import pomPages.LoginPage;
@Listeners(ListnerImplementationClass.class)
public class login extends BaseClass{
	
	
	@Test
	public void TC_OO1_() {
		
		
		LoginPage lo=new LoginPage(driver);
		lo.getUserNameTextField().sendKeys(USERNAME);
		lo.getLohinbtn().click();
		lo.getPasswordtextfield().sendKeys(PASSWORD);
		lo.getLoginbtn2().click();
		


}
}