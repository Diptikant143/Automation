package demo;

import org.testng.annotations.Test;

import GenericUtils.BaseClass;
import pomPages.MyUser;

public class UserOne extends BaseClass {
	
	@Test
	public void TC_ID_005_() throws Throwable {
		
		MyUser us=new MyUser(driver);
		us.getUserNameTextField().sendKeys(USERNAME);
		us.getLohinbtn().click();
		us.getPasswordtextfield().sendKeys(PASSWORD);
		us.getLoginbtn2().click();
		Thread.sleep(1000);
		us.getChoosecloent().click();
		us.getTesting().click();
		us.getLogin3().click();
		us.getiMatrix().click();
		us.getSodselection().click();
		us.getCreateruleset().click();
		us.getImportexcelruleset().click();
		us.getOrcalecloudfusion().click();
		us.getChooseFile().click();
		Thread.sleep(1000);
		//wLib.uploadFileWithRobot("\"C:\\Users\\dipti\\Downloads\\ebs21controls.xlsx\"");
	}

}
