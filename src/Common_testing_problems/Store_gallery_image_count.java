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

public class Store_gallery_image_count {
	WebDriver driver;
	DataConfig data;
	static JavascriptExecutor js;
	PopupClose pc=new PopupClose();
	OnlinePopupClose obc=new OnlinePopupClose();
	@BeforeClass
	  public void launchdriver() throws Exception 
	  {
		  String testDataPath = PropertiesFile.getDataFromProperty("TestData");
	      data = new DataConfig(testDataPath);
	      driver = CreateDriver.selectBrowser(data.getData(0, 1, 1));
	      WebDriverWait wait = new WebDriverWait (driver, 10);
	      driver.get(data.getData(0, 1, 3));
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      driver.manage().window().maximize();
	      Thread.sleep(2000);
	      driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 }
	  @Test
	  public void popupclose() throws InterruptedException //(Bowling flow) test case-001 
	  //to validate the pop up close functionality
	  {
		  Thread.sleep(3000);
		  pc.verifypopupclose(driver);
	  }
	  @Test(dependsOnMethods="popupclose")
	  public void verify_location_fetch_and_gallery_image_count() throws InterruptedException {
		  int count=0;
		  Thread.sleep(2000);
		  driver.findElement(Elements.xLOCATION_BUTTON_prod).click();
		  //driver.findElement(Elements.xLOCATION_BUTTON).click();
		  Thread.sleep(4000);
		  driver.findElement(Elements.xlocation_field).clear();
		  for(int i=37;i<=39;i++)
		  {
			  String s=data.getData(2, i, 9);
			  System.out.println(s);
			  driver.findElement(Elements.xlocation_field).sendKeys(s);
			  driver.findElement(Elements.xlocation_field).sendKeys(Keys.ENTER);
			  Thread.sleep(2000);
			 ((JavascriptExecutor)driver).executeScript("scroll(0,600)");
			  driver.findElement(Elements.xview_details).click();
			  Thread.sleep(3000);
			  ((JavascriptExecutor)driver).executeScript("scroll(0,750)");
			  driver.findElement(Elements.xgallery_bttn).click();
               for(int x=1;x<=100;x++) 
               {
				  try
				  {
					  driver.findElement(By.cssSelector("#gallery > div > div:nth-child("+x+") > img")).isDisplayed();
					  count++;
				  }
				  catch(Exception e)
				  {
					  System.out.println(s + " has "+count+" images under gallery");
					  count=0;
					  break;
				  }
				  
			  }
			  driver.findElement(Elements.xLOCATION_BUTTON_prod).click();
			  driver.findElement(Elements.xlocation_field).clear();
			  //data.
		  }
	  }
	  

	  }
	  

