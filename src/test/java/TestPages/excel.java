package TestPages;

import org.testng.annotations.Test;

import GenericUtils.BaseClass;

public class excel extends BaseClass {
	
	@Test
	public void test() throws Throwable {
		String EX = eLib.getExcelData("Sheet1",0,1);
		System.out.println(EX+"......");
	}

}
