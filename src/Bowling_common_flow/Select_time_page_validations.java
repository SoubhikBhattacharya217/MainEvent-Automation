package Bowling_common_flow;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.CognizantQA.PageObject.Elements;
import org.CognizantQA.Properties.PropertiesFile;
import org.CognizantQA.TestData.DataConfig;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.google.common.base.Verify;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import excelconnect.excelconnect;

public class Select_time_page_validations {

	static WebDriver driver;
	static boolean result=false;
	static DataConfig data;
	static excelconnect ec=new excelconnect();
	static ExtentReports extentReport;
	static ExtentTest logger;
	
	static Bowling_failure_screen_shot ss=new Bowling_failure_screen_shot();
	static String a="\\C:\\Users\\698531\\Desktop\\Automation Regression test case suit\\ME One Test Cases - Automation - Regression V2 - Copy.xlsx\\";
	 public static void verify_slct_time_PAGE(WebDriver driver,ExtentTest logger) throws Exception {
		 String testDataPath = PropertiesFile.getDataFromProperty("TestData");
	      data = new DataConfig(testDataPath);
		  WebDriverWait wait=new WebDriverWait(driver, 60);
		  SimpleDateFormat formatter=new SimpleDateFormat("MM/dd/yyyy");
		  Date date=new Date();
		  String date1=formatter.format(date);
          //ec.eLaunch(a, 0);
          result=driver.findElement(Elements.xslctdate).isDisplayed();
          if(result==false)
	      {
	    	  Thread.sleep(2000);
	    	  logger.log(LogStatus.FAIL, "Select date field is displayed");
	    	  ss.takeScreenShot(driver, "today button in calender pop up is not displayed");
	    	  System.out.println("today button in calender pop up is not displayed");
	      }
		  Assert.assertTrue(result);
		  logger.log(LogStatus.PASS, "Select date field is displayed");
		  logger.log(LogStatus.PASS, "2", "Select date field is displayed");
		  result=driver.findElement(Elements.xnoofbowlers).isDisplayed();
          if(result==false)
	      {
	    	  Thread.sleep(2000);
	    	  ss.takeScreenShot(driver, "no of bowlers is not displayed");
	    	  logger.log(LogStatus.FAIL, "Number of Bowlers field is displayed");
	      }
		  Assert.assertTrue(result);
		  logger.log(LogStatus.PASS, "Number of Bowlers field is displayed");
		  System.out.println("Number of Bowlers field is displayed");
		  result=driver.findElement(Elements.xno_duration_field).isDisplayed();
          if(result==false)
	      {
	    	  Thread.sleep(2000);
	    	  ss.takeScreenShot(driver, "duration field is not displayed");
	    	  logger.log(LogStatus.FAIL, "Choose Duration field is not displayed");
	    	  System.out.println("Choose Duration field is not displayed");
	      }
		  Assert.assertTrue(result);
		  logger.log(LogStatus.PASS, "Choose Duration field is displayed");
		  System.out.println("Choose Duration field is displayed");
		  result=driver.findElement(Elements.xno_of_bowling_lane).isDisplayed();
          if(result==false)
	      {
	    	  Thread.sleep(2000);
	    	  ss.takeScreenShot(driver, "bowling lane selection field is not displayed");
	    	  logger.log(LogStatus.PASS, "Number Of Bowling Lanes field is not displayed");
	      }
		  Assert.assertTrue(result);
		  logger.log(LogStatus.PASS, "Number Of Bowling Lanes field is displayed");
		  System.out.println("Number Of Bowling Lanes field is displayed");
          //ec.eWrite(57, 11, "pass");
		 /* wait.until(ExpectedConditions.visibilityOfElementLocated(Elements.xdate_slct));
		  driver.findElement(Elements.xdate_slct).click();
		  wait.until(ExpectedConditions.visibilityOfElementLocated(Elements.xdate_slct2));
		  wait.until(ExpectedConditions.visibilityOfElementLocated(Elements.xclose_bttn));
		  driver.findElement(Elements.xclose_bttn).click();*/
		  //ec.eWrite(66, 11, "pass");
		  result=driver.findElement(Elements.xse_av_times_bttn).isEnabled();   
		  try {
			 
			  Assert.assertFalse(result);
			  logger.log(LogStatus.PASS, "SEE AVAILABLE TIMES button does not gets enabled when any of the 4 fields is empty");
			  //ec.eWrite(67, 11, "pass");
		  }
		 catch(AssertionError e) {
			 ss.takeScreenShot(driver, "see available time issue issue");
			 logger.log(LogStatus.FAIL, "SEE AVAILABLE TIMES button does not gets enabled when any of the 4 fields is empty");
		 }
		  logger.log(LogStatus.SKIP, "Past date selection validation in calender pop up");
		  //ec.eWrite(60, 11, "pass");
		  wait.until(ExpectedConditions.visibilityOfElementLocated(Elements.xno_duration_field));
		  driver.findElement(Elements.xno_duration_field).click();
		  
		  //ec.eWrite(61, 11, "pass");
		  result=driver.findElement(Elements.xduration_1_hr).isDisplayed();
		  try {
			  Assert.assertTrue(result);
			  logger.log(LogStatus.PASS, "Duration of 1Hr is displayed from the duration field drop down");
		  }
		 catch(AssertionError e) {
			 ss.takeScreenShot(driver, "duration issue");
			 logger.log(LogStatus.FAIL, "Duration of 1Hr is displayed from the duration field drop down");
		 }
		  result=driver.findElement(Elements.xduration_2_hr).isDisplayed();
		  try {
			  Assert.assertTrue(result);
			  logger.log(LogStatus.PASS, "Duration of 2Hr is displayed from the duration field drop down");
		  }
		 catch(AssertionError e) {
			 ss.takeScreenShot(driver, "duration issue");
			 logger.log(LogStatus.FAIL, "Duration of 2Hr is displayed from the duration field drop down");
		 }
		  result=driver.findElement(Elements.xduration_3_hr).isDisplayed();
		  try {
			  Assert.assertTrue(result);
			  logger.log(LogStatus.PASS, "Duration of 3Hr is displayed from the duration field drop down");
		  }
		 catch(AssertionError e) {
			 ss.takeScreenShot(driver, "duration issue");
			 logger.log(LogStatus.FAIL, "Duration of 3Hr is displayed from the duration field drop down");
		 }
		  result=driver.findElement(Elements.xduration_4_hr).isDisplayed();
		  try {
			  Assert.assertTrue(result);
			  logger.log(LogStatus.PASS, "Duration of 4Hr is displayed from the duration field drop down");
			  //ec.eWrite(62, 11, "pass");
		  }
		 catch(AssertionError e) {
			 ss.takeScreenShot(driver, "duration issue");
			 logger.log(LogStatus.FAIL, "Duration of 4Hr is displayed from the duration field drop down");
		 }
		  driver.findElement(Elements.xduration_2_hr).click();
		  logger.log(LogStatus.PASS, "Duration of 2Hr is selected from the duration field drop down");
		  //ec.eWrite(68, 11, "pass");
		  result=driver.findElement(Elements.xse_av_times_bttn).isEnabled();
		  try {
			  Assert.assertFalse(result);
			  logger.log(LogStatus.PASS, "User is unable to click the SEE AVAILABLE TIME button since No Of Bowlers field is empty");
			  //ec.eWrite(69, 11, "pass");
		  }
		 catch(AssertionError e) {
			 ss.takeScreenShot(driver, "see available time issue issue");
			 logger.log(LogStatus.FAIL, "User is unable to click the SEE AVAILABLE TIME button since No Of Bowlers field is empty");
		 }
		  driver.findElement(Elements.xnoofbowlers).click();
			result=driver.findElement(Elements.xno_of_bowlers_popup).isDisplayed();//done multiple validations needed
			try {
				  Assert.assertTrue(result);
				  logger.log(LogStatus.PASS, "Number of Bowler Pop Up is displayed");
				  //ec.eWrite(63, 11, "pass");
			  }
			 catch(AssertionError e) {
				 ss.takeScreenShot(driver, "no of bowler pop up issue");
				 logger.log(LogStatus.FAIL, "Number of Bowler Pop Up is displayed");
			 }
			result=driver.findElement(Elements.xdone_bttn).isEnabled();
			try {
				  Assert.assertFalse(result);
				  logger.log(LogStatus.PASS, "Done button in Select number of bowlers pop up is disabled since no count is selected");
			  }
			 catch(AssertionError e) {
				 ss.takeScreenShot(driver, "duration issue");
				 logger.log(LogStatus.FAIL, "Done button in Select number of bowlers pop up is disabled since no count is selected");
			 }
			wait.until(ExpectedConditions.visibilityOfElementLocated(Elements.xadults));
			Thread.sleep(2000);//deliberate thread.sleep inserted due to ambigous webpage behaviour
			driver.findElement(Elements.xadults).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(Elements.xadults_19));
			driver.findElement(Elements.xadults_19).click();
			driver.findElement(Elements.xchild).click();
			driver.findElement(Elements.xchilds_2).click();
			result=driver.findElement(Elements.xdone_bttn).isDisplayed();
			Assert.assertTrue(result);
			result=driver.findElement(Elements.xdone_bttn).isEnabled();
			try {
				  Assert.assertFalse(result);
				  logger.log(LogStatus.PASS, "Done button in Select number of bowlers pop up is disabled since number of bowler count exceeds limit ");
			  }
			 catch(AssertionError e) {
				 ss.takeScreenShot(driver, "duration issue");
				 logger.log(LogStatus.FAIL, "Done button in Select number of bowlers pop up is disabled since number of bowler count exceeds limit ");
			 }
			String error_mssg=driver.findElement(Elements.xno_of_bowlers_max_range_error_mssg).getText();
			try {
				Assert.assertEquals(error_mssg, data.getData(0, 52, 1));
				logger.log(LogStatus.PASS, "Max Number of Bowler limit message successfully displayed");
			  }
			 catch(AssertionError e) {
				 ss.takeScreenShot(driver, "max bowler text message issue");
				 logger.log(LogStatus.FAIL, "Max Number of Bowler limit message successfully displayed");
			 }
			wait.until(ExpectedConditions.visibilityOfElementLocated(Elements.xadults));
			driver.findElement(Elements.xadults).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(Elements.xadults_19));
			driver.findElement(Elements.xadults_3).click();
			driver.findElement(Elements.xchild).click();
			driver.findElement(Elements.xchilds_2).click();
			result=driver.findElement(Elements.xdone_bttn).isEnabled();
			try {
				  Assert.assertTrue(result);
				  logger.log(LogStatus.PASS, "Done button in Select number of bowlers pop up is enabled since number of bowler count is valid ");
			  }
			 catch(AssertionError e) {
				 ss.takeScreenShot(driver, "duration issue");
				 logger.log(LogStatus.FAIL, "Done button in Select number of bowlers pop up is enabled since number of bowler count is valid ");
			 }
			driver.findElement(Elements.xdone_bttn).click();
			//ec.eWrite(70, 11, "pass");
			wait.until(ExpectedConditions.visibilityOfElementLocated(Elements.xse_av_times_bttn));
			Thread.sleep(2000);//deliberate thread.sleep given due to web page ambigous behaviour
			result=driver.findElement(Elements.xse_av_times_bttn).isEnabled();
			  try {
				  Assert.assertTrue(result);
				  logger.log(LogStatus.PASS, "SEE AVAILABLE TIMES button gets enabled when all the 4 fields are filled with proper credentials");
				  //ec.eWrite(71, 11, "pass");
			  }
			 catch(AssertionError e) {
				 ss.takeScreenShot(driver, "see available time issue issue");
				 logger.log(LogStatus.FAIL, "SEE AVAILABLE TIMES button gets enabled when all the 4 fields are filled with proper credentials");
			 }
			  wait.until(ExpectedConditions.visibilityOfElementLocated(Elements.xno_of_bowling_lane));
			  driver.findElement(Elements.xno_of_bowling_lane).click();
			  result=driver.findElement(Elements.xlane_count1).isDisplayed();//done multiple validations needed
				try {
					  Assert.assertTrue(result);
					  logger.log(LogStatus.PASS, "Lane 1 is displayed in select number of bowling lane drop down");
				  }
				 catch(AssertionError e) {
					 ss.takeScreenShot(driver, "lane count issue");
					 logger.log(LogStatus.FAIL, "Lane 1 is displayed in select number of bowling lane drop down");
				 }
				result=driver.findElement(Elements.xlane_count2).isDisplayed();//done multiple validations needed
				try {
					  Assert.assertTrue(result);
					  logger.log(LogStatus.PASS, "Lane 2 is displayed in select number of bowling lane drop down");
				  }
				 catch(AssertionError e) {
					 ss.takeScreenShot(driver, "lane count issue");
					 logger.log(LogStatus.FAIL, "Lane 2 is displayed in select number of bowling lane drop down");
				 }
				result=driver.findElement(Elements.xlane_count3).isDisplayed();//done multiple validations needed
				try {
					  Assert.assertTrue(result);
					  logger.log(LogStatus.PASS, "Lane 3 is displayed in select number of bowling lane drop down");
				  }
				 catch(AssertionError e) {
					 ss.takeScreenShot(driver, "lane count issue");
					 logger.log(LogStatus.FAIL, "Lane 3 is displayed in select number of bowling lane drop down");
				 }
				result=driver.findElement(Elements.xlane_count4).isDisplayed();//done multiple validations needed
				try {
					  Assert.assertTrue(result);
					  logger.log(LogStatus.PASS, "Lane 4 is displayed in select number of bowling lane drop down");
				  }
				 catch(AssertionError e) {
					 ss.takeScreenShot(driver, "lane count issue");
					 logger.log(LogStatus.FAIL, "Lane 4 is displayed in select number of bowling lane drop down");
				 }
				result=driver.findElement(Elements.xlane_count5).isDisplayed();//done multiple validations needed
				try {
					  Assert.assertTrue(result);
					  logger.log(LogStatus.PASS, "Lane 5 is displayed in select number of bowling lane drop down");
				  }
				 catch(AssertionError e) {
					 ss.takeScreenShot(driver, "lane count issue");
					 logger.log(LogStatus.FAIL, "Lane 5 is displayed in select number of bowling lane drop down");
				 }
				result=driver.findElement(Elements.xlane_count6).isDisplayed();//done multiple validations needed
				try {
					  Assert.assertTrue(result);
					  logger.log(LogStatus.PASS, "Lane 6 is displayed in select number of bowling lane drop down");
					 // ec.eWrite(72, 11, "pass");
				  }
				 catch(AssertionError e) {
					 ss.takeScreenShot(driver, "lane count issue");
					 logger.log(LogStatus.FAIL, "Lane 6 is displayed in select number of bowling lane drop down");
				 }
				driver.findElement(Elements.xlane_count2).click();
				
				
				 try {
					  driver.findElement(Elements.xslctdate).click();
					 // wait.until(ExpectedConditions.visibilityOfElementLocated(Elements.xtoday_bttn_calender));
					  Thread.sleep(1500);
					  //ec.eWrite(59, 11, "pass");
					  driver.findElement(Elements.xtoday_bttn_calender).click();
					  logger.log(LogStatus.PASS, "today button in calender pop up is clickable");
					  new Actions(driver).moveByOffset(230, 200).click().build().perform(); 
					  }
					  catch(Exception e) {
						  driver.navigate().refresh();
						  Thread.sleep(4000);
						  driver.findElement(Elements.xslctdate).click();
						 // wait.until(ExpectedConditions.visibilityOfElementLocated(Elements.xtoday_bttn_calender));
						  Thread.sleep(1500);
						  //ec.eWrite(59, 11, "pass");
						  driver.findElement(Elements.xtoday_bttn_calender).click();
						  logger.log(LogStatus.PASS, "today button in calender pop up is clickable");
					  }
				
				
				
				result=driver.findElement(Elements.xse_av_times_bttn).isEnabled();
				  try {
					  Assert.assertTrue(result);
					  logger.log(LogStatus.PASS, "SEE AVAILABLE TIMES button gets enabled when all the 4 fields are filled with user entered proper credentials");
					  //ec.eWrite(73, 11, "pass");
				  }
				 catch(AssertionError e) {
					 ss.takeScreenShot(driver, "see available time issue issue");
					 logger.log(LogStatus.FAIL, "SEE AVAILABLE TIMES button gets enabled when all the 4 fields are filled with user entered proper credentials");
				 }
				  driver.findElement(Elements.xse_av_times_bttn).click(); 
				  }  
	 
	 
	 public static void Select_your_bowling_time_Date_SelectionValidation(WebDriver driver, ExtentTest logger) throws Exception {		
		 
				 try  {
					 int m=0;
				     for(int i=1;i<=38;i++)
				      {
					      result=driver.findElement(By.xpath("//*[@id='storeTimeModal']//form//div/ul/li["+i+"]/input")).isEnabled();
					      if(result==true) {
						  //ec.eWrite(77, 11, "pass");
					      logger.log(LogStatus.PASS, "User is able to view an activated time slot in SELECT YOU BOWLING TIME POP UP ");
						  driver.findElement(By.xpath("//*[@id='storeTimeModal']//form//div/ul/li["+i+"]/input")).click();
						 // ec.eWrite(78, 11, "pass");
						  logger.log(LogStatus.PASS, "User is able to select an activated time slot in SELECT YOU BOWLING TIME POP UP ");
						  m++;
						  break;
					  } 
	                  }
				     if(m==0) {
				    	 throw new Exception();
				     }
				    }
				catch(Exception e) {
					System.out.println("Selecting different date");
					int t=0;
					  for(int i=1;i<=31;i++) {
						  try {
						  //wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='storeTimeModal']/div/form/div/div[1]/div[4]/div/div["+i+"]")));
						  result=driver.findElement(By.xpath("//*[@id='storeTimeModal']/div/form/div/div[1]/div[4]/div/div["+i+"]")).isEnabled();
						  if(result==true) {
							  driver.findElement(By.xpath("//*[@id='storeTimeModal']/div/form/div/div[1]/div[4]/div/div["+i+"]")).click();
							  Thread.sleep(7000);
							  for(int x=1;x<=38;x++)
							  {
								  result=driver.findElement(By.xpath("//*[@id='storeTimeModal']//form//div/ul/li["+x+"]/input")).isEnabled();
								  if(result==true) {
									  //ec.eWrite(77, 11, "pass");
									  logger.log(LogStatus.PASS, "User is able to view an activated time slot in SELECT YOU BOWLING TIME POP UP ");
									  driver.findElement(By.xpath("//*[@id='storeTimeModal']//form//div/ul/li["+x+"]/input")).click();
									  //ec.eWrite(78, 11, "pass");
									  logger.log(LogStatus.PASS, "User is able to select an activated time slot in SELECT YOU BOWLING TIME POP UP ");
									  t++;
									  break;
								  }
								  else {
									  continue;
								  }
							   }
							  //ec.eWrite(79, 11, "pass");
							  if(t==1) {
								  break;
							  }
							  else {
								  continue;
							  }	  
						  }
					  }
						  catch(Exception e1) {
							  System.out.println("Issue");
							  continue;
						  }
					  }	  
			 }
		/*  Thread.sleep(2000);
		  List<WebElement> b=driver.findElements(Elements.xslctdate1);
			for(WebElement item:b)
			{
				Thread.sleep(4000);
				String b1=item.getText();
				System.out.println("3."+b1);
				break;
			}*/
		  
			/*driver.findElement(Elements.xnoofbowlers).click();
			result=driver.findElement(Elements.xno_of_bowlers_popup).isDisplayed();//done multiple validations needed
			if(result==false)
		      {
		    	  Thread.sleep(2000);
		    	  ss.takeScreenShot(driver, "number of bowlers pop up is not displayed");
		      }
			Assert.assertTrue(result);
			Thread.sleep(2000);
			Assert.assertTrue(result);
			driver.findElement(Elements.xse_av_times_bttn).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(Elements.xtime_slct));
			driver.findElement(Elements.xtime_slct).click();//selection 12.00 am from the select time pop-up
*/	  }
}
