package Common_flow;

import java.util.concurrent.TimeUnit;

import org.CognizantQA.PageObject.Elements;
import org.CognizantQA.TestData.DataConfig;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class PopupClose {
	//static WebDriver driver;
	static DataConfig data;
	static JavascriptExecutor js;
	WebDriverWait wait;
	 static boolean result=false;
	ExtentReports extentReport;
	ExtentTest logger;
	public Boolean verifypopupclose(WebDriver driver,ExtentTest logger)
	{
		try 
		{
			WebDriverWait wait=new WebDriverWait(driver,30);
			try {
			wait.until(ExpectedConditions.elementToBeClickable(Elements.xproductionpopupclose));
			result=driver.findElement(Elements.xproductionpopupclose).isDisplayed();
			Assert.assertTrue(result);
			result=driver.findElement(Elements.xproductionpopupclose).isEnabled();
			Assert.assertTrue(result);
			driver.findElement(Elements.xproductionpopupclose).click();
			logger.log(LogStatus.PASS, "location pop up appearedand dealt with");
			}
			catch(Exception e) {
				logger.log(LogStatus.SKIP, "location pop up did not appeared");
			}
			try {
			wait.until(ExpectedConditions.elementToBeClickable(Elements.xbook_online_notify_close_bttn));
			driver.findElement(Elements.xbook_online_notify_close_bttn).click();
			((JavascriptExecutor)driver).executeScript("scroll(0,400)");
			logger.log(LogStatus.PASS, "pop up closed successfully");
			}
			catch(Exception e) {
				logger.log(LogStatus.SKIP, "pop up closed successfully");
			}
			return true;
		}
		catch(Exception e)
		{
			System.out.println("issue");
			return false;
		}
		
	}
}
