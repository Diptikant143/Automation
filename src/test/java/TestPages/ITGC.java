package TestPages;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import GenericUtils.BaseClass;
import GenericUtils.ListnerImplementationClass;
import PomPages.ITGCPom;

@Listeners(ListnerImplementationClass.class)

public class ITGC extends BaseClass{
	
	@Test
	public void ITGCTest() throws Throwable{
    	ListnerImplementationClass.test.log(Status.INFO, "ITGC");

		ITGCPom ITGC=new ITGCPom(driver);
		
		ITGC.getCChange().click();
		ITGC.getClientChange().click();
		ITGC.getAnotherclient().click();
		Thread.sleep(5000);
		ITGC.getITGC().click();
		ITGC.getITGCdashboard().click();
		//ITGC.getCreateJob().click();
		//ITGC.getFusionERP().click();
		//ITGC.getEvaluate().click();
		//ITGC.getChoosebatch().click();
		//ITGC.getBatch().click();
		//ITGC.getBatchname().sendKeys("newbatch");
		//ITGC.getBatchok().click();
		//ITGC.getOk().click();
		ITGC.getRefresh().click();
		ITGC.getAssesment().click();
		Thread.sleep(1000);
		ITGC.getABC().click();
		Thread.sleep(1000);
        ITGC.getITGCtab().click();
		Thread.sleep(1000);
		ITGC.getSubcontrol().click();

}
}