package TestPages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import GenericUtils.BaseClass;
import GenericUtils.ListnerImplementationClass;
import PomPages.CreateNewUserPom;
@Listeners(ListnerImplementationClass.class)
public class CreateNewUser extends BaseClass {
	
	@Test
	public void NewUserTest() throws Throwable {
		
    	ListnerImplementationClass.test.log(Status.INFO, "Createnewuser");

		CreateNewUserPom CNU=new CreateNewUserPom(driver);
		
		CNU.getSetup().click();
		CNU.getNewUser().click();
		CNU.getFirstName().sendKeys("Sharmi");
		CNU.getLastName().sendKeys("Adhikary");
		CNU.getEmail().sendKeys("abc@abc.com");
		CNU.getNum().sendKeys("7584002922");
		CNU.getUserName().sendKeys("Sharmi@123");
		CNU.getPassWord().sendKeys("Welcome@123");
		CNU.getClint().click();
		CNU.getChooseclint().click();
		
		Thread.sleep(1000);
		Robot tab=new Robot();
	 	tab.keyPress(KeyEvent.VK_TAB);
	 	tab.keyRelease(KeyEvent.VK_TAB);
		
		CNU.getPermision().click();
		CNU.getChoosePermision().click();
		
	 	tab.keyPress(KeyEvent.VK_TAB);
	 	tab.keyRelease(KeyEvent.VK_TAB);
	 	
	 	CNU.getEnddate().sendKeys("4/24/2024");
	 	CNU.getCheckbox().click();

     }
}