package demo;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.internal.annotations.IListeners;

import GenericUtils.BaseClass;
import GenericUtils.IListner;
import pomPages.DataSync_POM;
//@Listeners(IListner.class)

public class DataSync extends BaseClass {
	
	@Test
	
public void DataSyncPage() {
	DataSync_POM ds=new DataSync_POM(driver);
	
	ds.getNewConfig().click();
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
	ds.getHamburgerbtn().click();
	ds.getRCButton1().click();
	ds.getESbutton().click();
	ds.getSyncbutton().click();
	
}
}
