package Funleague_common_flow;

import org.CognizantQA.PageObject.Elements;
import org.CognizantQA.TestData.DataConfig;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Bowling_common_flow.Bowling_failure_screen_shot;

public class Cart_page_checkout_bttn_validaton {
	WebDriver driver;
	static DataConfig data;
	static JavascriptExecutor js;
	static boolean result=false;
	static Funleague_failure_screenshots ss=new Funleague_failure_screenshots();
	
	public void verify_chekcout_bttns(WebDriver driver) throws InterruptedException {
	WebDriverWait wait=new WebDriverWait(driver, 60);
	result=driver.findElement(Elements.xcheckout_bttn1).isDisplayed();
	if(result==false)
    {
  	  Thread.sleep(2000);
  	  ss.takeScreenShot(driver, "chechkout button 1 is not displayed");
    }
	  Assert.assertTrue(result);
	  result=driver.findElement(Elements.xcheckout_bttn1).isEnabled();
	  if(result==false)
    {
  	 ss.takeScreenShot(driver, "chechkout button 1 is not enabled");
    }
	  Assert.assertTrue(result);
	  result=driver.findElement(Elements.xcheckout_bttn2).isDisplayed();
	  if(result==false)
    {
  	 ss.takeScreenShot(driver, "chechkout button 2 is not displayed");
    }
	  Assert.assertTrue(result);
	  result=driver.findElement(Elements.xcheckout_bttn2).isEnabled();
	  if(result==false)
    {
  	 ss.takeScreenShot(driver, "chechkout button 2 is not enabled");
    }
	  Assert.assertTrue(result);
	  Thread.sleep(2000);
	  driver.findElement(Elements.xcheckout_bttn1).click();
}
}
