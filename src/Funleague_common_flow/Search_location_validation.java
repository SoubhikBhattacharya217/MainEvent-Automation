package Funleague_common_flow;

import java.io.File;

import org.CognizantQA.PageObject.Elements;
import org.CognizantQA.Properties.PropertiesFile;
import org.CognizantQA.TestData.DataConfig;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Bowling_common_flow.Bowling_failure_screen_shot;

public class Search_location_validation {
	WebDriver driver;
	static boolean result=false;
	static DataConfig data;
	static Funleague_failure_screenshots ss=new Funleague_failure_screenshots();
	public static void location_validations(WebDriver driver) throws Exception {
		String testDataPath = PropertiesFile.getDataFromProperty("TestData");
        data = new DataConfig(testDataPath);
        Thread.sleep(3000);
	      driver.findElement(Elements.xlocationsearchbar).clear();
	      driver.findElement(Elements.xlocationsearchbar).sendKeys("m");
	      driver.findElement(Elements.xlocationsearchbar).sendKeys(Keys.BACK_SPACE);
	      Thread.sleep(3000);
	      driver.findElement(Elements.xexternalclickfindpage).click();
	      result=driver.findElement(Elements.xinactivetype_city_field).isDisplayed();
	      if(result==false)
	      {
	    	  Thread.sleep(2000);
	    	  ss.takeScreenShot(driver, "issue");
	      }
	      Assert.assertTrue(result);
	      driver.findElement(Elements.xinactivetype_city_field).click();
	      result=driver.findElement(Elements.xactivetype_city_field).isDisplayed();
	      if(result==false)
	      {
	    	  Thread.sleep(2000);
	    	  ss.takeScreenShot(driver, "issue");
	      }
	      Assert.assertTrue(result);
	      result=driver.findElement(Elements.xfind_location).isDisplayed();
	      if(result==false)
	      {
	    	  Thread.sleep(2000);
	    	  ss.takeScreenShot(driver, "find location button is not displayed");
	      }
	      Assert.assertTrue(result);
	      result=driver.findElement(Elements.xfind_location).isEnabled();
	      if(result==true)
	      {
	    	  Thread.sleep(2000);
	    	  ss.takeScreenShot(driver, "find location button is not enabled");
	      }
	      Assert.assertFalse(result);
	      driver.findElement(Elements.xcity_field).sendKeys(data.getData(0, 19, 1));
	      Thread.sleep(3000);
	      driver.findElement(Elements.xexternalclickfindpage1).click();
	      Thread.sleep(3000);
	      result=driver.findElement(Elements.xfind_location).isEnabled();
	      if(result==false)
	      {
	    	  Thread.sleep(2000);
	    	  ss.takeScreenShot(driver, "find location button is not enabled");
	      }
	      Assert.assertTrue(result);
	      driver.findElement(Elements.xfind_location).click();
	      Thread.sleep(3000);
	}
}
