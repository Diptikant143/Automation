package demo;
import GenericUtils.BaseClass;
import GenericUtils.ListnerImplementationClass;
import pomPages.sodDashboard;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.aventstack.extentreports.Status;
@Listeners(ListnerImplementationClass.class)
public class SoDdashboardTest extends BaseClass{
    @Test
    public void soddashboardTest() throws Throwable{
        ListnerImplementationClass.test.log(Status.INFO, "ITGC DASHBOARD PAGE STARTS HERE");
		ListnerImplementationClass.test.assignAuthor("Saikat");
		ListnerImplementationClass.test.assignDevice("Windows X64");
		sodDashboard sod = new sodDashboard(driver);
		Robot robot = new Robot();
        sod.getClickOnAdvanced().click();
		sod.getClickOnUnsafeLink().click();
		sod.getUserNameTextField().sendKeys(USERNAME);
		sod.getLohinbtn().click();		
		sod.getPasswordtextfield().sendKeys(PASSWORD);
		sod.getLohinbtn().click();
		sod.getDropdownElement().click();
		sod.getChooseClient().click();
		sod.getLohinbtn().click();
		ListnerImplementationClass.test.log(Status.INFO, "LOGIN PAGE ENDS HERE");
		ListnerImplementationClass.test.log(Status.INFO, "SoD DASHBOARD ANALYSIS PAGE STARTS HERE");
		//System.out.println(driver.getCurrentUrl());
		Thread.sleep(5000);
		sod.getClickOnSoDAnalysisTab().click();
		Thread.sleep(5000);
		sod.getClickOnCountChartSoDRulesViolated().click();
		sod.getClickOnCountChartSoDRulesViolatedSortingAssending().click();
		Thread.sleep(5000);
		sod.getClickOnCountChartSoDRulesViolatedSortingDeAssending().click();
		sod.getClickOnCountChartSoDRulesViolatedSearching().sendKeys("Record to Report");
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		sod.getClickOnCountChartSoDRulesViolatedMultiSelectedDropDown().click();
		sod.getClickOnCountChartSoDRulesViolatedMultiSelectedDropDown().click();
		sod.getClickOnCountChartSoDRulesViolatedExcelSheetDownload().click();
        ListnerImplementationClass.test.log(Status.INFO, "SoD DASHBOARD ANALYSIS PAGE STARTS HERE");
    }

}