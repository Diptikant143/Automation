package demo;

import org.testng.annotations.Test;

import GenericUtils.BaseClass;
import pomPages.SoDDashboardPom;

public class SoDDashboard1 extends BaseClass {
	
	


   @Test
	public void SoDDashboardTest() throws Throwable {

	SoDDashboardPom sd=new SoDDashboardPom(driver);


    sd.getUserNameTextField().sendKeys(USERNAME);
    sd.getLohinbtn().click();
    sd.getPasswordtextfield().sendKeys(PASSWORD);
    sd.getLoginbtn2().click();
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
