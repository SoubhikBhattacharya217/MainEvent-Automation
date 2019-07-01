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
public class Title_tag_validation_for_all_pages {
	WebDriver driver;
	DataConfig data;
	static JavascriptExecutor js;
	PopupClose pc=new PopupClose();
	OnlinePopupClose obc=new OnlinePopupClose();
	excelconnect ec=new excelconnect(); 
	@BeforeClass
	  public void launchdriver() throws Exception 
	  {
		String testDataPath = PropertiesFile.getDataFromProperty("TestData2");
	      data = new DataConfig(testDataPath);
	      driver = CreateDriver.selectBrowser(data.getData(0, 2, 5));
	      driver.manage().window().maximize();
	      ec.eLaunch("\\C:\\Users\\698531\\Desktop\\Common testing Problems automated script excels\\title tag validation for all pages.xlsx\\", 0);
	 }
	  @Test
	  public void popupclose() throws InterruptedException //(Bowling flow) test case-001 
, IOException
	  //to validate the pop up close functionality
	  {
		  for(int i=22;i<=54;i++)
		  {
			  if(i==3)
			  {
				  continue;
			  }
			  WebDriverWait wait = new WebDriverWait (driver, 10);
		      driver.get(data.getData(0, i, 1));
		      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		      Thread.sleep(2000);
		      driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		      Thread.sleep(3000);
		      if(i==2)
			  {
				  pc.verifypopupclose(driver); 
			  }
		      String title=driver.getTitle();
		      ec.eWrite(i, 3, title);
		  }
		  
		  
	  }

}
