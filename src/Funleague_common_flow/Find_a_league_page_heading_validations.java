package Funleague_common_flow;

import java.io.File;
import java.io.IOException;

import org.CognizantQA.PageObject.Elements;
import org.CognizantQA.Properties.PropertiesFile;
import org.CognizantQA.TestData.DataConfig;
import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Bowling_common_flow.Bowling_failure_screen_shot;
import Verify.Compare;

public class Find_a_league_page_heading_validations {
	static WebDriver driver;
	static boolean result=false;
	static DataConfig data;
	static JavascriptExecutor js;
	WebDriverWait wait;
	XSSFSheet sheet;
	static Bowling_failure_screen_shot ss=new Bowling_failure_screen_shot();
	public void verify_funleague_findpage_byclick(WebDriver driver) throws Exception {
		String testDataPath = PropertiesFile.getDataFromProperty("TestData");
        data = new DataConfig(testDataPath);
        WebDriverWait wait=new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.urlToBe("https://mepreprod.cognizantorderserv.com/findALeague/find/"));
		result=Compare.verifyURL(driver, "https://mepreprod.cognizantorderserv.com/findALeague/find/");
	      if(result==false)
	      {
	    	  ss.takeScreenShot(driver, "find a league page is not successfully navigated");
	      }
	      Assert.assertTrue(result);
	      result=driver.findElement(Elements.xfind_fun_league_heading1).isDisplayed();
	      if(result==false)
	      {
	    	 ss.takeScreenShot(driver, "heading 1 in find a league page is not displayed");
	      }
	      Assert.assertTrue(result);
	      result=driver.findElement(Elements.xfind_fun_league_heading2).isDisplayed();
	      if(result==false)
	      {
	    	  ss.takeScreenShot(driver, "heading 2 in find a league page is not displayed");
	      }
	      Assert.assertTrue(result);
	      result=driver.findElement(Elements.xfind_fun_league_heading3).isDisplayed();
	      if(result==false)
	      {
	    	  ss.takeScreenShot(driver, "heading 3 in find a league page is not displayed");
	      }
	      Assert.assertTrue(result);
	      result=driver.findElement(Elements.xfind_fun_league_heading4).isDisplayed();
	      if(result==false)
	      {
	    	  ss.takeScreenShot(driver, "heading 4 in find a league page is not displayed");
	      }
	      Assert.assertTrue(result);
}
}
