package pomPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import GenericUtils.JavaUtility;

public class RegisterNewClient {
	
	
	
	@FindBy(xpath="//input[@name='username']")
	private WebElement userNameTextField;
	
	
	
	@FindBy(xpath="//span[text()='LOGIN']")
	private WebElement lohinbtn;
	
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement passwordtextfield;
	

	@FindBy(xpath="//span[text()='LOGIN']")
	private WebElement loginbtn2;
	
	@FindBy(xpath="(//span[text()='Register New Client'])[1]")
	private WebElement clientbtn1;
	
	
	@FindBy(xpath="(//span[text()='Register New Client'])[3]")
	private WebElement client2btn;
	
	
	@FindBy(xpath="//div[@class='mat-select-value ng-tns-c189-7']")
	private WebElement clienttypebtn;
	
	@FindBy(xpath="//span[text()=' External Partner (Customer) ']")
	private WebElement clientchoose;
	
	@FindBy(xpath="//div[@class='mat-select-value ng-tns-c189-9']")
	private WebElement parentcompanyname;
	

	@FindBy(xpath="//span[text()=' iRM Super Admin']")
	private WebElement parentcompanynamechoose;
	
	@FindBy(xpath="//input[@name='clientLegalEntity']")
	private WebElement clientlegalentityname;
	
	@FindBy(xpath="//input[@name='head_quarter']")
	private WebElement headquartername;
	
	
	@FindBy(xpath="//span[@class='mat-select-placeholder mat-select-min-line ng-tns-c189-13 ng-star-inserted']")
	private WebElement employeerange;
	
	@FindBy(xpath="(//span[@class='mat-option-text'])[2]")
	private WebElement employeerangechoose;
	

	@FindBy(xpath="//input[@name='scope_entity']")
	private WebElement scopeentity;
	
	@FindBy(xpath="//span[@class='mat-select-placeholder mat-select-min-line ng-tns-c189-16 ng-star-inserted']")
	private WebElement engagementtype;
	
	
	@FindBy(xpath="//span[text()=' External Audit ']")
	private WebElement chooseengagementtype;
	
	@FindBy(xpath="//span[@class='mat-select-placeholder mat-select-min-line ng-tns-c189-18 ng-star-inserted']")
	private WebElement revenuerange;
	
	@FindBy(xpath="//span[text()=' Less than $100m ']")
	private WebElement chooserevenuerange;
	
	@FindBy(xpath="//span[@class='mat-select-placeholder mat-select-min-line ng-tns-c189-20 ng-star-inserted']")
	private WebElement auditor;
	

	@FindBy(xpath="//span[text()=' PwC ']")
	private WebElement chooseauditor;
	
	@FindBy(xpath="//span[@class='mat-select-placeholder mat-select-min-line ng-tns-c189-22 ng-star-inserted']")
	private WebElement datasourcefileupload;
	
	 @FindBy(xpath="//span[text()=' FILE UPLOAD(ZIP:XML) ']")
		
		private WebElement uploadXMLfile;
	   
	   

	   @FindBy(xpath="//span[text()=' SOAP API ']")
		
		private WebElement uploadSOAPAPI;
	
	

	   @FindBy(xpath="//span[@class='mat-select-placeholder mat-select-min-line ng-tns-c189-25 ng-star-inserted']")
		
		private WebElement ComplianceRequirement ;
	
	
	   @FindBy(xpath="//span[text()=' SOX ']")
		
	 		private WebElement ChooseComplianceRequirement;
	   
	   @FindBy(xpath="//span[text()='Choose file ']")
		
		private WebElement Choosefile;

	   
	   @FindBy(xpath="//div[@class='mat-form-field-infix ng-tns-c146-23']")
		
		private WebElement Click;
	   
	   @FindBy(xpath="//span[text()='Next ']")
		
		private WebElement Clickonnext;

       
	   @FindBy(xpath="//input[@name='primary_contact']")
		
		private WebElement primarycontact;
	   

	   @FindBy(xpath="//input[@name='designation']")
		
		private WebElement Designation;
	   
	   @FindBy(xpath="//input[@name='email_address']")
		
	 		private WebElement emailadress;


	   @FindBy(xpath="//input[@name='contact_number']")
		
	 		private WebElement contactnumber;
	   

	   @FindBy(xpath="(//span[text()='Next'])[1]")
		
	 		private WebElement nextbtn;
      

	   @FindBy(xpath="//span[@class='mat-select-placeholder mat-select-min-line ng-tns-c189-31 ng-star-inserted']")
		
	 		private WebElement modulelicenses;


	   @FindBy(xpath="//span[text()='IT General Controls ']")
		
