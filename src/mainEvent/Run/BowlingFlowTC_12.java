package mainEvent.Run;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Bowling_common_flow.Bowling_reserve_bttn;
import Bowling_common_flow.Find_a_lane_page_heading_validations;
import Bowling_common_flow.Location_search_functionality_validations;
import Bowling_common_flow.Order_summary_page_details_and_change_bttn_validations;
import Bowling_common_flow.Order_summary_page_navigation_validation;
import Bowling_common_flow.Select_time_page_validations;
import Common_flow.Checkout_register_page_validations;
import Common_flow.Confirmation_page_validations;
import Common_flow.Payment_page_validations;
import Common_flow.PopupClose;
import Common_flow.Select_a_mainevent_store_popup_validations;

public class BowlingFlowTC_12 extends baseClass{
	PopupClose popupClose = new PopupClose();
	Bowling_reserve_bttn BowlingReserveBttn=new Bowling_reserve_bttn();
	Find_a_lane_page_heading_validations FindALanePageHeadingValidations=new Find_a_lane_page_heading_validations();
	Location_search_functionality_validations LocationSearchFunctionality =new Location_search_functionality_validations();
	Select_a_mainevent_store_popup_validations selectAMainEventStorePopUpValidations=new Select_a_mainevent_store_popup_validations();
	Select_time_page_validations SelectTimeValidation=new Select_time_page_validations();
	Order_summary_page_navigation_validation OrderSummaryPageNavigationValidation=new Order_summary_page_navigation_validation();
	Order_summary_page_details_and_change_bttn_validations OrderSummaryValidations=new Order_summary_page_details_and_change_bttn_validations();
	Checkout_register_page_validations crpv=new Checkout_register_page_validations();
	Payment_page_validations ppv=new Payment_page_validations();
	Confirmation_page_validations cpv=new Confirmation_page_validations();
	static ExtentReports extentReport;
	static ExtentTest logger;
	@BeforeClass
	public void beforeClass ()
	{
		extentReport = ExtentFactory.Instance();
	}
	@Test(priority=1)
	public void popupClose()
	{
		logger = extentReport.startTest("BowlingPageFlowTC_12 : Validate multiple fields in PAYMENT page and MAKE PAYMENT button functionality ");
		popupClose.verifypopupclose(driver,logger);
		
	}
	@Test(priority=2)
	public void BowlingReserveBttn() throws Exception
	{
		BowlingReserveBttn.verifybowling_lane_page_navigation(driver, logger);
		FindALanePageHeadingValidations.verifybowling_page_by_click(driver, logger);
		
	}
	@Test(priority=3)
	public void LocationSearchFunctionalityValidations() throws Exception
	{
		LocationSearchFunctionality.location_validations(driver, logger);
		
	}
	@Test(priority=4)
	public void verifySearchLocationFillValidationAndNavigation() throws Exception
	{
		 selectAMainEventStorePopUpValidations.verifystorepopup_close(driver,logger);		 
		 selectAMainEventStorePopUpValidations.verifystore_popup(driver,logger);
		 selectAMainEventStorePopUpValidations.verifystore_popupmapviewflow(driver,logger);
		
	}
	
	@Test(priority=5)
	public void SelectTimePageValidations() throws Exception
	{
		SelectTimeValidation.verify_slct_time_PAGE(driver, logger);
		SelectTimeValidation.Select_your_bowling_time_Date_SelectionValidation(driver, logger);
	}

	@Test(priority=6)
	public void OrderSummaryPageNavigationValidation() throws Exception
	{
		OrderSummaryPageNavigationValidation.verify_snavi_order_summary_page(driver , logger);
	}
	
	@Test(priority=7)
	public void verifyDetailsOnOrdersummaryPage() throws Exception
	{
		
		crpv.verify_register_page(driver, logger);
	}
	@Test(priority=8)
	public void verifyPaymentPage() throws Exception
	{
		
		ppv.verify_payment_page(driver, logger);
		cpv.verify_confirmation_page(driver, logger);
	}
	
	@AfterMethod
	public void getResult(ITestResult r)
    {
           
           if(r.getStatus() == ITestResult.FAILURE)
           {
                  //String screenShotPath = Utility.captureScreenShot(driver, "image1");
                  logger.log(LogStatus.FAIL, "Test Case failed is " + r.getName()); 
                  logger.log(LogStatus.FAIL, "Test Case failed is " + r.getThrowable());
                  //logger.log(LogStatus.FAIL, "ScreenShot below : "+logger.addScreenCapture(screenShotPath));
           }
           else if(r.getStatus() == ITestResult.SKIP)
           {
                  logger.log(LogStatus.SKIP, "Test Case skipped is " + r.getName());
           }
          extentReport.endTest(logger);
    }
	
	@AfterTest
	public void endReport()
	{
		extentReport.flush();
		extentReport.close();
		//driver.close();
	}
}
