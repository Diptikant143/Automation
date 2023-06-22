package GenericUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import PomPages.LoginPagePOM;






public class BaseClass {
public FileUtility fLib = new FileUtility();
public WebDriverUtility wLib= new WebDriverUtility();
public ExcelUtility eLib = new ExcelUtility();
public JavaUtility jLib = new JavaUtility();
public WebDriver driver;
public static WebDriver sdriver=null;
public String USERNAME;
public String PASSWORD;






@BeforeSuite
public void bSuite() {

}


@BeforeClass
public void launchBrowser() throws Throwable {
	//read data from property file
	String BROWSER = fLib.getPropertyKeyValue("browser");
	String URL = fLib.getPropertyKeyValue("url");
	/*
	 * if(BROWSER.equalsIgnoreCase("chrome")) { driver=new ChromeDriver(); } else+ +
	 * if(BROWSER.equalsIgnoreCase("firefox")) { driver = new FirefoxDriver(); }
	 * else { System.out.println("Invalid Browser Name"); }
	 */
	/*
	 * WebDriverListner regDriver=new WebDriverListner(); EventFiringWebDriver
	 * eventDriver = new EventFiringWebDriver(driver);
	 * eventDriver.register(regDriver);
	 */
	driver=new ChromeDriver();
	System.out.println("===========Browser Launch Sucessfully===========");
	wLib.maximiseWindow(driver);
	wLib.waitUntilPageLoad(driver);
	driver.get(URL);
	sdriver=driver;
}
@BeforeMethod
public void loginToApp() throws Throwable {
//read data from property file
	 USERNAME = fLib.getPropertyKeyValue("username");
	PASSWORD = fLib.getPropertyKeyValue("password");
	
	LoginPagePOM loginPage=new LoginPagePOM(driver);
	
	loginPage.getUsername().sendKeys(USERNAME);
	
	loginPage.getLogin1().click();
	
	Thread.sleep(1000);
	loginPage.getPassword().sendKeys(PASSWORD);
	loginPage.getLogin1().click();
	
	
	
		System.out.println("=============login sucessfull===========");
}
@AfterMethod
public void logoutApp() {
	//sign out of home page
	//Home h= new Home(driver);
	///h.signOut(driver);
	System.out.println("==========sign out sucessfull==========");
}
@AfterClass
public void closeBrowser() {
	driver.close();
	System.out.println("=====Browser close sucessfull============");
}
@AfterSuite
public void closeDB() {
	//dLib.closeDB();
	System.out.println("=============DB connection closed sucessfully======");
}
}