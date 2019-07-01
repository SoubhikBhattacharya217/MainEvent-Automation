package Common_flow;

import java.io.File;

import org.CognizantQA.PageObject.Elements;
import org.CognizantQA.TestData.DataConfig;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Bowling_common_flow.Bowling_failure_screen_shot;
import excelconnect.excelconnect;

public class Order_summary_page_go_to_cart_bttn_validation {
	WebDriver driver;
	static DataConfig data;
	static JavascriptExecutor js;
	 static boolean result=false;
	 Bowling_failure_screen_shot ss=new Bowling_failure_screen_shot();
	 excelconnect ec=new excelconnect();
	 static String a="\\C:\\Users\\698531\\Desktop\\Automation Regression test case suit\\ME One Test Cases - Automation - Regression V2 - Copy.xlsx\\";
	 public void verify_go_to_cart_bttn(WebDriver driver) throws Exception
	 {
		 WebDriverWait wait=new WebDriverWait(driver, 20);
		 wait.until(ExpectedConditions.elementToBeClickable(Elements.xgo_to_cart_bttn1));
		 result=driver.findElement(Elements.xgo_to_cart_bttn1).isDisplayed();
		  if(result==false)
	      {
	    	  Thread.sleep(2000);
	    	 ss.takeScreenShot(driver, "go to cart button1 is not displayed in order summary page");
	      }
		  Assert.assertTrue(result);
		  result=driver.findElement(Elements.xgo_to_cart_bttn1).isEnabled();
		  if(result==false)
	      {
	    	  Thread.sleep(2000);
	    	  ss.takeScreenShot(driver, "go to cart button1 is not clickable in order summary page");
	      }
		  Assert.assertTrue(result);
	 wait.until(ExpectedConditions.elementToBeClickable(Elements.xgo_to_cart_bttn2));
	 result=driver.findElement(Elements.xgo_to_cart_bttn2).isDisplayed();
	  if(result==false)
      {
    	  Thread.sleep(2000);
    	 ss.takeScreenShot(driver, "go to cart button2 is not displayed in order summary page");
      }
	  Assert.assertTrue(result);
	  result=driver.findElement(Elements.xgo_to_cart_bttn2).isEnabled();
	  if(result==false)
      {
    	  Thread.sleep(2000);
    	  ss.takeScreenShot(driver, "go to cart button2 is not clickable in order summary page");
      }
	  Assert.assertTrue(result);
	  ec.eLaunch(a, 0);
	  ec.eWrite(86, 11, "pass");
	  wait.until(ExpectedConditions.elementToBeClickable(Elements.xcontinue_shopping_1));
		 result=driver.findElement(Elements.xcontinue_shopping_1).isDisplayed();
		  if(result==false)
	      {
	    	  Thread.sleep(2000);
	    	 ss.takeScreenShot(driver, "continue shopping1 is not displayed in order summary page");
	      }
		  Assert.assertTrue(result);
		  result=driver.findElement(Elements.xcontinue_shopping_1).isEnabled();
		  if(result==false)
	      {
	    	  Thread.sleep(2000);
	    	  ss.takeScreenShot(driver, "continue shopping1 is not clickable in order summary page");
	      }
		  Assert.assertTrue(result);
		  wait.until(ExpectedConditions.elementToBeClickable(Elements.xcontinue_shopping_2));
			 result=driver.findElement(Elements.xcontinue_shopping_2).isDisplayed();
			  if(result==false)
		      {
		    	  Thread.sleep(2000);
		    	 ss.takeScreenShot(driver, "continue shopping2 is not displayed in order summary page");
		      }
			  Assert.assertTrue(result);
			  result=driver.findElement(Elements.xcontinue_shopping_2).isEnabled();
			  if(result==false)
		      {
		    	  Thread.sleep(2000);
		    	  ss.takeScreenShot(driver, "continue shopping2 is not clickable in order summary page");
		      }
			  Assert.assertTrue(result);
			  ec.eWrite(85, 11, "pass");
 }
	 
}
