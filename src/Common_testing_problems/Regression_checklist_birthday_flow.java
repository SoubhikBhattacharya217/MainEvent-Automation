package Common_testing_problems;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.CognizantQA.Driver.CreateDriver;
import org.CognizantQA.PageObject.Elements;
import org.CognizantQA.Properties.PropertiesFile;
import org.CognizantQA.TestData.DataConfig;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;

import Birthday_common_flow.Birthday_book_bttn_verify;
import Birthday_common_flow.Configure_pkg_validations;
import Birthday_common_flow.Plan_a_party_4heading_validations;
import Birthday_common_flow.Search_location_validation;
import Birthday_common_flow.Select_Party_time_popup_validations;
import Birthday_common_flow.Select_package_page_validations;
import Birthday_common_flow.Tell_about_party_popup_validation;
import Birthday_common_flow.party_order_summary_validations;
import Bowling_common_flow.Bowling_reserve_bttn;
import Bowling_common_flow.Cart_page_checkout_buttons_validations;
import Bowling_common_flow.Find_a_lane_page_heading_validations;
import Bowling_common_flow.Location_search_functionality_validations;
import Bowling_common_flow.Order_summary_page_details_and_change_bttn_validations;
import Bowling_common_flow.Order_summary_page_navigation_validation;
import Bowling_common_flow.Select_time_page_validations;
import Common_flow.Book_now_header_section_validations;
import Common_flow.Cart_page_modify_and_delete_button_validation;
import Common_flow.Checkout_register_page_validations;
import Common_flow.Confirmation_page_validations;
import Common_flow.Home_Page_validations;
import Common_flow.LaunchDriver1;
import Common_flow.OnlinePopupClose;
import Common_flow.Order_summary_page_go_to_cart_bttn_validation;
import Common_flow.Payment_page_validations;
import Common_flow.PopupClose;
import Common_flow.Registration;
import Common_flow.Search_location_keyboard_flow;
import Common_flow.Select_a_mainevent_store_popup_validations;
import Common_flow.login;
import Reporter.Reporter;
import Verify.Compare;
import excelconnect.excelconnect;
public class Regression_checklist_birthday_flow {
	WebDriver driver;
	DataConfig data;
	static JavascriptExecutor js;
	static String a="\\C:\\Users\\698531\\Desktop\\Automation Regression test case suit\\ME One Test Cases - Automation - Regression V2 - Copy.xlsx\\";
	PopupClose pc=new PopupClose();
	excelconnect ec=new excelconnect();
	LaunchDriver1 LD=new LaunchDriver1();
	Birthday_book_bttn_verify bbv=new Birthday_book_bttn_verify();
	Search_location_validation slv=new Search_location_validation();
	Select_a_mainevent_store_popup_validations spv=new Select_a_mainevent_store_popup_validations();
	Select_package_page_validations sppv=new Select_package_page_validations();
	Tell_about_party_popup_validation tppv=new Tell_about_party_popup_validation();
	Configure_pkg_validations cpv=new Configure_pkg_validations();
	Select_Party_time_popup_validations sptpv=new Select_Party_time_popup_validations();
	party_order_summary_validations posv=new party_order_summary_validations();
	Payment_page_validations ppv=new Payment_page_validations();
	Cart_page_modify_and_delete_button_validation cpmv=new Cart_page_modify_and_delete_button_validation();
	Checkout_register_page_validations crpv=new Checkout_register_page_validations();
	Reporter r=new Reporter();
	ExtentReports extent;
	ExtentTest logger;
	 @BeforeClass
	  public void launchdriver() throws Exception 
	  {
		 
	          LD.launchdriver(driver);
	 		 //ExtentReports(String filePath,Boolean replaceExisting) 
	 		 //filepath - path of the file, in .htm or .html format - path where your report needs to generate. 
	 		 //replaceExisting - Setting to overwrite (TRUE) the existing file or append to it
	 		 //True (default): the file will be replaced with brand new markup, and all existing data will be lost. Use this option to create a brand new report
	 		 //False: existing data will remain, new tests will be appended to the existing report. If the the supplied path does not exist, a new file will be created.
	 		 extent = new ExtentReports (System.getProperty("user.dir") +"/test-output/STMExtentReport.html", true);
	 		 //extent.addSystemInfo("Environment","Environment Name")
	 		 extent
	 		                .addSystemInfo("Host Name", "SoftwareTestingMaterial")
	 		                .addSystemInfo("Environment", "Automation Testing")
	 		                .addSystemInfo("User Name", "Rajkumar SM");
	 		                //loading the external xml file (i.e., extent-config.xml) which was placed under the base directory
	 		                //You could find the xml file below. Create xml file in your project and copy past the code mentioned below
	 		                extent.loadConfig(new File(System.getProperty("user.dir")+"\\extent-config.xml"));
	 		 
	 		              r.startTest("");
	 		                
	  }	
	
	 
	 
