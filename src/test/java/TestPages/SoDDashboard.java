package TestPages;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import GenericUtils.BaseClass;
import GenericUtils.ListnerImplementationClass;
import PomPages.SoDDashboardPom;

@Listeners(ListnerImplementationClass.class)

public class SoDDashboard extends BaseClass {
	
	@Test
	
	public void SoDDashboardTest() throws Throwable {
		
    	ListnerImplementationClass.test.log(Status.INFO, "SoDDashboard");

		SoDDashboardPom sd=new SoDDashboardPom(driver);
		
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

}
}
