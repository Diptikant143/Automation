package TestPages;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import GenericUtils.BaseClass;
import GenericUtils.ListnerImplementationClass;
import PomPages.PermissionPOM;

@Listeners(ListnerImplementationClass.class)


public class Permission extends BaseClass {
	
	@Test
	
	public void PermissionManagement() {
    	ListnerImplementationClass.test.log(Status.INFO, "permision");

		PermissionPOM PM=new PermissionPOM(driver);
		
		PM.getSetup().click();
		PM.getPermissionManagement().click();
		PM.getChoosecustomer().click();
		PM.getCustomer().click();
		PM.getPolicyName().sendKeys("Administrator");
		PM.getCatagory().click();
		PM.getCatagory1().click();
		//PM.getCreatePolicy().click();

}
}
