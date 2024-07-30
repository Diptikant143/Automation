package demo;

import org.testng.annotations.Test;

import GenericUtils.*;
import pomPages.excelTimePass;
public class excelTimePassTest {
	@Test
	public void newUserTest() throws Throwable{
		ExcelUtility excelUtility = new ExcelUtility();
		for (int i=0;i<100;i++) {
			excelUtility.writeExcelData("API Testing Rest", i,i+1,"Rest Assured");
		}
	}
}
