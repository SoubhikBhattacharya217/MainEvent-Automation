package Common_flow;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.CognizantQA.PageObject.Elements;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Bowling_common_flow.Bowling_failure_screen_shot;
import excelconnect.excelconnect;

public class Home_Page_validations {
	static JavascriptExecutor js;
	WebDriverWait wait;
	XSSFSheet sheet;
	static excelconnect ec=new excelconnect();
	static boolean result=false;
	static Bowling_failure_screen_shot ss=new Bowling_failure_screen_shot();
	static ExtentReports extentReport;
	static ExtentTest logger;
public static void verify_homepage_elements(WebDriver driver, ExtentTest logger) throws Exception {
	WebDriverWait wait=new WebDriverWait(driver,30);
	try {
 // ec.eLaunch("\\C:\\Users\\698531\\Desktop\\Automation Regression test case suit\\ME One Test Cases - Automation - Regression V2 - Copy.xlsx\\", 1);
  result=driver.findElement(Elements.xHEADER_MAIN_EVENT_LOGO).isDisplayed();
  assertEquals(result, true);
 // ec.eWrite(2, 12, "pass");
  result=driver.findElement(Elements.xLOCATION_FINDER_ICON).isDisplayed();
  assertEquals(result, true);
  //ec.eWrite(3, 12, "pass");
  result=driver.findElement(Elements.xBOOK_NOW).isDisplayed();
  assertEquals(result, true);
  //ec.eWrite(4, 12, "pass");
  result=driver.findElement(Elements.xEAT_AND_DRINK_BUTTON).isDisplayed();
  assertEquals(result, true);
  //ec.eWrite(5, 12, "pass");
  result=driver.findElement(Elements.xGAMES_AND_ACTIVITIES_BUTTON).isDisplayed();
  assertEquals(result, true);
  //ec.eWrite(6, 12, "pass");
  result=driver.findElement(Elements.xPARTIES_AND_EVENT_BUTTON).isDisplayed();
  assertEquals(result, true);
  //ec.eWrite(7, 12, "pass");
  result=driver.findElement(Elements.xFUNCARD_BUTTON).isDisplayed();
  assertEquals(result, true);
  //ec.eWrite(8, 12, "pass");
  result=driver.findElement(Elements.xSPECIALS_BUTTON).isDisplayed();
  assertEquals(result, true);
  //ec.eWrite(9, 12, "pass");
  result=driver.findElement(Elements.xACCOUNT_BUTTON).isDisplayed();
  assertEquals(result, true);
  //ec.eWrite(10, 12, "pass");
  result=driver.findElement(Elements.xLOCATION_BUTTON).isDisplayed();
  assertEquals(result, true);
  //ec.eWrite(11, 12, "pass");
  result=driver.findElement(Elements.xGIFT_CARDS_BUTTON).isDisplayed();
  assertEquals(result, true);
  //ec.eWrite(12, 12, "pass");
  result=driver.findElement(Elements.xCAREERS_BUTTON).isDisplayed();
  assertEquals(result, true);
  //ec.eWrite(13, 12, "pass");
  result=driver.findElement(Elements.xCART_ICON).isDisplayed();
  assertEquals(result, true);
  //ec.eWrite(14, 12, "pass");
  result=driver.findElement(Elements.xLOCATION_BUTTON).isDisplayed();
  assertEquals(result, true);
  //ec.eWrite(15, 12, "pass");
  driver.navigate().refresh();
  wait.until(ExpectedConditions.elementToBeClickable(Elements.xbook_online_notify_close_bttn));
  driver.findElement(Elements.xbook_online_notify_close_bttn).click();
  Thread.sleep(4000);
  ((JavascriptExecutor)driver).executeScript("scroll(0,1750)");
  Thread.sleep(3000);
  result=driver.findElement(Elements.xBIRTHDAY_BOOK_NOW_BUTTON).isDisplayed();
  assertEquals(result,true);
  //ec.eWrite(16, 12, "pass");
  result=driver.findElement(Elements.xSpecials_view_details_bttn).isDisplayed();
  assertEquals(result, true);
  //ec.eWrite(17, 12, "pass");
  result=driver.findElement(Elements.xGROUP_EVENTS_VIEW_DETAILS_BUTTON).isDisplayed();
  assertEquals(result, true);
  //ec.eWrite(18, 12, "pass");
  result=driver.findElement(Elements.xCOMPANY_EVENTS_LEARN_MORE_BUTTON).isDisplayed();
  assertEquals(result, true);
  //ec.eWrite(19, 12, "pass");
  logger.log(LogStatus.PASS, "All Element visibility validations in The Home Page Are Done");
	}
	catch(Exception e) {
		logger.log(LogStatus.FAIL, "All Element visibility validations in The Home Page Are Done");
	}

}

}
