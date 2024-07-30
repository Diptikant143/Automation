package demo;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import GenericUtils.BaseClass;
import GenericUtils.ListnerImplementationClass;
import pomPages.ItgcItac;


@Listeners(ListnerImplementationClass.class)

public class ITGCITACDashBoard extends BaseClass{

	@Test
	public void itgcdashboardDashboard() throws Throwable{
		ListnerImplementationClass.test.log(Status.INFO, "ITGC DASHBOARD PAGE STARTS HERE");
		ListnerImplementationClass.test.assignAuthor("Saikat");
		ListnerImplementationClass.test.assignDevice("Windows X64");
		ItgcItac dashboard = new ItgcItac(driver);
		Robot robot = new Robot();
		ListnerImplementationClass.test.log(Status.INFO, "LOGIN PAGE STARTS HERE");
		dashboard.getClickOnAdvanced().click();
		dashboard.getClickOnUnsafeLink().click();
		dashboard.getUserNameTextField().sendKeys(USERNAME);
		dashboard.getLohinbtn().click();		
		dashboard.getPasswordtextfield().sendKeys(PASSWORD);
		dashboard.getLohinbtn().click();
		dashboard.getDropdownElement().click();
		dashboard.getChooseClient().click();
		dashboard.getLohinbtn().click();
		ListnerImplementationClass.test.log(Status.INFO, "LOGIN PAGE ENDS HERE");
		ListnerImplementationClass.test.log(Status.INFO, "ITGC DASHBOARD PAGE STARTS HERE");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		dashboard.getClickOnHamBurger().click();
		dashboard.getItgcAndItac().click();
		dashboard.getItgcAndItacdashbaord().click();
		dashboard.getClickOnHamBurger().click();
		ListnerImplementationClass.test.log(Status.INFO, "ITGC DASHBOARD PAGE ENDS HERE");
		ListnerImplementationClass.test.log(Status.INFO, "CHECK ITGC CONTROLS STARTS HERE");
		dashboard.getITGC_Controls().click();
		dashboard.getITGC_Controls_sorting().click(); //For Ascending order
		dashboard.getITGC_Controls_sorting_Descending_Order().click(); //For Descending Order
		Thread.sleep(1000);
		dashboard.getITGC_Controls_search().sendKeys("ITGC-10");
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		dashboard.getITGC_Controls_search().sendKeys(Keys.CONTROL + "A");
		robot.keyPress(KeyEvent.VK_BACK_SPACE);
		robot.keyRelease(KeyEvent.VK_BACK_SPACE);
		dashboard.getPagination().click();
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		dashboard.getDownloadExcel().click();
		dashboard.getCrossButton().click();
		ListnerImplementationClass.test.log(Status.INFO, "CHECK ITGC CONTROLS Sucessfully Done");
		
		ListnerImplementationClass.test.log(Status.INFO, "FAMILY THEME: FAILED CONTROL STARTS HERE");
		/*ListnerImplementationClass.test.log(Status.INFO, "FAMILY THEME: FAILED CONTROL STARTS HERE YELLOW");
		Thread.sleep(7000);
		dashboard.getAccessGovernenceYellow().click();
		Thread.sleep(7000);
		dashboard.getAccessGovernenceYellowSorting().click();
		dashboard.getAccessGovernenceYellowSorting().click();
		//Thread.sleep(1000);
		dashboard.getDownloadExcel().click();
		dashboard.getPagination().click();
		//Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		dashboard.getMaximizeButton().click();
		dashboard.getCrossButton1().click();
		ListnerImplementationClass.test.log(Status.INFO, "FAMILY THEME: FAILED CONTROL END HERE YELLOW");
		ListnerImplementationClass.test.log(Status.INFO, "FAMILY THEME: FAILED CONTROL STARTS HERE RED");
		//Thread.sleep(2000);
		
		//Thread.sleep(1000);
		dashboard.getAccessGovernenceYellowSorting().click();
		dashboard.getAccessGovernenceYellowSorting().click();
		//Thread.sleep(1000);
		dashboard.getDownloadExcel().click();
		dashboard.getPagination().click();
		//Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		dashboard.getMaximizeButton().click();
		dashboard.getCrossButton1().click();
		ListnerImplementationClass.test.log(Status.INFO, "FAMILY THEME: FAILED CONTROL END HERE RED");
		ListnerImplementationClass.test.log(Status.INFO, "FAMILY THEME: FAILED CONTROL ENDS HERE");*/
		
		
		ListnerImplementationClass.test.log(Status.INFO, "FLIP ICON STARTS HERE");
		dashboard.getFlipFlop().click();
		ListnerImplementationClass.test.log(Status.INFO, "FLIP ICON ENDS HERE");
		ListnerImplementationClass.test.log(Status.INFO, "DOWNLOAD ICON STARTS HERE");
		
		//dashboard.getDownloadIcon().click();
		//dashboard.getImageIcon().click();
		//dashboard.getYellowLegend().click();
		ListnerImplementationClass.test.log(Status.INFO, "DOWNLOAD ICON END HERE");
		ListnerImplementationClass.test.log(Status.INFO, "DISTRIBUTION OF CHECK ITGC FAILED CONTROLS STARTS HERE");
		dashboard.getHighRiskRatedPassedCheckITGC().click();
		dashboard.getHighRiskRatedPassedCheckITGCSorting().click();
		dashboard.getHighRiskRatedPassedCheckITGCDecendingSorting().click();
		dashboard.getHighRiskRatedPassedCheckITGCInput().sendKeys("ITGC-02");
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		dashboard.getHighRiskRatedPassedCheckITGCClear().click();
		dashboard.getHighRiskRatedPassedCheckITGCCExcel().click();
		dashboard.getHighRiskRatedPassedCheckITGCCross().click();
		ListnerImplementationClass.test.log(Status.INFO, "DISTRIBUTION OF CHECK ITGC FAILED CONTROLS ENDS HERE");
		ListnerImplementationClass.test.log(Status.INFO, "DISTRIBUTION OF CHECK ITGC CONTROLS 50% CONTROL FAIL STARTS HERE");
		dashboard.getPassedControls().click();
		dashboard.getPassedControlsSorting().click();
		dashboard.getPassedControlsSortingDesending().click();
		dashboard.getPassedControlsSearchBox().sendKeys("ITGC-02");
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		dashboard.getPassedControlsClearButton().click();
		dashboard.getCrossButton2().click();
		//dashboard.getDistributionofCheckITGCControlsImageDownload().click();
		ListnerImplementationClass.test.log(Status.INFO, "DISTRIBUTION OF CHECK ITGC CONTROLS 50% CONTROL FAIL ENDS HERE");
		ListnerImplementationClass.test.log(Status.INFO, "LIST OF ITGC CONTROLS STARTS HERE");
		dashboard.getListOfITGCControlsSearch().sendKeys("ITGC-01");
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		dashboard.scrollToTheLast(driver);
		dashboard.getListOfITGCControlsDropDown().click();
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		dashboard.scrollToTheFast(driver);
		dashboard.getListOfITGCControlsExcelDownload().click();
		dashboard.getListOfITGCControlsClear().click();
		dashboard.getListOfITGCControlsSorting().click();
		dashboard.getListOfITGCControlsSortingDecending().click();
		//dashboard.getListOfITGCControlsDownloadIcon().click();
		//dashboard.getListOfITGCControlsDownload().click();
		ListnerImplementationClass.test.log(Status.INFO, "LIST OF ITGC CONTROLS ENDS HERE");
		dashboard.scrollToTheFast(driver);
		ListnerImplementationClass.test.log(Status.INFO, "ITGC DASHBOARD PAGE ENDS HERE");
		ListnerImplementationClass.test.log(Status.INFO, "ITAC DASHBOARD PAGE STARTS HERE");
		ListnerImplementationClass.test.log(Status.INFO, "ITAC DASHBOARD PAGE STARTS HERE: ITAC CONTROLS");
		dashboard.getClickonITAC().click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		dashboard.getClickonITACControls().click();
		Thread.sleep(3000);
		dashboard.getClickAscendingorder().click();
		dashboard.getClickonITACControls1().click();
		dashboard.getClickonclearbutton().click();
		dashboard.getClickonSearchbox().sendKeys("ITAC-06");
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		dashboard.getClickonexceldownload().click();
		dashboard.getClickOnCrossButton().click();
		ListnerImplementationClass.test.log(Status.INFO, "ITAC DASHBOARD PAGE STARTS HERE: ITAC CONTROLS");
		ListnerImplementationClass.test.log(Status.INFO, "ITAC DASHBOARD PAGE STARTS HERE: RISK RATING ACCORDING TO FAMILY");
		ListnerImplementationClass.test.log(Status.INFO, "ITAC DASHBOARD PAGE STARTS HERE: RISK RATING ACCORDING TO FAMILY:PAYABLES");
		dashboard.getClickOnPayables().click();
		dashboard.getClickOnPayablesAssendingOrder().click();
		dashboard.getClickOnPayablesdesendingOrder().click();
		dashboard.getClickOnPayablesFirstSearchBox().sendKeys("ITAC-04");
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		dashboard.getClickOnPayablesSecoendSearchBox().sendKeys("Dipti");
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		dashboard.getClickOnPayablesClear().click();
		dashboard.getClickOnPayablesPagination().click();
		dashboard.getClickOnCrossButton().click();
		ListnerImplementationClass.test.log(Status.INFO, "ITAC DASHBOARD PAGE END HERE: RISK RATING ACCORDING TO FAMILY:PAYABLES");
		ListnerImplementationClass.test.log(Status.INFO, "ITAC DASHBOARD PAGE STARTS HERE: RISK RATING ACCORDING TO FAMILY:PROCUREMENT");
		dashboard.getClickOnProcurement().click();
		dashboard.getClickOnPayablesAssendingOrder().click();
		dashboard.getClickOnPayablesdesendingOrder().click();
		dashboard.getClickOnPayablesFirstSearchBox().sendKeys("ITAC-08");
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		dashboard.getClickOnPayablesClear().click();
		dashboard.getDownloadExcel().click();
		dashboard.getClickOnProcurementCross().click();
		ListnerImplementationClass.test.log(Status.INFO, "ITAC DASHBOARD PAGE END HERE: RISK RATING ACCORDING TO FAMILY:PROCUREMENT");
		ListnerImplementationClass.test.log(Status.INFO, "ITAC DASHBOARD PAGE START HERE: RISK RATING ACCORDING TO FAMILY:FLIP");
		dashboard.getFlipFlopElementElement().click();
		ListnerImplementationClass.test.log(Status.INFO, "ITAC DASHBOARD PAGE ENDS HERE: RISK RATING ACCORDING TO FAMILY:FLIP");		
		ListnerImplementationClass.test.log(Status.INFO, "ITAC DASHBOARD PAGE START HERE: RISK RATING ACCORDING TO FAMILY:CHART LEGEND");	
		Thread.sleep(4000);
		dashboard.getITACLegends().click();	
		ListnerImplementationClass.test.log(Status.INFO, "ITAC DASHBOARD PAGE ENDS HERE: RISK RATING ACCORDING TO FAMILY:CHART LEGEND");
		ListnerImplementationClass.test.log(Status.INFO, "ITAC DASHBOARD PAGE END HERE: RISK RATING ACCORDING TO FAMILY");
		ListnerImplementationClass.test.log(Status.INFO, "ITAC DASHBOARD PAGE START HERE: DISTRIBUTION OF ITAC CONTROLS");
		ListnerImplementationClass.test.log(Status.INFO, "ITAC DASHBOARD PAGE START HERE: DISTRIBUTION OF ITAC CONTROLS:FAILED CONTROLS");
		dashboard.getITACFailedcontrols().click();
		dashboard.getITACFailedcontrolsChartAssendingSorting().click();
		dashboard.getITACFailedcontrolsChartDeAssendingSorting().click();
		dashboard.getITACFailedcontrolsChartSearchBox().sendKeys("ITAC-01");
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		dashboard.getITACFailedcontrolsChartExpand().click();
		dashboard.getITACFailedcontrolsChartCross().click();
		ListnerImplementationClass.test.log(Status.INFO, "ITAC DASHBOARD PAGE START HERE: DISTRIBUTION OF ITAC CONTROLS:FAILED CONTROLS");
		ListnerImplementationClass.test.log(Status.INFO, "ITAC DASHBOARD PAGE START HERE: DISTRIBUTION OF ITAC CONTROLS:FAILED CONTROLS");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		//dashboard.getControlFails().click();
		ListnerImplementationClass.test.log(Status.INFO, "ITAC DASHBOARD PAGE START HERE: DISTRIBUTION OF ITAC CONTROLS:FAILED CONTROLS");
		ListnerImplementationClass.test.log(Status.INFO, "ITAC DASHBOARD PAGE ENDS HERE: DISTRIBUTION OF ITAC CONTROLS ");
		ListnerImplementationClass.test.log(Status.INFO, "ITAC DASHBOARD PAGE STARTS HERE: LIST OF ITAC CONTROLS");
		dashboard.scrollToTheLast(driver);
		dashboard.getDropDownBtn().click();
		dashboard.getDropDownBtn1().click();
		dashboard.getDropDownBtn1().click();
		dashboard.getListITACControlsSearchBox().sendKeys("ITAC-01");
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		dashboard.scrollToTheFast(driver);
		dashboard.getListOfITACExcel().click();
		ListnerImplementationClass.test.log(Status.INFO, "ITAC DASHBOARD PAGE ENDS HERE: LIST OF ITAC CONTROLS");
		}
}