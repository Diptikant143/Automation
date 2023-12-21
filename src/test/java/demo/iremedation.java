package demo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.testng.annotations.Test;

import GenericUtils.BaseClass;
import pomPages.IRemediation;

public class iremedation extends BaseClass {
	
	
	
	@Test
	public void iremedation() throws Throwable {
		IRemediation ire=new IRemediation(driver);
		ire.getUserNameTextField().sendKeys(USERNAME);
		ire.getLohinbtn().click();
		ire.getPasswordtextfield().sendKeys(PASSWORD);
		ire.getLoginbtn2().click();
		ire.getCChange().click();

		ire.getClientChange().click();

		ire.getAnotherclient().click();

		Thread.sleep(5000);

		ire.getiMatrixbtn().click();

		ire.getIremadiation().click();

		Thread.sleep(1000);

		ire.getControls().click();

		ire.getControlsname().click();

		ire.getRoles().click();

		ire.getRole1().click();

		//ir.getRole2().click();

		

		Thread.sleep(9000);

		Robot rt=new Robot();

		rt.keyPress(KeyEvent.VK_TAB);

		rt.keyRelease(KeyEvent.VK_TAB);
		
		
	}

}
