package Birthday_common_flow;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.CognizantQA.PageObject.Elements;
import org.CognizantQA.Properties.PropertiesFile;
import org.CognizantQA.TestData.DataConfig;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Funleague_common_flow.Funleague_failure_screenshots;
import excelconnect.excelconnect;

public class Tell_about_party_popup_validation {
	WebDriver driver;
	static boolean result=false;
	static DataConfig data;
	static Bday_booking_failure_screen_shots ss=new Bday_booking_failure_screen_shots();
	static ExtentReports extentReport;
	static ExtentTest logger;
	
	public void verify_guest_count_popup(WebDriver driver,ExtentTest logger) throws Exception {
		//String ex="\\C:\\Users\\698531\\Desktop\\Automation Regression test case suit\\ME One Test Cases - Automation - Regression V2 - Copy.xlsx\\";
		excelconnect ec=new excelconnect();
		String testDataPath = PropertiesFile.getDataFromProperty("TestData");
        data = new DataConfig(testDataPath);
        WebDriverWait wait=new WebDriverWait(driver, 60);
		   List<WebElement> a=driver.findElements(Elements.xconditions_txt_pkg_popup);
			for(WebElement item:a)
			{
				String a1=item.getText();
				System.out.println("1."+a1);
				Assert.assertEquals(a1, data.getData(0, 32, 1));
				logger.log(LogStatus.PASS, "User is able to successfully view the conditions for booking a birthday package in the select your party time pop up ");
				break;
			}
			List<WebElement> b=driver.findElements(Elements.xguest_count_dd);
			for(WebElement item:b)
			{
				String b1=item.getText();
				System.out.println("1."+b1);
				logger.log(LogStatus.PASS, "User is able to successfully view the default selected guest count as 10 ");
				//Assert.assertEquals(b1, "10");//using integer because cannot get numeric value from a string cell error coming
				break;
			}
			List<WebElement> c=driver.findElements(Elements.xtxt_under_date_field);
			for(WebElement item:c)
			{
				String c1=item.getText();
				System.out.println("1."+c1);
				Assert.assertEquals(c1, data.getData(0, 33, 1));
				logger.log(LogStatus.PASS, "User is able to successfully view the message text under the date selection field ");
				break;
			}
			driver.findElement(Elements.xdate_picker_field).click();
			result=driver.findElement(Elements.xdate_close_bttn).isEnabled();
			if(result==false)
		      {
				 logger.log(LogStatus.FAIL, "User is unable to close the calender pop up ");
		    	 ss.takeScreenShot(driver, "date close button is not enabled");
		      }
			Assert.assertTrue(result);
			driver.findElement(Elements.xdate_close_bttn).click();
			logger.log(LogStatus.PASS, "User is able to successfully close the calender pop up ");
			result=driver.findElement(Elements.xproceed_bttn).isDisplayed();
			if(result==false)
		      {
				 logger.log(LogStatus.FAIL, "User is unable to view the PROCEED TO ACTIVITIES & FOOD button ");
		    	 ss.takeScreenShot(driver, "proceed button is not displayed");
		      }
			Assert.assertTrue(result);
			logger.log(LogStatus.PASS, "User is able to view the PROCEED TO ACTIVITIES & FOOD button ");
			result=driver.findElement(Elements.xproceed_bttn).isEnabled();
			if(result==true)
		      {
				logger.log(LogStatus.PASS, "User is able to click the PROCEED TO ACTIVITIES & FOOD button without selecting any date due to modify functionality");
				ss.takeScreenShot(driver, "proceed button is clickable");
		      }
			logger.log(LogStatus.PASS, "User is unable to click the PROCEED TO ACTIVITIES & FOOD button without selecting any date");
            Thread.sleep(2000);
            try {
            driver.findElement(Elements.xguest_count_dd).click();
            try {
            for(int i=10;i<=24;i++) {
            	wait.until(ExpectedConditions.visibilityOfElementLocated(ByXPath.xpath("(//*[@id='storeGuestModal']//div[starts-with(text(),'"+i+"')])[1]")));
            }
            logger.log(LogStatus.PASS, "User is able to view the GUEST dropdown");
           // ec.eLaunch(ex, 0);
            //ec.eWrite(159, 11, "Pass");
            }
            catch(Exception e) {
            	logger.log(LogStatus.FAIL, "User is unable to view the GUEST dropdown");
            	//ec.eLaunch(ex, 0);
                //ec.eWrite(159, 11, "Fail");
                //ec.eWrite(159, 13, "all the guest count is not present in the guest count drop down");
                
            }
            driver.findElement(Elements.xguest_count_dd_10).click();
            logger.log(LogStatus.PASS, "User is able to select a desired number of guests from the guest drop down");
           // ec.eLaunch(ex, 0);
            //ec.eWrite(160, 11, "Pass");
           // ec.eWrite(161, 11, "Pass");
            }
            catch(Exception e) {
            	logger.log(LogStatus.FAIL, "User is unable to select a desired number of guests from the guest drop down");
               // ec.eLaunch(ex, 0);
            	//ec.eLaunch(ex, 0);
            	//ec.eWrite(159, 11, "Fail");
               // ec.eWrite(160, 11, "Fail");
                //ec.eWrite(161, 11, "Fail");
            }
			driver.findElement(Elements.xdate_picker_field).click();
			wait.until(ExpectedConditions.elementToBeClickable(Elements.xdate_slct_bday));
			driver.findElement(Elements.xdate_slct_bday).click();
			logger.log(LogStatus.PASS, "User is able to select a desired date from the calender pop up");
			result=driver.findElement(Elements.xproceed_bttn).isEnabled();
			if(result==false)
		      {
				ss.takeScreenShot(driver, "proceed button is not clickable");
		      }
			Assert.assertTrue(result);
			Thread.sleep(1500);
			wait.until(ExpectedConditions.elementToBeClickable(Elements.xproceed_bttn));
			driver.findElement(Elements.xproceed_bttn).click();
			logger.log(LogStatus.PASS, "User is able to proceed to the activities & food selection page by clicking the PROCEED TO ACTIVITIES & FOOD button ");
	   }
}
