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

import Bowling_common_flow.Bowling_failure_screen_shot;
import excelconnect.excelconnect;

public class Checkout_register_page_validations {

	WebDriver driver;
	static DataConfig data;
	static JavascriptExecutor js;
	static boolean result=false;
	static Bowling_failure_screen_shot ss=new Bowling_failure_screen_shot();
	public static void verify_register_page(WebDriver driver) throws Exception {
		  WebDriverWait wait=new WebDriverWait(driver, 60);
		  String testDataPath = PropertiesFile.getDataFromProperty("TestData");
		  data = new DataConfig(testDataPath);
		  excelconnect ec=new excelconnect();
		  String a="\\C:\\Users\\698531\\Desktop\\Automation Regression test case suit\\ME One Test Cases - Automation - Regression V2 - Copy.xlsx\\";
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
				  ec.eLaunch(a, 0);
				  ec.eWrite(106, 11, "Pass");
				  driver.findElement(Elements.xfirstname1).sendKeys("$12#");
				  String firstname=driver.findElement(Elements.xfirstname1).getText();
				  int result2=firstname.compareToIgnoreCase("$12#");
				  driver.findElement(Elements.xlastname).sendKeys("$12#");
				  String lastname=driver.findElement(Elements.xlastname).getText();
				  int result3=lastname.compareToIgnoreCase("$12#");
				  if(result2==0) {
					  ec.eLaunch(a, 0);
					  ec.eWrite(108, 11, "Fail");
				  }
				  else if(result3==0) {
					  ec.eLaunch(a, 0);
					  ec.eWrite(108, 11, "Fail");
				  }
				  else {
					  ec.eLaunch(a, 0);
					  ec.eWrite(108, 11, "Pass");
				  }
				  driver.findElement(Elements.xfirstname1).sendKeys(data.getData(1, 22, 1));
				  driver.findElement(Elements.xlastname).sendKeys(data.getData(1, 22, 2));
				  ec.eLaunch(a, 0);
				  ec.eWrite(107, 11, "Pass");
			  }
			  catch(AssertionError e){
				  ec.eLaunch(a, 0);
				  ec.eWrite(106, 11, "Fail");
				  ec.eWrite(107, 11, "Fail");
			  }
			 
			try {
				  result=driver.findElement(Elements.xemail_checkout).isDisplayed();
				  Assert.assertTrue(result);
				  ec.eLaunch(a, 0);
				  ec.eWrite(109, 11, "Pass");	  
				  driver.findElement(Elements.xemail_checkout).sendKeys("test");
				  driver.findElement(Elements.xph_no_checkout).click();
				  result=driver.findElement(Elements.xinvalid_email_mssg).isDisplayed();
				  Assert.assertTrue(result);
				  ec.eLaunch(a, 0);
				  ec.eWrite(111, 11, "Pass");
				  driver.findElement(Elements.xemail_checkout).clear();
				  driver.findElement(Elements.xemail_checkout).sendKeys(data.getData(1, 22, 3));
				  ec.eLaunch(a, 0);
				  ec.eWrite(110, 11, "Pass");
		         }
			  catch(AssertionError e){
				  ec.eLaunch(a, 0);
				  ec.eWrite(109, 11, "Fail");
				  ec.eWrite(111, 11, "Fail");
				  ec.eWrite(110, 11, "Fail");
			      }
			  try {
				  result=driver.findElement(Elements.xph_no_checkout).isDisplayed();
				  Assert.assertTrue(result);
				  ec.eLaunch(a, 0);
				  ec.eWrite(112, 11, "Pass");	  
				  driver.findElement(Elements.xph_no_checkout).sendKeys("$Aab");
				  String ph_number=driver.findElement(Elements.xph_no_checkout).getText();
				  int result3=ph_number.compareToIgnoreCase("$12#");
				  if(result3==0) {
					  ec.eLaunch(a, 0);
					  ec.eWrite(108, 11, "Fail");
				  }
				  else {
					  ec.eLaunch(a, 0);
					  ec.eWrite(108, 11, "Pass");
				  }
			  }
			  catch(AssertionError e) {
				  ec.eLaunch(a, 0);
				  ec.eWrite(112, 11, "Fail");	
				  ec.eWrite(108, 11, "Fail");
			  }
			  try {
				  result=driver.findElement(Elements.xgo_to_payment_bttn).isEnabled();
				  Assert.assertTrue(result);
				  driver.findElement(Elements.xgo_to_payment_bttn).click();
				  ec.eLaunch(a, 0);
				  ec.eWrite(127, 11, "Pass");	  
				  result=Verify.Compare.verifyURL(driver, "https://mainevent.cognizantorderserv.com/checkout/payment");
				  Assert.assertTrue(result);
				  ec.eLaunch(a, 0);
				  ec.eWrite(128, 11, "Pass");
			  }
			  catch(AssertionError e) {
				  ec.eLaunch(a, 0);
				  ec.eWrite(127, 11, "Fail");	
				  ec.eWrite(128, 11, "Fail");
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
						  ec.eLaunch(a, 0);
						  ec.eWrite(106, 11, "Pass");
						  driver.findElement(Elements.xfirstname1).sendKeys("$12#");
						  String firstname=driver.findElement(Elements.xfirstname1).getText();
						  int result2=firstname.compareToIgnoreCase("$12#");
						  driver.findElement(Elements.xlastname).sendKeys("$12#");
						  String lastname=driver.findElement(Elements.xlastname).getText();
						  int result3=lastname.compareToIgnoreCase("$12#");
						  if(result2==0) {
							  ec.eLaunch(a, 0);
							  ec.eWrite(108, 11, "Fail");
						  }
						  else if(result3==0) {
							  ec.eLaunch(a, 0);
							  ec.eWrite(108, 11, "Fail");
						  }
						  else {
							  ec.eLaunch(a, 0);
							  ec.eWrite(108, 11, "Pass");
						  }
						  driver.findElement(Elements.xfirstname1).sendKeys(data.getData(1, 22, 1));
						  driver.findElement(Elements.xlastname).sendKeys(data.getData(1, 22, 2));
						  ec.eLaunch(a, 0);
						  ec.eWrite(107, 11, "Pass");
					  }
					  catch(AssertionError e1){
						  ec.eLaunch(a, 0);
						  ec.eWrite(106, 11, "Fail");
						  ec.eWrite(107, 11, "Fail");
					  }
					 
