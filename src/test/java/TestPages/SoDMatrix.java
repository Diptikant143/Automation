package TestPages;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import GenericUtils.BaseClass;
import GenericUtils.ListnerImplementationClass;
import PomPages.SoDMatrixPOM;
@Listeners(ListnerImplementationClass.class)
public class SoDMatrix extends BaseClass{
	
	@Test
	public void SoDMatrixpage() throws Throwable {
		ListnerImplementationClass.test.log(Status.INFO, "SoDMatrix");
		SoDMatrixPOM sm=new SoDMatrixPOM(driver);
		
		sm.getCChange().click();
		sm.getClientChange().click();
		sm.getAnotherclient().click();
		Thread.sleep(5000);
		sm.getiMatrixbtn().click();
		sm.getSoDMatrix().click();
		sm.getControls().click();
		sm.getSoD().sendKeys("Manage Employee and Manage Payroll");
		sm.getChooseSoD().click();
		sm.getForload().click();
		
	}

}
