package mainEvent.Run;

import org.CognizantQA.PageObject.Elements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import Birthday_common_flow.Birthday_book_bttn_verify;
import Birthday_common_flow.Search_location_validation;
import Common_flow.PopupClose;
import Common_flow.Select_a_mainevent_store_popup_validations;

public class RTE_Fetch_validation extends baseClass {
	//static WebDriver driver;
	PopupClose popupClose = new PopupClose();
	Birthday_book_bttn_verify birthdayBookButtonVerify = new Birthday_book_bttn_verify();
	Search_location_validation seachLocationValidation=new Search_location_validation();
	Select_a_mainevent_store_popup_validations selectAMainEventStorePopUpValidations=new Select_a_mainevent_store_popup_validations();
	RTE_validation_logic RTEValidationLogic=new RTE_validation_logic();
	String excel="\\C:\\Users\\698531\\Desktop\\RTE automated validation\\RTE Automated Validation List.xlsx\\";
	static ExtentReports extentReport;
	static ExtentTest logger;
	
	
	@BeforeClass
	public void beforeClass()
	{
		extentReport = ExtentFactory.Instance();
	}
	
	@Test(priority=1)
	public void popupClose()
	{
		//logger = extentReport.startTest("BirthdayFlowTC_02");
		popupClose.verifypopupclose(driver,logger);
		
	}

	@Test(priority=2)
	public void LocationSearchAndRTEFetch() throws Exception
	{
		RTEValidationLogic.RTE_Validation(driver, logger);			
	}
}
