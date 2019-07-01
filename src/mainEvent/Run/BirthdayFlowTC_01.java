package mainEvent.Run;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Birthday_common_flow.Birthday_book_bttn_verify;
import Common_flow.PopupClose;
import excelconnect.Utility;

public class BirthdayFlowTC_01 extends baseClass{
	//static WebDriver driver;
	PopupClose popupClose = new PopupClose();
	Birthday_book_bttn_verify birthdayBookButtonVerify = new Birthday_book_bttn_verify();
	static ExtentReports extentReport;
	static ExtentTest logger;
	
	
	@BeforeClass
	public void beforeClass()
	{
		extentReport = ExtentFactory.Instance();
	}
	
	@Test(priority=1)
	public void popupClose()
	{
		logger = extentReport.startTest("BirthdayFlowTC_01");
		popupClose.verifypopupclose(driver,logger);
		System.out.println("hello world");
		
	}
	
	@Test(priority=2)
	public void verifyBirthdayNavigationFunctionality() throws Exception
	{
		birthdayBookButtonVerify.verify_birthday_book_bttn(driver);
		logger.log(LogStatus.PASS, "Book Now button is working as expected and user is able to view the Kids Birthday Package Thumbnail");
		logger.log(LogStatus.PASS, "User is able to click the kids birthday package thumbnail");
		logger.log(LogStatus.PASS, "User is able to click the Book Now button from the birthday page");
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
