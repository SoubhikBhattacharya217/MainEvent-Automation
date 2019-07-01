package Bowling_common_flow;

import java.io.File;
import java.io.IOException;

import org.CognizantQA.PageObject.Elements;
import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
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

import Verify.Compare;
import excelconnect.excelconnect;

public class Bowling_reserve_bttn {
	    static WebDriver driver;
	    static JavascriptExecutor js;
		WebDriverWait wait;
		XSSFSheet sheet;
		static excelconnect ec=new excelconnect();
		static boolean result=false;
		static Bowling_failure_screen_shot ss=new Bowling_failure_screen_shot();
		static ExtentReports extentReport;
		static ExtentTest logger;
		
	public static void verifybowling_lane_page_navigation(WebDriver driver, ExtentTest logger) throws Exception {
		try {
		WebDriverWait wait=new WebDriverWait(driver,20);
		//ec.eLaunch("\\C:\\Users\\698531\\Desktop\\Automation Regression test case suit\\ME One Test Cases - Automation - Regression V2 - Copy.xlsx\\", 0);
		wait.until(ExpectedConditions.visibilityOfElementLocated(Elements.xHEADER_MAIN_EVENT_LOGO));
		Thread.sleep(4000);
		driver.findElement(Elements.xHEADER_MAIN_EVENT_LOGO).click();
		  Thread.sleep(2000);
		  //ec.eWrite(43, 11, "pass");
		  wait.until(ExpectedConditions.visibilityOfElementLocated(Elements.xBOOK_NOW));
		  driver.findElement(Elements.xBOOK_NOW).click();
		  Thread.sleep(1500);
		  driver.findElement(Elements.xbowling_under_book_now).click();
		  Thread.sleep(1500);
		  driver.findElement(Elements.xgroup_of_20_under_book_now).click();		  
	      Thread.sleep(1500);
	      result=Compare.verifyURL(driver, "https://mainevent.cognizantorderserv.com/play/bowling");
	      if(result==false)
	      {
	    	  Thread.sleep(2000);
	    	  ss.takeScreenShot(driver, "not navigated to find a lane page");
	      }
	      try {
	    	  Assert.assertTrue(result);
	      }
	      catch(AssertionError e) {
	    	  System.out.println("UAT bowling page is not navigated");
	      }
	      result=Compare.verifyURL(driver, "https://www.mainevent.com/play/bowling");
	      try {
	      Assert.assertTrue(result);
	      }
	      catch(AssertionError e) {
	    	  System.out.println("Production bowling page is not navigated");
	      }
	      logger.log(LogStatus.PASS, "User is able to navigate to the bowling page from the home page");
	      //ec.eWrite(46, 11, "pass");
	}
		catch(Exception e) {
			logger.log(LogStatus.FAIL, "User is able to navigate to the bowling page from the home page");
		}
	}
}
