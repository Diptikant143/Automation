package demo;

import org.testng.annotations.Test;

import GenericUtils.BaseClass;
import pomPages.PermissionManagement;

public class Permission extends BaseClass{
	
	
	
	@Test
	public void TC_ID_003() throws Throwable {
		PermissionManagement per=new PermissionManagement(driver);
		per.getUserNameTextField().sendKeys(USERNAME);
		per.getLoginbtn2().click();
		per.getPasswordtextfield().sendKeys(PASSWORD);
		per.getLoginbtn2().click();
		Thread.sleep(1000);
        per.getSetupbtn().click();
        per.getPermissionbtn().click();
        per.getCustomer().click();
        per.getClientname().click();
        per.getPolicyname().sendKeys("TESTAUTOMATION");
        per.getCatagoryname().click();
        per.getCountryname().click();
        per.getCreatepolicy().click();
        //per.getPermissionsaved().click();
	}

}
