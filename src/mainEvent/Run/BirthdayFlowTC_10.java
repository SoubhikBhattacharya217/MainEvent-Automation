package mainEvent.Run;

import org.CognizantQA.PageObject.Elements;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Birthday_common_flow.Birthday_book_bttn_verify;
import Birthday_common_flow.Configure_pkg_validations;
import Birthday_common_flow.Search_location_validation;
import Birthday_common_flow.Select_Party_time_popup_validations;
import Birthday_common_flow.Select_package_page_validations;
import Birthday_common_flow.Tell_about_party_popup_validation;
import Birthday_common_flow.party_order_summary_validations;
import Common_flow.Cart_page_modify_and_delete_button_validation;
import Common_flow.PopupClose;
import Common_flow.Select_a_mainevent_store_popup_validations;

public class BirthdayFlowTC_10 extends baseClass {
	PopupClose popupClose = new PopupClose();
	Birthday_book_bttn_verify birthdayBookButtonVerify = new Birthday_book_bttn_verify();
	Search_location_validation seachLocationValidation=new Search_location_validation();
	Select_a_mainevent_store_popup_validations selectAMainEventStorePopUpValidations=new Select_a_mainevent_store_popup_validations();
	Select_package_page_validations selectPackagePageValidations=new Select_package_page_validations();
	Tell_about_party_popup_validation tellAboutPartyPopUpValidation=new Tell_about_party_popup_validation();
	Configure_pkg_validations configurePackageValidations=new Configure_pkg_validations();
	Select_Party_time_popup_validations SelectPartyTimePopupValidations=new Select_Party_time_popup_validations();
	party_order_summary_validations PartyOrderSummaryValidations=new party_order_summary_validations();
	Cart_page_modify_and_delete_button_validation CartPageModifyValidation=new Cart_page_modify_and_delete_button_validation();
	String ex="\\C:\\Users\\698531\\Desktop\\Automation Regression test case suit\\ME One Test Cases - Automation - Regression V2 - Copy.xlsx\\";
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
		logger = extentReport.startTest("BirthdayFlowTC_10 : CART page validations : Terms And Conditions checkbox functionality and Go to Checkout button click fundtionality ");
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
	 
	 @Test(priority=7)
	 public void ConfigurePkgValidations() throws Exception
	 {
		 
		 //configurePackageValidations.config_pkg_change_bttns_validation(driver, logger);
		 //configurePackageValidations.config_pkg_onlyheadings(driver, logger);
		 try {
	           try {
	        	 Thread.sleep(5000);
	        	 wait.until(ExpectedConditions.urlToBe("https://mainevent.cognizantorderserv.com/planaparty/configurepackage"));
	               }
	           catch(Exception e) {
	        	 wait.until(ExpectedConditions.urlToBe("https://www.mainevent.com/planaparty/configurepackage"));
	           }
	           
	        }
	       catch(Exception e) {
	    	   System.out.println("ConfigurePkgValidations error");
	       }
		 driver.findElement(Elements.xslct_activity_tab2).click();
		 Thread.sleep(2000);
		 driver.findElement(Elements.xslct_activity_tab3).click();
		 Thread.sleep(2000);
		 driver.findElement(Elements.xslct_activity_tab4).click();
		 Thread.sleep(2000);
		 driver.findElement(Elements.xslct_your_food_tab).click();
		 Thread.sleep(2000);
		 configurePackageValidations.config_pkg_activity_slctn(driver, logger);
	 }
	 
	 @Test(priority=8)
	 public void Select_Party_time_popup_validations() throws Exception
	 {
		
		 SelectPartyTimePopupValidations.verify_select_party_time_pop_up(driver,logger);
		 SelectPartyTimePopupValidations.verify_select_party_time_pop_up_time_select(driver, logger);
		 
	 }
	 
	 @Test(priority=9)
	 public void party_order_summary_validations() throws Exception
	 {
		
		 PartyOrderSummaryValidations.party_order_summary_ADDON_AND_TAX_VALIDATIONS(driver, logger);
		 
		 
	 }
	 
	 @Test(priority=10)
	 public void Cart_page_modify_and_delete_button_validation() throws Exception
	 {
		 CartPageModifyValidation.verify_TermsAndConditions_bttn(driver, logger);
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