	 @Test
	  public void popupclose() throws InterruptedException //(Bowling flow) test case-001 
	  //to validate the pop up close functionality
	  {
	 
		  Thread.sleep(3000);
		  pc.verifypopupclose(driver);
		  
	  }
	 @Test(dependsOnMethods="popupclose",groups="bday navigation") 
	  public void verify_birthday_navigation_functionality() throws Exception//test-case - 001 sc-01
	  //Validate that user is able to navigate successfully to Birthday Party Booking page from Main Event Page.
	  {
		 r.testCasename("Book_A_Party_01 - Verify the navigation to Birthday Party Booking page from home page of Main Event.");
		 bbv.verify_birthday_book_bttn(driver);		  
		 r.testSteps("Pass", "Validate that user is able to navigate successfully to Birthday Party Booking page from Main Event Page.");
		 r.endTest();
	  }
	 @Test(dependsOnMethods="verify_birthday_navigation_functionality")
	  public void verify_search_location_page() throws Exception//test-case - 001 sc-02
	  //Validate that user is asked to choose location before navigating to the Birthday Party Booking page.
	 {
		 r.testCasename("Book_A_Party_02");
		 slv.werify_search_location(driver);
		 r.testSteps("Pass", "Validate that user is asked to choose location before navigating to the Birthday Party Booking page.");
		 r.endTest();
	 }
	 @Test(dependsOnMethods="verify_search_location_page")
	  public void verify_search_location_fill_validation_and_navigation() throws Exception//test-case - 001 sc-03
	  //Validate that user is able to enter a valid location before navigating to the Birthday Party Booking page..
	 {
		 r.testCasename("Book_A_Party_03");
		 spv.verifystorepopup_close(driver);
		 spv.verifystore_popup(driver);
		 spv.verifystore_popupmapviewflow(driver);
		 r.testSteps("Pass", "Validate that user is able to enter a valid location before navigating to the Birthday Party Booking page.");
		 r.endTest();
	 }
	 @Test(dependsOnMethods="verify_search_location_fill_validation_and_navigation")
	  public void verify_select_package_page() throws Exception//test-case - 001 sc-04-07
	  //Validate user is navigating to view packages page on clicking find packages button after entering all the mandatory details.
	 {
		 r.testCasename("Book_A_Party_04");
		 sppv.verify_select_package_page(driver);
		 r.testSteps("Pass", "Validate user is navigating to view packages page on clicking find packages button after entering all the mandatory details.");
		 r.testSteps("Pass", "Validate in select a package section all the available packages are present with all the details about the package and select package button.");
		 r.testSteps("Pass", "Validate compare package option is present in select a package page.");
		 r.testSteps("Pass", "Validate on clicking compare package a new modal pop up will come where all the available packages are present.");
		 r.testSteps("Pass", "Validate the functionality of close button present in the compare package pop up.");
		 tppv.verify_guest_count_popup(driver);
		 r.testSteps("Pass", "Validate the customer is able to enter number of guests from number of guest dropdown list.");
		 r.testSteps("Pass", "Validate the different change buttons in configure package page eg(change a different mainevent store,change a different package etc) are working as expected");
		 r.endTest();
	 }
	 @Test(dependsOnMethods="verify_select_package_page")
	 public void verify_config_package() throws Exception//test-case - 001 sc-08
	  //Validate user is navigating to view packages page on clicking find packages button after entering all the mandatory details.
	 {
		 r.testCasename("Book_A_Party_05 - Verify the configure package functionality.");
		 cpv.config_pkg_change_bttns_validation(driver);
		 r.testSteps("Pass", "Validate the different change buttons in configure package page eg(change a different mainevent store,change a different package etc) are working as expected");
		 cpv.config_pkg_onlyheadings(driver);
		 cpv.config_pkg_activity_slctn(driver);
		 r.testSteps("Pass", "Validate customer can select one more activity apart from the default selected activity.");
		 r.testSteps("Pass", "Validate customer can select one more activity apart from the default selected activity.");
		 r.endTest();
		 
	 }
	 @Test(dependsOnMethods="verify_config_package")
	 public void verify_select_party_time_popup() throws Exception//test-case - 001 sc-09
	  //Validate user is navigating to view packages page on clicking find packages button after entering all the mandatory details.
	 {
		 r.testCasename("Book_A_Party_06 - Verify the select your party time pop up .");
		sptpv.verify_select_party_time_pop_up(driver);
		r.testSteps("Pass", "Validate that user is able validate different functionalities of the select your party time pop up ");
		sptpv.verify_select_party_time_pop_up_time_select(driver);
		r.testSteps("Pass", "Validate that user is able to select a time slot from the 'select your party time' pop up");
		r.testSteps("Pass", "Validate on clicking compare package a new modal pop up will come where all the available packages are present.");
		r.testSteps("Pass", "Validate the functionality of close button present in the compare package pop up.");
		r.testSteps("Pass", "Validate the customer is able to enter number of guests from number of guest dropdown list.");
		r.testSteps("Pass", "Validate the customer is able to see change location button and all the package details are as expected");
		r.endTest();
		
	 }
	 @Test(dependsOnMethods="verify_select_party_time_popup")
	 public void verify_partyorder_summary_page_validations() throws Exception
	 {
		r.testCasename("Book_A_Party_07 - Verify the select your party time pop up .");
		posv.party_order_summary(driver);
		r.testSteps("Pass", "Validate that user is able validate different functionalities of the select your party time pop up "); 
		r.testSteps("Pass", "validate that in party order summary page the 'continue shopping' and 'go to cart' buttons are present");
		r.testSteps("Pass", "Valdiate that all the details are showing including price and person number.");
		r.testSteps("Pass", "Valdiate that all the change buttons under the details are present and clickable");
		posv.party_order_summary_ADDON_AND_TAX_VALIDATIONS(driver);
		r.testSteps("Pass", "Validate different add ons avaialble in the book a lane page.");
		r.testSteps("Pass", "Validate if user add any add on then it is directly added to the order summary.");
		r.testSteps("Pass", "Validate if user is able to check the terms and conditions box or not");
		r.testSteps("Pass", "Validate if user is able to navigate to the cart page ");
		r.endTest();
	 }
	 @Test(dependsOnMethods="verify_partyorder_summary_page_validations")
	 public void cart_page_validations() throws Exception
	 {
		 r.testCasename("Book_A_Party_08 - Verify multiple functionalities in the cart page");
		 cpmv.verify_modify_and_delete_bttn(driver);
		 r.testSteps("Pass", "Validate if user is able to view multiple details as chosen by user in the cart page");
		 r.testSteps("Pass", "Validate if user is able to click the modify button present in the cart page");
		 r.testSteps("Pass", "Validate if user is able to check the functionality of the terms and conditions button in the cart page");
		 r.testSteps("Pass", "Validate if user is able to click the go to checkout button");
		 r.endTest();
	 }
	 @Test(dependsOnMethods="cart_page_validations")
	 public void checkout_register_page_validation() throws Exception
	 {
		 r.testCasename("Book_A_Party_09 - Verify multiple functionalities in the register page");
		 crpv.verify_register_page(driver);
		 ec.eLaunch(a, 0);
		 ec.eWrite(198, 11, "Pass");
		 ec.eWrite(199, 11, "Pass");
		 ec.eWrite(200, 11, "Pass");
		 ec.eWrite(201, 11, "Pass");
		 ec.eWrite(202, 11, "Pass");
		 ec.eWrite(203, 11, "Pass");
		 ec.eWrite(204, 11, "Pass");
		 ec.eWrite(205, 11, "Pass");
		 r.testSteps("Pass", "Validate the total amount field present in the register  page.");
		 r.testSteps("Pass", "Validate if user is able to go to the payment page after entering all the valid credentials in the register page");
		 r.endTest();
	 }
	 
	 @Test(dependsOnMethods="checkout_register_page_validation")
	 public void payment_page_validations() throws Exception
	 {
		r.testCasename("Book_A_Party_10 - verify multiple functionalities in the payment page");
		ppv.verify_payment_page(driver);
		String total_payment=driver.findElement(Elements.xtotal_amount_make_payment_page).getText();
		ec.eLaunch(a, 1);
		ec.eWrite(109, 2, total_payment);
		ec.eLaunch(a, 0);
		ec.eWrite(206, 11, "Pass");
		ec.eWrite(207, 11, "Pass");
		ec.eWrite(208, 11, "Pass");
		ec.eWrite(209, 11, "Pass");
		ec.eWrite(210, 11, "Pass");
		ec.eWrite(211, 11, "Pass");
		r.testSteps("Pass", "validate if user is able to enter a valid credentials in the payment page");
		r.testSteps("Pass", "Validate if user is able to click the 'make payment' button");
		r.endTest();
		
	 }
	 
}
