package mainEvent.Run;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Birthday_common_flow.Birthday_book_bttn_verify;
import Birthday_common_flow.Search_location_validation;
import Birthday_common_flow.Select_package_page_validations;
import Birthday_common_flow.Tell_about_party_popup_validation;
import Common_flow.PopupClose;
import Common_flow.Select_a_mainevent_store_popup_validations;

public class BirthdayFlowTC_04 extends baseClass {
	PopupClose popupClose = new PopupClose();
	Birthday_book_bttn_verify birthdayBookButtonVerify = new Birthday_book_bttn_verify();
	Search_location_validation seachLocationValidation=new Search_location_validation();
	Select_a_mainevent_store_popup_validations selectAMainEventStorePopUpValidations=new Select_a_mainevent_store_popup_validations();
	Select_package_page_validations selectPackagePageValidations=new Select_package_page_validations();
	Tell_about_party_popup_validation tellAboutPartyPopUpValidation=new Tell_about_party_popup_validation();
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
		logger = extentReport.startTest("BirthdayFlowTC_04 : Validation of different functionalities of the select your party time pop up ");
		popupClose.verifypopupclose(driver,logger);
		
	}
	
	@Test(priority=2)
	public void verifyBirthdayNavigationFunctionality() throws Exception
	{
		birthdayBookButtonVerify.verify_birthday_book_bttn(driver);
		logger.log(LogStatus.PASS, "All validations before the location page navigation is successfuly done");
	}
	
	@Test(priority=3)
	public void  verifySearchLocationPage() throws Exception
	{
		seachLocationValidation.werify_search_location(driver);
		logger.log(LogStatus.PASS, "user is asked to choose location before navigating to the Birthday Party Booking page.");
	}
	
	 @Test(priority=4)
	  public void verifySearchLocationFillValidationAndNavigation() throws Exception
	 {
		
		 selectAMainEventStorePopUpValidations.verifystorepopup_close(driver,logger);		 
		 selectAMainEventStorePopUpValidations.verifystore_popup(driver,logger);
		 selectAMainEventStorePopUpValidations.verifystore_popupmapviewflow(driver,logger);
	 }
	 
	 @Test(priority=5)
	  public void verifySelectPackagePage() throws Exception
	 {
		 
		 selectPackagePageValidations.verify_select_package_page_button(driver, logger);
	 }
	 
	 @Test(priority=6)
	 public void verifyGuestCountPopup() throws Exception
	 {
		 
		 tellAboutPartyPopUpValidation.verify_guest_count_popup(driver,logger);
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
		driver.close();
	}
}
