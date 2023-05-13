package demo;

import org.testng.annotations.Test;

import GenericUtils.BaseClass;
import pomPages.DataSync;

public class DataSyncProcess extends BaseClass {
	
	@Test
	public void TC_ID_005_() throws Throwable {
		
		
		DataSync data=new DataSync(driver);
		data.getUserNameTextField().sendKeys(USERNAME);
		data.getLohinbtn().click();
		data.getPasswordtextfield().sendKeys(PASSWORD);
		data.getLoginbtn2().click();
		data.getLogo().click();
		data.getChangeclient().click();
		data.getMicroDemo().click();
		Thread.sleep(5000);
		data.getNewDatasource().click();
		data.getERP().click();
		data.getOracleFusion().click();
		data.getDatasourcetype().click();
		data.getAPI().click();
		data.getUrl().sendKeys("https://enae-dev1.fa.em8.oraclecloud.com");
		data.getErpusername().sendKeys("dpolley@adq.ae");
		data.getErppassword().sendKeys("ADQdev12345");
		data.getDataSourceName().sendKeys("TestOne");
		data.getCreateDataSource().click();
		data.getSucessfullok().click();
		data.getNewiMatrix().click();
		data.getErpStatus().click();
		data.getMouseSync().click();
		data.getButtonone().click();
		Thread.sleep(1000);
		data.getButtonTwo().click();
		Thread.sleep(1000);
		data.getButtonThree().click();
		data.getSelectPolicy().click();
		data.getControls().click();
		data.getLink().click();
		data.getBUTTON().click();
		
		data.getBUTTONOK().click();
		
		//Thread.sleep(3000);
		//data.getBUTTONOKSYNCDATA().click();
		//data.getBUTTONOKSYNCDATAALERT().click();
		//Thread.sleep(6000);
		data.getJobs().click();
		Thread.sleep(2000);
		//data.getRefresh().click();
	}

}
