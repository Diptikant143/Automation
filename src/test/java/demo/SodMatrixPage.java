package demo;

import org.testng.annotations.Test;

import GenericUtils.BaseClass;
import pomPages.SodMatrix;

public class SodMatrixPage extends BaseClass{
	
	
	@Test
	public void SodMatrixPage() throws Throwable {
		SodMatrix matrix=new SodMatrix(driver);
		matrix.getUserNameTextField().sendKeys(USERNAME);
		matrix.getLohinbtn().click();
		matrix.getPasswordtextfield().sendKeys(PASSWORD);
		matrix.getLoginbtn2().click();
		matrix.getLogo1().click();
		matrix.getClient().click();
		matrix.getDemo().click();
		matrix.getiMatrix1().click();
		Thread.sleep(2000);
		matrix.getiMatrix2().click();
		matrix.getSoDMatrix().click();
		matrix.getControls().click();
		//Thread.sleep(3000);
		matrix.getSod().click();
		matrix.getInputtextbox().sendKeys("Manage Employee and Manage Payroll");
		Thread.sleep(3000);
		matrix.getNewsod().click();
		Thread.sleep(2000);
		matrix.getIcon().click();
		Thread.sleep(2000);

		//matrix.getSod1().click();
		//Thread.sleep(5000);
		//matrix.getManage().click(); 
		//Thread.sleep(2000);

		matrix.getEntitlement().click();
		Thread.sleep(2000);

		matrix.getEntitlement().sendKeys("Manage Payroll Batch Processes");
		Thread.sleep(2000);

		matrix.getProcess().click();
		
		Thread.sleep(2000);
		
		matrix.getCancel().click();

		
	}

}
