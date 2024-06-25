package demo;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;


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
		ListnerImplementationClass.test.assignDevice("windows 64");
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
		//Thread.sleep(1000);
		dashboard.getITGC_Controls().click();
		dashboard.getITGC_Controls_sorting().click(); //For Ascending order
		dashboard.getITGC_Controls_sorting_Descending_Order().click(); //For Descending Order
		Thread.sleep(1000);
		dashboard.getITGC_Controls_search().sendKeys("ITGC-10");
		//Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		//Thread.sleep(3000);
		dashboard.getITGC_Controls_search().sendKeys(Keys.CONTROL + "A");
		//Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_BACK_SPACE);
		robot.keyRelease(KeyEvent.VK_BACK_SPACE);
		dashboard.getPagination().click();
		//Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		dashboard.getDownloadExcel().click();
		//dashboard.getMaximizeButton().click();
		dashboard.getCrossButton().click();
		ListnerImplementationClass.test.log(Status.INFO, "CHECK ITGC CONTROLS STARTS HERE");
		ListnerImplementationClass.test.log(Status.INFO, "FAMILY THEME: FAILED CONTROL STARTS HERE");
		ListnerImplementationClass.test.log(Status.INFO, "FAMILY THEME: FAILED CONTROL STARTS HERE YELLOW");
		//Thread.sleep(2000);
		dashboard.getAccessGovernenceYellow().click();
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
		ListnerImplementationClass.test.log(Status.INFO, "FAMILY THEME: FAILED CONTROL ENDS HERE");
		ListnerImplementationClass.test.log(Status.INFO, "FLIP ICON STARTS HERE");
		dashboard.getFlipFlop().click();
		ListnerImplementationClass.test.log(Status.INFO, "FLIP ICON ENDS HERE");
		ListnerImplementationClass.test.log(Status.INFO, "DOWNLOAD ICON STARTS HERE");
		//Thread.sleep(1000);
		dashboard.getDownloadIcon().click();
		dashboard.getImageIcon().click();
		dashboard.getYellowLegend().click();
		ListnerImplementationClass.test.log(Status.INFO, "DOWNLOAD ICON END HERE");
		ListnerImplementationClass.test.log(Status.INFO, "DISTRIBUTION OF CHECK ITGC FAILED CONTROLS STARTS HERE");
		dashboard.getHighRiskRatedPassedCheckITGC().click();
		dashboard.getHighRiskRatedPassedCheckITGCSorting().click();
		dashboard.getHighRiskRatedPassedCheckITGCDecendingSorting().click();
		dashboard.getHighRiskRatedPassedCheckITGCInput().sendKeys("ITGC-02");
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
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
		dashboard.getListOfITGCControlsDownloadIcon().click();
		dashboard.getListOfITGCControlsDownload().click();
		ListnerImplementationClass.test.log(Status.INFO, "LIST OF ITGC CONTROLS ENDS HERE");
		//ListnerImplementationClass.test.log(Status.INFO, "OVERALL RISK STATUS STARTS HERE");
		//dashboard.scrollToTheIeft(driver);
		//ListnerImplementationClass.test.log(Status.INFO, "OVERALL RISK STATUS STARTS HERE");
		//ListnerImplementationClass.test.log(Status.INFO, "LOGOUT STARTS HERE");
		//dashboard.getProfileDropDown().click();
		//dashboard.getLogOut().click();
		//ListnerImplementationClass.test.log(Status.INFO, "LOGOUT STARTS HERE");
		dashboard.scrollToTheFast(driver);
		//ITAC
		dashboard.getClickonITAC().click();
		Thread.sleep(3000);
		dashboard.getClickonITACControls().click();
		Thread.sleep(3000);
		dashboard.getClickAscendingorder().click();
		dashboard.getClickonITACControls1().click();
		Thread.sleep(1000);
		dashboard.getClickonclearbutton().click();
		dashboard.getClickonSearchbox().sendKeys("ITAC");
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		dashboard.getClickonclearsearch().click();
		dashboard.getClickonexceldownload().click();
		dashboard.getClickonconrolfamilysearchbox().sendKeys("Dipti");
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		dashboard.getClickonconrolfamilyclearbutton().click();
		dashboard.getITACControlspageDropDown().click();
		dashboard.getClickoncrossbutton().click();
		dashboard.getClickonfailedITACcontrol().click();
		dashboard.getClickonfailedITACcontrolfirstsearchbox().sendKeys("08");
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		dashboard.getClickonfailedITACcontrolriskClear().click();
		dashboard.getClickonfailedITACcontrolpagination().click();
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		dashboard.getClickonfailedITACcontrolclearbutton().click();
		//1
		dashboard.getClickonfailedITACcontrolriskratingsearchbox().sendKeys("High");
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		//2
		dashboard.getClickonfailedITACcontrolriskdescriptionsearchbox().sendKeys("that");
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		dashboard.getClickonfailedITACcontrolriskdescriptionClear().click();
		dashboard.getClickonfailedITACcontrolriskCross().click();
		ListnerImplementationClass.test.log(Status.INFO, "RISK RATING ACCORDING TO FAMILY STARTS HERE");
		dashboard.getRiskRatingAccordingToFamilyOrdertoCash().click();
		Thread.sleep(3000);
		dashboard.getRiskRatingAccordingToFamilyOrdertoCashSearch().sendKeys("ITAC-16");
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		dashboard.getRiskRatingAccordingToFamilyOrdertoCashSorting().click();
		dashboard.getRiskRatingAccordingToFamilyOrdertoCashSortingDesc().click();
		dashboard.getClickonfailedITACcontrolriskdescriptionClear().click();
		dashboard.getRiskRatingAccordingToFamilyOrdertoCashMaximze().click();
		dashboard.getRiskRatingAccordingToFamilyOrdertoCashCrossButton().click();
		dashboard.getMediumLegends().click();
		Thread.sleep(5000);
		//dashboard.getDownloadriskRatingAccordingToFamily().click();
		//dashboard.getDownloadImage().click();
		ListnerImplementationClass.test.log(Status.INFO, "RISK RATING ACCORDING TO FAMILY ENDS HERE");
		ListnerImplementationClass.test.log(Status.INFO, "CONTROL DISTRIBUTION: BASED ON MONITORED RISK RATING STARTS HERE");
		Thread.sleep(5000);
		dashboard.getClickOnHigh().click();
		dashboard.getControlDistributionBasedOnMonitoredRiskRatingHigh().click();
		dashboard.getControlDistributionBasedOnMonitoredRiskRatingHighSortAesc().click();
		dashboard.getControlDistributionBasedOnMonitoredRiskRatingHighSortDesc().click();
		dashboard.getControlDistributionBasedOnMonitoredRiskRatingHighText().sendKeys("ITAC-21");
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		dashboard.getControlDistributionBasedOnMonitoredRiskRatingHighMaximize().click();
		dashboard.getControlDistributionBasedOnMonitoredRiskRatingHighPagination().click();
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		dashboard.getRiskRatingAccordingToFamilyOrdertoCashCrossButton().click();
		ListnerImplementationClass.test.log(Status.INFO, "CONTROL DISTRIBUTION: BASED ON MONITORED RISK RATING ENDS HERE");
		ListnerImplementationClass.test.log(Status.INFO, "LIST OF ITAC STARTS HERE");
		dashboard.getListOfITACControlsSearchBox().sendKeys("ITAC-01");
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		dashboard.scrollToTheLast(driver);
		dashboard.getListOfITACControlsPagination().click();
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		dashboard.scrollToTheFast(driver);
		ListnerImplementationClass.test.log(Status.INFO, "LIST OF ITAC ENDS HERE");
	}
	
	
}

