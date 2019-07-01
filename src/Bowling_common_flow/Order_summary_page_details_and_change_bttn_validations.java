package Bowling_common_flow;
import java.io.File;

import org.CognizantQA.PageObject.Elements;
import org.CognizantQA.TestData.DataConfig;
import org.apache.commons.io.FileUtils;
import org.apache.commons.logging.Log;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Verify.Compare;
import excelconnect.excelconnect;
public class Order_summary_page_details_and_change_bttn_validations {
	WebDriver driver;
	static DataConfig data;
	static JavascriptExecutor js;
	 static boolean result=false;
	 static boolean result1=false;
	 static boolean result2=false;
	 static boolean resulturl=false;
	 Bowling_failure_screen_shot ss=new Bowling_failure_screen_shot();
	 excelconnect ec=new excelconnect();
	 static ExtentReports extentReport;
     static ExtentTest logger;
	 static String a="\\C:\\Users\\698531\\Desktop\\Automation Regression test case suit\\ME One Test Cases - Automation - Regression V2 - Copy.xlsx\\";
	 
	 
	 
	 public void verify_details_on_ordersummary_page(WebDriver driver , ExtentTest logger) throws Exception{
		 WebDriverWait wait=new WebDriverWait(driver, 20);
		// ec.eLaunch(a, 0);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(Elements.xstore_location_fetch_in_ordersummary_page));
		 
		 try {
			 result=driver.findElement(Elements.xstore_location_fetch_in_ordersummary_page).isDisplayed();
			  Assert.assertTrue(result);
			  String store_location=driver.findElement(Elements.xstore_location_fetch_in_ordersummary_page).getText();
			  //ec.eWrite(87, 11, "pass");
			  ec.eLaunch(a, 1);
			  ec.eWrite(53, 2, store_location);
			  logger.log(LogStatus.PASS, "User given store location is reflected successfully in ORDER SUMMARY PAGE");
			  
		  }
		 catch(Exception e) {
			 System.out.println("ordersummary page location name validation has failed");
			 logger.log(LogStatus.FAIL, "User given store location is reflected successfully in ORDER SUMMARY PAGE");
			 //ec.eWrite(87, 11, "Fail");
		 }
		// ec.eLaunch(a, 0);
		 
		 try {
			 result=driver.findElement(Elements.xduration_noofbowlers_lanes_fetch).isDisplayed();
			  Assert.assertTrue(result);
			  String duration=driver.findElement(Elements.xduration_noofbowlers_lanes_fetch).getText();
			  //ec.eWrite(88, 11, "pass");
			  ec.eLaunch(a, 1);
			  ec.eWrite(54, 2, duration);
			  logger.log(LogStatus.PASS, "User given duration , number of bowlers and number of lanes have reflected successfully in ORDER SUMMARY PAGE");
		  }
		 catch(Exception e) {
			 System.out.println("ordersummary page duration,no of bowlers and number of lanes validation has failed");
			 logger.log(LogStatus.FAIL, "User given duration , number of bowlers and number of lanes have reflected successfully in ORDER SUMMARY PAGE");
			 //ec.eWrite(88, 11, "Fail");
		 }
		// ec.eLaunch(a, 0);
		 
		 try {
			  result=driver.findElement(Elements.xdate_fetch).isDisplayed();
			  Assert.assertTrue(result);
			  String date=driver.findElement(Elements.xdate_fetch).getText();
			  //ec.eWrite(90, 11, "pass");
			  ec.eLaunch(a, 1);
			  ec.eWrite(55, 2, date);
			  logger.log(LogStatus.SKIP, "time field cannot be validated via automation since the automation script is choosing random time if the time slot is remaining activated");
		  }
		 catch(Exception e) {
			 System.out.println("ordersummary page date validation has failed");
			 logger.log(LogStatus.FAIL, "time field cannot be selected");
		 }
		
		 
		 
	 }
	 
	 
	 
