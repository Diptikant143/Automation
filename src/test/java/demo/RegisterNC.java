package demo;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.testng.annotations.Test;

import GenericUtils.BaseClass;
import pomPages.RegisterNC_POM;

public class RegisterNC extends BaseClass {
	
	@Test
	public void RegisterClintPage() throws Throwable {
		
		RegisterNC_POM RC= new RegisterNC_POM(driver);
		
		
		Thread.sleep(2000);
		RC.getHamburgerbtn().click();
		RC.getRCButton1().click();
		Thread.sleep(1000);
		RC.getRCButton2().click();
		
		//GENERAL PAGE
		
		RC.getClienttypebtn().click();
		RC.getChooseclienttypebtn().click();
		RC.getParentcompanybtn().click();
		RC.getParentcompanyname().click();
		RC.getClientlegalentitybtn().sendKeys("TEST_ORGANISATION_1");
		RC.getSelectheadquartername().sendKeys("INDIA");
		RC.getClickonemployeerange().click();
		Thread.sleep(2000);
		RC.getWriteemployeerange().click();
		RC.getEnterscopeentitybtn().sendKeys("TEST_ORGANISATION_1");
		RC.getSelectengagementtype().click();
		RC.getEnterengagementtype().click();
		RC.getSelectRevenueRangebtn().click();
		RC.getEntereRevenuerangettype().click();
		RC.getSelectAuditorbtn().click();
		RC.getEnterAuditorName().click();
		
		RC.getClickonfileupload().click();
		RC.getUploadXMLfile().click();
		RC.getUploadSOAPAPI().click();
		
	    Thread.sleep(3000);
	 	Robot rt=new Robot();
	 	rt.keyPress(KeyEvent.VK_TAB);
	 	rt.keyRelease(KeyEvent.VK_TAB);

		RC.getChoosefile().sendKeys("C:\\Users\\91824\\OneDrive - Technology Risk Limited\\Desktop\\chanel_logo_the_branding_journal.jpg");
		
		rt.keyPress(KeyEvent.VK_TAB);
		rt.keyRelease(KeyEvent.VK_TAB);
		
		RC.getCompliance().click();
		RC.getClickonSOXbtn().click();
		
		rt.keyPress(KeyEvent.VK_TAB);
		rt.keyRelease(KeyEvent.VK_TAB);
		
		
		RC.getClickonNEXTbtn().click();
		
		//CONTACT PAGE
		
		RC.getClickonPrimaryContact().sendKeys("SHARMI");
		RC.getClickonDesignationbtn().sendKeys("QA");
		RC.getClickonEmailAdressbtn().sendKeys("abc@abc.com");
		RC.getClickonContactNumberbtn().sendKeys("1234567890");
		RC.getClickonNextBTN().click();
	
		//For MODULES ONE
		
		RC.getClickonMODULEBTN().click();
		RC.getClickonmodulelicensesnumber1().click();
		RC.getClickonstartdate1().sendKeys("4/11/2023");
		RC.getClickonenddate1().sendKeys("8/7/2024");
		RC.getClickonADDBTN1().click();

		Thread.sleep(2000);
		
		// For MODULES TWO

		RC.getClickonmodulelicenses2().click();
		RC.getClickonIMatrix().click();
		RC.getClickonstartdate2().sendKeys("4/11/2023");
		RC.getClickonenddate2().sendKeys("10/5/2025");
		RC.getClickonADDBTN2().click();
		Thread.sleep(2000);

		// For MODULES THREE

		RC.getClickonmodulelicenses3().click();
		RC.getClickonDeveloper().click();
		RC.getClickonstartdate3().sendKeys("4/11/2023");
		RC.getClickonenddate3().sendKeys("7/10/2025");
		RC.getClickonADDBTN3().click();
		RC.getCLICKONNEXTBUTTON().click();
		RC.getCLICKOnERP().click();
		RC.getCLICKOnERPBUTTON().click();
		RC.getCLICKOnERPADDBUTTON().click();
		RC.getCLICKOnERPNEXTBUTTON().click();
		RC.getDeploymentBox().click();
		RC.getAWS().click();
		RC.getPEODUCTION().sendKeys("1");
		RC.getDPNEXTBTN().click();
		RC.getFORDATABASE().click();
		RC.getFORDATABASEBTN().click();

		RC.getFORDATABASESUBMITBTN().click();

		}
	
	
	}
	
	
	

	     
      
 


