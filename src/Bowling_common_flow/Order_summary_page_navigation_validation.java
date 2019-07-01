package Bowling_common_flow;

import java.io.File;

import org.CognizantQA.PageObject.Elements;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Order_summary_page_navigation_validation {
	WebDriver driver;
	static boolean result=false;
	Bowling_failure_screen_shot ss=new Bowling_failure_screen_shot();
	static ExtentReports extentReport;
	static ExtentTest logger;
	public void verify_snavi_order_summary_page(WebDriver driver , ExtentTest logger) throws InterruptedException {   
		WebDriverWait wait=new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOfElementLocated(Elements.xgo_to_cart_bttn1));
	  result=Verify.Compare.verifyURL(driver, "https://mainevent.cognizantorderserv.com/findalane/laneordersummary");
	  if(result==false)
    {
  	  Thread.sleep(2000);
  	  ss.takeScreenShot(driver, "order summary page is not successfully navigated");
    }
	  try {		 
		  Assert.assertTrue(result);  
		  logger.log(LogStatus.PASS, "User is navigated to ORDER SUMMARY PAGE in UAT environment");
	  }
	 catch(AssertionError e) {
		 System.out.println("ordersummary page UAT url validation has failed");
		 ss.takeScreenShot(driver, "ordersummary page UAT url validation has failed");
		 logger.log(LogStatus.SKIP, "User is navigated to ORDER SUMMARY PAGE in UAT environment");
	 }
	  result=Verify.Compare.verifyURL(driver, "https://www.mainevent.com/findalane/laneordersummary");
	  if(result==false)
	    {
	  	  Thread.sleep(2000);
	  	  ss.takeScreenShot(driver, "order summary page is not successfully navigated");
	    }
		  try {	 
			  Assert.assertTrue(result);
			  logger.log(LogStatus.PASS, "User is navigated to ORDER SUMMARY PAGE in Production environment");
		  }
		 catch(AssertionError e) {
			 System.out.println("ordersummary page Production url validation has failed");
			 ss.takeScreenShot(driver, "ordersummary page Production url validation has failed");
			 logger.log(LogStatus.SKIP, "User is navigated to ORDER SUMMARY PAGE in Production environment");
		 }
}
}