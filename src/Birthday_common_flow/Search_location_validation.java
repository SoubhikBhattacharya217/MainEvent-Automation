package Birthday_common_flow;

import org.CognizantQA.PageObject.Elements;
import org.CognizantQA.Properties.PropertiesFile;
import org.CognizantQA.TestData.DataConfig;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Funleague_common_flow.Funleague_failure_screenshots;
import excelconnect.excelconnect;

public class Search_location_validation {
	WebDriver driver;
	static boolean result=false;
	static DataConfig data;
	static excelconnect ec=new excelconnect();
	//String a="\\C:\\Users\\698531\\Desktop\\Automation Regression test case suit\\ME One Test Cases - Automation - Regression V2 - Copy.xlsx\\";
	static Bday_booking_failure_screen_shots ss=new Bday_booking_failure_screen_shots();
	public void werify_search_location(WebDriver driver) throws Exception {
		WebDriverWait wait=new WebDriverWait(driver, 60);
		String testDataPath = PropertiesFile.getDataFromProperty("TestData");
        data = new DataConfig(testDataPath);
        wait.until(ExpectedConditions.visibilityOfElementLocated(Elements.xlocationsearchbar));
        Thread.sleep(3000);
	    driver.findElement(Elements.xlocationsearchbar).clear();
	      //Thread.sleep(3000);
	      driver.findElement(Elements.xlocationsearchbar).sendKeys("m");
	      driver.findElement(Elements.xlocationsearchbar).sendKeys(Keys.BACK_SPACE);
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
	      result=driver.findElement(Elements.xactivetype_city_field2).isDisplayed();
	      if(result==false)
	      {
	    	  Thread.sleep(2000);
	    	  ss.takeScreenShot(driver, "issue");
	      }
	      Assert.assertTrue(result);
	      result=driver.findElement(Elements.xfind_mevent_bttn_bday).isDisplayed();
	      if(result==false)
	      {
	    	  Thread.sleep(2000);
	    	  ss.takeScreenShot(driver, "find main event button is not displayed");
	      }
	      Assert.assertTrue(result);
	      Thread.sleep(1500);
	      result=driver.findElement(Elements.xfind_mevent_bttn_bday).isEnabled();
	      if(result==true)
	      {
	    	  Thread.sleep(2000);
	    	  ss.takeScreenShot(driver, "find main event  button is enabled");
	      }
	      Assert.assertFalse(result);
	      driver.findElement(Elements.xcity_field2).click();
	      driver.findElement(Elements.xcity_field2).clear();
	      driver.findElement(Elements.xcity_field2).sendKeys(data.getData(1, 19, 1));
	      Thread.sleep(3000);
	      //ec.eLaunch(a, 0);
	      //ec.eWrite(150, 11, "pass");
	      driver.findElement(Elements.xexternalclickfindpage_bday).click();
	      Thread.sleep(3000);
	      result=driver.findElement(Elements.xfind_mevent_bttn_bday).isEnabled();
	      if(result==false)
	      {
	    	  Thread.sleep(2000);
	    	  ss.takeScreenShot(driver, "find main event  button is not enabled");
	      }
	      Assert.assertTrue(result);
	      driver.findElement(Elements.xfind_mevent_bttn_bday).click();
	      Thread.sleep(3000);
	}
	
}


