package demo;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import GenericUtils.BaseClass;
import GenericUtils.ListnerImplementationClass;
import pomPages.CreateNewuser;
@Listeners(ListnerImplementationClass.class)
public class Newuser extends BaseClass {
	
	
	@Test
	public void Newuser() throws Throwable {
		
		ListnerImplementationClass.test.log(Status.INFO, "NEWUSER");
		
		CreateNewuser user=new CreateNewuser(driver);
		user.getUserNameTextField().sendKeys(USERNAME);
		user.getLohinbtn().click();
		user.getPasswordtextfield().sendKeys(PASSWORD);
		user.getLoginbtn2().click();
		
		ListnerImplementationClass.test.log(Status.INFO, "LOGIN");
	




		user.getSetup().click();

		user.getNewUser().click();

		user.getFirstName().sendKeys("DIPTI");

		user.getLastName().sendKeys("JENA");

		user.getEmail().sendKeys("abc@abc.com");

		user.getNum().sendKeys("7584002922");

		user.getUserName().sendKeys("DIPTI@123");

		user.getPassWord().sendKeys("Welcome@123");

		user.getClint().click();

		user.getChooseclint().click();

		

		Thread.sleep(1000);

		Robot tab=new Robot();

		tab.keyPress(KeyEvent.VK_TAB);

		tab.keyRelease(KeyEvent.VK_TAB);

		

		user.getPermision().click();

		user.getChoosePermision().click();

		

		tab.keyPress(KeyEvent.VK_TAB);

		tab.keyRelease(KeyEvent.VK_TAB);

		

		user.getEnddate().sendKeys("4/24/2024");

		user.getCheckbox().click();






		//user.getCREATENEWUSER().click();
		
		//user.getCREATENEWUSERALERTOK().click();
		
		
		
		ListnerImplementationClass.test.log(Status.INFO, "CREATE NEWUSER");
		
	}

}
