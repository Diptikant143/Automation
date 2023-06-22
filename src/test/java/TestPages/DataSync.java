package TestPages;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import GenericUtils.BaseClass;
import GenericUtils.ListnerImplementationClass;
import PomPages.DataSyncPOM;
@Listeners(ListnerImplementationClass.class)
public class DataSync extends BaseClass {
	
	@Test
	
	public void DSPage() throws Throwable {
    	ListnerImplementationClass.test.log(Status.INFO, "Datasync");

		DataSyncPOM ds=new DataSyncPOM(driver);
		
		ds.getCChange().click();
		ds.getClientChange().click();
		ds.getAnotherclient().click();
		Thread.sleep(5000);
		
		//ds.getNewConfig().click();
		//ds.getOk().click();
		ds.getNewConfig2().click();
		ds.getERP().click();
		ds.getERPname().click();
		ds.getDatasourceType().click();
		ds.getAPI().click();
		ds.getERPurl().sendKeys("https://enae-dev1.fa.em8.oraclecloud.com");
		ds.getERPusername().sendKeys("dpolley@adq.ae");
		ds.getERPpw().sendKeys("ADQdev12345");
		ds.getDSname().sendKeys("newDSAPI");
		ds.getCreatDS().click();
		ds.getOkbutton().click();
		ds.getiMatrixbtn().click();
		ds.getESbutton().click();
		ds.getSyncbutton().click();
		ds.getSyncforiMatrix().click();
		ds.getSyncforSoD().click();
		ds.getSyncforITGC().click();
		ds.getRuleset().click();
		ds.getControls().click();
		ds.getGlobalconditions().click();
		ds.getBusinessprocess().click();
		ds.getOkBP().click();
       // ds.getSync().click();
		ds.getDSjob().click();
		ds.getRefresh().click();

}
}