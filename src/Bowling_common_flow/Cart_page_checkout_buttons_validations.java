package Bowling_common_flow;

import java.io.File;

import org.CognizantQA.PageObject.Elements;
import org.CognizantQA.TestData.DataConfig;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Cart_page_checkout_buttons_validations {
	WebDriver driver;
	static DataConfig data;
	static JavascriptExecutor js;
	static boolean result=false;
	static Bowling_failure_screen_shot ss=new Bowling_failure_screen_shot();
	
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