	 		private WebElement clickonmodulelicensesone;
      
	
	   public WebElement getdate(WebDriver driver,String date) {
			WebElement er = driver.findElement(By.xpath("//div[contains(.,'"+date+"') and @class='mat-calendar-body-cell-content mat-focus-indicator mat-calendar-body-today']"));
			return er;
	   }
		

	  
	    @FindBy(xpath="//input[@name='start_date']")
		
	 		private WebElement clickondate;
	   
	   
	   @FindBy(xpath="//input[@name='end_date']")
		
		private WebElement getbackdata;
	   
	   
	   
	   @FindBy(xpath="//span[text()='Add ']")
		
		private WebElement Addone;
 
//      FOR MODULE TWO
 
	   @FindBy(xpath="//span[@class='mat-select-placeholder mat-select-min-line ng-tns-c189-31 ng-star-inserted']")
		
	 		private WebElement modulelicenses2 ;
	  
	       
	   @FindBy(xpath="//span[text()='iMatrix ']")
		
		private WebElement iMatrix;
	   
	   public WebElement getdate2(WebDriver driver,String date) {
			WebElement er1 = driver.findElement(By.xpath("//div[contains(.,'"+date+"') and  @class='mat-calendar-body-cell-content mat-focus-indicator mat-calendar-body-today']"));
			return er1;
	   }
	 
		   
	   
	   @FindBy(xpath="//input[@name='start_date']")
		
		private WebElement clickondate2;
	   
	   
	   
	   @FindBy(xpath="//input[@name='end_date']")
		
		private WebElement enddate2;
	   
	   @FindBy(xpath="//span[text()='Add ']")
		
		private WebElement Addagain;
	   
	   
	   
//	   FOE MODULE THREE
	   
	   @FindBy(xpath="//span[@class='mat-select-placeholder mat-select-min-line ng-tns-c189-31 ng-star-inserted']")
		
		private WebElement Modulethree; 
	   
	  @FindBy(xpath="//span[text()='ERM ']")
		
		private WebElement ERM;
	   
	  @FindBy(xpath="//input[@name='start_date']")
		
		private WebElement Date3;
	  
	  
	  public WebElement getdate3(WebDriver driver,String date) {
			WebElement er2 = driver.findElement(By.xpath("//div[contains(.,'"+date+"') and  @class='mat-calendar-body-cell-content mat-focus-indicator mat-calendar-body-today']"));
			return er2;
	   }
	  
	   @FindBy(xpath="//input[@name='end_date']")
		
		private WebElement enddate3;
	  
	  @FindBy(xpath="//span[text()='Add ']")
		
			private WebElement add3;
	  
	  @FindBy(xpath="(//span[text()='Next'])[2]")
		
		private WebElement nextbtn3;
	  
	  
	  @FindBy(xpath="//div[@class='mat-select-value ng-tns-c189-36']")
		
		private WebElement ERPbtn;  
	  
	  
	  @FindBy(xpath="//span[text()=' Oracle Fusion']")
		
		private WebElement oraclefusion;  
	  
	  @FindBy(xpath="//span[text()='Add']")
		
		private WebElement ERPadd;  
	  
	  @FindBy(xpath="(//span[text()='Next'])[3]")
		
		private WebElement ERPnext;  
	  
// FOR DEPLOYMENT
	  
	  @FindBy(xpath="//div[@class='mat-select-value ng-tns-c189-38']")
		
		private WebElement deptype; 
	  
	  @FindBy(xpath="//span[text()='Shared Public Cloud - AWS ']")
		
		private WebElement AWS; 
	  
	  
	  @FindBy(xpath="//input[@type='number']")
		
		private WebElement numberofinstance;
	  
	  
	  @FindBy(xpath="//span[text()='Submit ']")
		
		private WebElement finalsubmit;
	  
	  @FindBy(xpath="//button[text()='OK']")
		
		private WebElement alertokbutton1;
	  
	  @FindBy(xpath="(//span[text()='Next'])[4]")
		
		private WebElement Next4;
	  
//	  FOR DATABASE
	  
	  @FindBy(xpath="//div[@class='mat-select-value ng-tns-c189-41']")
		
			private WebElement Database;
	  
	  
	  @FindBy(xpath="//span[text()=' MSSQL']")
		
		private WebElement Mssql;
		  
	  @FindBy(xpath="//span[text()='Submit ']")
		
		private WebElement submit1;
	  
	  
	  
	   
	   
	public RegisterNewClient(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}





	public WebElement getUserNameTextField() {
		return userNameTextField;
	}

   public WebElement getLohinbtn() {
		return lohinbtn;
	}

   public WebElement getPasswordtextfield() {
		return passwordtextfield;
	}

    public WebElement getLoginbtn2() {
		return loginbtn2;
	}
    public WebElement getClientbtn1() {
		return clientbtn1;
	}
   public WebElement getClient2btn() {
		return client2btn;
	}

  public WebElement getClienttypebtn() {
	return clienttypebtn;
}

   public WebElement getClientchoose() {
	return clientchoose;
}

