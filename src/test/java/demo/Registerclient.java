package demo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import GenericUtils.BaseClass;

import GenericUtils.ListnerImplementationClass;
import pomPages.RegisterNewClient;
@Listeners(ListnerImplementationClass.class)
public class Registerclient extends BaseClass{
	
	@Test
	public void TC_002Test_() throws Throwable {
		
		ListnerImplementationClass.test.log(Status.INFO, "REGISTERNEWCLIENT");
		
		
		RegisterNewClient client=new RegisterNewClient (driver);
		client.getUserNameTextField().sendKeys(USERNAME);
		client.getLohinbtn().click();
		client.getPasswordtextfield().sendKeys(PASSWORD);
		client.getLoginbtn2().click();
		client.getClientbtn1().click();
		client.getClient2btn().click();
		ListnerImplementationClass.test.log(Status.INFO, "Performed login action.");
		client.getClienttypebtn().click();
		client.getClientchoose().click();
		client.getParentcompanyname().click();
		client.getParentcompanynamechoose().click();
		client.getClientlegalentityname().sendKeys("TESTING CLIENT");
		client.getHeadquartername().sendKeys("INDIA");
		Thread.sleep(1000);
		//ListnerImplementationClass.test.log(Status.INFO, "Performed login action2.");
		client.getEmployeerange().click();
		client.getEmployeerangechoose().click();
		client.getScopeentity().sendKeys("TEST ENV");
		client.getEngagementtype().click();
		client.getChooseengagementtype().click();
		client.getRevenuerange().click();
		client.getChooserevenuerange().click();
		client.getAuditor().click();
//		ListnerImplementationClass.test.log(Status.INFO, "Performed login action3.");
		client.getChooseauditor().click();
		client.getDatasourcefileupload().click();
		client.getUploadXMLfile().click();
		client.getUploadSOAPAPI().click();
		
		
		Thread.sleep(3000);
		Robot rt=new Robot();
		rt.keyPress(KeyEvent.VK_TAB);
		
		rt.keyRelease(KeyEvent.VK_TAB);
		
			
		Robot rt1=new Robot();
		rt1.keyPress(KeyEvent.VK_TAB);
		
		rt1.keyRelease(KeyEvent.VK_TAB);
		//ListnerImplementationClass.test.log(Status.INFO, "Performed login action4.");
		
		client.getComplianceRequirement().click();
		client.getChooseComplianceRequirement().click();
		
		
		Robot rt2=new Robot();
		rt2.keyPress(KeyEvent.VK_TAB);
		
		rt2.keyRelease(KeyEvent.VK_TAB);
		
		Robot rt3=new Robot();
		rt3.keyPress(KeyEvent.VK_TAB);
		
		rt3.keyRelease(KeyEvent.VK_TAB);
		
		client.getChoosefile().click();
		
		client.getClick().click();
		
		 Thread.sleep(5000);
	    wLib.uploadFileWithRobot("\"C:\\Users\\dipti\\OneDrive\\Pictures\\download.png\"");
	    
	    Thread.sleep(5000);
	    client.getClickonnext().click();
	    
	    ListnerImplementationClass.test.log(Status.INFO, "complete GENERAL module.");
	   
	    client.getPrimarycontact().sendKeys("Diptikanta");
	    client.getDesignation().sendKeys("QA");
	    client.getEmailadress().sendKeys("deep123@gmail.com");
	    client.getContactnumber().sendKeys("8654123256");
	    Thread.sleep(1000);
	    client.getNextbtn().click();
	    ListnerImplementationClass.test.log(Status.INFO, "complete CONTACT module.");  
	    
//	   FOR MODULE ONE 
	    Thread.sleep(1000);
		client.getModulelicenses().click();
		client.getClickonmodulelicensesone().click();
		client.getClickondate().click();
	    Thread.sleep(3000);

		client.clickoncurrentdate(driver);
		
		client.getGetbackdata().sendKeys("8/14/2024");
		client.getAddone().click();
		
//		FOR MODULE TWO
		
		client.getModulelicenses2().click();
		client.getiMatrix().click();
		
		client.getClickondate2().click();
		Thread.sleep(1000);
		client.clickoncurrentdate2(driver);
		client.getEnddate2().sendKeys("5/8/2024");
		client.getAddagain().click();
		
		
//		FOR MODULE THREE
		
		client.getModulethree().click();
		client.getERM().click();
		client.getDate3().click();
		client.clickoncurrentdate3(driver);
		client.getEnddate3().sendKeys("2/5/2025");
		client.getAdd3().click();
		
		Thread.sleep(1000);
		client.getNextbtn3().click();
		
	 ListnerImplementationClass.test.log(Status.INFO, "complete MODULES module.");  
		client.getERPbtn().click();
		client.getOraclefusion().click();
		client.getERPadd().click();
		Thread.sleep(1000);
		client.getERPnext().click();
		
	  ListnerImplementationClass.test.log(Status.INFO, "complete ERP module.");  
		
	    client.getDeptype().click();
		client.getAWS().click();
		client.getNumberofinstance().sendKeys("1");
		client.getNext4().click();
		
	 ListnerImplementationClass.test.log(Status.INFO, "complete DEPLOYMENT module.");  

		client.getDatabase().click();
		
		Robot rt5=new Robot();
		rt5.keyPress(KeyEvent.VK_DOWN);
		
		rt5.keyRelease(KeyEvent.VK_DOWN);
		
		
		
		
		Robot rt6=new Robot();
      rt6.keyPress(KeyEvent.VK_DOWN);
		
		rt6.keyRelease(KeyEvent.VK_DOWN);
		client.getMssql().click();
		
		
		Robot rt8=new Robot();
		rt8.keyPress(KeyEvent.VK_TAB);
		
		rt8.keyRelease(KeyEvent.VK_TAB);
		
		 ListnerImplementationClass.test.log(Status.INFO, "complete DATABASE module.");  

		
		
		//Assert.assertEquals(client.getLohinbtn().isDisplayed(), true,"button is not displg.");
		//ListnerImplementationClass.test.log(Status.PASS, "Verified lead creation pouop .");
	

		//client.getSubmit1().click();
		
		
	}
}