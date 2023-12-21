package demo;

import org.testng.annotations.Test;

import GenericUtils.ExcelUtility;

public class Data {
	
	@Test
	public void Dipti() throws Throwable {
		 ExcelUtility excel=new ExcelUtility();
		 String rt = excel.getExcelData("Sheet1", 2,1 );
		 System.out.println(rt+"-----------");
		 
		
	}

}