	 public void verify_change_button_validations(WebDriver driver , ExtentTest logger) throws Exception{
		 WebDriverWait wait=new WebDriverWait(driver, 20);
		 String text = null;
		 try {
			  result1=driver.findElement(Elements.xstore_location_change_bttn_ordersummarypage).isDisplayed();
			  result2=driver.findElement(Elements.xstore_location_change_bttn_ordersummarypage).isEnabled();
			  Assert.assertTrue(result1);
			  Assert.assertTrue(result2);
			  driver.findElement(Elements.xstore_location_change_bttn_ordersummarypage).click();
			  wait.until(ExpectedConditions.elementToBeClickable(Elements.xstore_popupclose_bbtn));
			  driver.findElement(Elements.xstore_popupclose_bbtn).click();
			  //ec.eLaunch(a, 0);
			  //ec.eWrite(90, 11, "pass");
			  logger.log(LogStatus.PASS, "User is able to view and click the change button present under store location details sextion in ORDER SUMMARY PAGE"); 
		  }
		 catch(Exception e) {
			 System.out.println("ordersummary location change button validation has failed");
			 logger.log(LogStatus.FAIL, "User is able to view and click the change button present under store location details sextion in ORDER SUMMARY PAGE");
			 //ec.eWrite(90, 11, "Fail");
		 }
		 
		 try {
			  result1=driver.findElement(Elements.xduration_change_bttn_ordersummarypage).isDisplayed();
			  result2=driver.findElement(Elements.xduration_change_bttn_ordersummarypage).isEnabled();
			  Assert.assertTrue(result1);
			  Assert.assertTrue(result2);
			  driver.findElement(Elements.xduration_change_bttn_ordersummarypage).click();
			  Thread.sleep(3000);
			  try {
				  resulturl=Compare.verifyURL(driver, "https://mainevent.cognizantorderserv.com/findalane/selecttime");
				  Assert.assertTrue(resulturl);
				  logger.log(LogStatus.PASS, "User is present in UAT select time page ");
				  }
				  catch(AssertionError e) {
					  System.out.println("user is not present in UAt select time page");
					  logger.log(LogStatus.SKIP, "User is not present in UAT select time page thus skipping validation");
					  text="user is not present in UAT select time page";
				  }
				  try {
					  resulturl=Compare.verifyURL(driver, "https://mainevent.com/findalane/selecttime");
					  Assert.assertTrue(resulturl);
					  logger.log(LogStatus.PASS, "User is present in PRODUCTION select time page ");
					  }
					  catch(AssertionError e) {
						  System.out.println("user is not present in Production select time page");
						  logger.log(LogStatus.SKIP, "User is not present in PRODUCTION select time page thus skipping validation");
						  text="user is not present in Production select time page";
					  }
			 driver.navigate().back();
			// ec.eWrite(91, 11, "pass");
			 //ec.eWrite(91, 13, text);
		  }
		 catch(Exception e) {
			 System.out.println("ordersummary page duration change button validation has failed");
			 logger.log(LogStatus.FAIL, "Select time page navigation validation");
			 //ec.eWrite(91, 11, "Fail");
		 }
		 
		 try {
			  result1=driver.findElement(Elements.xdate_change_bttn_ordersummarypage).isDisplayed();
			  result2=driver.findElement(Elements.xdate_change_bttn_ordersummarypage).isEnabled();
			  Assert.assertTrue(result1);
			  Assert.assertTrue(result2);
			  Thread.sleep(3000);
			  wait.until(ExpectedConditions.visibilityOfElementLocated(Elements.xaddon_heading_order_summary_page));
			  wait.until(ExpectedConditions.elementToBeClickable(Elements.xdate_change_bttn_ordersummarypage));
			  driver.findElement(Elements.xdate_change_bttn_ordersummarypage).click();
			  logger.log(LogStatus.PASS, "User can click the change date button present in ORDER SUMMARY PAGE ");
			  wait.until(ExpectedConditions.elementToBeClickable(Elements.xslct_bowling_time_popup_close_bttn));
			  driver.findElement(Elements.xslct_bowling_time_popup_close_bttn).click();
			  logger.log(LogStatus.PASS, "User can click the change date pop up cross button present in ORDER SUMMARY PAGE ");
			  try {
			  resulturl=Compare.verifyURL(driver, "https://mainevent.cognizantorderserv.com/findalane/selecttime");
			  Assert.assertTrue(resulturl);
			  }
			  catch(AssertionError e) {
				  System.out.println("user is not present in UAt select time page");
				  text="user is not present in UAT select time page";
			  }
			  try {
				  resulturl=Compare.verifyURL(driver, "https://mainevent.com/findalane/selecttime");
				  Assert.assertTrue(resulturl);
				  }
				  catch(AssertionError e) {
					  System.out.println("user is not present in Production select time page");
					  text="user is not present in Production select time page";
				  }
			  driver.navigate().back();
			  //ec.eWrite(92, 11, "pass");
			 // ec.eWrite(92, 13, text);
		  }
		 catch(Exception e) {
			 System.out.println("ordersummary page date change button validation has failed");
			 logger.log(LogStatus.FAIL, "User can click the change date button present in ORDER SUMMARY PAGE "); 
			 logger.log(LogStatus.FAIL, "User can click the change date pop up cross button present in ORDER SUMMARY PAGE ");
			 //ec.eWrite(92, 11, "Fail");
		 }
	 }
	 
	 
	 
