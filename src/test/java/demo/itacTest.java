package demo;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import GenericUtils.BaseClass;
import GenericUtils.ListnerImplementationClass;
import pomPages.itac;

@Listeners(ListnerImplementationClass.class)
public class itacTest extends BaseClass{
	@Test
	public void itacTest() throws Throwable{
		ListnerImplementationClass.test.log(Status.INFO, "itac PAGE STARTS HERE");
		ListnerImplementationClass.test.assignAuthor("Saikat");
		ListnerImplementationClass.test.assignDevice("windows 64");
		itac itac=new itac(driver);
		Robot robot = new Robot();
		ListnerImplementationClass.test.log(Status.INFO, "LOGIN PAGE STARTS HERE");
		itac.getClickOnAdvanced().click();
		itac.getClickOnUnsafeLink().click();
		itac.getUserNameTextField().sendKeys(USERNAME);
		itac.getLohinbtn().click();		
		itac.getPasswordtextfield().sendKeys(PASSWORD);
		itac.getLohinbtn().click();
		itac.getDropdownElement().click();
		itac.getChooseClient().click();
		itac.getLohinbtn().click();
		ListnerImplementationClass.test.log(Status.INFO, "LOGIN PAGE ENS HERE");
		ListnerImplementationClass.test.log(Status.INFO, "itac RULE SET STARTS HERE");
		itac.getClickOnHamBurger().click();
		itac.getItgcAndItac().click();
		Thread.sleep(1000);
		itac.getItgcAndItacSection().click();
		itac.getClickOnHamBurger().click();
		itac.getCreateNewRuleSet().click();
		itac.getItgcItac().click();
		itac.itgcItacPopup(driver);
		itac.getImportExcelRuleSet().click();
		itac.importRuleSetChooseERPPopup(driver);
		itac.getChooseFile().click();
		//wLib.uploadFileWithRobot(System. getProperty("user.dir")+"\\Data\\ADQ_Fusion_ITAC_Ruleset_V1.0.xlsx"); //for fusion
		wLib.uploadFileWithRobot(System. getProperty("user.dir")+"\\Data\\Acino_SAP_ITAC_Ruleset_V1.0.xlsx"); //for sap
		itac.getSelectAllCheckBox().click();
		robot.keyPress(KeyEvent.VK_END);
		robot.keyRelease(KeyEvent.VK_END);
		itac.getRulesetName().sendKeys("TestAutomation_itac");
		//itac.getSaveITACRuleSet().click();
		ListnerImplementationClass.test.log(Status.INFO, "ITAC RULE SET ENDS HERE");
		ListnerImplementationClass.test.log(Status.INFO, "LOGOUT PAGE STARTS HERE");
		itac.getClickOnUsername().click();
		itac.getLogOutButton().click();
		ListnerImplementationClass.test.log(Status.INFO, "LOGOUT PAGE ENDS HERE");
		ListnerImplementationClass.test.log(Status.INFO, "ITAC PAGE ENDS HERE");
	}
}
