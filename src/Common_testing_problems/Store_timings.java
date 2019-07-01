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
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
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
import excelconnect.excelconnect;
public class Store_timings {
	WebDriver driver;
	DataConfig data;
	static JavascriptExecutor js;
	PopupClose pc=new PopupClose();
	OnlinePopupClose obc=new OnlinePopupClose();
	excelconnect ec=new excelconnect(); 
	@BeforeClass
	  public void launchdriver() throws Exception 
	  {
		String testDataPath = PropertiesFile.getDataFromProperty("TestData");
	      data = new DataConfig(testDataPath);
	      driver = CreateDriver.selectBrowser(data.getData(1, 1, 1));
	      WebDriverWait wait = new WebDriverWait (driver, 10);
	      driver.get(data.getData(1, 1, 3));
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      driver.manage().window().maximize();
	      Thread.sleep(2000);
	      driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	      ec.eLaunch("\\C:\\Users\\698531\\Desktop\\Common testing Problems automated script excels\\Monday store 9am opening validations.xlsx\\", 0);
	 }
	  @Test
	  public void popupclose() throws InterruptedException //(Bowling flow) test case-001 
	  //to validate the pop up close functionality
	  {
		  Thread.sleep(3000);
		  pc.verifypopupclose(driver);
	  }
	  @Test(dependsOnMethods="popupclose")
	  public void click_location_button_enter_location()throws IOException, InterruptedException{
		  
		  System.out.println("start");
		  
	  }
	  @Test(dependsOnMethods="click_location_button_enter_location")
	  public void store_timing_print_validations()throws IOException, InterruptedException {
		  
		  for(int s1=2;s1<=44;s1++)
		  {
			  if(s1==8)
			  {
				  continue;
				  
			  }
			Thread.sleep(2000);
		  driver.findElement(Elements.xLOCATION_BUTTON).click();
		  Thread.sleep(1500);
		  driver.findElement(Elements.xlocation_field).clear();
		  String store_name=ec.eRead(s1, 11);
		  driver.findElement(Elements.xlocation_field).sendKeys(store_name);
		  driver.findElement(Elements.xlocation_field).sendKeys(Keys.ENTER);
		  Thread.sleep(3000);
		  ((JavascriptExecutor)driver).executeScript("scroll(0,750)");
		  driver.findElement(Elements.xshow_hours_expand_bttn).click();
		  
		  String mon_time1=driver.findElement(Elements.xstore_show_hrs_mon).getText();
		  /*String tue_time1=driver.findElement(Elements.xstore_show_hrs_tue).getText();
		  String wed_time1=driver.findElement(Elements.xstore_show_hrs_wed).getText();
		  String thur_time1=driver.findElement(Elements.xstore_show_hrs_thur).getText();
		  String fri_time1=driver.findElement(Elements.xstore_show_hrs_fri).getText();
		  String sat_time1=driver.findElement(Elements.xstore_show_hrs_sat).getText();
		  String sun_time1=driver.findElement(Elements.xstore_show_hrs_sun).getText();*/
		  ec.eWrite(s1, 13, mon_time1);
		 /* ec.eWrite(s1, 19, tue_time1);
		  ec.eWrite(s1, 20, wed_time1);
		  ec.eWrite(s1, 21, thur_time1);
		  ec.eWrite(s1, 22, fri_time1);
		  ec.eWrite(s1, 23, sat_time1);
		  ec.eWrite(s1, 24, sun_time1);*/
		  ((JavascriptExecutor)driver).executeScript("scroll(0,150)");
			 driver.findElement(Elements.xview_details).click();
			 Thread.sleep(3000);
		  String mon_time2=driver.findElement(Elements.xstore_time_mon).getText();
		  /*String tue_time2=driver.findElement(Elements.xstore_time_tue).getText();
		  String wed_time2=driver.findElement(Elements.xstore_time_wed).getText();
		  String thur_time2=driver.findElement(Elements.xstore_time_thur).getText();
		  String fri_time2=driver.findElement(Elements.xstore_time_fri).getText();
		  String sat_time2=driver.findElement(Elements.xstore_time_sat).getText();
		  String sun_time2=driver.findElement(Elements.xstore_time_sun).getText(); */
		  ec.eWrite(s1, 15, mon_time2);
		/*  ec.eWrite(s1, 26, tue_time2);
		  ec.eWrite(s1, 27, wed_time2);	 
		  ec.eWrite(s1, 28, thur_time2);
		  ec.eWrite(s1, 29, fri_time2);
		  ec.eWrite(s1, 30, sat_time2);
		  ec.eWrite(s1, 31, sun_time2);*/
		  
		 
		 //((JavascriptExecutor)driver).executeScript("scroll(0,750)");
		// driver.findElement(Elements.xgallery_bttn).click();
		 
		
	  }
	  }

}
