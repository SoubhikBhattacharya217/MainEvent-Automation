package Birthday_common_flow;

import java.io.File;
import java.io.IOException;
import Birthday_common_flow.Bday_booking_failure_screen_shots;
import Verify.Compare;
import excelconnect.excelconnect;

import org.CognizantQA.PageObject.Elements;
import org.CognizantQA.TestData.DataConfig;
import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Birthday_book_bttn_verify {
	
	static WebDriver driver;
    static JavascriptExecutor js;
	WebDriverWait wait;
	XSSFSheet sheet;
	static excelconnect ec=new excelconnect();
	//String a="\\C:\\Users\\698531\\Desktop\\Automation Regression test case suit\\ME One Test Cases - Automation - Regression V2 - Copy.xlsx\\";
	static boolean result=false;
	public void verify_birthday_book_bttn(WebDriver driver) throws Exception {
		WebDriverWait wait=new WebDriverWait(driver,30);
		//ec.eLaunch(a, 0);
		wait.until(ExpectedConditions.visibilityOfElementLocated(Elements.xHEADER_MAIN_EVENT_LOGO));
		Thread.sleep(4000);
		driver.findElement(Elements.xHEADER_MAIN_EVENT_LOGO).click();
		  Thread.sleep(2000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(Elements.xBOOK_NOW));
		  driver.findElement(Elements.xBOOK_NOW).click();
		  //ec.eWrite(145, 11, "pass");
		  wait.until(ExpectedConditions.visibilityOfElementLocated(Elements.xkidsbday_under_book_now));
		  driver.findElement(Elements.xkidsbday_under_book_now).click();		  
	      Thread.sleep(1500);
		try
		{
			result=Compare.verifyURL(driver, "https://mainevent.cognizantorderserv.com/event/birthday");
	        Assert.assertTrue(result);
	 /*       ec.eWrite(146, 11, "pass");
	        ec.eWrite(147, 11, "pass");
	        ec.eWrite(148, 11, "pass");*/
		}
		catch(AssertionError e)
		{
			System.out.println("UAT environment bday url is not navigated");
		}
		try
		{
			result=Compare.verifyURL(driver, "https://www.mainevent.com/event/birthday");
	        Assert.assertTrue(result);
	       /* ec.eWrite(146, 11, "pass");
	        ec.eWrite(147, 11, "pass");
	        ec.eWrite(148, 11, "pass");*/
	
		}
		catch(AssertionError e)
		{
			System.out.println("Production environment bday url is not navigated");
		}
		try
		{
			result=driver.findElement(Elements.xbook_bttn2).isDisplayed();
	        Assert.assertTrue(result);
	        wait.until(ExpectedConditions.elementToBeClickable(Elements.xbook_bttn2));
	        driver.findElement(Elements.xbook_bttn2).click();
	        //ec.eWrite(149, 11, "pass");
	
		}
		catch(AssertionError e)
		{
			System.out.println("Book now button under kids bday party is not clickable");
		}		
    }
}
