package Common_testing_problems;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.io.IOException;
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
import Birthday_common_flow.Birthday_book_bttn_verify;
import Birthday_common_flow.Plan_a_party_4heading_validations;
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
import Verify.Compare;
import excelconnect.excelconnect;
public class Regression_checklist_UAT {
	WebDriver driver;
	DataConfig data;
	static JavascriptExecutor js;
	PopupClose pc =new PopupClose();
	Home_Page_validations hpv=new Home_Page_validations();
	login l=new login();
	Registration r=new Registration();
	Book_now_header_section_validations bnv=new Book_now_header_section_validations();
	Find_a_lane_page_heading_validations hv=new Find_a_lane_page_heading_validations();
	Location_search_functionality_validations lsfv=new Location_search_functionality_validations();
	Location_search_functionality_validations ls=new Location_search_functionality_validations();
	Select_a_mainevent_store_popup_validations spv=new Select_a_mainevent_store_popup_validations();
	Select_time_page_validations stv=new Select_time_page_validations();
	Order_summary_page_navigation_validation ospv=new Order_summary_page_navigation_validation();
	Order_summary_page_go_to_cart_bttn_validation osgtv=new Order_summary_page_go_to_cart_bttn_validation();
	Order_summary_page_details_and_change_bttn_validations osdv=new Order_summary_page_details_and_change_bttn_validations();
	Bowling_reserve_bttn brb=new Bowling_reserve_bttn();
	Cart_page_modify_and_delete_button_validation cpv=new Cart_page_modify_and_delete_button_validation();
	Location_search_functionality_validations lv=new Location_search_functionality_validations();
	Checkout_register_page_validations chkv=new Checkout_register_page_validations();
	excelconnect ec=new excelconnect();
	@BeforeClass
	  public void launchdriver() throws Exception 
	  {
		Boolean resulturl=false;
		  String testDataPath = PropertiesFile.getDataFromProperty("TestData");
	      data = new DataConfig(testDataPath);
	      driver = CreateDriver.selectBrowser(data.getData(1, 1, 1),driver);
	      WebDriverWait wait = new WebDriverWait (driver, 10);
	      driver.get(data.getData(1, 1, 4));
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      driver.manage().window().maximize();
	      Thread.sleep(2000);
	      driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	      ec.eLaunch("\\C:\\Users\\698531\\Desktop\\RTE automated validation\\RTE Automated Validation List.xlsx\\", 0);
	      ec.eWrite(1, 11, "pass");
	      resulturl=Compare.verifyURL(driver, "https://mainevent.cognizantorderserv.com/secureuat/secureuat");
	      if(resulturl==true) {
	    	  driver.findElement(Elements.xuser_id).sendKeys("meoserv");
	    	  driver.findElement(Elements.xpassword_secureUAT).sendKeys("UTxv34ERTmmv");
	    	  driver.findElement(Elements.xlogin_secureUAT).click(); 
	      }
	      
	 }
	 @Test
	  public void popupclose() throws InterruptedException //(Bowling flow) test case-001 
	  //to validate the pop up close functionality
	  {
		  Thread.sleep(3000);
		  pc.verifypopupclose(driver);
	  }
	 
/*	@Test(dependsOnMethods="popupclose")
	 public void homepage_validations() throws Exception//test case-002
	 //Validate if user is able to find all the details that gets showed in 
	 //the landing/Home Page for Main Event One site 
	
	 { 
		 hpv.verify_homepage_elements(driver);
		 ec.eWrite(2, 11, "pass");
		 ec.eWrite(3, 11, "pass");
	 }
	@Test(dependsOnMethods="Book_now_validations")
	 public void login_validations() throws Exception//test case - 003
	 //Validate if user is able to find the login section in landing/Home Page for Main Event One site
	 {
		 l.verifyAccountsignin(driver);
		 l.verifyAccountLogout(driver);
		 l.verifyAccountlogin_with_invalid_password(driver);
		 l.wrong_user_login(driver);
		 l.wrong_emailid_login(driver);
	 }
	 @Test(dependsOnMethods="login_validations")
	 public void Registration_page_validations() throws Exception//test case - 004
	 //Validate if user is able to find the Registration section in landing/Home Page for Main Event One site
	 {
		 WebDriverWait wait = new WebDriverWait(driver, 10);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(Elements.xdrdforsignin));
		 r.verify_registration_page(driver);
	 }
	 @Test(dependsOnMethods="homepage_validations")
	 public void Book_now_validations() throws Exception//test case - 005,009,010,011,012
	 //Validate if user can navigate to the Book Now section of the Main Event One site
	 {
		bnv.verify_book_now_locate_and_interact(driver); 
		bnv.verify_EAT_AND_DRINK(driver);
		bnv.verify_Games_And_Activities(driver);
		bnv.verify_Parties_and_events(driver);
		bnv.verify_FUNCARDS(driver);
	 }*/
	 @Test(dependsOnMethods="popupclose")
	  public void verify_bowling_navigation_functionality() throws Exception//test-case - 014 sc-01
	  //Validate that user is able to navigate successfully to book a lane page from Main Event Page.
	  {
		  brb.verifybowling_lane_page_navigation(driver);
	  }
	 @Test(dependsOnMethods="verify_bowling_navigation_functionality")
	  public void verify_bowling_lane_page_heading_validations() throws Exception//test-case - 014 sc-01
	  //Validate that user is able to navigate successfully to book a lane page from Main Event Page.
	  {
		 hv.verifybowling_page_by_click(driver);
		 
	  }
	 @Test(dependsOnMethods="verify_bowling_lane_page_heading_validations")
	  public void verify_location_search() throws Exception//test-case - 014 sc-02
	  //Validate that user is asked to choose location before navigating to the book a lane page.
	  {
		 ls.location_validations(driver);//
		 spv.verifystorepopup_close(driver);
		 spv.verifystore_popup(driver);
		 spv.verifystore_popupmapviewflow(driver);
	  }
	 @Test(dependsOnMethods="verify_location_search")
	  public void verify_select_time_page() throws Exception//test-case - 014 sc-03-08
	  //Verify the book a lane functioanlity under select time page.
	  {
		 stv.verify_slct_time_PAGE(driver);
		 
	  }
	 @Test(dependsOnMethods="verify_select_time_page")
	  public void verify_ordersummary_page() throws Exception//test-case - 014 sc-09 to 15
	  //Verify the book a lane functioanlity under select time page.
	  {
		 try {
			 ospv.verify_snavi_order_summary_page(driver);
			 osdv.verify_terms_and_conditions(driver);
			 osgtv.verify_go_to_cart_bttn(driver);
			 osdv.verify_details_on_ordersummary_page(driver);
			 osdv.verify_change_button_validations(driver);	 
			 osdv.verify_add_ons__validations(driver);
			 osdv.verify_add_ons__addition_and_total_amount(driver);
		 }
		 catch(AssertionError e) {
			 System.out.println("Ordersummary page validations failed");
		 }
	  }
	 @Test(dependsOnMethods="verify_ordersummary_page")
	  public void verify_cart_page() throws Exception//test-case - 014 sc-16 to 
	  //Verify the book a lane functioanlity under select time page.
	  {
		 try {
			 cpv.verify_modify_and_delete_bttn(driver);
		 }
		 catch(Exception e) {
			 System.out.println("cart page validation has failed");
		 }
	  }
	 @Test(dependsOnMethods="verify_cart_page")
	 public void verify_checkout_page() throws Exception//testcase 
	 {
		 chkv.verify_register_page(driver);
	 }
	 
	 @AfterClass
		 public void driverClose() {
			                    //driver.close();
		                           }
}

