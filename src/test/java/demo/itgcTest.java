package demo;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import GenericUtils.BaseClass;
import GenericUtils.ListnerImplementationClass;
import pomPages.itgc;

@Listeners(ListnerImplementationClass.class)
public class itgcTest extends BaseClass{
	@Test
	public void itgcTest() throws Throwable{
		ListnerImplementationClass.test.log(Status.INFO, "ITGC PAGE STARTS HERE");
		ListnerImplementationClass.test.assignAuthor("Saikat");
		ListnerImplementationClass.test.assignDevice("windows 64");
		itgc itgc=new itgc(driver);
		Robot robot = new Robot();
		ListnerImplementationClass.test.log(Status.INFO, "LOGIN PAGE STARTS HERE");
		itgc.getClickOnAdvanced().click();
		itgc.getClickOnUnsafeLink().click();
		itgc.getUserNameTextField().sendKeys(USERNAME);
		itgc.getLohinbtn().click();		
		itgc.getPasswordtextfield().sendKeys(PASSWORD);
		itgc.getLohinbtn().click();
		itgc.getDropdownElement().click();
		itgc.getChooseClient().click();
		itgc.getLohinbtn().click();
		ListnerImplementationClass.test.log(Status.INFO, "LOGIN PAGE ENS HERE");
		ListnerImplementationClass.test.log(Status.INFO, "ITGC RULE SET STARTS HERE");
		itgc.getClickOnHamBurger().click();
		itgc.getItgcAndItac().click();
		Thread.sleep(1000);
		itgc.getItgcAndItacSection().click();
		itgc.getClickOnHamBurger().click();
		itgc.getCreateNewRuleSet().click();
		itgc.getItgcItac().click();
		itgc.itgcItacPopup(driver);
		itgc.getImportExcelRuleSet().click();
		itgc.importRuleSetChooseERPPopup(driver);
		itgc.getChooseFile().click();
		wLib.uploadFileWithRobot(System. getProperty("user.dir")+"\\Data\\ADQ_Fusion_ITGC_Ruleset_V1.0.xlsx");
		itgc.getSelectAllCheckBox().click();
		robot.keyPress(KeyEvent.VK_END);
		robot.keyRelease(KeyEvent.VK_END);
		itgc.getRulesetName().sendKeys("TestAutomation_ITGC");
		//itgc.getSaveITGCRuleSet().click();
		ListnerImplementationClass.test.log(Status.INFO, "ITGC RULE SET ENDS HERE");
		ListnerImplementationClass.test.log(Status.INFO, "LOGOUT PAGE STARTS HERE");
		itgc.getClickOnUsername().click();
		itgc.getLogOutButton().click();
		ListnerImplementationClass.test.log(Status.INFO, "LOGOUT PAGE ENDS HERE");
		ListnerImplementationClass.test.log(Status.INFO, "ITGC PAGE ENDS HERE");
	}
}
