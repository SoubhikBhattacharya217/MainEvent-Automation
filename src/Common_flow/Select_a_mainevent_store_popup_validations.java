package Common_flow;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.CognizantQA.PageObject.Elements;
import org.CognizantQA.PageObject.Elements1;
import org.CognizantQA.Properties.PropertiesFile;
import org.CognizantQA.TestData.DataConfig;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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

import Bowling_common_flow.Bowling_failure_screen_shot;
import Verify.Compare;
import excelconnect.excelconnect;
import test_automation_login.org.CognizantQA.MErun.Bowling_lane_flow_production_site;

public class Select_a_mainevent_store_popup_validations {
	static WebDriver driver;
	static boolean result=false;
	static DataConfig data;
	static Bowling_failure_screen_shot ss=new Bowling_failure_screen_shot();
	static excelconnect ec=new excelconnect();
	//static String a="\\C:\\Users\\698531\\Desktop\\Automation Regression test case suit\\ME One Test Cases - Automation - Regression V2 - Copy.xlsx\\";
	public static final By xstorename_txt_in_popup=By.cssSelector("#storeModal > div > div.col-xs-12.storeListContainer.ng-scope > ul > li:nth-child(1) > div.col-xs-8 > span:nth-child(1)");
	static ExtentReports extentReport;
	static ExtentTest logger;
	
