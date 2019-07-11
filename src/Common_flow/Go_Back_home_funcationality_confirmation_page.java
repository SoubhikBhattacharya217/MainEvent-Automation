package Common_flow;

import org.CognizantQA.PageObject.Elements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Bowling_common_flow.Bowling_failure_screen_shot;

public class Go_Back_home_funcationality_confirmation_page {
WebDriver driver;
static ExtentReports report;
static ExtentTest logger;
static Bowling_failure_screen_shot ss=new Bowling_failure_screen_shot();
public static void verify_go_back_home_button_functionality(WebDriver driver , ExtentTest logger) throws Exception {
	WebDriverWait wait=new WebDriverWait(driver,30);
	Thread.sleep(3000);
	try {
	    wait.until(ExpectedConditions.elementToBeClickable(Elements.xGobackhomeBttn_details)).click();
		wait.until(ExpectedConditions.urlToBe("https://mainevent.cognizantorderserv.com/"));	
		logger.log(LogStatus.PASS, "Go Back Home button in Order Confirmation page is working as expected");
	}
	catch(Exception e) {
		logger.log(LogStatus.FAIL, "Go Back Home button in Order Confirmation page is working as expected");
	}
}
}
