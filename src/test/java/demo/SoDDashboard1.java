package demo;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import GenericUtils.BaseClass;
import GenericUtils.ListnerImplementationClass;
import pomPages.SoDDashboardPom;
@Listeners(ListnerImplementationClass.class)

public class SoDDashboard1 extends BaseClass {
	
	


   @Test
	public void  SoDDashboard() throws Throwable {
	   
		ListnerImplementationClass.test.log(Status.INFO, "SoD Dashboard");


	SoDDashboardPom sd=new SoDDashboardPom(driver);


    sd.getUserNameTextField().sendKeys(USERNAME);
    sd.getLohinbtn().click();
    sd.getPasswordtextfield().sendKeys(PASSWORD);
    sd.getLoginbtn2().click();
    
	ListnerImplementationClass.test.log(Status.INFO, "LOGIN");

    
    
	sd.getCChange().click();

	sd.getClientChange().click();

	sd.getAnotherclient().click();

	Thread.sleep(5000);

	sd.getiMatrixbtn().click();

	sd.getSAD().click();

	sd.getRefresh().click();

	sd.getAssesment().click();

	sd.getDiddo().click();

	sd.getCcode().click();

	sd.getCcodevalue().click();

	ListnerImplementationClass.test.log(Status.INFO, "SoD Dashboard Sucessfully");


	}

}
