package demo;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import GenericUtils.BaseClass;
import GenericUtils.ListnerImplementationClass;
import pomPages.newUser;
@Listeners(ListnerImplementationClass.class)

public class newUserTest extends BaseClass {
	@Test
	public void newUserTest() throws Throwable {
		ListnerImplementationClass.test.log(Status.INFO, "CREATE NEW USER");
		newUser user=new newUser(driver);
		Robot robot =new Robot();
		
		ListnerImplementationClass.test.log(Status.INFO, "CREATE NEW USER STARTS HERE");
		ListnerImplementationClass.test.assignAuthor("Saikat");
		ListnerImplementationClass.test.assignDevice("windows 64");
		user.getClickOnAdvanced().click();
		user.getClickOnUnsafeLink().click();
		user.getUserNameTextField().sendKeys(USERNAME);
		user.getLoginbtn2().click();
		user.getPasswordtextfield().sendKeys(PASSWORD);
		user.getLoginbtn2().click();
		user.getDropdownElement().click();
		user.getChooseIRM().click();
		user.getLoginbtn2().click();
		//=======================new user=====================
		user.getClickOnHamBurgerSign().click();
		user.getSetUpAdmin().click();
		robot.keyPress(KeyEvent.VK_END);
		robot.keyRelease(KeyEvent.VK_END);
		user.getCreateNewUser().click();
		//robot.keyPress(KeyEvent.VK_TAB);
		//robot.keyRelease(KeyEvent.VK_TAB);
		user.getClickOnHamBurgerSign().click();
		user.getFirstName().sendKeys("Saikat");
		user.getLastName().sendKeys("Das");
		user.getEmailId().sendKeys("saikat@gmail.com");
		user.getContactNumber().sendKeys("7894561230");
		user.getUserName().sendKeys("saikat98");
		user.getPassword().sendKeys("Abcdefgh1");
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		user.getClient().click();
		user.getChooseClient().click();
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		user.getPermissionPolicy().click();
		user.getChoosePermissionPolicy().click();
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		user.getEndDate().sendKeys("12/28/2024");
		user.getUncheckMail().click();
		//user.getCreateANewUser().click();
		user.getClickOnIRM().click();
		user.getLogoutButton().click();
		ListnerImplementationClass.test.log(Status.INFO, " CREATE NEW USER END HERE");
	}

}
