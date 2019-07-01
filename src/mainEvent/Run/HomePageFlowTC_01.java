package mainEvent.Run;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Common_flow.Book_now_header_section_validations;
import Common_flow.Home_Page_validations;
import Common_flow.PopupClose;

public class HomePageFlowTC_01 extends baseClass {
	PopupClose popupClose = new PopupClose();
	Home_Page_validations homePageElementsValidation=new Home_Page_validations();
	Book_now_header_section_validations BookNowAndOtherHeaderSectionsValidations=new Book_now_header_section_validations();
	static ExtentReports extentReport;
	static ExtentTest logger;
	@BeforeClass
	public void beforeClass ()
	{
		extentReport = ExtentFactory.Instance();
	}
	@Test(priority=1)
	public void popupClose()
	{
		logger = extentReport.startTest("HomePageFlowTC_01 : HOME page validations : Selected Elements visibility and naviagtion to all pages from the Home Page Via BOOK NOW section ");
		popupClose.verifypopupclose(driver,logger);
		
	}
	@Test(priority=2)
	 public void homepage_validations() throws Exception//test case-002
	 //Validate if user is able to find all the details that gets showed in 
	 //the landing/Home Page for Main Event One site 
	
	 { 
		homePageElementsValidation.verify_homepage_elements(driver,logger);
		
	 }
	@Test(priority=3)
	 public void BookNowHeaderSectionsValidations() throws Exception//test case-002
	 //Validate if user is able to find all the details that gets showed in 
	 //the landing/Home Page for Main Event One site 
	
	 { 
		BookNowAndOtherHeaderSectionsValidations.verify_book_now_locate_and_interact(driver, logger);
		 extentReport.endTest(logger);
		logger = extentReport.startTest("HomePageFlowTC_02 : HOME page validations : Naviagtion to all pages from the Home Page Via EAT AND DRINK , GAMES AND ACTIVITIES , PARTIES AND EVENTS , FUNCARDS sections ");
		BookNowAndOtherHeaderSectionsValidations.verify_EAT_AND_DRINK(driver,logger);
		BookNowAndOtherHeaderSectionsValidations.verify_Games_And_Activities(driver, logger);
		BookNowAndOtherHeaderSectionsValidations.verify_Parties_and_events(driver, logger);
		BookNowAndOtherHeaderSectionsValidations.verify_FUNCARDS(driver, logger);
	 }
	@AfterMethod
	public void getResult(ITestResult r)
    {
           
           if(r.getStatus() == ITestResult.FAILURE)
           {
                  //String screenShotPath = Utility.captureScreenShot(driver, "image1");
                  logger.log(LogStatus.FAIL, "Test Case failed is " + r.getName()); 
                  logger.log(LogStatus.FAIL, "Test Case failed is " + r.getThrowable());
                  //logger.log(LogStatus.FAIL, "ScreenShot below : "+logger.addScreenCapture(screenShotPath));
           }
           else if(r.getStatus() == ITestResult.SKIP)
           {
                  logger.log(LogStatus.SKIP, "Test Case skipped is " + r.getName());
           }
          extentReport.endTest(logger);
    }
	
	@AfterTest
	public void endReport()
	{
		extentReport.flush();
		extentReport.close();
		driver.close();
	}

}
