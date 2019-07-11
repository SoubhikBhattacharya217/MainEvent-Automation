package Common_flow;

import java.io.File;
import java.io.IOException;

import org.CognizantQA.PageObject.Elements;
import org.CognizantQA.Properties.PropertiesFile;
import org.CognizantQA.TestData.DataConfig;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
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

import Bowling_common_flow.Bowling_failure_screen_shot;
import excelconnect.excelconnect;

public class Payment_page_validations {
	WebDriver driver;
	static DataConfig data;
	static JavascriptExecutor js;
	static boolean result=false;
	static Bowling_failure_screen_shot ss=new Bowling_failure_screen_shot();
	static excelconnect ec=new excelconnect();
	static ExtentReports extentreport;
	static ExtentTest logger;
	static String a="\\C:\\Users\\698531\\Desktop\\Automation Regression test case suit\\ME One Test Cases - Automation - Regression V2 - Copy.xlsx\\";
	public static void verify_payment_page(WebDriver driver , ExtentTest logger) throws Exception {
		WebDriverWait wait=new WebDriverWait(driver, 20);
		WebElement expiry_month=driver.findElement(By.cssSelector("#payonline > div.ng-scope > form > div:nth-child(1) > div > div > div:nth-child(3) > div > div > div:nth-child(1) > div > dropdowncustom > div > div"));
		Point point1 = expiry_month.getLocation();
		 int xcord1 = point1.getX();
		 System.out.println("Position of the webelement from left side is "+xcord1 +" pixels");
		 int ycord1 = point1.getY();
		 System.out.println("Position of the webelement from top side is "+ycord1 +" pixels");
		WebElement expiry_year=driver.findElement(By.cssSelector("#payonline > div.ng-scope > form > div:nth-child(1) > div > div > div:nth-child(3) > div > div > div:nth-child(2) > div > dropdowncustom > div > div"));
		Point point2 = expiry_year.getLocation();
		 int xcord2 = point2.getX();
		 System.out.println("Position of the Year webelement from left side is "+xcord2 +" pixels");
		 int ycord2 = point2.getY();
		 System.out.println("Position of the Year webelement from top side is "+ycord2 +" pixels");
		String testDataPath = PropertiesFile.getDataFromProperty("TestData");
        data = new DataConfig(testDataPath);
       try {
          wait.until(ExpectedConditions.urlToBe("https://mainevent.cognizantorderserv.com/checkout/payment"));	
          //ec.eLaunch(a, 0);
          //ec.eWrite(193, 11, "Pass");
   		  result=driver.findElement(Elements.xmake_payment_bttn).isDisplayed();
   		  Assert.assertTrue(result);
   		  logger.log(LogStatus.PASS, "user is able to view make payment button");
   		  try {
   			 driver.findElement(Elements.xnamefield_card).sendKeys(data.getData(1, 26, 0));
   			 logger.log(LogStatus.PASS, "User is able to enter credentials in name on card field");
      		  result=driver.findElement(Elements.xmake_payment_bttn).isEnabled();
      		  Assert.assertFalse(result);
      		  logger.log(LogStatus.PASS,"Make payment button remains inactive when only name on card field ios filled");
   		  }
   		  catch(Exception e) {
   			logger.log(LogStatus.FAIL, "User is able to enter credentials in name on card field");
   			logger.log(LogStatus.FAIL,"Make payment button remains inactive when only name on card field is filled");
   		  }
   		 try {
   			driver.findElement(Elements.xcard_no).sendKeys(data.getData(1, 26, 1));
   			logger.log(LogStatus.PASS, "User is able to enter credentials in card number field");
     		  result=driver.findElement(Elements.xmake_payment_bttn).isEnabled();
     		  Assert.assertFalse(result);
     		 logger.log(LogStatus.PASS,"Make payment button remains inactive when only name on card and card number field is filled");
   		 }
   		  catch(Exception e) {
   			logger.log(LogStatus.FAIL, "User is able to enter credentials in card number field"); 
   		 logger.log(LogStatus.FAIL,"Make payment button remains inactive when only name on card and card number field is filled");
   		  }
   		  Thread.sleep(4000);
   		  ///////////////////////////////
   		  try {
          new Actions(driver).moveToElement(expiry_month).click().build().perform();
   		  driver.findElement(Elements.xexpiry_month2).click();
   		  result=driver.findElement(Elements.xmake_payment_bttn).isEnabled();
   		  Assert.assertFalse(result);
   		  logger.log(LogStatus.PASS, "User is able to enter expiry month for card");
   		  }
   		  catch(Exception e) {
   			logger.log(LogStatus.FAIL, "User is able to enter expiry month for card");
   		  }
   		  try {
   		  new Actions(driver).moveToElement(expiry_year).click().build().perform();
   		  driver.findElement(Elements.xexpiry_year2).click();
   		  result=driver.findElement(Elements.xmake_payment_bttn).isEnabled();
   		  Assert.assertFalse(result);
   		  logger.log(LogStatus.PASS, "User is able to enter expiry year for card");
   		  }
   		  catch(Exception e) {
   			logger.log(LogStatus.FAIL, "User is able to enter expiry year for card");  
   		  }
   		  driver.findElement(Elements.xCVV).sendKeys("123");	  
   		  try {
   			  driver.findElement(Elements.xzipcode).sendKeys("700110");
   			logger.log(LogStatus.PASS, "User is able to enter zipcode field with valid credentials");
   		  }
   		  catch(Exception e) {
   			logger.log(LogStatus.FAIL, "User is able to enter zipcode field with valid credentials");
   		  }
   		  result=driver.findElement(Elements.xmake_payment_bttn).isEnabled();
   		  if(result==false)
   	      {
   			logger.log(LogStatus.FAIL, "Make Payment button remains inactive even when all required field is filled with valid credentials"); 
   	    	  Thread.sleep(2000);
   	    	  ss.takeScreenShot(driver, "make payment button is not clikable");
   	      }
   		  Assert.assertTrue(result);
   		logger.log(LogStatus.PASS, "Make Payment button remains active when all required field is filled with valid credentials");
   		  driver.findElement(Elements.xmake_payment_bttn).click();
   	  }
     catch(Exception e) {
    	  wait.until(ExpectedConditions.urlToBe("https://www.mainevent.com/checkout/payment"));	
    	  result=driver.findElement(Elements.xmake_payment_bttn).isDisplayed();
   		  Assert.assertTrue(result);
   		  logger.log(LogStatus.PASS, "user is able to view make payment button");
   		  try {
   			 driver.findElement(Elements.xnamefield_card).sendKeys(data.getData(1, 26, 0));
   			 logger.log(LogStatus.PASS, "User is able to enter credentials in name on card field");
      		  result=driver.findElement(Elements.xmake_payment_bttn).isEnabled();
      		  Assert.assertFalse(result);
      		  logger.log(LogStatus.PASS,"Make payment button remains inactive when only name on card field ios filled");
   		  }
   		  catch(Exception e1) {
   			logger.log(LogStatus.FAIL, "User is able to enter credentials in name on card field");
   			logger.log(LogStatus.FAIL,"Make payment button remains inactive when only name on card field is filled");
   		  }
   		 try {
   			driver.findElement(Elements.xcard_no).sendKeys(data.getData(1, 26, 1));
   			logger.log(LogStatus.PASS, "User is able to enter credentials in card number field");
     		  result=driver.findElement(Elements.xmake_payment_bttn).isEnabled();
     		  Assert.assertFalse(result);
     		 logger.log(LogStatus.PASS,"Make payment button remains inactive when only name on card and card number field is filled");
   		 }
   		  catch(Exception e1) {
   			logger.log(LogStatus.FAIL, "User is able to enter credentials in card number field"); 
   		 logger.log(LogStatus.FAIL,"Make payment button remains inactive when only name on card and card number field is filled");
   		  }
   		  Thread.sleep(4000);
   		  driver.findElement(Elements.xexpiry_month1).click();
   		  driver.findElement(Elements.xexpiry_month2).click();
   		  result=driver.findElement(Elements.xmake_payment_bttn).isEnabled();
   		  Assert.assertFalse(result);
   		  driver.findElement(Elements.xexpiry_year1).click();
   		  driver.findElement(Elements.xexpiry_year2).click();
   		  result=driver.findElement(Elements.xmake_payment_bttn).isEnabled();
   		  Assert.assertFalse(result);
   		  driver.findElement(Elements.xCVV).sendKeys("123");	  
   		  try {
   			  driver.findElement(Elements.xzipcode).sendKeys("70110");
   			logger.log(LogStatus.PASS, "User is able to enter zipcode field with valid credentials");
   		  }
   		  catch(Exception e1) {
   			logger.log(LogStatus.FAIL, "User is able to enter zipcode field with valid credentials");
   		  }
   		  result=driver.findElement(Elements.xmake_payment_bttn).isEnabled();
   		  if(result==false)
   	      {
   			logger.log(LogStatus.FAIL, "Make Payment button remains inactive even when all required field is filled with valid credentials"); 
   	    	  Thread.sleep(2000);
   	    	  ss.takeScreenShot(driver, "make payment button is not clikable");
   	      }
   		  Assert.assertTrue(result);
   		logger.log(LogStatus.PASS, "Make Payment button remains active when all required field is filled with valid credentials");
   		  driver.findElement(Elements.xmake_payment_bttn).click();
     }
       }
		  
}
