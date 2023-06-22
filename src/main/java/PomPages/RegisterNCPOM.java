package PomPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericUtils.JavaUtility;

public class RegisterNCPOM {
	
    
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
       
     @FindBy(xpath="//input[@type='file']")
   	private WebElement choosefile;

       
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


       @FindBy(xpath="//span[@class=\'mat-select-placeholder mat-select-min-line ng-tns-c189-31 ng-star-inserted\']")
       private WebElement modulelicenses;


       @FindBy(xpath="//span[text()='IT General Controls']")
       private WebElement clickonmodulelicensesone;

       
       @FindBy(xpath="//input[@name='start_date']")
      	private WebElement clickonstartdate1;

     @FindBy(xpath="//input[@name='end_date']")
     	private WebElement clickonenddate1;
       
       
       
       @FindBy(xpath="//span[text()='Add ']")
       private WebElement Addone;
       
//FOR MODULE TWO
       
       @FindBy(xpath="//span[@class='mat-select-placeholder mat-select-min-line ng-tns-c189-31 ng-star-inserted']")
       private WebElement modulelicenses2 ;
      
           
       @FindBy(xpath="(//span[@class=\'mat-option-text\'])[5]")
       private WebElement iMatrix;
       
     
       @FindBy(xpath="//input[@name='start_date']")
     	private WebElement clickonstartdate2;

     @FindBy(xpath="//input[@name='end_date']")
     	private WebElement clickonenddate2;
       
       
       
//   FOE MODULE THREE
       
       @FindBy(xpath="//span[@class='mat-select-placeholder mat-select-min-line ng-tns-c189-31 ng-star-inserted']")
        private WebElement Modulethree; 
       
      @FindBy(xpath="(//span[text()='ERM'])[3]")
       private WebElement ERM;
      
      @FindBy(xpath="//input[@name='start_date']")
      private WebElement clickonstartdate3;
      
      @FindBy(xpath="//input[@name='end_date']")
      	private WebElement clickonenddate3;
      
      @FindBy(xpath="(//span[text()='Next'])[2]")
       private WebElement nextbtn3;
      
      //ERP
      
      
      @FindBy(xpath="//div[@id=\'mat-select-value-19\']")
    	private WebElement CLICKOnERP;

   @FindBy(xpath="//span[text()=' Oracle Fusion']")
   	private WebElement CLICKOnERPBUTTON;

    @FindBy(xpath="//span[text()='Add']")
    	private WebElement CLICKOnERPADDBUTTON;

    @FindBy(xpath="(//span[text()='Next'])[3]")
    	private WebElement CLICKOnERPNEXTBUTTON;
      
//FOR DEPLOYMENT
      
      @FindBy(xpath="//span[@class=\'mat-select-placeholder mat-select-min-line ng-tns-c189-37 ng-star-inserted\']")
      private WebElement deptype; 
      
      @FindBy(xpath="//span[text()='Shared Public Cloud - AWS ']")
      private WebElement AWS; 
      
      
      @FindBy(xpath="//input[@type='number']")
      private WebElement numberofinstance;
      
      
      @FindBy(xpath="//span[text()='Submit ']")
      private WebElement finalsubmit;
      
      @FindBy(xpath="//button[text()='OK']")
      private WebElement alertokbutton1;
      
      
      //constractot
      
        public RegisterNCPOM(WebDriver driver) {
        	PageFactory.initElements(driver, this);		// TODO Auto-generated constructor stub
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
    return choosefile;
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
    
public WebElement getclickonstartdate1() {
    return clickonstartdate1;
}


public WebElement getclickonenddate1() {
    return clickonenddate1;
    
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

public WebElement getclickonstartdate2() {
    return clickonstartdate2;
}
public WebElement getclickonenddate2() {
    return clickonenddate2;
}

public WebElement getModulethree() {
    return Modulethree;
}

public WebElement getERM() {
    return ERM;
}


public WebElement getclickonstartdate3() {
    return clickonstartdate3;
}

public WebElement getclickonenddate3() {
    return clickonenddate3;
}


public WebElement getNextbtn3() {
    return nextbtn3;
}
public WebElement getCLICKOnERP() {
	return CLICKOnERP;
}

public WebElement getCLICKOnERPBUTTON() {
	return CLICKOnERPBUTTON;
}

public WebElement getCLICKOnERPADDBUTTON() {
	return CLICKOnERPADDBUTTON;
}

public WebElement getCLICKOnERPNEXTBUTTON() {
	return CLICKOnERPNEXTBUTTON;
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




    
    
}
    
    




