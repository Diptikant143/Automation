package TestPages;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import GenericUtils.BaseClass;
import GenericUtils.ListnerImplementationClass;
import PomPages.LoginPagePOM;

@Listeners(ListnerImplementationClass.class)

public class LoginPage extends BaseClass {
	
	@Test
	public void LoginTest() {
    	ListnerImplementationClass.test.log(Status.INFO, "login");

		LoginPagePOM log=new LoginPagePOM(driver);
		
		log.getUsername().sendKeys("irm.admin");
		log.getLogin1().click();
		log.getPassword().sendKeys("welcome");
		log.getLogin1().click();

	}
}