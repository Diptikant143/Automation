package demo;

import org.testng.annotations.Test;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

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
	public void REGISTERNEWCLIENT()throws Throwable {
		
		ListnerImplementationClass.test.log(Status.INFO, "REGISTER NEW CLIENT");
		ListnerImplementationClass.test.assignAuthor("SAIKAT");
		ListnerImplementationClass.test.assignDevice("windows 64");
		
		RegisterNewClient client=new RegisterNewClient (driver);
		Robot rt=new Robot();
		Thread.sleep(2000);
		client.getClickOnAdvanced().click();
		client.getClickOnUnsafeLink().click();
		client.getUserNameTextField().sendKeys(USERNAME);
		client.getLoginbtn2().click();
		client.getPasswordtextfield().sendKeys(PASSWORD);
		client.getLoginbtn2().click();
		client.getDropdownElement().click();
		client.getChooseIRM().click();
		client.getLoginbtn2().click();
		
		//=====================================Register new client begins==========================
		client.getClickOnHamBurgerSign().click();
		client.getRegisterNewClientDropdown().click();
		client.getRegisterNewClientButton().click();
		
		//======================================Register New Client General Module==========================================
		ListnerImplementationClass.test.log(Status.INFO, "REGISTER NEW CLIENT GENERAL MODULE STARTS");
		client.getSelectClientType().click();
		Thread.sleep(1000);
		client.getSelectClientTypeAsTechnicalSuperAdmin().click();
		client.getChooseParentCompany().click();
		Thread.sleep(1000);
		client.getChooseAsIRMAdmin().click();
		client.getClientLeagalEntity().sendKeys("Test Automation");
		client.getHeadquarter().sendKeys("India");
		client.getEmployeeRange().click();
		Thread.sleep(1000);
		client.getChooseEmployeeRange().click();
		client.getScopeEntity().sendKeys("Test_Automation");
		client.getEngagementType().click();
		client.getChooseEngagementType().click();
		client.getRevenueRange().click();
		Thread.sleep(1000);
		client.getChooseRevenueRange().click();
		client.getAuditor().click();
		Thread.sleep(1000);
		client.getChooseAuditor().click();
		client.getDataSource().click();
		client.getChooseDataSource().click();
		rt.keyPress(KeyEvent.VK_TAB);
		rt.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(5000);
		client.getChooseFile().click();
		Thread.sleep(5000);
	    wLib.uploadFileWithRobot(System. getProperty("user.dir")+"\\Data\\image.png");
		
	    client.getComplaenceRequirement().click();
	    client.getChooseComplaenceRequirement().click();
	    rt.keyPress(KeyEvent.VK_TAB);
		rt.keyRelease(KeyEvent.VK_TAB);
		client.getClickOnNextButton().click();
		ListnerImplementationClass.test.log(Status.INFO, "REGISTER NEW CLIENT GENERAL MODULE CREATE SUCESSFULLY");
		//======================================Register New Client General Module ends==========================================
		//======================================Register New Client Contact Module starts========================================
		ListnerImplementationClass.test.log(Status.INFO, "REGISTER NEW CLIENT CONTACT MODULE STARTS");
		client.getPrimaryContact().sendKeys("Saikat");
		client.getDesignation().sendKeys("QA");
		client.getEmail().sendKeys("saikat.j.das@gmail.com");
		client.getContactNumber().sendKeys("1234567890");
		client.getClickOnNext().click();
		ListnerImplementationClass.test.log(Status.INFO, "REGISTER NEW CLIENT CONTACT MODULE ENDS SUCESSFULLY");
		//======================================Register New Client Contact Module ends==========================================
		//======================================Register New Client Module starts================================================
		ListnerImplementationClass.test.log(Status.INFO, "REGISTER NEW CLIENT IT GENERAL CONTROLS STARTED SUCESSFULLY");
		client.getModuleLicense().click();
		client.getChooseModuleLicense().click();
		client.getClickOnstartingdateField().click();
		client.clickoncurrentdate(driver);
		client.getClickOnendingdateField().sendKeys("31-Dec-2023");
		Thread.sleep(1000);
		client.getAddButton().click();
		ListnerImplementationClass.test.log(Status.INFO, "REGISTER NEW CLIENT IT GENERAL CONTROLS END SUCESSFULLY");
		ListnerImplementationClass.test.log(Status.INFO, "REGISTER NEW CLIENT IRM SETUP & ADMIN STARTED SUCESSFULLY");
		client.getModuleLicense().click();
		client.getIrmSetUp().click();
		client.getClickOnstartingdateField().click();
		client.clickoncurrentdate(driver);
		client.getClickOnendingdateField().sendKeys("27-Dec-2023");
		Thread.sleep(1000);
		client.getAddButton().click();
		ListnerImplementationClass.test.log(Status.INFO, "REGISTER NEW CLIENT IRM SETUP & ADMIN ENDS SUCESSFULLY");
		ListnerImplementationClass.test.log(Status.INFO, "REGISTER NEW CLIENT IRM SUPER ADMIN STARTED SUCESSFULLY");
		client.getModuleLicense().click();
		client.getIrmSuperAdmin().click();
		client.getClickOnstartingdateField().click();
		client.clickoncurrentdate(driver);
		client.getClickOnendingdateField().sendKeys("28-Dec-2023");
		Thread.sleep(1000);
		client.getAddButton().click();
		ListnerImplementationClass.test.log(Status.INFO, "REGISTER NEW CLIENT IRM SUPER ADMIN ENDS SUCESSFULLY");
		ListnerImplementationClass.test.log(Status.INFO, "REGISTER NEW CLIENT IMATRIX STARTED SUCESSFULLY");
		client.getModuleLicense().click();
		client.getImatrix().click();
		client.getClickOnstartingdateField().click();
		client.clickoncurrentdate(driver);
		client.getClickOnendingdateField().sendKeys("28-Dec-2023");
		Thread.sleep(1000);
		client.getAddButton().click();
		ListnerImplementationClass.test.log(Status.INFO, "REGISTER NEW CLIENT IMATRIX ENDS SUCESSFULLY");
		ListnerImplementationClass.test.log(Status.INFO, "REGISTER NEW CLIENT DEVELOPER STARTED SUCESSFULLY");
		client.getModuleLicense().click();
		client.getDeveloper().click();
		client.getClickOnstartingdateField().click();
		client.clickoncurrentdate(driver);
		client.getClickOnendingdateField().sendKeys("28-Dec-2023");
		Thread.sleep(1000);
		client.getAddButton().click();
		ListnerImplementationClass.test.log(Status.INFO, "REGISTER NEW CLIENT DEVELOPER STARTED SUCESSFULLY");
		ListnerImplementationClass.test.log(Status.INFO, "REGISTER NEW CLIENT SMTP EMAIL STARTED SUCESSFULLY");
		client.getModuleLicense().click();
		client.getSmtpEmail().click();
		client.getClickOnstartingdateField().click();
		client.clickoncurrentdate(driver);
		client.getClickOnendingdateField().sendKeys("24-Dec-2023");
		Thread.sleep(1000);
		client.getAddButton().click();
		ListnerImplementationClass.test.log(Status.INFO, "REGISTER NEW CLIENT SMTP EMAIL ENDS SUCESSFULLY");
		//=====================click on next button====================================
		client.getClickOnNextButton1().click();
		ListnerImplementationClass.test.log(Status.INFO, "REGISTER NEW CLIENT ERP STARTED SUCESSFULLY");
		client.getSourceERP().click();
		client.getChooseSourceERP().click();
		Thread.sleep(1000);
		if(client.getClickOnNextButton2().isDisplayed()) {
			client.getClickOnNextButton2().click();
		}else {
			System.out.println("Element not chacting");
		}
		ListnerImplementationClass.test.log(Status.INFO, "REGISTER NEW CLIENT ERP ENDS SUCESSFULLY");
		ListnerImplementationClass.test.log(Status.INFO, "REGISTER NEW CLIENT DEPLOYMENT STARTS SUCESSFULLY");
		client.getDeploymentType().click();
		client.getChooseDeploymentType().click();
		client.getNoOfProdInstance().sendKeys("1");
		client.getClickOnNextButton3().click();
		ListnerImplementationClass.test.log(Status.INFO, "REGISTER NEW CLIENT DEPLOYMENT END SUCESSFULLY");
		ListnerImplementationClass.test.log(Status.INFO, "REGISTER NEW CLIENT DATABASE STARTS SUCESSFULLY");
		client.getSourceOfDatabase().click();
		client.getChooseSourceOfDatabase().click();
		ListnerImplementationClass.test.log(Status.INFO, "REGISTER OF NEW CLIENT IS SUCESSFULLY");
		//client.getSubmit().click();
		/*ListnerImplementationClass.test.log(Status.INFO, "REGISTER NEW CLIENT DATABASE END SUCESSFULLY");
		ListnerImplementationClass.test.log(Status.INFO, "VARIFYING SUCCESS REPORT,SUCCESS ALERT");
		if(client.getAlert().isDisplayed()) {
			System.out.println("Congratulations!! Register of New client got success");
			client.getFinalOk().click();
			ListnerImplementationClass.test.log(Status.INFO, "REGISTER OF NEW CLIENT IS SUCESSFULLY");
		}
		else {
			ListnerImplementationClass.test.log(Status.INFO, "REGISTER OF NEW CLIENT IS CAUSING SOME ISSUE");
		}*/
		

		//Assert.assertEquals(client.getclienthinbtn().isDisplayed(), true,"button is not displg.");
		//ListnerImplementationClass.test.clientg(Status.PASS, "Verified lead creation pouop .");
		
		client.getClickOnIRM().click();
		client.getLogoutButton().click();
		
	}
}