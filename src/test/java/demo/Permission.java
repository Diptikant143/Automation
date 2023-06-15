package demo;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import GenericUtils.BaseClass;
import GenericUtils.ListnerImplementationClass;
import pomPages.PermissionManagement;
@Listeners(ListnerImplementationClass.class)
public class Permission extends BaseClass{
	
	
	
	@Test
	public void Permission () throws Throwable {
		
		ListnerImplementationClass.test.log(Status.INFO, "PERMISSION");
		
		PermissionManagement per=new PermissionManagement(driver);
		per.getUserNameTextField().sendKeys(USERNAME);
		per.getLoginbtn2().click();
		per.getPasswordtextfield().sendKeys(PASSWORD);
		per.getLoginbtn2().click();
		ListnerImplementationClass.test.log(Status.INFO, "LOGIN");
		
		per.getSetup().click();

		per.getPermissionManagement().click();

		per.getChoosecustomer().click();

		per.getCustomer().click();

		per.getPolicyName().sendKeys("Administrator");

		per.getCatagory().click();

		per.getCatagory1().click();
        ListnerImplementationClass.test.log(Status.INFO, "SUCESSFULLY PERMISSION");
	}

}