  public WebElement getParentcompanyname() {
	return parentcompanyname;
}

  public WebElement getParentcompanynamechoose() {
	return parentcompanynamechoose;
}

   public WebElement getClientlegalentityname() {
	return clientlegalentityname;
}

  public WebElement getHeadquartername() {
	return headquartername;
}

  public WebElement getEmployeerange() {
	return employeerange;
}

 public WebElement getEmployeerangechoose() {
	return employeerangechoose;
}
 public WebElement getScopeentity() {
	return scopeentity;
}

 public WebElement getEngagementtype() {
	return engagementtype;
}
 public WebElement getChooseengagementtype() {
	return chooseengagementtype;
}
public WebElement getRevenuerange() {
	return revenuerange;
}
 public WebElement getChooserevenuerange() {
	return chooserevenuerange;
}

 public WebElement getAuditor() {
	return auditor;
}

 public WebElement getChooseauditor() {
	return chooseauditor;
}

 public WebElement getDatasourcefileupload() {
	return datasourcefileupload;
}
	
	public WebElement getUploadXMLfile() {
		return uploadXMLfile;
	}

 public WebElement getUploadSOAPAPI() {
		return uploadSOAPAPI;
	}


 public WebElement getComplianceRequirement() {
	return ComplianceRequirement;
}

 public WebElement getChooseComplianceRequirement() {
	return ChooseComplianceRequirement;
}

 public WebElement getChoosefile() {
	return Choosefile;
}

 public WebElement getClick() {
	return Click;
}

 public WebElement getClickonnext() {
	return Clickonnext;
}
 public WebElement getPrimarycontact() {
	return primarycontact;
}

 public WebElement getDesignation() {
	return Designation;
}
 public WebElement getEmailadress() {
	return emailadress;
}
 public WebElement getContactnumber() {
	return contactnumber;
}
 public WebElement getNextbtn() {
	return nextbtn;
}
 public WebElement getModulelicenses() {
	return modulelicenses;
}

 public WebElement getClickonmodulelicensesone() {
	return clickonmodulelicensesone;
}
	
  public WebElement getClickondate() {
	return clickondate;
}

public void clickoncurrentdate(WebDriver driver) {
	JavaUtility javautil=new JavaUtility();
	
	String str = javautil.getcurrentdate();
	
	String[] er = str.split("/");
	
	System.out.println(er[0]);
	
	int i=Integer.parseInt(er[0]);
	String date=i+"";
	
	getdate(driver,date).click();
	}


  public WebElement getGetbackdata() {
	return getbackdata;
	
}

 public WebElement getAddone() {
	return Addone;
}
public WebElement getModulelicenses2() {
	return modulelicenses2;
}

 public WebElement getiMatrix() {
	return iMatrix;
}

 
 public void clickoncurrentdate2(WebDriver driver) {
		JavaUtility javautil=new JavaUtility();
		
		String str = javautil.getcurrentdate();
		String[] er1 = str.split("/");
		System.out.println(er1[0]);
		int i=Integer.parseInt(er1[0]);
		String date=i+"";
		
		getdate(driver,date).click();
		}

 public WebElement getClickondate2() {
	return clickondate2;
}
 public WebElement getEnddate2() {
	return enddate2;
}
 public WebElement getAddagain() {
	return Addagain;
}

 public WebElement getModulethree() {
	return Modulethree;
}

 public WebElement getERM() {
	return ERM;
}
 public WebElement getDate3() {
	return Date3;
}


 public void clickoncurrentdate3(WebDriver driver) {
		JavaUtility javautil=new JavaUtility();
		
		String str = javautil.getcurrentdate();
		String[] er2 = str.split("/");
		System.out.println(er2[0]);
		int i=Integer.parseInt(er2[0]);
		String date=i+"";
		getdate(driver,date).click();
		}

 public WebElement getEnddate3() {
	return enddate3;
}

 public WebElement getAdd3() {
	return add3;
}

 public WebElement getNextbtn3() {
	return nextbtn3;
}
public WebElement getERPbtn() {
	return ERPbtn;
}
public WebElement getOraclefusion() {
	return oraclefusion;
}
 public WebElement getERPadd() {
	return ERPadd;
}
 public WebElement getERPnext() {
	return ERPnext;
}

public WebElement getDeptype() {
	return deptype;
}
 public WebElement getAWS() {
	return AWS;
}
 public WebElement getNumberofinstance() {
	return numberofinstance;
}

public WebElement getFinalsubmit() {
	return finalsubmit;
}

public WebElement getAlertokbutton1() {
	return alertokbutton1;
}

 public WebElement getNext4() {
	return Next4;
}

 public WebElement getDatabase() {
	return Database;
}





public WebElement getMssql() {
	return Mssql;
}





public WebElement getSubmit1() {
	return submit1;
}
 
 
 
 

	
	
}
	
	


