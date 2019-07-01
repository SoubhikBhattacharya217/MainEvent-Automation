package Birthday_common_flow;

import java.util.List;

import org.CognizantQA.PageObject.Elements;
import org.CognizantQA.Properties.PropertiesFile;
import org.CognizantQA.TestData.DataConfig;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Verify.Compare;
import excelconnect.excelconnect;

public class Configure_pkg_validations {
	WebDriver driver;
	static boolean result=false;
	static DataConfig data;
	static Bday_booking_failure_screen_shots ss=new Bday_booking_failure_screen_shots();
	 excelconnect ec=new excelconnect();
	// String ex="\\C:\\Users\\698531\\Desktop\\Automation Regression test case suit\\ME One Test Cases - Automation - Regression V2 - Copy.xlsx\\";
	 static ExtentReports extentReport;
	 static ExtentTest logger;
		
	 public void config_pkg_change_bttns_validation(WebDriver driver, ExtentTest logger) throws Exception {
		 String testDataPath = PropertiesFile.getDataFromProperty("TestData");
	        data = new DataConfig(testDataPath);
	        WebDriverWait wait=new WebDriverWait(driver, 20);
	        try {
	        	wait.until(ExpectedConditions.elementToBeClickable(Elements.xslct_a_diff_mainevent_bttn_config_pkg)).click();
	        	System.out.println("clicked");
	        	//driver.findElement(Elements.xslct_a_diff_mainevent_bttn_config_pkg).click();
	        	wait.until(ExpectedConditions.elementToBeClickable(Elements.xstore_popupclose_bbtn)).click();
	        	//ec.eLaunch(ex, 0);
	        	//ec.eWrite(170, 11, "Pass");
	        	logger.log(LogStatus.PASS, "User is able to change the MainEvent store location from configure package page");
	        	//ec.eWrite(170, 13, "User is able to change the MainEvent store location from configure package page");
	        }
	        catch(Exception e) {
	        	logger.log(LogStatus.FAIL, "User is unable to change the MainEvent store location from configure package page");
	        	//ec.eLaunch(ex, 0);
	        	//ec.eWrite(170, 11, "Fail");
	        	//ec.eWrite(170, 13, "User is unable to change the MainEvent store location from configure package page");
	        }
	        try {
	        	wait.until(ExpectedConditions.elementToBeClickable(Elements.xslct_a_diff_pkg_bttn_config_pkg)).click();
	        	
	        	try {
	        		wait.until(ExpectedConditions.urlToBe("https://mainevent.cognizantorderserv.com/planaparty/selectpackage"));
	        		driver.navigate().back();
	        	}
	        	catch(Exception e) {
	        		wait.until(ExpectedConditions.urlToBe("https://www.mainevent.com/planaparty/selectpackage"));
	        		driver.navigate().back();
	        	}
	        	logger.log(LogStatus.PASS, "User is able to change the MainEvent package details from configure package page");
	        	//ec.eLaunch(ex, 0);
	        	//ec.eWrite(171, 11, "Pass");
	        	//ec.eWrite(171, 13, "User is able to change the MainEvent package details from configure package page");
	        }
	        catch(Exception e) {
	        	logger.log(LogStatus.FAIL, "User is unable to change the MainEvent package details from configure package page");
	        	//ec.eLaunch(ex, 0);
	        	//ec.eWrite(171, 11, "Fail");
	        	//ec.eWrite(171, 13, "User is unable to change the MainEvent package details from configure package page");
	        }
	       try {
	    	   Thread.sleep(5000);
	    	   wait.until(ExpectedConditions.elementToBeClickable(Elements.xchange_bttn_config_pkg));
	        	driver.findElement(Elements.xchange_bttn_config_pkg).click();
	        	wait.until(ExpectedConditions.elementToBeClickable(Elements.xtell_us_about_party_close_bttn));
	        	driver.findElement(Elements.xtell_us_about_party_close_bttn).click();
	        	logger.log(LogStatus.PASS, "User is able to change the MainEvent guest count and date from configure package page");
	        	//ec.eLaunch(ex, 0);
	        	//ec.eWrite(172, 11, "Pass");
	        	//ec.eWrite(172, 13, "User is able to change the MainEvent guest count and date from configure package page");
	       }
	       catch(Exception e) {
	    	   logger.log(LogStatus.FAIL, "User is unable to change the MainEvent guest count and date from configure package page");
	    	   //ec.eLaunch(ex, 0);
	        	//ec.eWrite(172, 11, "Fail");
	        	//ec.eWrite(172, 13, "User is unable to change the MainEvent guest count and date from configure package page");
	       }
		 
	 }
	public void config_pkg_onlyheadings(WebDriver driver, ExtentTest logger) throws Exception {
		String testDataPath = PropertiesFile.getDataFromProperty("TestData");
        data = new DataConfig(testDataPath);
        WebDriverWait wait=new WebDriverWait(driver, 60);
        try {
           try {
        	 Thread.sleep(5000);
        	 result=Compare.verifyURL(driver, "https://mainevent.cognizantorderserv.com/planaparty/configurepackage");
	    	 Assert.assertTrue(result);
        	 //ec.eWrite(164, 11, "Pass");
        	 //ec.eWrite(164, 13, "User is present in the UAT environment configure package page");
               }
           catch(AssertionError e) {
        	 result=Compare.verifyURL(driver, "https://www.mainevent.com/planaparty/configurepackage");
	    	 Assert.assertTrue(result);
          	 //ec.eWrite(164, 11, "Pass");
          	 //ec.eWrite(164, 13, "User is present in the Production environment configure package page");
           }
           
        }
       catch(Exception e) {
    	   //ec.eLaunch(ex, 0);
    	   //ec.eWrite(164, 11, "Fail");
    	   //ec.eWrite(166, 11, "Fail");
       }
        try {
        	List<WebElement> a=driver.findElements(Elements.xmain_hdng);
			for(WebElement item:a)
			{
				String a1=item.getText();
				System.out.println("1. "+a1);
				Assert.assertEquals(a1, data.getData(0, 35, 1));
				break;
			}
			List<WebElement> b=driver.findElements(Elements.xslct_activity_tab1);
			for(WebElement item:b)
			{
				String b1=item.getText();
				System.out.println("2. "+b1);
				Assert.assertEquals(b1, data.getData(0, 36, 1));
				break;
			}
			List<WebElement> c=driver.findElements(Elements.xslct_activity_tab2);
			for(WebElement item:c)
			{
				String c1=item.getText();
				System.out.println("3. "+c1);
				Assert.assertEquals(c1, data.getData(0, 37, 1));
				break;
			}
			List<WebElement> d=driver.findElements(Elements.xslct_activity_tab3);
			for(WebElement item:d)
			{
				String d1=item.getText();
				System.out.println("4. "+d1);
				Assert.assertEquals(d1, data.getData(0, 38, 1));
				break;
			}
			List<WebElement> e=driver.findElements(Elements.xslct_activity_tab4);
			for(WebElement item:e)
			{
				String e1=item.getText();
				System.out.println("5. "+e1);
				Assert.assertEquals(e1, data.getData(0, 39, 1));
				break;
			}
			List<WebElement> f=driver.findElements(Elements.xslct_your_food_tab);
			for(WebElement item:f)
			{
				String f1=item.getText();
				System.out.println("6. "+f1);
				Assert.assertEquals(f1, data.getData(0, 40, 1));
				break;
			}
	      try {
	    	  Thread.sleep(2000);
	    	  result=driver.findElement(Elements.xactivities1_tab_bttnlazer).isDisplayed();
	    	  Assert.assertTrue(result);
	    	  result=driver.findElement(Elements.xactivities1_tab_bttnbowling).isDisplayed();
	    	  Assert.assertTrue(result);
	    	  result=driver.findElement(Elements.xactivities1_tab_bttnxtra_gplay).isDisplayed();
	    	  Assert.assertTrue(result);
	    	  result=driver.findElement(Elements.xactivities1_tab_bttn_gravity_ropes).isDisplayed();
	    	  Assert.assertTrue(result);
	    	  driver.findElement(Elements.xslct_activity_tab2).click();
	    	  Thread.sleep(2000);
	    	  result=driver.findElement(Elements.xactivities2_tab_bttnlazer).isDisplayed();
	    	  Assert.assertTrue(result);
	    	  result=driver.findElement(Elements.xactivities2_tab_bttnbowling).isDisplayed();
	    	  Assert.assertTrue(result);
	    	  result=driver.findElement(Elements.xactivities2_tab_bttnxtra_gplay).isDisplayed();
	    	  Assert.assertTrue(result);
	    	  result=driver.findElement(Elements.xactivities2_tab_bttn_gravity_ropes).isDisplayed();
	    	  Assert.assertTrue(result);
	    	  driver.findElement(Elements.xslct_activity_tab3).click();
	    	  Thread.sleep(2000);
	    	  result=driver.findElement(Elements.xactivities3_tab_bttnlazer).isDisplayed();
	    	  Assert.assertTrue(result);
	    	  result=driver.findElement(Elements.xactivities3_tab_bttnbowling).isDisplayed();
	    	  Assert.assertTrue(result);
	    	  result=driver.findElement(Elements.xactivities3_tab_bttnxtra_gplay).isDisplayed();
	    	  Assert.assertTrue(result);
	    	  result=driver.findElement(Elements.xactivities3_tab_bttn_gravity_ropes).isDisplayed();
	    	  Assert.assertTrue(result);
	    	  driver.findElement(Elements.xslct_activity_tab4).click();
	    	  Thread.sleep(2000);
	    	  result=driver.findElement(Elements.xactivities4_tab_bttnlazer).isDisplayed();
	    	  Assert.assertTrue(result);
	    	  result=driver.findElement(Elements.xactivities4_tab_bttnbowling).isDisplayed();
	    	  Assert.assertTrue(result);
	    	  result=driver.findElement(Elements.xactivities4_tab_bttnxtra_gplay).isDisplayed();
	    	  Assert.assertTrue(result);
	    	  result=driver.findElement(Elements.xactivities4_tab_bttn_gravity_ropes).isDisplayed();
	    	  Assert.assertTrue(result);    
	    	  driver.findElement(Elements.xslct_your_food_tab).click();
	    	  Thread.sleep(2000);
	    	  result=driver.findElement(Elements.xslct_bttn_of_food).isDisplayed();
	    	  Assert.assertTrue(result);  
	    	  logger.log(LogStatus.PASS, "All the ACTIVITY details and FOOD details are successfully validated as per pre determined order : Please note for more validation reference please refere to the excel sheet where all the data have been fetched and validated");
	    	  //ec.eLaunch(ex, 0);
	    	  //ec.eWrite(166, 11, "Pass");
	      }
	      catch(Exception e1) {
	    	  logger.log(LogStatus.FAIL, "User is unable to Validate the ACTIVITY and FOOD details in the configure package page");
	    	  //ec.eLaunch(ex, 0);
	    	  //ec.eWrite(166, 11, "Fail");
	      }
        }
		 catch(Exception e) {
			 logger.log(LogStatus.FAIL, "User is unable to Validate the ACTIVITY and FOOD details in the configure package page");
			 //ec.eLaunch(ex, 0);
	    	 //ec.eWrite(166, 11, "Fail");
		 }
	}
	