	public static void verifystorepopup_close(WebDriver driver,ExtentTest logger) throws Exception {
		String testDataPath = PropertiesFile.getDataFromProperty("TestData");
		data = new DataConfig(testDataPath);
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(Elements.xseelct_main_event_text));
		driver.findElement(Elements.xseelct_main_event_text).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(Elements.xstore_popupclose_bbtn));
		result=driver.findElement(Elements.xstore_popupclose_bbtn).isDisplayed();
		if(result==false)
		{
			Thread.sleep(2000);
			ss.takeScreenShot(driver, "store pop up close button is not visible");
		}
		Assert.assertTrue(result);
		result=driver.findElement(Elements.xstore_popupclose_bbtn).isEnabled();
		if(result==false)
		{
			Thread.sleep(2000);
			ss.takeScreenShot(driver, "store pop up close button is not clickable");
		}
		Assert.assertTrue(result);
		driver.findElement(Elements.xstore_popupclose_bbtn).click();
		logger.log(LogStatus.PASS, "user is able to close the pop up successfully which appears after loaction selection");
	}
	public static void verifystore_popup(WebDriver driver,ExtentTest logger) throws InterruptedException, IOException {
		//driver.switchTo().frame("storeModalContent");
		WebDriverWait wait1=new WebDriverWait(driver,5);
		try {	
			Thread.sleep(4000);
			wait1.until(ExpectedConditions.visibilityOfElementLocated(Elements.xfind_a_mainevent_bttn1)).click();
			
			/*driver.findElement(Elements.xcity_field).clear();
			Thread.sleep(2000);
			driver.findElement(Elements.xcity_field).sendKeys(data.getData(1, 19, 1));
     		driver.findElement(Elements.xcity_field).click();
			driver.findElement(Elements.xexternalclickfindpage1).click();*/
			//driver.findElement(Elements.xfind_a_mainevent_bttn1).click();
		}
		catch(Exception e) {
			System.out.println("user is not sitauted in the bowling flow select main event pop up");
		}
		try {	
			wait1.until(ExpectedConditions.visibilityOfElementLocated(Elements.xfind_mevent_bttn_bday));
			driver.findElement(Elements.xcity_field).clear();
			Thread.sleep(2000);
			driver.findElement(Elements.xcity_field2).sendKeys(data.getData(1, 19, 1));
			driver.findElement(Elements.xcity_field2).sendKeys(Keys.DOWN);
			driver.findElement(Elements.xcity_field2).click();
			driver.findElement(Elements.xexternalclickfindpage_bday).click();
			driver.findElement(Elements.xfind_mevent_bttn_bday).click();
		}
		catch(Exception e) {
			System.out.println("user is not sitauted in the birthday flow select main event pop up");
		}
		wait1.until(ExpectedConditions.visibilityOfElementLocated(Elements.xfind_bttn_in_popup));
		result=driver.findElement(Elements.xfind_bttn_in_popup).isDisplayed();//to verify the list view flow in the store pop up
		if(result==false)
		{
			Thread.sleep(2000);
			ss.takeScreenShot(driver, "find button is not visible in store pop up");
		}
		Assert.assertTrue(result);
		result=driver.findElement(Elements.xfind_bttn_in_popup).isEnabled();
		if(result==false)
		{
			Thread.sleep(2000);
			ss.takeScreenShot(driver, "find button is not clickable in store pop up");
		}
		Assert.assertTrue(result);
		logger.log(LogStatus.PASS, "user is able to click the find button present in the store loaction pop up ");
		/*Thread.sleep(2000);
		List<WebElement> a=driver.findElements(Bowling_lane_flow_production_site.xstorename_txt_in_popup) ;
		for(WebElement item:a)
		{
		    String a1= item.getText();
		    System.out.println("1."+a1);
		    break;
		}*/
		driver.findElement(Elements.xlocation_field_select_mainevent_popup).clear();
		driver.findElement(Elements.xlocation_field_select_mainevent_popup).sendKeys(data.getData(1, 19, 1));
		driver.findElement(Elements.xfind_bttn_in_popup).click();
		
	}

	public static void verifystore_popupmapviewflow(WebDriver driver,ExtentTest logger) throws Exception {
		WebDriverWait wait=new WebDriverWait(driver,20);
		WebDriverWait wait1=new WebDriverWait(driver,10);  
		wait.until(ExpectedConditions.visibilityOfElementLocated(Elements.xmapbttn_store_popup));
		result=driver.findElement(Elements.xmapbttn_store_popup).isDisplayed();//verifying the pop field with using the map view flow
		if(result==false)
		{
			Thread.sleep(2000);
			ss.takeScreenShot(driver, "map button is not displayed");
		}
		Assert.assertTrue(result);
		result=driver.findElement(Elements.xmapbttn_store_popup).isEnabled();
		if(result==false)
		{
			Thread.sleep(2000);
			ss.takeScreenShot(driver, "map button is not enabled");
		}
		Assert.assertTrue(result);
		/*driver.findElement(Elements.xmapbttn_store_popup).click();
		logger.log(LogStatus.PASS, "user is able to click the map button ");
		driver.findElement(Elements.xseelct_main_event_text).click();
		WebElement p = driver.findElement(Elements.xmapview_placename);//different approach to store webelement text rather than using arraylist
		String placename=p.getText();
		Assert.assertEquals(placename, data.getData(0, 0, 0));	 */
		wait.until(ExpectedConditions.visibilityOfElementLocated(Elements.xselect_and_continue));
		result=driver.findElement(Elements.xselect_and_continue).isEnabled();
		if(result==false)
		{
			ss.takeScreenShot(driver, "select and continue button is not visible");
		}
		Assert.assertTrue(result);
		//ec.eLaunch(a, 0);
		//ec.eWrite(56, 11, "pass");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(Elements.xselect_and_continue)).click();
		logger.log(LogStatus.PASS, "user is able to click the Select And Continue button in the SELECT A MAINEVENT popup");
		driver.navigate().refresh();
		WebDriverWait wait2=new WebDriverWait(driver,10);
		Thread.sleep(5000);
		try {
			wait1.until(ExpectedConditions.urlToBe("https://mainevent.cognizantorderserv.com/findalane/selecttime"));
			result=Compare.verifyURL(driver, "https://mainevent.cognizantorderserv.com/findalane/selecttime");
			Assert.assertTrue(result);
			WebElement q = driver.findElement(Elements.xselecttime_placename);//different approach to store webelement text rather than using arraylist
		    String placename1=q.getText();
			Assert.assertEquals(placename1, data.getData(0, 20, 1));
			logger.log(LogStatus.PASS, "user is navigated to the bowling selectime pop up in UAT environment");
		}
		catch(AssertionError|Exception e) {
			System.out.println("**** user is not navigated to bowling flow UAT find a lane page");
		}
		try {
			wait1.until(ExpectedConditions.urlToBe("https://www.mainevent.com/findalane/selecttime"));
			result=Compare.verifyURL(driver, "https://www.mainevent.com/findalane/selecttime");
			Assert.assertTrue(result);
			WebElement q1 = driver.findElement(Elements.xselecttime_placename);//different approach to store webelement text rather than using arraylist
			String placename11=q1.getText();
			Assert.assertEquals(placename11, data.getData(0, 20, 1));
			logger.log(LogStatus.PASS, "user is navigated to the bowling selectime pop up in Production environment");
		}
		catch(AssertionError|Exception e) {
			System.out.println("**** user is not navigated to bowling flow Production environment find a lane page");
		}
		try {
			wait1.until(ExpectedConditions.urlToBe("https://mainevent.cognizantorderserv.com/planaparty/selectpackage"));
			result=Compare.verifyURL(driver, "https://mainevent.cognizantorderserv.com/planaparty/selectpackage");
			Assert.assertTrue(result);
			WebElement q = driver.findElement(Elements.xselecttime_placename);//different approach to store webelement text rather than using arraylist
			String placename1=q.getText();
			Assert.assertEquals(placename1, data.getData(0, 1, 0));
			//ec.eLaunch(a, 0);
			//ec.eWrite(151, 11, "pass");
			//ec.eWrite(152, 11, "pass");
			//ec.eWrite(152, 13, "user is Present in UAT birthday flow select package page");
			logger.log(LogStatus.PASS, "user is navigated to the Birthday select package Page in UAT environment");
		}
		catch(AssertionError|Exception e) {
			System.out.println("**** user is not navigated to birthday flow UAT environment find a lane page");
		}
		try {
			wait1.until(ExpectedConditions.urlToBe("https://www.mainevent.com/planaparty/selectpackage"));
			result=Compare.verifyURL(driver, "https://www.mainevent.com/planaparty/selectpackage");
			Assert.assertTrue(result);
			WebElement q = driver.findElement(Elements.xselecttime_placename);//different approach to store webelement text rather than using arraylist
			String placename1=q.getText();
			Assert.assertEquals(placename1, data.getData(0, 20, 0));
			//ec.eLaunch(a, 0);
			//ec.eWrite(151, 11, "pass");
			//ec.eWrite(152, 11, "pass");
			//ec.eWrite(152, 13, "user is Present in Production birthday flow select package page");
			logger.log(LogStatus.PASS, "user is navigated to the Birthday select package Page in Production environment");
		}
		catch(AssertionError|Exception e) {
			System.out.println("**** user is not navigated to birthday flow Production environment find a lane page");
		}

	}
}