					try {
						  result=driver.findElement(Elements.xemail_checkout).isDisplayed();
						  Assert.assertTrue(result);
						  ec.eLaunch(a, 0);
						  ec.eWrite(109, 11, "Pass");	  
						  driver.findElement(Elements.xemail_checkout).sendKeys("test");
						  result=driver.findElement(Elements.xinvalid_email_mssg).isDisplayed();
						  Assert.assertTrue(result);
						  ec.eLaunch(a, 0);
						  ec.eWrite(111, 11, "Pass");
						  driver.findElement(Elements.xemail_checkout).sendKeys(data.getData(1, 22, 3));
						  ec.eLaunch(a, 0);
						  ec.eWrite(110, 11, "Pass");
				         }
					  catch(AssertionError e1){
						  ec.eLaunch(a, 0);
						  ec.eWrite(109, 11, "Fail");
						  ec.eWrite(111, 11, "Fail");
						  ec.eWrite(110, 11, "Fail");
					      }
					  try {
						  result=driver.findElement(Elements.xph_no_checkout).isDisplayed();
						  Assert.assertTrue(result);
						  ec.eLaunch(a, 0);
						  ec.eWrite(112, 11, "Pass");	  
						  driver.findElement(Elements.xph_no_checkout).sendKeys("$Aab");
						  String ph_number=driver.findElement(Elements.xph_no_checkout).getText();
						  int result3=ph_number.compareToIgnoreCase("$12#");
						  if(result3==0) {
							  ec.eLaunch(a, 0);
							  ec.eWrite(108, 11, "Fail");
						  }
						  else {
							  ec.eLaunch(a, 0);
							  ec.eWrite(108, 11, "Pass");
						  }
					  }
					  catch(AssertionError e1) {
						  ec.eLaunch(a, 0);
						  ec.eWrite(112, 11, "Fail");	
						  ec.eWrite(108, 11, "Fail");
					  }
					  try {
						  result=driver.findElement(Elements.xgo_to_payment_bttn).isEnabled();
						  Assert.assertTrue(result);
						  driver.findElement(Elements.xgo_to_payment_bttn).click();
						  ec.eLaunch(a, 0);
						  ec.eWrite(127, 11, "Pass");	  
						  result=Verify.Compare.verifyURL(driver, "https://www.mainevent.com/checkout/payment");
						  Assert.assertTrue(result);
						  ec.eLaunch(a, 0);
						  ec.eWrite(128, 11, "Pass");
					  }
					  catch(AssertionError e1) {
						  ec.eLaunch(a, 0);
						  ec.eWrite(127, 11, "Fail");	
						  ec.eWrite(128, 11, "Fail");
					  }
					   
				  
				  }	  		  
	} 
}
