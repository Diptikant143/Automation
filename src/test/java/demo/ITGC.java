package demo;

import org.testng.annotations.Test;

import GenericUtils.BaseClass;
import pomPages.ITGCPom;

public class ITGC extends BaseClass {
	
	
	
	
	@Test
	public void ITGCTest() throws Throwable{
		 ITGCPom ITGC=new ITGCPom(driver);

		 
		 
		 
		 ITGC.getUserNameTextField().sendKeys(USERNAME);
		 ITGC.getLohinbtn().click();
		 ITGC.getPasswordtextfield().sendKeys(PASSWORD);
		 ITGC.getLoginbtn2().click();
		ITGC.getCChange().click();
		ITGC.getClientChange().click();
		 ITGC.getAnotherclient().click();
		 Thread.sleep(5000);
		ITGC.getITGC().click();
		 ITGC.getITGCdashboard().click();
		ITGC.getCreateJob().click();
		 ITGC.getFusionERP().click();
		 ITGC.getEvaluate().click();
		 Thread.sleep(2000);
		 ITGC.getChoosebatch().click();
 ITGC.getBatch().click();
		 ITGC.getBatchname().sendKeys("newbatch");
 ITGC.getBatchok().click();
		 ITGC.getOk().click();
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