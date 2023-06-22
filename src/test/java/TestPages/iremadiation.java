package TestPages;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import GenericUtils.BaseClass;
import GenericUtils.ListnerImplementationClass;
import PomPages.iremadiationPom;
@Listeners(ListnerImplementationClass.class)

    public class iremadiation extends BaseClass{
	@Test
	public void SoDDashboardTest() throws Throwable {
    	ListnerImplementationClass.test.log(Status.INFO, "iremediation");

		iremadiationPom ir=new iremadiationPom(driver);
		
		ir.getCChange().click();
		ir.getClientChange().click();
		ir.getAnotherclient().click();
		Thread.sleep(5000);
		ir.getiMatrixbtn().click();
		ir.getIremadiation().click();
		Thread.sleep(1000);
		ir.getControls().click();
		ir.getControlsname().click();	    
		ir.getRoles().click();
		ir.getRole1().click();
		//ir.getRole2().click();
		
	    Thread.sleep(9000);
	    Robot rt=new Robot();
	    rt.keyPress(KeyEvent.VK_TAB);
	    rt.keyRelease(KeyEvent.VK_TAB);
	    
}
}
