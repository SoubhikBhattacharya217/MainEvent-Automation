package Bowling_common_flow;

import java.io.File;

import org.CognizantQA.PageObject.Elements;
import org.CognizantQA.Properties.PropertiesFile;
import org.CognizantQA.TestData.DataConfig;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import excelconnect.excelconnect;

public class Location_search_functionality_validations {

	WebDriver driver;
	static boolean result=false;
	static DataConfig data;
	static Bowling_failure_screen_shot ss=new Bowling_failure_screen_shot();
	static String a="\\C:\\Users\\698531\\Desktop\\Automation Regression test case suit\\ME One Test Cases - Automation - Regression V2 - Copy.xlsx\\";
	static ExtentReports extentReport;
	static ExtentTest logger;
	public static void location_validations(WebDriver driver, ExtentTest logger) throws Exception {
		WebDriverWait wait=new WebDriverWait(driver, 60);
		excelconnect ec=new excelconnect();
		String testDataPath = PropertiesFile.getDataFromProperty("TestData");
        data = new DataConfig(testDataPath);
        wait.until(ExpectedConditions.visibilityOfElementLocated(Elements.xlocationsearchbar2));
        Thread.sleep(3000);
	    driver.findElement(Elements.xlocationsearchbar2).clear();
	      //Thread.sleep(3000);
	      driver.findElement(Elements.xlocationsearchbar2).sendKeys("m");
	      driver.findElement(Elements.xlocationsearchbar2).sendKeys(Keys.BACK_SPACE);
	      //Thread.sleep(3000);
	      driver.findElement(Elements.xexternalclickfindpage).click();
	      result=driver.findElement(Elements.xinactivetype_city_field).isDisplayed();
	      if(result==false)
	      {
	    	  Thread.sleep(2000);
	    	  ss.takeScreenShot(driver, "issue");
	      }
	      Assert.assertTrue(result);
	      driver.findElement(Elements.xinactivetype_city_field).click();
	      result=driver.findElement(Elements.xactivetype_city_field).isDisplayed();//done
	      if(result==false)
	      {
	    	  Thread.sleep(2000);
	    	  ss.takeScreenShot(driver, "issue");
	      }
	      Assert.assertTrue(result);
	      result=driver.findElement(Elements.xfind_a_mainevent_bttn1).isDisplayed();
	      if(result==false)
	      {
	    	  Thread.sleep(2000);
	    	  ss.takeScreenShot(driver, "find a main event button is not visible");
	      }
	      Assert.assertTrue(result);
	      result=driver.findElement(Elements.xfind_a_mainevent_bttn1).isEnabled();
	      if(result==true)
	      {
	    	  Thread.sleep(2000);
	    	  ss.takeScreenShot(driver, "find a main event button is enabled without giving anything in the search location field");
	      }
	      Assert.assertFalse(result);
	      //ec.eLaunch(a, 0);
	      //ec.eWrite(47, 11, "pass");
	      try {
	      logger.log(LogStatus.PASS, "User is asked to provide enter lcoation before navigating to the booking page."); 
	      driver.findElement(Elements.xcity_field).sendKeys(data.getData(1, 19, 1));
	      logger.log(LogStatus.PASS, "User is able to give valid location name in the location search box"); 
	      driver.findElement(Elements.xcity_field).sendKeys(Keys.DOWN);
	      logger.log(LogStatus.PASS, "User is able to give select location name from the drop down"); 
	      driver.findElement(Elements.xcity_field).click();
	      Thread.sleep(3000);
	      //ec.eWrite(50, 11, "pass");
	      //ec.eWrite(51, 11, "pass");
	      //ec.eWrite(52, 11, "pass");
	      //ec.eWrite(53, 11, "pass");
	      //WebElement.sendKeys(Keys.DOWN, Keys.RETURN);
	      driver.findElement(Elements.xexternalclickfindpage1).click();
	      }
	      catch(Exception e) {
	    	  logger.log(LogStatus.FAIL, "User is asked to provide enter lcoation before navigating to the booking page."); 
	    	  logger.log(LogStatus.FAIL, "User is able to give valid location name in the location search box");
	    	  logger.log(LogStatus.FAIL, "User is able to give select location name from the drop down"); 
	      }
	      Thread.sleep(3000);
	      result=driver.findElement(Elements.xfind_a_mainevent_bttn1).isEnabled();
	      if(result==false)
	      {
	    	  Thread.sleep(2000);
	    	  logger.log(LogStatus.FAIL, "FIND A MAINEVENT button is not getting activated on giving valid location in location search box"); 
	      }
	      Assert.assertTrue(result);
	      logger.log(LogStatus.PASS, "FIND A MAINEVENT button is getting activated on giving valid location in location search box"); 
	      //ec.eWrite(54, 11, "pass");
	      driver.findElement(Elements.xfind_a_mainevent_bttn1).click();
	      //ec.eWrite(55, 11, "pass");
	      Thread.sleep(3000);      
	     /* driver.findElement(Elements1.xstorepopup).click();
	  	((JavascriptExecutor)driver).executeScript("scroll(0,550)");*/
	}
	}

