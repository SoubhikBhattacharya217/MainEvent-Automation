package Common_flow;

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

public class Payment_page_validations {
	WebDriver driver;
	static DataConfig data;
	static JavascriptExecutor js;
	static boolean result=false;
	static Bowling_failure_screen_shot ss=new Bowling_failure_screen_shot();
	static excelconnect ec=new excelconnect();
	static String a="\\C:\\Users\\698531\\Desktop\\Automation Regression test case suit\\ME One Test Cases - Automation - Regression V2 - Copy.xlsx\\";
	public static void verify_payment_page(WebDriver driver) throws Exception {
		WebDriverWait wait=new WebDriverWait(driver, 20);
		String testDataPath = PropertiesFile.getDataFromProperty("TestData");
        data = new DataConfig(testDataPath);
        try {
          wait.until(ExpectedConditions.urlToBe("https://mainevent.cognizantorderserv.com/checkout/payment"));	
          ec.eLaunch(a, 0);
          ec.eWrite(193, 11, "Pass");
   		  result=driver.findElement(Elements.xmake_payment_bttn).isDisplayed();
   		  Assert.assertTrue(result);
   		  driver.findElement(Elements.xnamefield_card).sendKeys(data.getData(1, 26, 0));
   		  result=driver.findElement(Elements.xmake_payment_bttn).isEnabled();
   		  Assert.assertFalse(result);
   		  driver.findElement(Elements.xcard_no).sendKeys(data.getData(1, 26, 1));
   		  result=driver.findElement(Elements.xmake_payment_bttn).isEnabled();
   		  Assert.assertFalse(result);
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
   		  result=driver.findElement(Elements.xmake_payment_bttn).isEnabled();
   		  if(result==false)
   	      {
   	    	  Thread.sleep(2000);
   	    	  ss.takeScreenShot(driver, "make payment button is not clikable");
   	      }
   		  Assert.assertTrue(result);
   		  driver.findElement(Elements.xmake_payment_bttn).click();
   	  }
     catch(Exception e) {
    	  wait.until(ExpectedConditions.urlToBe("https://www.mainevent.com/checkout/payment"));	
    	  ec.eLaunch(a, 0);
          ec.eWrite(193, 11, "Pass");
  		  result=driver.findElement(Elements.xmake_payment_bttn).isDisplayed();
  		  Assert.assertTrue(result);
  		  driver.findElement(Elements.xnamefield_card).sendKeys(data.getData(1, 26, 0));
  		  result=driver.findElement(Elements.xmake_payment_bttn).isEnabled();
  		  Assert.assertFalse(result);
  		  driver.findElement(Elements.xcard_no).sendKeys(data.getData(1, 26, 1));
  		  result=driver.findElement(Elements.xmake_payment_bttn).isEnabled();
  		  Assert.assertFalse(result);
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
  		  result=driver.findElement(Elements.xmake_payment_bttn).isEnabled();
  		  if(result==false)
  	      {
  	    	  Thread.sleep(2000);
  	    	  ss.takeScreenShot(driver, "make payment button is not clikable");
  	      }
  		  Assert.assertTrue(result);
  		  //driver.findElement(Elements.xmake_payment_bttn).click();
     }
        }
		  
}
