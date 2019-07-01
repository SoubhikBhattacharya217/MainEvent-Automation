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
import Birthday_common_flow.Configure_pkg_validations;
import Birthday_common_flow.Plan_a_party_4heading_validations;
import Birthday_common_flow.Search_location_validation;
import Birthday_common_flow.Select_package_page_validations;
import Birthday_common_flow.Tell_about_party_popup_validation;
import Common_flow.LaunchDriver1;
import Common_flow.PopupClose;
import Common_flow.Search_location_keyboard_flow;
import Common_flow.Select_a_mainevent_store_popup_validations;
public class Birthday_booking_flow_pre_prod {
	WebDriver driver;
	LaunchDriver1 lc = new LaunchDriver1();
	PopupClose pc = new PopupClose();
	Birthday_book_bttn_verify bbv=new Birthday_book_bttn_verify();
	Plan_a_party_4heading_validations hv=new Plan_a_party_4heading_validations();
	Search_location_validation slv=new Search_location_validation();
	Search_location_keyboard_flow slk=new Search_location_keyboard_flow();
	Select_a_mainevent_store_popup_validations spv=new Select_a_mainevent_store_popup_validations();
	Select_package_page_validations sppv=new Select_package_page_validations();
	Tell_about_party_popup_validation ppv=new Tell_about_party_popup_validation();
	Configure_pkg_validations cpv=new Configure_pkg_validations();
	
	DataConfig data;
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
  public void popup_close()//(Birthday flow) test case-001 
  //to validate the pop up close functionality 
  {  
	pc.verifypopupclose(driver);  
  }
  @Test(dependsOnMethods="popup_close")
  public void bday_book_bttn() throws IOException, InterruptedException//(Birthday flow) test case-002 
  //to validate the birthday book button in the home landing page 
  {
  bbv.verify_birthday_book_bttn(driver);
  }
  @Test(dependsOnMethods="bday_book_bttn")
  public void plan_a_party_page_and_heading_valiadtions() throws Exception//(Birthday flow) test case-003 
  //to validate the birthday book button in the home landing page  
  {
	  hv.verifybook_birthday_page_by_click(driver);
  }
  @Test(dependsOnMethods="plan_a_party_page_and_heading_valiadtions")
  public void verify_plan_a_party_find_page() throws Exception//(Birthday flow) test case-004 
  //to validate the different functionalities of the plan a party find page 
  {
	  slv.werify_search_location(driver);
  }
  @Test(dependsOnMethods="verify_plan_a_party_find_page")
  public void verify_store_popup() throws Exception//(Birthday flow) test case-005
  //to validate the different functionalities of the store pop up.
  {
	  spv.verifystorepopup_close(driver);
	  slk.verifybowling_page_by_keyboard(driver);
	  spv.verifystore_popup(driver);
	  spv.verifystore_popupmapviewflow(driver);
  }
  @Test(dependsOnMethods="verify_store_popup")
  public void verify_select_pkg_page() throws Exception//(Birthday flow) test case-006
  //to validate the select package page.
  {
    sppv.verify_select_package_page(driver);
  }
  @Test(dependsOnMethods="verify_select_pkg_page")
  public void verify_party_guest() throws Exception//(Birthday flow) test case-007
  //to validate the tell about the party pop up arising after selecting the package.
  {
	 ppv.verify_guest_count_popup(driver); 
  }
  @Test(dependsOnMethods="verify_party_guest")
  public void verify_config_pkg() throws Exception//(Birthday flow) test case-008
  //to validate the tell about the party pop up arising after selecting the package.
  {
	  cpv.config_pkg_onlyheadings(driver);
	  cpv.config_pkg_activity_slctn(driver);
  }
  
  @AfterClass
  public void afterClass() 
  {
	  //driver.close();
  }

}
