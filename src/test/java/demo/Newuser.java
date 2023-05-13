package demo;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.testng.annotations.Test;

import GenericUtils.BaseClass;
import pomPages.CreateNewuser;

public class Newuser extends BaseClass {
	
	
	@Test
	public void TC_ID_004() throws Throwable {
		
		CreateNewuser user=new CreateNewuser(driver);
		user.getUserNameTextField().sendKeys(USERNAME);
		user.getLohinbtn().click();
		user.getPasswordtextfield().sendKeys(PASSWORD);
		user.getLoginbtn2().click();
		user.getSetup2().click();
		user.getCreatenewuser().click();
		user.getFirstname().sendKeys("DIPTIKANTA");
		user.getLastname().sendKeys("JENA");
		user.getEmailid().sendKeys("deep123@gmail.com");
		user.getContactnumber().sendKeys("8945610234");
		user.getUsername().sendKeys("akash.d");
		user.getPassword().sendKeys("Welcome@123");
		user.getForcustomer().click();
		user.getTestingclient().click();
		
		Thread.sleep(1000);
		
		Robot rt=new Robot();
		rt.keyPress(KeyEvent.VK_TAB);
		
		rt.keyRelease(KeyEvent.VK_TAB);
		
		
		user.getPermissionpolicy().click();
		Thread.sleep(1000);
		user.getPermissionpolicyclient().click();
		
		Thread.sleep(1000);
		
      rt.keyPress(KeyEvent.VK_TAB);
		
		rt.keyRelease(KeyEvent.VK_TAB);
		
		user.getENDDATE().sendKeys("6/12/2024");
		
		user.getVerifymail().click();
		
		//user.getCREATENEWUSER().click();
		
		//user.getCREATENEWUSERALERTOK().click();
		
		user.getiRMBUTTON().click();
		
		user.getLogoutbtn().click();
		
		
		
	}

}
