package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterNC_POM {
	
	@FindBy(xpath="//*[local-name()='svg' and @class='ionicon']")
	private WebElement hamburgerbtn;
	
	@FindBy(xpath="(//span[@class=\"menu-text\"])[108]")
	private WebElement RCButton1;
	
	@FindBy(xpath="(//span[text()='Register New Client'])[6]")
	private WebElement RCButton2;
	
	//GENRAL PAGE
	
	@FindBy(xpath="//span[@class='mat-select-placeholder mat-select-min-line ng-tns-c189-11 ng-star-inserted']")
	private WebElement clienttypebtn;
	
	@FindBy(xpath="(//span[@class='mat-option-text'])[4]")
	private WebElement chooseclienttypebtn;
	
	@FindBy(xpath="//span[@class='mat-select-placeholder mat-select-min-line ng-tns-c189-13 ng-star-inserted']")
	private WebElement parentcompanybtn;
	
	
	@FindBy(xpath="//span[text()=' iRM Super Admin']")
	private WebElement parentcompanyname;
    
	
	@FindBy(xpath="//input[@name='clientLegalEntity']")
	private WebElement clientlegalentitybtn;
	
	
	@FindBy(xpath="//input[@name='head_quarter']")
	private WebElement selectheadquartername;
	
	@FindBy(xpath="//span[@class='mat-select-placeholder mat-select-min-line ng-tns-c189-17 ng-star-inserted']")
	private WebElement clickonemployeerange;


	@FindBy(xpath="//span[text()=' Less than 1000 ']")
	private WebElement writeemployeerange;
	
	@FindBy(xpath="//input[@name='scope_entity']")
	private WebElement enterscopeentitybtn;
	
	@FindBy(xpath="//span[@class='mat-select-placeholder mat-select-min-line ng-tns-c189-20 ng-star-inserted']")
	private WebElement selectengagementtype;
	
	
	@FindBy(xpath="//span[text()=' External Audit ']")
	private WebElement enterengagementtype;
	
	@FindBy(xpath="//span[@class='mat-select-placeholder mat-select-min-line ng-tns-c189-22 ng-star-inserted']")
	private WebElement selectRevenueRangebtn;
	
	
	@FindBy(xpath="//span[text()=' $100m-$500m ']")
	private WebElement entereRevenuerangettype;
	
	
	
	@FindBy(xpath="//span[@class='mat-select-placeholder mat-select-min-line ng-tns-c189-24 ng-star-inserted']")
	private WebElement selectAuditorbtn;
	
	@FindBy(xpath="//span[text()=' PwC ']")
	private WebElement enterAuditorName;
	
   @FindBy(xpath="//div[@class='mat-select-value ng-tns-c189-26']")
	private WebElement clickonfileupload;
	
   @FindBy(xpath="//span[text()=' FILE UPLOAD(ZIP:XML) ']")
	private WebElement uploadXMLfile;
   
   @FindBy(xpath="//span[text()=' SOAP API ']")
	private WebElement uploadSOAPAPI;
   
   @FindBy(xpath="//input[@type='file']")
  	private WebElement choosefile;
   
   @FindBy(xpath="//div[@class='mat-select-value ng-tns-c189-29']")
 	private WebElement compliance;
   
   @FindBy(xpath="//span[text()=' SOX ']")
	private WebElement clickonSOXbtn;
   
   @FindBy(xpath="(//button[@type='button'])[2]")
	private WebElement clickonNEXTbtn;
   
   //CONTACT PAGE
   
   @FindBy(xpath="//input[@name='primary_contact']")
	
	private WebElement clickonPrimaryContact;
  
  
  @FindBy(xpath="//input[@name='designation']")
	
	private WebElement clickonDesignationbtn;
 
  @FindBy(xpath="//input[@name='email_address']")
	
	private WebElement clickonEmailAdressbtn;

  @FindBy(xpath="//input[@name='contact_number']")
	
 	private WebElement clickonContactNumberbtn;
  
  
  
  @FindBy(xpath="(//span[text()='Next'])[1]")
	private WebElement clickonNextBTN;
  
	//FOR MODULES ONE
  
  
  @FindBy(xpath="//span[@class='mat-select-placeholder mat-select-min-line ng-tns-c189-35 ng-star-inserted']")
 	private WebElement clickonMODULEBTN;
  

  @FindBy(xpath="//span[text()='IT General Controls ']")
     private WebElement clickonmodulelicensesnumber1;

  @FindBy(xpath="//input[@name='start_date']")
   	private WebElement clickonstartdate1;

  @FindBy(xpath="//input[@name='end_date']")
  	private WebElement clickonenddate1;

  @FindBy(xpath="//span[text()='Add ']")
  	private WebElement clickonADDBTN1;

  //FOR MODULES TWO

  @FindBy(xpath="//span[text()='iMatrix ']")
  	private WebElement clickonIMatrix;

  @FindBy(xpath="//div[@class='mat-select-value ng-tns-c189-35']")
  	private WebElement clickonmodulelicenses2;

  @FindBy(xpath="//input[@name='start_date']")
  	private WebElement clickonstartdate2;

  @FindBy(xpath="//input[@name='end_date']")
  	private WebElement clickonenddate2;

  @FindBy(xpath="//span[text()='Add ']")
  	private WebElement clickonADDBTN2;

  //FOR MODULES THREE

  @FindBy(xpath="//div[@class='mat-select-value ng-tns-c189-35']")
  	private WebElement clickonmodulelicenses3;

  @FindBy(xpath="//span[text()='Developer ']")
  	private WebElement clickonDeveloper;

  @FindBy(xpath="//input[@name='start_date']")
  private WebElement clickonstartdate3;
  
  @FindBy(xpath="//input[@name='end_date']")
  	private WebElement clickonenddate3;

  @FindBy(xpath="//span[text()='Add ']")
  	private WebElement clickonADDBTN3;

  @FindBy(xpath="(//span[text()='Next'])[2]")
  	private WebElement CLICKONNEXTBUTTON;

 //FOR ERP

  @FindBy(xpath="//div[@class='mat-select-value ng-tns-c189-39']")
  	private WebElement CLICKOnERP;

 @FindBy(xpath="//span[text()=' Oracle Fusion']")
 	private WebElement CLICKOnERPBUTTON;

  @FindBy(xpath="//span[text()='Add']")
  	private WebElement CLICKOnERPADDBUTTON;

  @FindBy(xpath="(//span[text()='Next'])[3]")
  	private WebElement CLICKOnERPNEXTBUTTON;

  //FOR DEPLOYMENT

  @FindBy(xpath="//div[@class='mat-select-value ng-tns-c189-41']")
  	private WebElement DeploymentBox;

  @FindBy(xpath="//span[text()='Shared Public Cloud - AWS ']")
  	private WebElement AWS;

  @FindBy(xpath="//input[@type='number']")
  	private WebElement PEODUCTION;

  @FindBy(xpath="(//span[text()='Next'])[4]")
  	private WebElement DPNEXTBTN;

   // FOR DATABASE

  @FindBy(xpath="//div[@class='mat-select-value ng-tns-c189-44']")
  	private WebElement FORDATABASE;

  @FindBy(xpath="//span[text()=' MSSQL']")
  	private WebElement FORDATABASEBTN;

  @FindBy(xpath="//span[text()='Submit ']")
  	private WebElement FORDATABASESUBMITBTN;
   
  
   
	
	
	
   //Constructor 
   
	public RegisterNC_POM(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	//Getters

	public WebElement getHamburgerbtn() {
		return hamburgerbtn;
	}

	public WebElement getRCButton1() {
		return RCButton1;
	}

	public WebElement getRCButton2() {
		return RCButton2;
	}
	//GENRAL PAGE
	
	public WebElement getClienttypebtn() {
		return clienttypebtn;
	}

	public WebElement getChooseclienttypebtn() {
		return chooseclienttypebtn;
	}

	public WebElement getParentcompanybtn() {
		return parentcompanybtn;
	}

	public WebElement getParentcompanyname() {
		return parentcompanyname;
	}

	public WebElement getClientlegalentitybtn() {
		return clientlegalentitybtn;
	}

	public WebElement getSelectheadquartername() {
		return selectheadquartername;
	}

	public WebElement getClickonemployeerange() {
		return clickonemployeerange;
	}

	public WebElement getWriteemployeerange() {
		return writeemployeerange;
	}

	public WebElement getEnterscopeentitybtn() {
		return enterscopeentitybtn;
	}

	public WebElement getSelectengagementtype() {
		return selectengagementtype;
	}

	public WebElement getEnterengagementtype() {
		return enterengagementtype;
	}

	public WebElement getSelectRevenueRangebtn() {
		return selectRevenueRangebtn;
	}

	public WebElement getEntereRevenuerangettype() {
		return entereRevenuerangettype;
	}

	public WebElement getSelectAuditorbtn() {
		return selectAuditorbtn;
	}

	public WebElement getEnterAuditorName() {
		return enterAuditorName;
	}
	public WebElement getClickonfileupload() {
		return clickonfileupload;
	}

	public WebElement getUploadXMLfile() {
		return uploadXMLfile;
	}

	public WebElement getUploadSOAPAPI() {
		return uploadSOAPAPI;
	}

	public WebElement getChoosefile() {
		return choosefile;
	}

	public WebElement getCompliance() {
		return compliance;
	}
	public WebElement getClickonSOXbtn() {
		return clickonSOXbtn;
	}

	public WebElement getClickonNEXTbtn() {
		return clickonNEXTbtn;
	}
	
	//CONTACT
	
	public WebElement getClickonPrimaryContact() {
		return clickonPrimaryContact;
	}

	public WebElement getClickonDesignationbtn() {
		return clickonDesignationbtn;
	}

	public WebElement getClickonEmailAdressbtn() {
		return clickonEmailAdressbtn;
	}

	public WebElement getClickonContactNumberbtn() {
		return clickonContactNumberbtn;
	}

	public WebElement getClickonNextBTN() {
		return clickonNextBTN;
	}

	//FOR MODULES ONE
	
	public WebElement getClickonMODULEBTN() {
		return clickonMODULEBTN;
	}
	public WebElement getClickonmodulelicensesnumber1() {
		return clickonmodulelicensesnumber1;

	}

	public WebElement getClickonstartdate1() {
		return clickonstartdate1;
	}

	public WebElement getClickonenddate1() {
		return clickonenddate1;
	}

    public WebElement getClickonADDBTN1() {
    	return clickonADDBTN1;
    }

	//FOR MODULES TWO

	public WebElement getClickonmodulelicenses2() {
		return clickonmodulelicenses2;
	}

	public WebElement getClickonIMatrix() {
		return clickonIMatrix;
	}

	public WebElement getClickonstartdate2() {
		return clickonstartdate2;
	}

	public WebElement getClickonenddate2() {
		return clickonenddate2;
	}

	public WebElement getClickonADDBTN2() {
		return clickonADDBTN2;
	}

		// FOE MODULE THREE

	public WebElement getClickonmodulelicenses3() {
		return clickonmodulelicenses3;
	}

	public WebElement getClickonDeveloper() {
		return clickonDeveloper;
	}

	public WebElement getClickonstartdate3() {
		return clickonstartdate3;
	}

	public WebElement getClickonenddate3() {
		return clickonenddate3;
	}

	public WebElement getClickonADDBTN3() {
		return clickonADDBTN3;
	}

	public WebElement getCLICKONNEXTBUTTON() {
		return CLICKONNEXTBUTTON;
	}

	//ERP
	
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

	public WebElement getDeploymentBox() {
		return DeploymentBox;
	}

	public WebElement getAWS() {
		return AWS;
	}

	public WebElement getPEODUCTION() {
		return PEODUCTION;
	}

	public WebElement getDPNEXTBTN() {
		return DPNEXTBTN;
	}

	// FOR DATABASE

	public WebElement getFORDATABASE() {
		return FORDATABASE;
	}

	public WebElement getFORDATABASEBTN() {
		return FORDATABASEBTN;
	}

	public WebElement getFORDATABASESUBMITBTN() {
		return FORDATABASESUBMITBTN;
	}



	

	

}
