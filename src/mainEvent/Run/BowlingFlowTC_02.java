package mainEvent.Run;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Bowling_common_flow.Bowling_reserve_bttn;
import Bowling_common_flow.Find_a_lane_page_heading_validations;
import Bowling_common_flow.Location_search_functionality_validations;
import Common_flow.PopupClose;

public class BowlingFlowTC_02 extends baseClass{
	PopupClose popupClose = new PopupClose();
	Bowling_reserve_bttn BowlingReserveBttn=new Bowling_reserve_bttn();
	Find_a_lane_page_heading_validations FindALanePageHeadingValidations=new Find_a_lane_page_heading_validations();
	Location_search_functionality_validations LocationSearchFunctionality =new Location_search_functionality_validations();
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
		logger = extentReport.startTest("BowlingPageFlowTC_02 : Validate the successful location search from BOOK A LANE page  ");
		popupClose.verifypopupclose(driver,logger);
		
	}
	@Test(priority=2)
	public void BowlingReserveBttn() throws Exception
	{
		BowlingReserveBttn.verifybowling_lane_page_navigation(driver, logger);
		FindALanePageHeadingValidations.verifybowling_page_by_click(driver, logger);
		
	}
	@Test(priority=3)
	public void LocationSearchFunctionalityValidations() throws Exception
	{
		LocationSearchFunctionality.location_validations(driver, logger);
		
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
		//driver.close();
	}
}
