package TestPages;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import GenericUtils.BaseClass;
import GenericUtils.ListnerImplementationClass;
import PomPages.RegisterNCPOM;
@Listeners(ListnerImplementationClass.class)
public class RegisterNC extends BaseClass {
	
    @Test
	
	public void RegisterNCTest() throws Throwable {
    	ListnerImplementationClass.test.log(Status.INFO, "registerNC");

	RegisterNCPOM client=new RegisterNCPOM(driver);
  
    client.getClientbtn1().click();
    client.getClient2btn().click();
    client.getClienttypebtn().click();
    client.getClientchoose().click();
    client.getParentcompanyname().click();
    client.getParentcompanynamechoose().click();
    client.getClientlegalentityname().sendKeys("TESTING CLIENT");
    client.getHeadquartername().sendKeys("INDIA");
    Thread.sleep(1000);
    client.getEmployeerange().click();
    client.getEmployeerangechoose().click();
    client.getScopeentity().sendKeys("TEST ENV");
    client.getEngagementtype().click();
    client.getChooseengagementtype().click();
    client.getRevenuerange().click();
    client.getChooserevenuerange().click();
    client.getAuditor().click();
    client.getChooseauditor().click();
    client.getDatasourcefileupload().click();
    client.getUploadXMLfile().click();
    client.getUploadSOAPAPI().click();
    
    Thread.sleep(1000);
    Robot rt=new Robot();
    rt.keyPress(KeyEvent.VK_TAB);
    
    rt.keyRelease(KeyEvent.VK_TAB);
    
    

    
    
    client.getComplianceRequirement().click();
    client.getChooseComplianceRequirement().click();
    
    rt.keyPress(KeyEvent.VK_TAB);
    
    rt.keyRelease(KeyEvent.VK_TAB);
    
    client.getChoosefile().sendKeys("C:\\\\Users\\\\91824\\\\OneDrive - Technology Risk Limited\\\\Desktop\\\\chanel_logo_the_branding_journal.jpg");
    
client.getClickonnext().click();


client.getPrimarycontact().sendKeys("Sharmi");
client.getDesignation().sendKeys("QA");
client.getEmailadress().sendKeys("abc@gmail.com");
client.getContactnumber().sendKeys("0987654321");
Thread.sleep(1000);
client.getNextbtn().click();


//FOR MODULE ONE 

    client.getModulelicenses().click();
    client.getClickonmodulelicensesone().click();
    client.getclickonstartdate1().sendKeys("4/27/2023");
    client.getclickonenddate1().sendKeys("8/14/2024");
    client.getAddone().click();
    
// FOR MODULE TWO
    
    client.getModulelicenses2().click();
    client.getiMatrix().click();
    
    client.getclickonstartdate2().sendKeys("4/27/2023");
    client.getclickonenddate2().sendKeys("5/8/2024");
    client.getAddone().click();
    
    
// FOR MODULE THREE
    
    client.getModulethree().click();
    client.getERM().click();
    client.getclickonstartdate3().sendKeys("4/27/2023");
    client.getclickonenddate2().sendKeys("2/5/2025");
    client.getAddone().click();
    
    Thread.sleep(1000);
    client.getNextbtn3().click();
    
    
    client.getCLICKOnERP().click();
    client.getCLICKOnERPBUTTON().click();
    client.getCLICKOnERPADDBUTTON().click();
    client.getCLICKOnERPNEXTBUTTON().click();
    
    
    client.getDeptype().click();
    client.getAWS().click();
    client.getNumberofinstance().sendKeys("1");
    
    //client.getFinalsubmit().click();
    //Thread.sleep(7000);
    //client.getAlertokbutton1().click();

    
    
}

}


