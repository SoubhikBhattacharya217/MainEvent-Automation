package test_automation_login.org.CognizantQA.MErun;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.CognizantQA.Driver.CreateDriver;
import org.CognizantQA.Properties.PropertiesFile;
import org.CognizantQA.TestData.DataConfig;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import Birthday_common_flow.Birthday_book_bttn_verify;
import Birthday_common_flow.Plan_a_party_4heading_validations;
import Bowling_common_flow.Bowling_reserve_bttn;
import Bowling_common_flow.Cart_page_checkout_buttons_validations;
import Bowling_common_flow.Find_a_lane_page_heading_validations;
import Bowling_common_flow.Location_search_functionality_validations;
import Bowling_common_flow.Order_summary_page_navigation_validation;
import Bowling_common_flow.Select_time_page_validations;
import Common_flow.Cart_page_modify_and_delete_button_validation;
import Common_flow.Checkout_register_page_validations;
import Common_flow.Confirmation_page_validations;
import Common_flow.LaunchDriver1;
import Common_flow.OnlinePopupClose;
import Common_flow.Order_summary_page_go_to_cart_bttn_validation;
import Common_flow.Payment_page_validations;
import Common_flow.PopupClose;
import Common_flow.Search_location_keyboard_flow;
import Common_flow.Select_a_mainevent_store_popup_validations;
public class Bowling_flow_UAT {
	WebDriver driver;
	DataConfig data;
	
	PopupClose pc=new PopupClose();
	OnlinePopupClose obc=new OnlinePopupClose();
	Bowling_reserve_bttn brb=new Bowling_reserve_bttn();
	Find_a_lane_page_heading_validations hv=new Find_a_lane_page_heading_validations();
	Location_search_functionality_validations lv=new Location_search_functionality_validations();
	Search_location_keyboard_flow slk=new Search_location_keyboard_flow();
	Select_a_mainevent_store_popup_validations spv=new Select_a_mainevent_store_popup_validations();
	Select_time_page_validations stv=new Select_time_page_validations();
	Order_summary_page_navigation_validation opv=new Order_summary_page_navigation_validation();
	Order_summary_page_go_to_cart_bttn_validation cb=new Order_summary_page_go_to_cart_bttn_validation();
	Cart_page_modify_and_delete_button_validation mdv=new Cart_page_modify_and_delete_button_validation();
	Cart_page_checkout_buttons_validations cv=new Cart_page_checkout_buttons_validations();
	Checkout_register_page_validations crv=new Checkout_register_page_validations();
	Payment_page_validations ppv=new Payment_page_validations();
	Confirmation_page_validations cpv=new Confirmation_page_validations();
	
  @BeforeClass
  public void launchdriver() throws Exception 
  {
	  String testDataPath = PropertiesFile.getDataFromProperty("TestData");
      data = new DataConfig(testDataPath);
      driver = CreateDriver.selectBrowser(data.getData(1, 1, 1));
      WebDriverWait wait = new WebDriverWait (driver, 10);
      driver.get(data.getData(1, 1, 4));
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      driver.manage().window().maximize();
      Thread.sleep(2000);
      driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
 }
  @Test
  public void popupclose() //(Bowling flow) test case-001 
  //to validate the pop up close functionality
  {
	  pc.verifypopupclose(driver);
  }
  @Test(dependsOnMethods="popupclose")
  public void Online_booking_popup_close() throws IOException,InterruptedException//(Bowling flow) test case-002
  //to validate the online booking pop up is closed properly
  {
	  obc.verifyonlinepopupclose(driver);
  }
  @Test(dependsOnMethods="Online_booking_popup_close")
  public void verify_bowling_reserve_bttn_functionality() throws Exception
  //Validate that user is able to navigate successfully to book a lane page from Main Event Page.
  {
	  brb.verifybowling_lane_page_navigation(driver);
  }
  @Test(dependsOnMethods="verify_bowling_reserve_bttn_functionality")
  public void find_a_lane_page_heading_validations() throws Exception //(Bowling flow) test case-004 
  //to validate all the heading in the find a lane page
  {
	  hv.verifybowling_page_by_click(driver);
  }
  @Test(dependsOnMethods="find_a_lane_page_heading_validations")
  public void location_search_validations() throws Exception//(Bowling flow) test case-004 
  //to validate all the funcationalities related to the location search field and the find a main event button
  {
	  lv.location_validations(driver);//done
  }
  @Test(dependsOnMethods="location_search_validations")
  public void store_popup_validations() throws Exception //(Bowling flow) test case-005 
  //to validate all the funcationalities related to the location search field and the find a main event button
  {
	  spv.verifystorepopup_close(driver);
	  slk.verifybowling_page_by_keyboard(driver);
	  spv.verifystore_popup(driver);
	  spv.verifystore_popupmapviewflow(driver);
  }
  @Test(dependsOnMethods="store_popup_validations") 
  public void verify_select_time_page() throws InterruptedException, IOException//(Bowling flow) test case-006 
  //To validate all the functionalities in the select time page like 1.calender pop up, 2.number of bowlers etc.
  {
	stv.verify_slct_time_PAGE(driver); 
  }
  @Test(dependsOnMethods="verify_select_time_page")
  public void verify_order_summary_page() throws InterruptedException//(Bowling flow) test case-007 
  //To validate that user is able to successfully navigate to the order summary page and able to click the go to cart page.
  {
	  opv.verify_snavi_order_summary_page(driver);
	  cb.verify_go_to_cart_bttn(driver);
  }
  @Test(dependsOnMethods="verify_order_summary_page")
  public void verify_cart_page() throws InterruptedException, IOException //(Bowling flow) test case-008 
  //To validate the functionalities of the cart page.
  {
	  mdv.verify_modify_and_delete_bttn(driver);
	  cv.verify_chekcout_bttns(driver);
  }
  @Test(dependsOnMethods="verify_cart_page")
  public void verify_chk_out_reg_page() throws Exception //(Bowling flow) test case-009 
  //To validate the functionalities of the checkout register page.
  {
	  crv.verify_register_page(driver);
  }
  @Test(dependsOnMethods="verify_chk_out_reg_page")
  public void verify_payment_page() throws Exception//(Bowling flow) test case-010 
  //To validate the functionalities of the payment page.
  {
	  ppv.verify_payment_page(driver);
  }
  @Test(dependsOnMethods="verify_payment_page")
  public void verify_confirmation_page() throws InterruptedException, IOException//(Bowling flow) test case-011 
  //To validate the functionalities of the payment page.
  {
	  cpv.verify_confirmation_page(driver);
  }
}
