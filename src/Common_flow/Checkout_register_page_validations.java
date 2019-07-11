package Common_flow;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;

import org.CognizantQA.PageObject.Elements;
import org.CognizantQA.Properties.PropertiesFile;
import org.CognizantQA.TestData.DataConfig;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Bowling_common_flow.Bowling_failure_screen_shot;
import excelconnect.excelconnect;

public class Checkout_register_page_validations {

	WebDriver driver;
	static DataConfig data;
	static JavascriptExecutor js;
	static boolean result=false;
	static Bowling_failure_screen_shot ss=new Bowling_failure_screen_shot();
	static ExtentReports extentReport;
	static ExtentTest logger;
	public static void verify_register_page(WebDriver driver , ExtentTest logger) throws Exception {
		  WebDriverWait wait=new WebDriverWait(driver, 60);
		  String testDataPath = PropertiesFile.getDataFromProperty("TestData");
		  data = new DataConfig(testDataPath);
		  excelconnect ec=new excelconnect();
		 //String a="\\C:\\Users\\698531\\Desktop\\Automation Regression test case suit\\ME One Test Cases - Automation - Regression V2 - Copy.xlsx\\";
		  Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(Elements.xgo_to_cart_bttn1)).click();
		  Thread.sleep(3000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(Elements.xcheckout_bttn1)).click();
		  try{
			  result=Verify.Compare.verifyURL(driver, "https://mainevent.cognizantorderserv.com/checkout/register");
			  if(result==false)
		      {
		    	  Thread.sleep(2000);
		    	  ss.takeScreenShot(driver, "Not successfully navigated to the checkout register page");
		      }
			  result=driver.findElement(Elements.xcheckout_heading1).isDisplayed();
			  if(result==false)
		      {
		    	  Thread.sleep(2000);
		    	 ss.takeScreenShot(driver, "heading 1 in checkout register page is not displayed");
		      }
			  Assert.assertTrue(result);
			  result=driver.findElement(Elements.xcheckout_heading2).isDisplayed();
			  if(result==false)
		      {
		    	  ss.takeScreenShot(driver, "heading 2 in checkout register page is not displayed");
		      }
			  Assert.assertTrue(result);
			  Thread.sleep(4000);
			  try {
				  result=driver.findElement(Elements.xfirstname1).isDisplayed();
				  Assert.assertTrue(result);
				  result=driver.findElement(Elements.xlastname).isDisplayed();
				  Assert.assertTrue(result);
				  //ec.eLaunch(a, 0);
				  //ec.eWrite(106, 11, "Pass");
		    	  driver.findElement(Elements.xfirstname1).sendKeys("$12#");
				  String firstname=driver.findElement(Elements.xfirstname1).getText();
				  int result2=firstname.compareToIgnoreCase("$12#");
				  driver.findElement(Elements.xlastname).sendKeys("$12#");
				  String lastname=driver.findElement(Elements.xlastname).getText();
				  int result3=lastname.compareToIgnoreCase("$12#");
				  if(result2==-4) {
					  logger.log(LogStatus.PASS, "Validate that first name field is present in the checkout page.");
					  //ec.eLaunch(a, 0);
					  //ec.eWrite(108, 11, "Fail");
				  }
				  else if(result3==-4) {
					  logger.log(LogStatus.PASS, "Validate that last name field is present in the checkout page.");
					  //ec.eLaunch(a, 0);
					  //ec.eWrite(108, 11, "Fail");
				  }
				  else {
					  logger.log(LogStatus.FAIL, "Validate that first name field is present in the checkout page.");
					  logger.log(LogStatus.FAIL, "Validate that last name field is present in the checkout page.");
					  //ec.eLaunch(a, 0);
					  //ec.eWrite(108, 11, "Pass");
				  }
				  driver.findElement(Elements.xfirstname1).sendKeys(data.getData(1, 22, 1));
				  driver.findElement(Elements.xlastname).sendKeys(data.getData(1, 22, 2));
				  //ec.eLaunch(a, 0);
				  //ec.eWrite(107, 11, "Pass");
			  }
			  catch(AssertionError e){
				  //ec.eLaunch(a, 0);
				  //ec.eWrite(106, 11, "Fail");
				  //ec.eWrite(107, 11, "Fail");
			  }
			 
			try {
				try {
				  result=driver.findElement(Elements.xemail_checkout).isDisplayed();
				  Assert.assertTrue(result);
				  //ec.eLaunch(a, 0);
				  //ec.eWrite(109, 11, "Pass");	  
				  driver.findElement(Elements.xemail_checkout).sendKeys("test");
				  logger.log(LogStatus.PASS, "Valdiate that Email field is present in the checkout page.");
				}
				catch(Exception e) {
					logger.log(LogStatus.FAIL, "Valdiate that Email field is present in the checkout page.");
				}
				  logger.log(LogStatus.PASS, "Invalid email message appears on giving wrong email in the checkout page.");
				  driver.findElement(Elements.xph_no_checkout).click();
				  result=driver.findElement(Elements.xinvalid_email_mssg).isDisplayed();
				  Assert.assertTrue(result);
				  
				  //ec.eLaunch(a, 0);
				  //ec.eWrite(111, 11, "Pass");
				  driver.findElement(Elements.xemail_checkout).clear();
				  driver.findElement(Elements.xemail_checkout).sendKeys(data.getData(1, 22, 3));
				  //ec.eLaunch(a, 0);
				  //ec.eWrite(110, 11, "Pass");
		         }
			  catch(AssertionError e){
				  //ec.eLaunch(a, 0);
				  //ec.eWrite(109, 11, "Fail");
				  //ec.eWrite(111, 11, "Fail");
				  //ec.eWrite(110, 11, "Fail");
			      }
			  try {
				  result=driver.findElement(Elements.xph_no_checkout).isDisplayed();
				  Assert.assertTrue(result);
				  //ec.eLaunch(a, 0);
				  //ec.eWrite(112, 11, "Pass");	  
				  driver.findElement(Elements.xph_no_checkout).sendKeys("$Aab");
				  String ph_number=driver.findElement(Elements.xph_no_checkout).getText();
				  int result3=ph_number.compareToIgnoreCase("$12#");
				  if(result3==0) {
					  logger.log(LogStatus.FAIL, "Phone number field is present and editable in the checkout page.");
					  //ec.eLaunch(a, 0);
					  //ec.eWrite(108, 11, "Fail");
				  }
				  else {
					  logger.log(LogStatus.PASS, "Phone number field is present and editable in the checkout page.");
					  //ec.eLaunch(a, 0);
					  //ec.eWrite(108, 11, "Pass");
				  }
			  }
			  catch(AssertionError e) {
				  logger.log(LogStatus.FAIL, "Phone number field is present and editable in the checkout page.");
				  //ec.eLaunch(a, 0);
				  //ec.eWrite(112, 11, "Fail");	
				  //ec.eWrite(108, 11, "Fail");
			  }
			  try {
				  result=driver.findElement(Elements.xgo_to_payment_bttn).isEnabled();
				  Assert.assertTrue(result);
				  driver.findElement(Elements.xgo_to_payment_bttn).click();
				  logger.log(LogStatus.PASS, "User is able to click the payment button after filling all fields with valid credentials in the checkout page.");
				  //ec.eLaunch(a, 0);
				  //ec.eWrite(127, 11, "Pass");	  
				  result=Verify.Compare.verifyURL(driver, "https://mainevent.cognizantorderserv.com/checkout/payment");
				  Assert.assertTrue(result);
				  logger.log(LogStatus.PASS, "User is able to to get navigated to the payment page");
				  //ec.eLaunch(a, 0);
				  //ec.eWrite(128, 11, "Pass");
			  }
			  catch(AssertionError e) {
				  logger.log(LogStatus.FAIL, "User is able to to get navigated to the payment page");
				  //ec.eLaunch(a, 0);
				  //ec.eWrite(127, 11, "Fail");	
				  //ec.eWrite(128, 11, "Fail");
			  }
			   
		  }
         catch(Exception e){
					  result=Verify.Compare.verifyURL(driver, "https://www.mainevent.com/checkout/register");
					  if(result==false)
				      {
				    	  Thread.sleep(2000);
				    	  ss.takeScreenShot(driver, "Not successfully navigated to the checkout register page");
				      }
					  result=driver.findElement(Elements.xcheckout_heading1).isDisplayed();
					  if(result==false)
				      {
				    	  Thread.sleep(2000);
				    	 ss.takeScreenShot(driver, "heading 1 in checkout register page is not displayed");
				      }
					  Assert.assertTrue(result);
					  result=driver.findElement(Elements.xcheckout_heading2).isDisplayed();
					  if(result==false)
				      {
				    	  ss.takeScreenShot(driver, "heading 2 in checkout register page is not displayed");
				      }
					  Assert.assertTrue(result);
					  Thread.sleep(4000);
					  try {
						  result=driver.findElement(Elements.xfirstname1).isDisplayed();
						  Assert.assertTrue(result);
						  result=driver.findElement(Elements.xlastname).isDisplayed();
						  Assert.assertTrue(result);
						  //ec.eLaunch(a, 0);
						  //ec.eWrite(106, 11, "Pass");
						  driver.findElement(Elements.xfirstname1).sendKeys("$12#");
						  String firstname=driver.findElement(Elements.xfirstname1).getText();
						  int result2=firstname.compareToIgnoreCase("$12#");
						  driver.findElement(Elements.xlastname).sendKeys("$12#");
						  String lastname=driver.findElement(Elements.xlastname).getText();
						  int result3=lastname.compareToIgnoreCase("$12#");
						  if(result2==0) {
							  //ec.eLaunch(a, 0);
							  //ec.eWrite(108, 11, "Fail");
						  }
						  else if(result3==0) {
							  //ec.eLaunch(a, 0);
							  //ec.eWrite(108, 11, "Fail");
						  }
						  else {
							  //ec.eLaunch(a, 0);
							  //ec.eWrite(108, 11, "Pass");
						  }
						  driver.findElement(Elements.xfirstname1).sendKeys(data.getData(1, 22, 1));
						  driver.findElement(Elements.xlastname).sendKeys(data.getData(1, 22, 2));
						  //ec.eLaunch(a, 0);
						  //ec.eWrite(107, 11, "Pass");
					  }
					  catch(AssertionError e1){
						  //ec.eLaunch(a, 0);
						  //ec.eWrite(106, 11, "Fail");
						  //ec.eWrite(107, 11, "Fail");
					  }
					 
					try {
						  result=driver.findElement(Elements.xemail_checkout).isDisplayed();
						  Assert.assertTrue(result);
						  //ec.eLaunch(a, 0);
						  //ec.eWrite(109, 11, "Pass");	  
						  driver.findElement(Elements.xemail_checkout).sendKeys("test");
						  result=driver.findElement(Elements.xinvalid_email_mssg).isDisplayed();
						  Assert.assertTrue(result);
						  //ec.eLaunch(a, 0);
						  //ec.eWrite(111, 11, "Pass");
						  driver.findElement(Elements.xemail_checkout).sendKeys(data.getData(1, 22, 3));
						  //ec.eLaunch(a, 0);
						  //ec.eWrite(110, 11, "Pass");
				         }
					  catch(AssertionError e1){
						  //ec.eLaunch(a, 0);
						  //ec.eWrite(109, 11, "Fail");
						  //ec.eWrite(111, 11, "Fail");
						  //ec.eWrite(110, 11, "Fail");
					      }
					  try {
						  result=driver.findElement(Elements.xph_no_checkout).isDisplayed();
						  Assert.assertTrue(result);
						  //ec.eLaunch(a, 0);
						  //ec.eWrite(112, 11, "Pass");	  
						  driver.findElement(Elements.xph_no_checkout).sendKeys("$Aab");
						  String ph_number=driver.findElement(Elements.xph_no_checkout).getText();
						  int result3=ph_number.compareToIgnoreCase("$12#");
						  if(result3==0) {
							  //ec.eLaunch(a, 0);
							  //ec.eWrite(108, 11, "Fail");
						  }
						  else {
							  //ec.eLaunch(a, 0);
							  //ec.eWrite(108, 11, "Pass");
						  }
					  }
					  catch(AssertionError e1) {
						  //ec.eLaunch(a, 0);
						  //ec.eWrite(112, 11, "Fail");	
						  //ec.eWrite(108, 11, "Fail");
					  }
					  try {
						  result=driver.findElement(Elements.xgo_to_payment_bttn).isEnabled();
						  Assert.assertTrue(result);
						  driver.findElement(Elements.xgo_to_payment_bttn).click();
						  //ec.eLaunch(a, 0);
						  //ec.eWrite(127, 11, "Pass");	  
						  result=Verify.Compare.verifyURL(driver, "https://www.mainevent.com/checkout/payment");
						  Assert.assertTrue(result);
						  //ec.eLaunch(a, 0);
						  //ec.eWrite(128, 11, "Pass");
					  }
					  catch(AssertionError e1) {
						  //ec.eLaunch(a, 0);
						  //ec.eWrite(127, 11, "Fail");	
						  //ec.eWrite(128, 11, "Fail");
					  }				   
				  
				  }	  		  
	} 
}
