package demo;

import org.testng.annotations.Test;

import GenericUtils.BaseClass;
import pomPages.DataSync_POM;
import pomPages.Developer_POM;

public class Developer extends BaseClass{

	@Test
	
	public void Developerpage() {
		Developer_POM dev=new Developer_POM(driver);
	
		dev.getHambutton().click();
		dev.getDevbutton().click();
		dev.getDevdesigner().click();
		//dev.getNewproject().click();
		//dev.getProjectname().sendKeys("projectTwo");
		//dev.getOkbutton().click();
		//dev.getOkbutton2().click();
		dev.getHambutton2().click();
		dev.getSelectproject().click();
		//dev.getImporttable().click();
		//dev.getIRMDB().click();
		//dev.getSelecttable().click();
		//dev.getSearchfortable().sendKeys("new");
		//dev.getDBtable().click();
		//dev.getTablename().sendKeys("NewTable");
		//dev.getCreatetableok().click();
		//dev.getAftecreatetablealert().click();
		dev.getVisualizationtab().click();
	}
	
}
