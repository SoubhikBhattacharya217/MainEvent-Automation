package Common_flow;

import java.io.File;
import java.io.IOException;

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

public class Confirmation_page_validations {
	WebDriver driver;
	static DataConfig data;
	static JavascriptExecutor js;
	static boolean result=false;
	static Bowling_failure_screen_shot ss=new Bowling_failure_screen_shot();
	public static void verify_confirmation_page(WebDriver driver) throws InterruptedException, IOException {
		  WebDriverWait wait=new WebDriverWait(driver, 60);
		  wait.until(ExpectedConditions.urlToBe("https://mepreprod.cognizantorderserv.com/checkout/confirmation"));
		  result=Verify.Compare.verifyURL(driver, "https://mepreprod.cognizantorderserv.com/checkout/confirmation");
		  if(result==false)
	      {
	    	  Thread.sleep(2000);
	    	  ss.takeScreenShot(driver, "confirmation page not successfully navigated");
	      }
		  Assert.assertTrue(result);
	  }
}