	 public void verify_add_ons__validations(WebDriver driver , ExtentTest logger) throws Exception{
		 WebDriverWait wait=new WebDriverWait(driver, 20);
		 
		 try {
			 result=driver.findElement(Elements.xaddon_heading_order_summary_page).isDisplayed();
			  Assert.assertTrue(result);
			  //ec.eWrite(94, 11, "pass");
		  }
		 catch(Exception e) {
			 System.out.println("ordersummary page add on heading text validation has failed");
			 //ec.eWrite(94, 11, "Fail");
		 }
		 
		 try {
			  result=driver.findElement(Elements.xaddon_heading_10$order_summary_page).isDisplayed();
			  Assert.assertTrue(result);
			  logger.log(LogStatus.PASS, "10 $ Funcard Add On is present in ORDER SUMMARY PAGE "); 
			  //ec.eWrite(95, 11, "pass");
		  }
		 catch(Exception e) {
			 System.out.println("ordersummary page add on 10$ heading text validation has failed");
			 logger.log(LogStatus.FAIL, "10 $ Funcard Add On is present in ORDER SUMMARY PAGE ");
			 //ec.eWrite(95, 11, "Fail");
		 }
		 
		 try {
			  result=driver.findElement(Elements.xaddon_heading_5$order_summary_page).isDisplayed();
			  Assert.assertTrue(result);
			  logger.log(LogStatus.PASS, "5 $ Funcard Add On is present in ORDER SUMMARY PAGE "); 
		  }
		 catch(Exception e) {
			 System.out.println("ordersummary page add on 10$ heading text validation has failed");
			 logger.log(LogStatus.FAIL, "5 $ Funcard Add On is present in ORDER SUMMARY PAGE "); 
		 }
		 
		 try {
			 result=driver.findElement(Elements.xaddon_heading_10$seelct_bttn_order_summary_page).isEnabled();
			  Assert.assertTrue(result);
			  logger.log(LogStatus.PASS, "10 $ Funcard select button is present in ORDER SUMMARY PAGE "); 
		  }
		 catch(Exception e) {
			 System.out.println("ordersummary page add on 10$ select button validation has failed");
			 logger.log(LogStatus.FAIL, "10 $ Funcard select button is present in ORDER SUMMARY PAGE ");
			 
		 }
		 
		 try {
			  result=driver.findElement(Elements.xaddon_heading_5$select_bttn_order_summary_page).isEnabled();
			  Assert.assertTrue(result);
			  logger.log(LogStatus.PASS, "5 $ Funcard select button is present in ORDER SUMMARY PAGE "); 
		  }
		 catch(Exception e) {
			 System.out.println("ordersummary page add on 5$ select button validation has failed");
			 logger.log(LogStatus.FAIL, "5 $ Funcard select button is present in ORDER SUMMARY PAGE ");
		 }
		 
		 try {
			 result=driver.findElement(Elements.xaddon_heading_10$increase_bttn_order_summary_page).isEnabled();
			  Assert.assertTrue(result);
			  logger.log(LogStatus.PASS, "10 $ Funcard quantity increase button is present in ORDER SUMMARY PAGE ");
		  }
		 catch(Exception e) {
			 System.out.println("ordersummary page add on 10$ increase button validation has failed");
			 logger.log(LogStatus.FAIL, "10 $ Funcard quantity increase button is present in ORDER SUMMARY PAGE ");
		 }
		 
		 try {
			 result=driver.findElement(Elements.xaddon_heading_5$increase_bttn_order_summary_page).isEnabled();
			  Assert.assertTrue(result);
			  logger.log(LogStatus.PASS, "5 $ Funcard quantity increase button is present in ORDER SUMMARY PAGE ");
		  }
		 catch(Exception e) {
			 System.out.println("ordersummary page add on 5$ increase button validation has failed");
			 logger.log(LogStatus.FAIL, "5 $ Funcard quantity increase button is present in ORDER SUMMARY PAGE ");
		 }
		 
		 try {
			 result=driver.findElement(Elements.xaddon_heading_10$decrease_bttn_order_summary_page).isEnabled();
			  Assert.assertTrue(result);
			  logger.log(LogStatus.PASS, "10 $ Funcard quantity decrease button is present in ORDER SUMMARY PAGE ");
		  }
		 catch(Exception e) {
			 System.out.println("ordersummary page add on 10$ decrease button validation has failed");
			 logger.log(LogStatus.FAIL, "10 $ Funcard quantity decrease button is present in ORDER SUMMARY PAGE ");
		 } 
		 
		 try {
			  result=driver.findElement(Elements.xaddon_heading_5$decrease_bttn_order_summary_page).isEnabled();
			  Assert.assertTrue(result);
			  logger.log(LogStatus.PASS, "5 $ Funcard quantity decrease button is present in ORDER SUMMARY PAGE ");
			  //ec.eLaunch(a, 0);
			  //ec.eWrite(93, 11, "pass");
		  }
		 catch(Exception e) {
			 System.out.println("ordersummary page add on 5$ decrease button validation has failed");
			 logger.log(LogStatus.FAIL, "5 $ Funcard quantity decrease button is present in ORDER SUMMARY PAGE ");
			 //ec.eWrite(93, 11, "Fail");
			 
		 } 
	 }
	 
	 
	 
