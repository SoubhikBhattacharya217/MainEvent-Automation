package Bowling_common_flow;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.CognizantQA.PageObject.Elements;
import org.CognizantQA.Properties.PropertiesFile;
import org.CognizantQA.TestData.DataConfig;
import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Verify.Compare;

public class Find_a_lane_page_heading_validations {
	static WebDriver driver;
	static boolean result=false;
	static DataConfig data;
	static JavascriptExecutor js;
	
	XSSFSheet sheet;
	static Bowling_failure_screen_shot ss=new Bowling_failure_screen_shot();
	static ExtentReports extentReport;
	static ExtentTest logger;
	public static void verifybowling_page_by_click(WebDriver driver,ExtentTest logger) throws Exception {
		  WebDriverWait wait=new WebDriverWait(driver,10);
		  wait.until(ExpectedConditions.elementToBeClickable(Elements.xbowling_booknow_bttn));
		  driver.findElement(Elements.xbowling_booknow_bttn).click();
		  String testDataPath = PropertiesFile.getDataFromProperty("TestData");
          data = new DataConfig(testDataPath);
          wait.until(ExpectedConditions.visibilityOfElementLocated(Elements.xfind_bowling_lane_heading1));
	      result=driver.findElement(Elements.xfind_bowling_lane_heading1).isDisplayed();
	      if(result==false)
	      {
	    	  Thread.sleep(2000);
	    	  ss.takeScreenShot(driver, "find a lane heading 1 is not displayed");
	      }
	      Assert.assertTrue(result);
	      logger.log(LogStatus.PASS, "User is able to click the BOOK NOW button situated in the BOWLING page");
	      List<WebElement> a=driver.findElements(Elements.xfind_bowling_lane_heading1);
	      for(WebElement Item:a)
	      {
	    	String a1=Item.getText();
	    	Assert.assertEquals(a1, data.getData(0, 47, 1));
	    	break;
	      }
	      result=driver.findElement(Elements.xfind_bowling_lane_heading2).isDisplayed();
	      if(result==false)
	      {
	    	  Thread.sleep(2000);
	    	  ss.takeScreenShot(driver, "find a lane heading 2 is not displayed");
	      }
	      Assert.assertTrue(result);
	      List<WebElement> b=driver.findElements(Elements.xfind_bowling_lane_heading2);
	      for(WebElement Item:b)
	      {
	    	String b1=Item.getText();
	    	Assert.assertEquals(b1, data.getData(0, 48, 1));
	    	break;
	      }
	      result=driver.findElement(Elements.xfind_bowling_lane_heading3).isDisplayed();
	      if(result==false)
	      {
	    	  Thread.sleep(2000);
	    	  ss.takeScreenShot(driver, "find a lane heading 3 is not displayed");
	      }
	      Assert.assertTrue(result);
	      List<WebElement> c=driver.findElements(Elements.xfind_bowling_lane_heading3);
	      for(WebElement Item:c)
	      {
	    	String c1=Item.getText();
	    	Assert.assertEquals(c1, data.getData(0, 49, 1));
	    	break;
	      }
	      result=driver.findElement(Elements.xfind_bowling_lane_heading4).isDisplayed();
	      if(result==false)
	      {
	    	  Thread.sleep(2000);
	    	  TakesScreenshot ts=(TakesScreenshot)driver;
	    	  ss.takeScreenShot(driver, "find a lane heading 4 is not displayed");
	      }
	      Assert.assertTrue(result);
	      List<WebElement> d=driver.findElements(Elements.xfind_bowling_lane_heading4);
	      for(WebElement Item:d)
	      {
	    	String d1=Item.getText();
	    	Assert.assertEquals(d1, data.getData(0, 50, 1));
	    	break;
	      }
	      logger.log(LogStatus.PASS, "All the headings are validated with Raw data provided in the excel sheet for FIND A BOWLING page");
}
}
