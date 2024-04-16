package demo;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import GenericUtils.BaseClass;
import GenericUtils.ListnerImplementationClass;

import pomPages.dataVarification;
@Listeners(ListnerImplementationClass.class)

public class dataVarificationTesting extends BaseClass{
	@Test
	public void dataVarificationTesting() throws Throwable {
		ListnerImplementationClass.test.log(Status.INFO, "CONFIGURATION PAGE");
		ListnerImplementationClass.test.assignAuthor("Saikat");
		ListnerImplementationClass.test.assignDevice("windows 64");
		dataVarification data=new dataVarification(driver);
		ListnerImplementationClass.test.log(Status.INFO, "LOGIN PAGE STARTS HERE");
		data.getClickOnAdvanced().click();
		data.getClickOnUnsafeLink().click();
		data.getUserNameTextField().sendKeys(USERNAME);
		data.getLohinbtn().click();
		Thread.sleep(1000);		
		data.getPasswordtextfield().sendKeys(PASSWORD);
		data.getLohinbtn().click();
		data.getDropdownElement().click();
		data.getChooseClient().click();
		data.getLohinbtn().click();
		ListnerImplementationClass.test.log(Status.INFO, "LOGIN PAGE ENS HERE");
		ListnerImplementationClass.test.log(Status.INFO, "DATA CHECKING FOR DASHBOARD STRATS HERE");
		data.scrollToExecutiveChart(driver);
		
		ListnerImplementationClass.test.log(Status.INFO, "DATA CHECKING FOR DASHBOARD ENDS HERE");
	}

}
