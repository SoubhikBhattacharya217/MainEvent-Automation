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

import Common_flow.PopupClose;
import Common_flow.login;

public class LoginTC_01 extends baseClass {
	
	login loginValidations=new login();
	PopupClose popupClose = new PopupClose();
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
		logger = extentReport.startTest("BowlingPageFlowTC_04 : Validate Multiple functionalities in SELECT TIME PAGE  ");
		popupClose.verifypopupclose(driver,logger);
		
	}
	@Test(priority=2)
	public void LoginValidations() throws Exception
	{
		logger = extentReport.startTest("LoginFlowTC_01 : Validate Successfull Login of User  ");
		login.verifyAccountsignin(driver,logger);
		login.verifyAccountLogout( driver,  logger);
		login.verifyAccountlogin_with_invalid_password(driver, logger);
		login.wrong_user_login(driver, logger);
		login.wrong_emailid_login(driver, logger);
		
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