	public void config_pkg_activity_slctn(WebDriver driver, ExtentTest logger) throws Exception {
		 WebDriverWait wait=new WebDriverWait(driver, 60);
		try {
			result=driver.findElement(Elements.xsee_av_times_bttn).isEnabled();
	    	Assert.assertTrue(result);
	    	logger.log(LogStatus.FAIL, "See available times button remains active when no activity and food is selected");
			//ec.eLaunch(ex, 0);
	        //ec.eWrite(167, 11, "Fail");
		}
		catch(AssertionError e) {
			logger.log(LogStatus.PASS, "See available times button remains inactive when no activity and food is selected");
			//ec.eLaunch(ex, 0);
	    	//ec.eWrite(167, 11, "Pass");
		}
		try {
			
			try {
				driver.findElement(Elements.xactivities1_tab_bttnbowling).click();
				result=driver.findElement(Elements.xactivities2_tab_bttnbowling).isEnabled();
		    	Assert.assertTrue(result);
		    	logger.log(LogStatus.FAIL, "Bowling activity can be selected twice");
				//ec.eLaunch(ex, 0);
		    	//ec.eWrite(168, 11, "Fail");
		    	//ec.eWrite(168, 13, "bowling activity can be selected twice");
			}
			catch(AssertionError e) {
				Thread.sleep(2000);
				driver.findElement(Elements.xactivities2_tab_bttn_gravity_ropes).click();
			}
			try {
				result=driver.findElement(Elements.xactivities3_tab_bttnbowling).isEnabled();
		    	Assert.assertTrue(result);
		    	logger.log(LogStatus.FAIL, "Bowling activity can be selected twice");
				//ec.eLaunch(ex, 0);
		    	//ec.eWrite(168, 11, "Fail");
		    	//ec.eWrite(168, 13, "bowling activity can be selected twice");
			}
			catch(AssertionError e) {
				Thread.sleep(2000);
				driver.findElement(Elements.xactivities3_tab_bttnlazer).click();
			}
			try {
				result=driver.findElement(Elements.xactivities4_tab_bttnbowling).isEnabled();
		    	Assert.assertTrue(result);
		    	logger.log(LogStatus.FAIL, "Bowling activity can be selected twice");
				//ec.eLaunch(ex, 0);
		    	//ec.eWrite(168, 11, "Fail");
		    	//ec.eWrite(168, 13, "bowling activity can be selected twice");
			}
			catch(AssertionError e) {
				Thread.sleep(2000);
				driver.findElement(Elements.xactivities4_tab_bttnxtra_gplay).click();
				driver.findElement(Elements.xslct_bttn_of_food).click();
				logger.log(LogStatus.PASS, "All the ACTIVITIES and FOOD can be selected successfully");
				//ec.eLaunch(ex, 0);
		    	//ec.eWrite(168, 11, "Pass");
			}		
	    	try {
				wait.until(ExpectedConditions.elementToBeClickable(Elements.xsee_av_times_bttn));
				logger.log(LogStatus.PASS, "See available times button gets activated on selection of all Activities and Food");
				 //ec.eLaunch(ex, 0);
		    	 //ec.eWrite(169, 11, "Pass");
			}
			catch(Exception e) {
				logger.log(LogStatus.FAIL, "See available times button gets activated without selection of all required Activities and Food");
				//ec.eLaunch(ex, 0);
		    	//ec.eWrite(169, 11, "Fail");
	    	
		}
	
	}
		catch(Exception e) {
			logger.log(LogStatus.FAIL, "All the ACTIVITIES and FOOD cannot be selected successfully");
			logger.log(LogStatus.FAIL, "See available times button gets activated without selection of all required Activities and Food");
			//ec.eLaunch(ex, 0);
	    	//ec.eWrite(168, 11, "Fail");
	    	//ec.eWrite(169, 11, "Fail");
		}
}
	public void config_pkg_activity_slctn2(WebDriver driver, ExtentTest logger) throws Exception {
		 WebDriverWait wait=new WebDriverWait(driver, 60);
		 WebDriverWait wait1=new WebDriverWait(driver, 5);
			try {
				
				try {
					driver.findElement(Elements.xactivities1_tab_bttnbowling).click();
					result=driver.findElement(Elements.xactivities2_tab_bttnbowling).isEnabled();
			    	Assert.assertTrue(result);
			    	logger.log(LogStatus.FAIL, "Bowling activity can be selected twice");
			
				}
				catch(AssertionError e) {
					Thread.sleep(2000);
					driver.findElement(Elements.xactivities2_tab_bttn_gravity_ropes).click();
				}
				try {
					result=driver.findElement(Elements.xactivities3_tab_bttnbowling).isEnabled();
			    	Assert.assertTrue(result);
			    	logger.log(LogStatus.FAIL, "Bowling activity can be selected twice");
				
				}
				catch(AssertionError e) {
					Thread.sleep(2000);
					driver.findElement(Elements.xactivities3_tab_bttnlazer).click();
				}		
					Thread.sleep(2000);
					driver.findElement(Elements.xslct_bttn_of_food).click();
					logger.log(LogStatus.PASS, "All the ACTIVITIES and FOOD can be selected successfully");			
		    	try {
					wait1.until(ExpectedConditions.elementToBeClickable(Elements.xsee_av_times_bttn));
					logger.log(LogStatus.PASS, "See available times button gets activated on selection of all Activities and Food");
					
				}
				catch(Exception e) {
					logger.log(LogStatus.FAIL, "See available times button gets activated without selection of all required Activities and Food");
				
			}
		    	try {
		            Thread.sleep(2000);
		            wait.until(ExpectedConditions.elementToBeClickable(Elements.xsee_av_times_bttn));
		        	driver.findElement(Elements.xsee_av_times_bttn).click();
		    		}
		    		catch(Exception e) {
		    			System.out.println("Modify functionality error");
		    		}
		
		}
			catch(Exception e) {
				logger.log(LogStatus.FAIL, "All the ACTIVITIES and FOOD cannot be selected successfully");
				logger.log(LogStatus.FAIL, "See available times button gets activated without selection of all required Activities and Food");
			}
	}
}
