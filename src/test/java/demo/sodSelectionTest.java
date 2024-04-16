package demo;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import GenericUtils.BaseClass;
import GenericUtils.ListnerImplementationClass;

import pomPages.sodSelection;
@Listeners(ListnerImplementationClass.class)
public class sodSelectionTest extends BaseClass {
	@Test
	public void sodSelectionTest() throws Throwable{
		ListnerImplementationClass.test.log(Status.INFO, "SEGRIGATION OF DUTIES PAGE STARTS HERE");
		ListnerImplementationClass.test.assignAuthor("Saikat");
		ListnerImplementationClass.test.assignDevice("windows 64");
		sodSelection sod=new sodSelection(driver);
		Robot robot = new Robot();
		ListnerImplementationClass.test.log(Status.INFO, "LOGIN PAGE STARTS HERE");
		sod.getClickOnAdvanced().click();
		sod.getClickOnUnsafeLink().click();
		sod.getUserNameTextField().sendKeys(USERNAME);
		sod.getLohinbtn().click();		
		sod.getPasswordtextfield().sendKeys(PASSWORD);
		sod.getLohinbtn().click();
		sod.getDropdownElement().click();
		sod.getChooseClient().click();
		sod.getLohinbtn().click();
		ListnerImplementationClass.test.log(Status.INFO, "LOGIN PAGE ENS HERE");
		ListnerImplementationClass.test.log(Status.INFO, "SOD PAGE STARTS HERE");
		sod.getClickOnHamBurger().click();
		sod.getClickOnIrmMatrix().click();
		sod.getSodSelection().click();
		sod.getClickOnHamBurger().click();
		sod.getCreateNewRuleSet().click();
		sod.getImportExcelRuleSet().click();
		sod.varifyChooseErpPopup(driver);
		Thread.sleep(1000);
		sod.getChooseFile().click();
		//wLib.uploadFileWithRobot(System. getProperty("user.dir")+"\\Data\\iRM_198_ADQ_Ruleset_29-08-2023 5.xlsx");    //For fusion
		wLib.uploadFileWithRobot(System. getProperty("user.dir")+"\\Data\\SAP_13Sep2023_Acino_TRPReviewed_Finalised_Rulebook 2.xlsx");   //For SAP
		sod.getCheckBoxForAll().click();
		robot.keyPress(KeyEvent.VK_END);
		robot.keyRelease(KeyEvent.VK_END);
		Thread.sleep(1000);
		sod.getRuleSetname().sendKeys("Fusion198RuleSet");
		//sod.getSaveRule().click();
		//sod.sodRuleSetPopup(driver);
		sod.getClickOnUsername().click();
		sod.getLogOutButton().click();
		ListnerImplementationClass.test.log(Status.INFO, "SOD PAGE STARTS HERE");
		
	}
}
