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

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Bowling_common_flow.Bowling_failure_screen_shot;

public class Confirmation_page_validations {
	WebDriver driver;
	static DataConfig data;
	static JavascriptExecutor js;
	static boolean result=false;
	static ExtentReports report;
	static ExtentTest logger;
	static Bowling_failure_screen_shot ss=new Bowling_failure_screen_shot();
	public static void verify_confirmation_page(WebDriver driver , ExtentTest logger) throws InterruptedException, IOException {
		  WebDriverWait wait=new WebDriverWait(driver, 60);
		  try {
		  wait.until(ExpectedConditions.urlToBe("https://mainevent.cognizantorderserv.com/checkout/confirmation"));	
		  result=Verify.Compare.verifyURL(driver, "https://mainevent.cognizantorderserv.com/checkout/confirmation");
		  Assert.assertTrue(result);
		  logger.log(LogStatus.PASS, "User is successfully navigated to the Order Confirmation Page in UAT environment");
		  }
		  catch(Exception e) {
			  try {
			  result=Verify.Compare.verifyURL(driver, "https://www.mainevent.com/checkout/confirmation");
			  Assert.assertTrue(result);
			  logger.log(LogStatus.PASS, "User is successfully navigated to the Order Confirmation Page in Production environment");
			  }
			  catch(Exception e1) {
				  logger.log(LogStatus.FAIL, "User is successfully navigated to the Order Confirmation Page in UAT environment");
				  logger.log(LogStatus.FAIL, "User is successfully navigated to the Order Confirmation Page in Production environment");
			  }
		  }
	  }
}
