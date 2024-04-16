package demo;



import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import GenericUtils.BaseClass;
import GenericUtils.ListnerImplementationClass;
import pomPages.emailNotification;

@Listeners(ListnerImplementationClass.class)

public class emailNotificationTest extends BaseClass{
	@Test
	public void emailNotificationTestfile() throws Throwable{
	    ListnerImplementationClass.test.log(Status.INFO, "itac PAGE STARTS HERE");
		ListnerImplementationClass.test.assignAuthor("Saikat");
		ListnerImplementationClass.test.assignDevice("windows 64");
		emailNotification mail=new emailNotification(driver);
		//Robot robot = new Robot();
		ListnerImplementationClass.test.log(Status.INFO, "LOGIN PAGE STARTS HERE");
		mail.getClickOnAdvanced().click();
		mail.getClickOnUnsafeLink().click();
		mail.getUserNameTextField().sendKeys(USERNAME);
		mail.getLohinbtn().click();		
		mail.getPasswordtextfield().sendKeys(PASSWORD);
		mail.getLohinbtn().click();
		mail.getDropdownElement().click();
		mail.getChooseClient().click();
		mail.getLohinbtn().click();
		ListnerImplementationClass.test.log(Status.INFO, "LOGIN PAGE ENDS HERE");
		ListnerImplementationClass.test.log(Status.INFO, "EMAIL COFIGARATION TEST STARTS HERE");
		mail.getClickOnHamBurger().click();
		mail.getEmailNotification().click();
		mail.getEmailConfiguration().click();
		Thread.sleep(5000);
		ListnerImplementationClass.test.log(Status.INFO, "EMAIL COFIGARATION TEST ENDS HERE");
		ListnerImplementationClass.test.log(Status.INFO, "EMAIL CONFIGURATION");
	}
}
