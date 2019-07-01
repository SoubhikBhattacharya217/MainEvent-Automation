package mainEvent.Run;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.TimeUnit;

import org.CognizantQA.PageObject.Elements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import excelconnect.excelconnect;

public class RTE_validation_logic {
	static WebDriver driver;
	String excel="\\C:\\Users\\698531\\Desktop\\RTE automated validation\\RTE Automated Validation List.xlsx\\";
	static ExtentReports extentReport;
	static ExtentTest logger;
	public excelconnect ec=new excelconnect();
	public void RTE_Validation(WebDriver driver , ExtentTest logger) throws Exception {
	WebDriverWait wait = new WebDriverWait(driver,20);
	WebDriverWait wait1 = new WebDriverWait(driver,3);
	ec.eLaunch(excel, 1);
	for(int i=1;i<=43;i++) {
    Thread.sleep(2000);
	wait.until(ExpectedConditions.elementToBeClickable(Elements.xLOCATION_BUTTON)).click();
	
	wait.until(ExpectedConditions.elementToBeClickable(Elements.xenter_location_field)).click();
	Thread.sleep(3000);
	driver.findElement(Elements.xenter_location_field).sendKeys(ec.eRead(i, 0));
	wait.until(ExpectedConditions.elementToBeClickable(Elements.xfind_store_button)).click();
	wait.until(ExpectedConditions.elementToBeClickable(Elements.xstatic_google_map)).click();
	wait.until(ExpectedConditions.elementToBeClickable(Elements.xseelct_store_button_in_dynamic_map)).click();
	Thread.sleep(3000);
	wait.until(ExpectedConditions.elementToBeClickable(Elements.xHEADER_MAIN_EVENT_LOGO)).click();
	try {
    //driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	wait1.until(ExpectedConditions.visibilityOfElementLocated(Elements.xRTE_text));
	Boolean Assert=driver.findElement(Elements.xRTE_text).isDisplayed();
	if(Assert==true) {
	String RTE=driver.findElement(Elements.xRTE_text).getText();
	ec.eWrite(i, 2, RTE);	
	}
	}
	catch(Exception e) {
		ec.eWrite(i, 2, "RTE not present for this store");	
	}
	}		
}
}
