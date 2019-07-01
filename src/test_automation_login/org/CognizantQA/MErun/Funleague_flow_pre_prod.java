package test_automation_login.org.CognizantQA.MErun;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.CognizantQA.Driver.CreateDriver;
import org.CognizantQA.Properties.PropertiesFile;
import org.CognizantQA.TestData.DataConfig;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Common_flow.Cart_page_modify_and_delete_button_validation;
import Common_flow.Checkout_register_page_validations;
import Common_flow.Confirmation_page_validations;
import Common_flow.Order_summary_page_go_to_cart_bttn_validation;
import Common_flow.Payment_page_validations;
import Common_flow.PopupClose;
import Common_flow.Search_location_keyboard_flow;
import Common_flow.Select_a_mainevent_store_popup_validations;
import Funleague_common_flow.Cart_page_checkout_bttn_validaton;
import Funleague_common_flow.Find_a_league_page_heading_validations;
import Funleague_common_flow.Funleague_time_page_validations;
import Funleague_common_flow.Join_bttn_validation;
import Funleague_common_flow.League_details_page;
import Funleague_common_flow.Order_summary_page_navigation_validationf;
import Funleague_common_flow.Search_location_validation;


public class Funleague_flow_pre_prod {
	WebDriver driver;
	DataConfig data;
	PopupClose pc=new PopupClose();
	Join_bttn_validation jv=new Join_bttn_validation();
	Find_a_league_page_heading_validations flhv=new Find_a_league_page_heading_validations();
	Search_location_validation slv=new Search_location_validation();
	Select_a_mainevent_store_popup_validations psv=new Select_a_mainevent_store_popup_validations();
	Search_location_keyboard_flow slkv=new Search_location_keyboard_flow();
	Funleague_time_page_validations ftv=new Funleague_time_page_validations();
	League_details_page ldv=new League_details_page();
	Order_summary_page_navigation_validationf osnv=new Order_summary_page_navigation_validationf();
	Order_summary_page_go_to_cart_bttn_validation oscv=new Order_summary_page_go_to_cart_bttn_validation();
	Cart_page_modify_and_delete_button_validation cpmdv=new Cart_page_modify_and_delete_button_validation();
	Cart_page_checkout_bttn_validaton cpcv=new Cart_page_checkout_bttn_validaton();
	Checkout_register_page_validations crpv=new Checkout_register_page_validations();
	Payment_page_validations ppv=new Payment_page_validations();
	Confirmation_page_validations cpv=new Confirmation_page_validations();
	
	@BeforeClass
	  public void launchdriver() throws Exception 
	  {
		  String testDataPath = PropertiesFile.getDataFromProperty("TestData");
	      data = new DataConfig(testDataPath);
	      driver = CreateDriver.selectBrowser(data.getData(0, 1, 1));
	      WebDriverWait wait = new WebDriverWait (driver, 10);
	      driver.get(data.getData(0, 1, 4));
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      driver.manage().window().maximize();
	      Thread.sleep(2000);
	      driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 }
	@Test
	  public void popupclose() //(funleague flow) test case-001 
	  //to validate the pop up close functionality
	  {
		  pc.verifypopupclose(driver);
	  }
	@Test(dependsOnMethods="popupclose")
	  public void verify_join_bttn_functionality() throws IOException, InterruptedException //(funleague flow) test case-002 
	  //to validate the complete functionality of the join button of funleague situated in the home page of bowling flow
	  {
		  jv.verify_join_funleague_bttn(driver);
	  }
	@Test(dependsOnMethods="verify_join_bttn_functionality")
	public void verify_finda_league_page() throws Exception//(funleague flow) test case-003 
	  //to validate the complete functionality of the join button of funleague situated in the home page of bowling flow
	{
		flhv.verify_funleague_findpage_byclick(driver);
		slv.location_validations(driver);
	}
	@Test(dependsOnMethods="verify_finda_league_page")
	public void verify_store_popup_validations() throws Exception//(funleague flow) test case-004 
	  //to validate the complete functionality of the join button of funleague situated in the home page of bowling flow 
	{
		psv.verifystorepopup_close(driver);
		slkv.verifybowling_page_by_keyboard(driver);
		psv.verifystore_popup(driver);
		psv.verifystore_popupmapviewflow(driver);
	}
	@Test(dependsOnMethods="verify_store_popup_validations")
	public void verify_time_page_validation() throws Exception//(funleague flow) test case-005 
	  //to validate the funleage time page
	{
		ftv.verify_choose_leaguetime_page(driver);
	}
	@Test(dependsOnMethods="verify_time_page_validation")
	public void verify_league_detail_page() throws Exception//(funleague flow) test case-006 
	  //to validate all the functionalities of league details page
	{
		ldv.verify_enter_league_details_page(driver);
	}
	@Test(dependsOnMethods="verify_league_detail_page")
	public void verify_order_summary_navigation() throws Exception//(funleague flow) test case-007 
	//to validate successfull navigation to the order summary page
	{
		osnv.verify_snavi_order_summary_page(driver);
	}
	@Test(dependsOnMethods="verify_order_summary_navigation")
	public void verify_order_summary_page() throws Exception//(funleague flow) test case-008
	//to validate only the cart button in the order summary page
	{
		oscv.verify_go_to_cart_bttn(driver);
	}
	@Test(dependsOnMethods="verify_order_summary_page")
	public void verify_cart_page() throws Exception//(funleague flow) test case-009
	//to validate only the cart page
	{
		cpmdv.verify_modify_and_delete_bttn(driver);
		cpcv.verify_chekcout_bttns(driver);
	}
	@Test(dependsOnMethods="verify_cart_page")
	public void verify_checkout_register_page() throws Exception//(funleague flow) test case-010
	//to validate the check out register page validations
	{
		crpv.verify_register_page(driver);
	}
	@Test(dependsOnMethods="verify_checkout_register_page")
	public void verify_payment_page() throws Exception//(funleague flow) test case-011
	//to validate the payment page validations
	{
		ppv.verify_payment_page(driver);
	}
	@Test(dependsOnMethods="verify_payment_page")
	public void verify_confirmation_page() throws Exception//(funleague flow) test case-012
	//to validate the confirmation page validations
	{
		cpv.verify_confirmation_page(driver);
	}
}