	 public void verify_add_ons__addition_and_total_amount(WebDriver driver , ExtentTest logger) throws Exception {
		 WebDriverWait wait=new WebDriverWait(driver, 20);
		 wait.until(ExpectedConditions.elementToBeClickable(Elements.x1bowling_lane_charge_per_hour));
		 ec.eLaunch(a, 1);
		 try {
			  result=driver.findElement(Elements.x1bowling_lane_charge_per_hour).isDisplayed();
			  Assert.assertTrue(result);
			  String bowling_1_hr_charge=driver.findElement(Elements.x1bowling_lane_charge_per_hour).getText();
			  ec.eWrite(57, 2, bowling_1_hr_charge);
			  logger.log(LogStatus.PASS, "Bowling lane 1 hr charge fetch is successfull please refer to the excel for complete TAX validation reference  ");
		  }
		 catch(Exception e) {
			 System.out.println("bowling lane 1 hr charge fetch validation has failed");
			 logger.log(LogStatus.FAIL, "Bowling lane 1 hr charge fetch is successfull please refer to the excel for complete TAX validation reference  ");
			 
		 } 
		 try {
			 result=driver.findElement(Elements.xadult_bowling_shoe_perunit_price).isDisplayed();
			  Assert.assertTrue(result);
			  String bowling_adult_shoe_1hr_charge=driver.findElement(Elements.xadult_bowling_shoe_perunit_price).getText();
			  ec.eWrite(58, 2, bowling_adult_shoe_1hr_charge);
			  logger.log(LogStatus.PASS, "Adult Bowling shoe  per unit charge fetch is successfull please refer to the excel for complete TAX validation reference  ");
		  }
		 catch(Exception e) {
			 System.out.println("adult show 1 hr charge fetch validation has failed");
			 logger.log(LogStatus.FAIL, "Adult Bowling shoe  per unit charge fetch is successfull please refer to the excel for complete  TAX validation reference  ");
			 
		 }
		 try {
			 result=driver.findElement(Elements.xchild_bowling_shoe_perunit_price).isDisplayed();
			  Assert.assertTrue(result);
			  String bowling_child_shoe_1hr_charge=driver.findElement(Elements.xchild_bowling_shoe_perunit_price).getText();
			  ec.eWrite(59, 2, bowling_child_shoe_1hr_charge);
			  logger.log(LogStatus.PASS, "Adult Bowling shoe  per unit charge fetch is successfull please refer to the excel for complete TAX validation reference  ");
		  }
		 catch(Exception e) {
			 System.out.println("child show 1 hr charge fetch validation has failed");
			 logger.log(LogStatus.FAIL, "Adult Bowling shoe  per unit charge fetch is successfull please refer to the excel for complete TAX validation reference  ");
			 
		 }
		 try {
			 result=driver.findElement(Elements.xadult_bowling_shoe_total_price).isDisplayed();
			  Assert.assertTrue(result);
			  String bowling_adult_shoe_total_charge=driver.findElement(Elements.xadult_bowling_shoe_total_price).getText();
			  ec.eWrite(60, 2, bowling_adult_shoe_total_charge);
			  logger.log(LogStatus.PASS, "Adult Bowling shoe  total price charge fetch is successfull please refer to the excel for complete TAX validation reference  ");
		  }
		 catch(Exception e) {
			 System.out.println("adult show total charge fetch validation has failed");
			 logger.log(LogStatus.FAIL, "Adult Bowling shoe  total price charge fetch is successfull please refer to the excel for complete TAX validation reference  ");
			 
		 }
		 try {
			 result=driver.findElement(Elements.xchild_bowling_shoe_total_price).isDisplayed(); 
			  Assert.assertTrue(result);
			  String bowling_child_shoe_total_charge=driver.findElement(Elements.xchild_bowling_shoe_total_price).getText();
			  ec.eWrite(61, 2, bowling_child_shoe_total_charge);
			  logger.log(LogStatus.PASS, "Child Bowling shoe  total price charge fetch is successfull please refer to the excel for complete TAX validation reference  ");
		  }
		 catch(Exception e) {
			 System.out.println("child show total charge fetch validation has failed");
			 logger.log(LogStatus.FAIL, "Child Bowling shoe  total price charge fetch is successfull please refer to the excel for complete TAX validation reference  ");
			 
		 }
		 try {
			  result=driver.findElement(Elements.xadult_bowling_shoe_quantity).isDisplayed(); 
			  Assert.assertTrue(result);
			  String bowling_adult_shoe_count=driver.findElement(Elements.xadult_bowling_shoe_quantity).getText();
			  ec.eWrite(62, 2, bowling_adult_shoe_count);
			  logger.log(LogStatus.PASS, "Adult Bowling shoe quantity fetch is successfull please refer to the excel for complete validation reference  ");
		  }
		 catch(Exception e) {
			 System.out.println("adult shoe quantity fetch validation has failed");
			 logger.log(LogStatus.FAIL, "Adult Bowling shoe quantity fetch is successfull please refer to the excel for complete validation reference  ");
			 
		 }
		 try {
			  result=driver.findElement(Elements.xchild_bowling_shoe_quantity).isDisplayed(); 
			  Assert.assertTrue(result);
			  String bowling_child_shoe_count=driver.findElement(Elements.xchild_bowling_shoe_quantity).getText();
			  ec.eWrite(63, 2, bowling_child_shoe_count);
			  logger.log(LogStatus.PASS, "Child Bowling shoe quantity fetch is successfull please refer to the excel for complete validation reference  ");
		  }
		 catch(Exception e) {
			 System.out.println("child shoe quantity fetch validation has failed");
			 logger.log(LogStatus.FAIL, "Child Bowling shoe quantity fetch is successfull please refer to the excel for complete validation reference  ");
			 
		 }
		 try {
			  result=driver.findElement(Elements.xsub_total).isDisplayed();	 
			  Assert.assertTrue(result);
			  String sub_total=driver.findElement(Elements.xsub_total).getText();
			  ec.eWrite(64, 2, sub_total);
			  logger.log(LogStatus.PASS, "Sub Total fetch is successfull please refer to the excel for complete TAX validation reference  ");
		  }
		 catch(Exception e) {
			 System.out.println("sub total fetch validation has failed");
			 logger.log(LogStatus.FAIL, "Sub Total fetch is successfull please refer to the excel for complete TAX validation reference  ");
			 
		 }
		 try {
			  result=driver.findElement(Elements.xsales_tax).isDisplayed();	 
			  Assert.assertTrue(result);
			  String sales_tax=driver.findElement(Elements.xsales_tax).getText();
			  ec.eWrite(65, 2, sales_tax);
			  logger.log(LogStatus.PASS, "Sales Tax fetch is successfull please refer to the excel for complete TAX validation reference  ");
		  }
		 catch(Exception e) {
			 System.out.println("sales tax fetch validation has failed");
			 logger.log(LogStatus.FAIL, "Sales Tax fetch is successfull please refer to the excel for complete TAX validation reference  ");
			 
		 }
		 try {
			  result=driver.findElement(Elements.xtotal).isDisplayed(); 
			  Assert.assertTrue(result);
			  String total=driver.findElement(Elements.xtotal).getText();
			  ec.eWrite(66, 2, total);
			  logger.log(LogStatus.PASS, "Total Amount fetch is successfull please refer to the excel for complete TAX validation reference  ");
			  //ec.eLaunch(a, 0);
			  //ec.eWrite(96, 11, "Pass");
		  }
		 catch(Exception e) {
			 System.out.println("total fetch validation has failed");
			 logger.log(LogStatus.FAIL, "Total Amount fetch is successfull please refer to the excel for complete TAX validation reference  ");
			  //ec.eWrite(96, 11, "Fail");	 
		 }
		 //now adding addons and checking
		 driver.findElement(Elements.xaddon_heading_10$seelct_bttn_order_summary_page).click();
		 wait.until(ExpectedConditions.elementToBeClickable(Elements.xADD_ONSheading_SECTION_IN_TAX));
		 try {
		   	  result=driver.findElement(Elements.xADD_ONSheading_SECTION_IN_TAX).isDisplayed();	 
			  Assert.assertTrue(result);
			 // ec.eLaunch("C:\\Users\\698531\\Desktop\\Automation Regression test case suit\\ME One Test Cases - Automation - Regression V2.xlsx", 0);
			  
		  }
		 catch(Exception e) {
			 System.out.println("Add On heading section in TAX validation has failed");
			
			 
		 }
		 try {
			  result=driver.findElement(Elements.xADD_10$quantity_SECTION_IN_TAX).isDisplayed(); 
			  Assert.assertTrue(result);
			  String units=driver.findElement(Elements.xADD_10$quantity_SECTION_IN_TAX).getText();
			  ec.eLaunch(a, 1);
				 ec.eWrite(67, 2, units);
			  
		  }
		 catch(Exception e) {
			 System.out.println("10$ units fetch section in TAX validation has failed");
			 
			 
		 }
		 try {
			  result=driver.findElement(Elements.xADD_10$unitprice_SECTION_IN_TAX).isDisplayed();	 
			  Assert.assertTrue(result);
			  String units=driver.findElement(Elements.xADD_10$unitprice_SECTION_IN_TAX).getText();
				 ec.eWrite(68, 2, units);
			  
		  }
		 catch(Exception e) {
			 System.out.println("10$ unit price fetch section in TAX validation has failed");
			 
			 
		 }
		 try {
		   	  result=driver.findElement(Elements.xADD_10$totalprice_SECTION_IN_TAX).isDisplayed();	 
			  Assert.assertTrue(result);
			  String units=driver.findElement(Elements.xADD_10$totalprice_SECTION_IN_TAX).getText();
				 ec.eWrite(69, 2, units);
			  
		  }
		 catch(Exception e) {
			 System.out.println("10$ total price fetch section in TAX validation has failed");
			 
			 
		 }

		 try {
			  result=driver.findElement(Elements.xtotal1).isDisplayed();
			  Assert.assertTrue(result);
			  String units=driver.findElement(Elements.xtotal1).getText();
				 ec.eWrite(70, 2, units);
				 logger.log(LogStatus.PASS, "Total Amount fetch after adding ADD ON is successfull please refer to the excel for complete TAX validation reference  ");
		  }
		 catch(Exception e) {
			 System.out.println("total price with 10$ add ons price fetch section in TAX validation has failed");
			 logger.log(LogStatus.FAIL, "Total Amount fetch after adding ADD ON is successfull please refer to the excel for complete TAX validation reference  ");
			 
		 }
		 driver.findElement(Elements.xADD_10$trash_bttn).click();
		 try {
			 Thread.sleep(1200);
			  result=driver.findElement(Elements.xADD_ONSheading_SECTION_IN_TAX).isDisplayed();
			  Assert.assertFalse(result);
			  logger.log(LogStatus.PASS, "ADD ON can be successfully deleted using delete icon  ");
		  }
		 catch(Exception e) {
			 System.out.println("removal of add on section on clicking delete button on funcard section in TAX validation has failed");	
			 logger.log(LogStatus.FAIL, "ADD ON can be successfully deleted using delete icon  ");
		 }
		 //driver.findElement(Elements.xgo_to_cart_bttn1).click();
	 }
	 
	 
	 public void verify_terms_and_conditions(WebDriver driver , ExtentTest logger) throws Exception{
		 WebDriverWait wait=new WebDriverWait(driver, 5);
		 try {
			 wait.until(ExpectedConditions.elementToBeClickable(Elements.xterms_and_conditions));
			 driver.findElement(Elements.xterms_and_conditions).click();
			 wait.until(ExpectedConditions.elementToBeClickable(Elements.xterms_and_conditions_close_bttn));
			 driver.findElement(Elements.xterms_and_conditions_close_bttn).click();
			 logger.log(LogStatus.PASS, "Terms and Conditions pop up open and close functionality");
			// ec.eLaunch(a, 0);
			// ec.eWrite(98, 11, "Pass");
		 }
		 catch(Exception e) {
			 System.out.println("terms and conditions opening validation failed");
			 logger.log(LogStatus.FAIL, "Terms and Conditions pop up open and close functionality");
			 //ec.eWrite(98, 11, "Fail");		 
		 }
		 try {
			 Thread.sleep(2000);
			 wait.until(ExpectedConditions.elementToBeClickable(Elements.xterms_and_conditions_checkbox));
			 Actions act=new Actions(driver);
			 act.moveToElement(driver.findElement(Elements.xterms_and_conditions_checkbox)).click().build().perform();
			try {
			 //Thread.sleep(2000);
			 wait.until(ExpectedConditions.elementToBeClickable(Elements.xgo_to_cart_bttn1));
			 logger.log(LogStatus.FAIL, "Terms and Conditions checkbox uncheck functionality");
			 //ec.eWrite(99, 11, "Fail");
			 }
			 catch(Exception e) {
				 //ec.eWrite(99, 11, "Pass");
				 logger.log(LogStatus.PASS, "Terms and Conditions checkbox uncheck functionality");
			 }
			 wait.until(ExpectedConditions.elementToBeClickable(Elements.xterms_and_conditions_checkbox));
			 act.moveToElement(driver.findElement(Elements.xterms_and_conditions_checkbox)).click().build().perform();
			 Thread.sleep(1500);
			 try {
				 wait.until(ExpectedConditions.elementToBeClickable(Elements.xgo_to_cart_bttn1));
				 //ec.eWrite(100, 11, "Pass");
				 logger.log(LogStatus.PASS, "Terms and Conditions checkbox check functionality");
				 driver.findElement(Elements.xgo_to_cart_bttn1).click();
				 }
				 catch(Exception e) {
					 //ec.eWrite(100, 11, "Fail");
					 logger.log(LogStatus.FAIL, "Terms and Conditions checkbox check functionality");
				 }
		}
		 catch(Exception e) {
			 System.out.println("terms and conditions checkbox validation failed");
			 logger.log(LogStatus.FAIL, "Terms and Conditions checkbox functionality");
			 //ec.eWrite(99, 11, "Fail");
			 //ec.eWrite(100, 11,"Fail");
		 }
	 }
}
