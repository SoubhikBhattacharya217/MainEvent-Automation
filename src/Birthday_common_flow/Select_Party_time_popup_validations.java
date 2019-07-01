package Birthday_common_flow;
import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.CognizantQA.PageObject.Elements;
import org.CognizantQA.TestData.DataConfig;
import org.apache.commons.io.FileUtils;
import org.apache.commons.logging.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import java.util.Date;
import Bowling_common_flow.Bowling_failure_screen_shot;
import Verify.Compare;
import excelconnect.excelconnect;
public class Select_Party_time_popup_validations {
	WebDriver driver;
	static DataConfig data;
	static JavascriptExecutor js;
	static boolean result=false;
    static Bowling_failure_screen_shot ss=new Bowling_failure_screen_shot();
	static excelconnect ec=new excelconnect();
	//static String a="\\C:\\Users\\698531\\Desktop\\Automation Regression test case suit\\ME One Test Cases - Automation - Regression V2 - Copy.xlsx\\";
	static ExtentReports extentReport;
	static ExtentTest logger;
	public static void verify_select_party_time_pop_up(WebDriver driver, ExtentTest logger) throws Exception{
                   // ec.eLaunch(a, 0);
                    WebDriverWait wait=new WebDriverWait(driver, 60);
                    Thread.sleep(2000);
                    try{
                    	wait.until(ExpectedConditions.elementToBeClickable(Elements.xsee_av_times_bttn));
                    	driver.findElement(Elements.xsee_av_times_bttn).click();
                    	logger.log(LogStatus.PASS, "User is able to click the SEE AVAILABLE TIMES button in configure package page");
                    	//ec.eWrite(173, 11, "Pass");
                    	wait.until(ExpectedConditions.visibilityOfElementLocated(Elements.xheading_slct_your_party_time));
                    	String a1=driver.findElement(Elements.xheading_slct_your_party_time).getText();
                    	//ec.eLaunch(a, 1);
                    	ec.eWrite(76, 2, a1);
                    	String a2=driver.findElement(Elements.xstorename_slct_your_party_time).getText();
                    	//ec.eLaunch(a, 1);
                    	//ec.eWrite(77, 2, a2);
                    	String a3=driver.findElement(Elements.xpkgdetails_slct_your_party_time).getText();
                    	//ec.eLaunch(a, 1);
                    	//ec.eWrite(78, 2, a3);
                    	//ec.eLaunch(a, 0);
                    	logger.log(LogStatus.PASS, "Validation to check whether user entered store name and package details are same in the SELECT PARTY TIME pop up : Please note the validation is done inside the excel sheet so kindly refer to the excel sheet ");
                    	//ec.eWrite(174, 11, "Pass");
                    }
                    catch(Exception e) {
                    	logger.log(LogStatus.FAIL, "User is unable to click the SEE AVAILABLE TIMES button in configure package page and thus unable to validate package details and select time slot for the package");
                    	//ec.eLaunch(a, 0);
                    	//ec.eWrite(173, 11, "Fail");
                    	//ec.eWrite(174, 11, "Fail");
                    }
}
	public static void verify_select_party_time_pop_up_time_select(WebDriver driver, ExtentTest logger) throws Exception{
		WebDriverWait wait=new WebDriverWait(driver, 60);
	
		 try  {
			 wait.until(ExpectedConditions.elementToBeClickable(Elements.xfeb));
			 try {
				 DateFormat dateFormat=new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
				 Date date=new Date();
				 System.out.println(dateFormat.format(date));
				 String date1=dateFormat.format(date);
				 String month=date1.substring(5, 7);
				 driver.findElement(By.xpath("//*[@id='storeTimeModal']/div/form/div/div[1]/div[2]/div/div[" +month+"]")).click();
			 }
			 catch(Exception edate) {
				 System.out.println("month cannot be selected");
			 }
			 int m=0;
		     for(int i=1;i<5;i++)
		      {
			      result=driver.findElement(By.xpath("//*[@id='storeTimeModal']/div/form/div/div[3]/ul/li["+i+"]/input")).isEnabled();
			      if(result==true) {
				  driver.findElement(By.xpath("//*[@id='storeTimeModal']/div/form/div/div[3]/ul/li["+i+"]/input")).click();
				  logger.log(LogStatus.PASS, "User is able to select an appropriate time slot for the Birthday Package from the SELECT YOUR PARTY TIME pop up ");
				  //ec.eLaunch(a, 0);
				 // ec.eWrite(175, 11, "Pass");
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
					  result=driver.findElement(By.xpath("//*[@id='storeTimeModal']/div/form/div/div[1]/div[4]/div/div["+i+"]")).isEnabled();
					  if(result==true) {
						  driver.findElement(By.xpath("//*[@id='storeTimeModal']/div/form/div/div[1]/div[4]/div/div["+i+"]")).click();
						  Thread.sleep(5000);
						  for(int x=1;x<=5;x++)
						  {
							  result=driver.findElement(By.xpath("//*[@id='storeTimeModal']/div/form/div/div[3]/ul/li["+x+"]/input")).isEnabled();
							  if(result==true) {
								  driver.findElement(By.xpath("//*[@id='storeTimeModal']/div/form/div/div[3]/ul/li["+x+"]/input")).click();
								  logger.log(LogStatus.PASS, "User is able to select an appropriate time slot for the Birthday Package from the SELECT YOUR PARTY TIME pop up ");
								  //ec.eLaunch(a, 0);
								  //ec.eWrite(175, 11, "Pass");
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
						  if(i==31) {
							     DateFormat dateFormat=new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
								 Date date=new Date();
								 System.out.println(dateFormat.format(date));
								 String date1=dateFormat.format(date);
								 String month=date1.substring(5, 7);
								 int month1=Integer.parseInt(month);
								 month1++;
								 driver.findElement(By.xpath("//*[@id='storeTimeModal']/div/form/div/div[1]/div[2]/div/div[" +month1+"]")).click();
								 for(int o=1;o<=31;o++) {
									  try {
									  result=driver.findElement(By.xpath("//*[@id='storeTimeModal']/div/form/div/div[1]/div[4]/div/div["+o+"]")).isEnabled();
									  if(result==true) {
										  driver.findElement(By.xpath("//*[@id='storeTimeModal']/div/form/div/div[1]/div[4]/div/div["+o+"]")).click();
										  Thread.sleep(5000);
										  for(int x=1;x<=5;x++)
										  {
											  result=driver.findElement(By.xpath("//*[@id='storeTimeModal']/div/form/div/div[3]/ul/li["+x+"]/input")).isEnabled();
											  if(result==true) {
												  driver.findElement(By.xpath("//*[@id='storeTimeModal']/div/form/div/div[3]/ul/li["+x+"]/input")).click();
												  logger.log(LogStatus.PASS, "User is able to select an appropriate time slot for the Birthday Package from the SELECT YOUR PARTY TIME pop up ");
												  //ec.eLaunch(a, 0);
												  //ec.eWrite(175, 11, "Pass");
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
									  catch(Exception e2) {
										  continue;
									  }
						  }
						  continue;	 
					  }
				  }	  
		 }
	}
}
}
