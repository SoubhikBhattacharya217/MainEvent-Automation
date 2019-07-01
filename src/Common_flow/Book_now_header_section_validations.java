package Common_flow;
import static org.testng.Assert.assertEquals;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import org.CognizantQA.PageObject.Elements;
import org.CognizantQA.Properties.PropertiesFile;
import org.CognizantQA.TestData.DataConfig;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Bowling_common_flow.Bowling_failure_screen_shot;
import Verify.Compare;
import excelconnect.excelconnect;
public class Book_now_header_section_validations {

	static JavascriptExecutor js;
	WebDriverWait wait;
	XSSFSheet sheet;
	static excelconnect ec=new excelconnect();
	Compare com=new Compare();
	static boolean result=false;
	static DataConfig data;
	String a="\\C:\\Users\\698531\\Desktop\\Automation Regression test case suit\\ME One Test Cases - Automation - Regression V2 - Copy.xlsx\\";
	static ExtentReports extentReport;
	static ExtentTest logger;
	public void verify_book_now_locate_and_interact(WebDriver driver, ExtentTest logger) throws Exception//All validations under BOOK NOW section
	{
		WebDriverWait wait=new WebDriverWait(driver,10);
		try {
		//ec.eLaunch(a, 0);
		result=driver.findElement(Elements.xBOOK_NOW).isDisplayed();
		Assert.assertTrue(result);
		driver.findElement(Elements.xBOOK_NOW).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(Elements.xbday_under_book_now));
		result=driver.findElement(Elements.xBOOK_NOW).isEnabled();
		Assert.assertTrue(result);
		logger.log(LogStatus.PASS, "Book Now Button is Clicked");
		}
catch(Exception e) {
	logger.log(LogStatus.FAIL, "Book Now Button is Clicked");
		}
		//ec.eWrite(18, 11, "pass");
		//ec.eWrite(19, 11, "pass");
		try {
		result=driver.findElement(Elements.xbday_under_book_now).isDisplayed();
		Assert.assertTrue(result);
		result=driver.findElement(Elements.xbowling_under_book_now).isDisplayed();
		Assert.assertTrue(result);
		driver.findElement(Elements.xbowling_under_book_now).click();
		result=driver.findElement(Elements.xcorporate_under_book_now).isDisplayed();
		Assert.assertTrue(result);
		result=driver.findElement(Elements.xgroup_under_book_now).isDisplayed();
		Assert.assertTrue(result);
		driver.findElement(Elements.xbday_under_book_now).click();
		Thread.sleep(2000);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(Elements.xkidsbday_under_book_now));
		result=driver.findElement(Elements.xkidsbday_under_book_now).isDisplayed();
		Assert.assertTrue(result);
		result=driver.findElement(Elements.xadultsbday_under_book_now).isDisplayed();
		Assert.assertTrue(result);
		driver.findElement(Elements.xbowling_under_book_now).click();
		Thread.sleep(2000);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(Elements.xgroup_of_20_under_book_now));
		result=driver.findElement(Elements.xgroup_of_20_under_book_now).isDisplayed();
		Assert.assertTrue(result);
		result=driver.findElement(Elements.xgroup_of_21_under_book_now).isDisplayed();
		Assert.assertTrue(result);
		driver.findElement(Elements.xcorporate_under_book_now).click();
		Thread.sleep(2000);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(Elements.xteambulding_under_company_under_book_now));
		result=driver.findElement(Elements.xteambulding_under_company_under_book_now).isDisplayed();
		Assert.assertTrue(result);
		result=driver.findElement(Elements.xhalfdfday_under_company_under_book_now).isDisplayed();
		Assert.assertTrue(result);
		result=driver.findElement(Elements.xeappreciation_under_company_under_book_now).isDisplayed();
		Assert.assertTrue(result);
		result=driver.findElement(Elements.xholidayparty_under_company_under_book_now).isDisplayed();
		Assert.assertTrue(result);
		result=driver.findElement(Elements.xcompanypicnic_under_company_under_book_now).isDisplayed();
		Assert.assertTrue(result);
		result=driver.findElement(Elements.xhappyhr_under_company_under_book_now).isDisplayed();
		Assert.assertTrue(result);
		result=driver.findElement(Elements.xffbuyout_under_company_under_book_now).isDisplayed();
		Assert.assertTrue(result);
		driver.findElement(Elements.xgroup_under_book_now).click();
		Thread.sleep(2000);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(Elements.xfundraiser_under_group_under_book_now));
		result=driver.findElement(Elements.xfundraiser_under_group_under_book_now).isDisplayed();
		Assert.assertTrue(result);
		result=driver.findElement(Elements.xschool_under_group_under_book_now).isDisplayed();
		Assert.assertTrue(result);
		result=driver.findElement(Elements.xyouthevents_under_group_under_book_now).isDisplayed();
		Assert.assertTrue(result);
		result=driver.findElement(Elements.xlockins_under_group_under_book_now).isDisplayed();
		Assert.assertTrue(result);
		result=driver.findElement(Elements.xendofseason_under_group_under_book_now).isDisplayed();
		Assert.assertTrue(result);
		logger.log(LogStatus.PASS, "All the subsection falling under BOOK NOW i.e subsections under i-Birthday  ii-Bowling iii-Corporate Events iv-Group Events are visible ");
	    }
		catch(Exception e) {
			logger.log(LogStatus.FAIL, "All the subsection falling under BOOK NOW i.e subsections under i-Birthday  ii-Bowling iii-Corporate Events iv-Group Events are visible ");
		}
		ec.eLaunch(a, 1);
		//try {
		for(int i=0;i<=14;i++)
		{
			
			if(i==0) {
				driver.findElement(Elements.xbday_under_book_now).click();
				driver.findElement(Elements.xkidsbday_under_book_now).click();
				wait.until(ExpectedConditions.visibilityOfElementLocated(Elements.xkids_bday_header));
			}
			else if(i==1) {
				wait.until(ExpectedConditions.visibilityOfElementLocated(Elements.xBOOK_NOW));
				driver.findElement(Elements.xBOOK_NOW).click();
				driver.findElement(Elements.xbday_under_book_now).click();
				driver.findElement(Elements.xadultsbday_under_book_now).click();
				wait.until(ExpectedConditions.visibilityOfElementLocated(Elements.xadults_bday_header));
			}
			else if(i==2) {
				wait.until(ExpectedConditions.visibilityOfElementLocated(Elements.xBOOK_NOW));
				driver.findElement(Elements.xBOOK_NOW).click();
				driver.findElement(Elements.xbowling_under_book_now).click();
				driver.findElement(Elements.xgroup_of_20_under_book_now).click();
				wait.until(ExpectedConditions.urlToBe("https://www.mainevent.com/play/bowling"));
				Thread.sleep(1500);
			}
			else if(i==3) {
				wait.until(ExpectedConditions.visibilityOfElementLocated(Elements.xBOOK_NOW));
				driver.findElement(Elements.xBOOK_NOW).click();
				wait.until(ExpectedConditions.visibilityOfElementLocated(Elements.xcorporate_under_book_now));
				driver.findElement(Elements.xcorporate_under_book_now).click();
				driver.findElement(Elements.xteambulding_under_company_under_book_now).click();
				wait.until(ExpectedConditions.urlToBe("https://www.mainevent.com/event/corporate-package/teambuilding"));
				Thread.sleep(1500);
			}
			else if(i==4) {
				wait.until(ExpectedConditions.visibilityOfElementLocated(Elements.xBOOK_NOW));
				driver.findElement(Elements.xBOOK_NOW).click();
				wait.until(ExpectedConditions.visibilityOfElementLocated(Elements.xcorporate_under_book_now));
				driver.findElement(Elements.xcorporate_under_book_now).click();
				driver.findElement(Elements.xhalfdfday_under_company_under_book_now).click();
				wait.until(ExpectedConditions.urlToBe("https://www.mainevent.com/event/corporate-package/halfdayfullday"));
				Thread.sleep(1500);
			}
			else if(i==5) {
				wait.until(ExpectedConditions.visibilityOfElementLocated(Elements.xBOOK_NOW));
				driver.findElement(Elements.xBOOK_NOW).click();
				wait.until(ExpectedConditions.visibilityOfElementLocated(Elements.xcorporate_under_book_now));
				driver.findElement(Elements.xcorporate_under_book_now).click();
				driver.findElement(Elements.xeappreciation_under_company_under_book_now).click();
				wait.until(ExpectedConditions.urlToBe("https://www.mainevent.com/event/corporate-package/employeeappreciation"));
				Thread.sleep(1500);
			}
			else if(i==6) {
				wait.until(ExpectedConditions.visibilityOfElementLocated(Elements.xBOOK_NOW));
				driver.findElement(Elements.xBOOK_NOW).click();
				wait.until(ExpectedConditions.visibilityOfElementLocated(Elements.xcorporate_under_book_now));
				driver.findElement(Elements.xcorporate_under_book_now).click();	
				driver.findElement(Elements.xholidayparty_under_company_under_book_now).click();
				wait.until(ExpectedConditions.urlToBe("https://www.mainevent.com/event/corporate-package/holidayparty"));
				Thread.sleep(1500);
			}
			else if(i==7) {
				wait.until(ExpectedConditions.visibilityOfElementLocated(Elements.xBOOK_NOW));
				driver.findElement(Elements.xBOOK_NOW).click();
				wait.until(ExpectedConditions.visibilityOfElementLocated(Elements.xcorporate_under_book_now));
				driver.findElement(Elements.xcorporate_under_book_now).click();
				driver.findElement(Elements.xcompanypicnic_under_company_under_book_now).click();
				wait.until(ExpectedConditions.urlToBe("https://www.mainevent.com/event/corporate-package/companypicnics"));
				Thread.sleep(1500);
			}
			else if(i==8) {
				wait.until(ExpectedConditions.visibilityOfElementLocated(Elements.xBOOK_NOW));
				driver.findElement(Elements.xBOOK_NOW).click();
				wait.until(ExpectedConditions.visibilityOfElementLocated(Elements.xcorporate_under_book_now));
				driver.findElement(Elements.xcorporate_under_book_now).click();
				driver.findElement(Elements.xhappyhr_under_company_under_book_now).click();
				wait.until(ExpectedConditions.urlToBe("https://www.mainevent.com/event/corporate-package/happyhour"));
				Thread.sleep(1500);
			}
			else if(i==9) {
				wait.until(ExpectedConditions.visibilityOfElementLocated(Elements.xBOOK_NOW));
				driver.findElement(Elements.xBOOK_NOW).click();
				wait.until(ExpectedConditions.visibilityOfElementLocated(Elements.xcorporate_under_book_now));
				driver.findElement(Elements.xcorporate_under_book_now).click();
				driver.findElement(Elements.xffbuyout_under_company_under_book_now).click();
				wait.until(ExpectedConditions.urlToBe("https://www.mainevent.com/event/corporate-package/fullfacilitybuyout"));
				Thread.sleep(1500);
			}
			else if(i==10) {
				wait.until(ExpectedConditions.visibilityOfElementLocated(Elements.xBOOK_NOW));
				driver.findElement(Elements.xBOOK_NOW).click();
				wait.until(ExpectedConditions.visibilityOfElementLocated(Elements.xgroup_under_book_now));
				driver.findElement(Elements.xgroup_under_book_now).click();
				driver.findElement(Elements.xfundraiser_under_group_under_book_now).click();
				wait.until(ExpectedConditions.urlToBe("https://www.mainevent.com/event/group-package/fundraisers"));
				Thread.sleep(1500);
			}
			else if(i==11) {
				wait.until(ExpectedConditions.visibilityOfElementLocated(Elements.xBOOK_NOW));
				driver.findElement(Elements.xBOOK_NOW).click();
				wait.until(ExpectedConditions.visibilityOfElementLocated(Elements.xgroup_under_book_now));
				driver.findElement(Elements.xgroup_under_book_now).click();
				driver.findElement(Elements.xschool_under_group_under_book_now).click();
				wait.until(ExpectedConditions.urlToBe("https://www.mainevent.com/event/group-package/school"));
				Thread.sleep(1500);
			}
			else if(i==12) {
				wait.until(ExpectedConditions.visibilityOfElementLocated(Elements.xBOOK_NOW));
				driver.findElement(Elements.xBOOK_NOW).click();
				wait.until(ExpectedConditions.visibilityOfElementLocated(Elements.xgroup_under_book_now));
				driver.findElement(Elements.xgroup_under_book_now).click();
				driver.findElement(Elements.xyouthevents_under_group_under_book_now).click();
				wait.until(ExpectedConditions.urlToBe("https://www.mainevent.com/event/group-package/youthgroup"));
				Thread.sleep(1500);
			}
			else if(i==13) {
				wait.until(ExpectedConditions.visibilityOfElementLocated(Elements.xBOOK_NOW));
				driver.findElement(Elements.xBOOK_NOW).click();
				wait.until(ExpectedConditions.visibilityOfElementLocated(Elements.xgroup_under_book_now));
				driver.findElement(Elements.xgroup_under_book_now).click();
				driver.findElement(Elements.xlockins_under_group_under_book_now).click();
				wait.until(ExpectedConditions.urlToBe("https://www.mainevent.com/event/group-package/lockin"));
				Thread.sleep(1500);
			}
			else if(i==14) {
				wait.until(ExpectedConditions.visibilityOfElementLocated(Elements.xBOOK_NOW));
				driver.findElement(Elements.xBOOK_NOW).click();
				wait.until(ExpectedConditions.visibilityOfElementLocated(Elements.xgroup_under_book_now));
				driver.findElement(Elements.xgroup_under_book_now).click();
				driver.findElement(Elements.xendofseason_under_group_under_book_now).click();
				wait.until(ExpectedConditions.urlToBe("https://www.mainevent.com/event/group-package/sportsendofseason"));
				Thread.sleep(1500);
			}
			String url=driver.getCurrentUrl();
			ec.eWrite(23+i, 2, url);
		}
		logger.log(LogStatus.PASS, "All the subsection falling under BOOK NOW i.e subsections under i-Birthday  ii-Bowling iii-Corporate Events iv-Group Events are Navigated successfully URL of the pages are fetched properly in the excel sheet kindly refer for complete validation ");
		//ec.eLaunch(a, 0);
		//ec.eWrite(20, 11, "pass");
		//}
		//catch(Exception e){
			//logger.log(LogStatus.FAIL, "All the subsection falling under BOOK NOW i.e subsections under i-Birthday  ii-Bowling iii-Corporate Events iv-Group Events are Navigated successfully URL of the pages are fetched properly in the excel sheet kindly refer for complete validation ");
		//}
	}
	public void verify_EAT_AND_DRINK(WebDriver driver,ExtentTest logger) throws Exception//All Validations under EAT AND DRINK
	{
		try {
		//ec.eLaunch(a, 0);
		driver.findElement(Elements.xHEADER_MAIN_EVENT_LOGO).click();
		Thread.sleep(2000);
		//ec.eWrite(31, 11, "pass");
		driver.findElement(Elements.xEAT_AND_DRINK).click();
		Thread.sleep(2000);
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(Elements.xBar_under_EAT_AND_DRINK));
		result=driver.findElement(Elements.xEAT_AND_DRINK).isEnabled();
		Assert.assertTrue(result);
		//ec.eWrite(32, 11, "pass");
		result=driver.findElement(Elements.xBar_under_EAT_AND_DRINK).isDisplayed();
		Assert.assertTrue(result);
		result=driver.findElement(Elements.xDining_under_EAT_AND_DRINK).isDisplayed();
		Assert.assertTrue(result);
		result=driver.findElement(Elements.xEventMenu_under_EAT_AND_DRINK).isDisplayed();
		Assert.assertTrue(result);	
		for(int i=0;i<=2;i++)
		{
			ec.eLaunch(a, 1);
			if(i==0) {
				driver.findElement(Elements.xBar_under_EAT_AND_DRINK).click();
				Thread.sleep(1500);
			}
			else if(i==1) {
				wait.until(ExpectedConditions.elementToBeClickable(Elements.xEAT_AND_DRINK));
				driver.findElement(Elements.xEAT_AND_DRINK).click();
				driver.findElement(Elements.xDining_under_EAT_AND_DRINK).click();
				Thread.sleep(1500);
			}
			else if(i==2) {
				wait.until(ExpectedConditions.elementToBeClickable(Elements.xEAT_AND_DRINK));
				driver.findElement(Elements.xEAT_AND_DRINK).click();
				driver.findElement(Elements.xEventMenu_under_EAT_AND_DRINK).click();
				Thread.sleep(1500);
			}
			String url=driver.getCurrentUrl();
			ec.eWrite(38+i, 2, url);
			
		}
		logger.log(LogStatus.PASS, "ALL the Subsections under EAT AND DRINK header section are visible and navigated properly URL of the navigated pages are fetched in the excel sheet kindly refer for complete validation");
		//ec.eWrite(33, 11, "pass");
		}
		catch(Exception e) {
			logger.log(LogStatus.FAIL, "ALL the Subsections under EAT AND DRINK header section are visible and navigated properly URL of the navigated pages are fetched in the excel sheet kindly refer for complete validation");
		}
	}
	public void verify_Games_And_Activities(WebDriver driver,ExtentTest logger) throws Exception//All Validations under GAMES AND ACTIVITIES
	{
		try {
		//ec.eLaunch(a, 0);
		driver.findElement(Elements.xHEADER_MAIN_EVENT_LOGO).click();
		Thread.sleep(2000);
		//ec.eWrite(34, 11, "pass");
		driver.findElement(Elements.xGames_And_Activities).click();
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(Elements.xBowling_under_Games_And_Activities));
		result=driver.findElement(Elements.xGames_And_Activities).isEnabled();
		Assert.assertTrue(result);
		//ec.eWrite(35, 11, "pass");
		result=driver.findElement(Elements.xGames_And_Activities).isDisplayed();
		Assert.assertTrue(result);
		for(int i=0;i<=8;i++)
		{
			ec.eLaunch(a, 1);
			if(i==0) {
				result=driver.findElement(Elements.xBowling_under_Games_And_Activities).isDisplayed();
				Assert.assertTrue(result);
				driver.findElement(Elements.xBowling_under_Games_And_Activities).click();
				Thread.sleep(1500);
			}
			else if(i==1) {
				wait.until(ExpectedConditions.elementToBeClickable(Elements.xGames_And_Activities));
				driver.findElement(Elements.xGames_And_Activities).click();
				result=driver.findElement(Elements.xArcade_under_Games_And_Activities).isDisplayed();
				Assert.assertTrue(result);
				driver.findElement(Elements.xArcade_under_Games_And_Activities).click();
				Thread.sleep(1500);
			}
			else if(i==2) {
				wait.until(ExpectedConditions.elementToBeClickable(Elements.xGames_And_Activities));
				driver.findElement(Elements.xGames_And_Activities).click();
				result=driver.findElement(Elements.xLaser_under_Games_And_Activities).isDisplayed();
				Assert.assertTrue(result);
				driver.findElement(Elements.xLaser_under_Games_And_Activities).click();
				Thread.sleep(1500);
			}
			else if(i==3) {
				wait.until(ExpectedConditions.elementToBeClickable(Elements.xGames_And_Activities));
				driver.findElement(Elements.xGames_And_Activities).click();
				result=driver.findElement(Elements.xBilliards_under_Games_And_Activities).isDisplayed();
				Assert.assertTrue(result);
				driver.findElement(Elements.xBilliards_under_Games_And_Activities).click();
				Thread.sleep(1500);
			}
			else if(i==4) {
				wait.until(ExpectedConditions.elementToBeClickable(Elements.xGames_And_Activities));
				driver.findElement(Elements.xGames_And_Activities).click();
				result=driver.findElement(Elements.xGravity_under_Games_And_Activities).isDisplayed();
				Assert.assertTrue(result);
				driver.findElement(Elements.xGravity_under_Games_And_Activities).click();
				Thread.sleep(1500);
			}
			else if(i==5) {
				wait.until(ExpectedConditions.elementToBeClickable(Elements.xGames_And_Activities));
				driver.findElement(Elements.xGames_And_Activities).click();
				result=driver.findElement(Elements.xKaraoke_under_Games_And_Activities).isDisplayed();
				Assert.assertTrue(result);
				driver.findElement(Elements.xKaraoke_under_Games_And_Activities).click();
				Thread.sleep(1500);
			}
			else if(i==6) {
				wait.until(ExpectedConditions.elementToBeClickable(Elements.xGames_And_Activities));
				driver.findElement(Elements.xGames_And_Activities).click();
				result=driver.findElement(Elements.xmini_under_Games_And_Activities).isDisplayed();
				Assert.assertTrue(result);
				driver.findElement(Elements.xmini_under_Games_And_Activities).click();
				Thread.sleep(1500);
			}
			else if(i==7) {
				wait.until(ExpectedConditions.elementToBeClickable(Elements.xGames_And_Activities));
				driver.findElement(Elements.xGames_And_Activities).click();
				result=driver.findElement(Elements.xRock_under_Games_And_Activities).isDisplayed();
				Assert.assertTrue(result);
				driver.findElement(Elements.xRock_under_Games_And_Activities).click();
				Thread.sleep(1500);
			}
			else if(i==8) {
				wait.until(ExpectedConditions.elementToBeClickable(Elements.xGames_And_Activities));
				driver.findElement(Elements.xGames_And_Activities).click();
				result=driver.findElement(Elements.xVR_under_Games_And_Activities).isDisplayed();
				Assert.assertTrue(result);
				driver.findElement(Elements.xVR_under_Games_And_Activities).click();
				Thread.sleep(1500);
				
			}
			String url=driver.getCurrentUrl();
			ec.eWrite(41+i, 2, url);
		
		}
		logger.log(LogStatus.PASS, "ALL the Subsections under GAMES AND ACTIVITIES header section are visible and navigated properly URL of the navigated pages are fetched in the excel sheet kindly refer for complete validation");
		//ec.eLaunch(a, 0);
		//ec.eWrite(36, 11, "pass");
		}
		catch(Exception e) {
			logger.log(LogStatus.FAIL, "ALL the Subsections under GAMES AND ACTIVITIES header section are visible and navigated properly URL of the navigated pages are fetched in the excel sheet kindly refer for complete validation");
		}
	}
	public void verify_Parties_and_events(WebDriver driver,ExtentTest logger) throws Exception//All Validations under Parties and Events
	{
		try {
		//ec.eLaunch(a, 0);
		driver.findElement(Elements.xHEADER_MAIN_EVENT_LOGO).click();
		Thread.sleep(2000);
		//ec.eWrite(37, 11, "pass");
		driver.findElement(Elements.xPARTIES_AND_EVENT_BUTTON).click();
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(Elements.xkidsbday_under_parties));
		Assert.assertTrue(result);
		//ec.eWrite(38, 11, "pass");
		for(int i=0;i<=3;i++)
		{
			ec.eLaunch(a, 1);
			if(i==0) {
				result=driver.findElement(Elements.xkidsbday_under_parties).isDisplayed();
				Assert.assertTrue(result);
				driver.findElement(Elements.xkidsbday_under_parties).click();
				Thread.sleep(1500);
			}
			else if(i==1) {
				wait.until(ExpectedConditions.elementToBeClickable(Elements.xPARTIES_AND_EVENT_BUTTON));
				driver.findElement(Elements.xPARTIES_AND_EVENT_BUTTON).click();
				result=driver.findElement(Elements.xadultsbday_under_parties).isDisplayed();
				Assert.assertTrue(result);
				driver.findElement(Elements.xadultsbday_under_parties).click();
				Thread.sleep(1500);
			}
			else if(i==2) {
				wait.until(ExpectedConditions.elementToBeClickable(Elements.xPARTIES_AND_EVENT_BUTTON));
				driver.findElement(Elements.xPARTIES_AND_EVENT_BUTTON).click();
				result=driver.findElement(Elements.xcompnay_events_under_parties).isDisplayed();
				Assert.assertTrue(result);
				driver.findElement(Elements.xcompnay_events_under_parties).click();
				Thread.sleep(1500);
			}
			else {
				wait.until(ExpectedConditions.elementToBeClickable(Elements.xPARTIES_AND_EVENT_BUTTON));
				driver.findElement(Elements.xPARTIES_AND_EVENT_BUTTON).click();
				result=driver.findElement(Elements.xgroup_events_under_parties).isDisplayed();
				Assert.assertTrue(result);
				driver.findElement(Elements.xgroup_events_under_parties).click();
				Thread.sleep(1500);
			}
			String url=driver.getCurrentUrl();
			ec.eWrite(50+i, 2, url);
		}
		logger.log(LogStatus.PASS, "ALL the Subsections under PARTIES AND EVENTS header section are visible and navigated properly URL of the navigated pages are fetched in the excel sheet kindly refer for complete validation");
		//ec.eLaunch(a, 0);
		//ec.eWrite(39, 11, "pass");
	}
	catch(Exception e) {
		logger.log(LogStatus.FAIL, "ALL the Subsections under PARTIES AND EVENTS header section are visible and navigated properly URL of the navigated pages are fetched in the excel sheet kindly refer for complete validation");
	}
	}
	public void verify_FUNCARDS(WebDriver driver,ExtentTest logger) throws Exception//All Validations under Parties and Events
	{
	try {
		//ec.eLaunch(a, 0);
		driver.findElement(Elements.xHEADER_MAIN_EVENT_LOGO).click();
		Thread.sleep(2000);
		//ec.eWrite(40, 11, "pass");
		driver.findElement(Elements.xFUNCARD_BUTTON).click();
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(Elements.xbuy_under_Funcards));
		Assert.assertTrue(result);
		//ec.eWrite(41, 11, "pass");
		for(int i=0;i<=1;i++)
		{
			ec.eLaunch(a, 1);
			if(i==0) {
				result=driver.findElement(Elements.xACCOUNT_BUTTON_under_parties).isDisplayed();
				Assert.assertTrue(result);
				driver.findElement(Elements.xACCOUNT_BUTTON_under_parties).click();
				Thread.sleep(1500);
				Actions action= new Actions(driver);
				action.keyDown(Keys.CONTROL).keyDown(Keys.SHIFT).sendKeys(Keys.TAB).build().perform();
			}
			else {
				driver.findElement(Elements.xFUNCARD_BUTTON).click();
				result=driver.findElement(Elements.xCHECKBALANCE_under_Funcards).isDisplayed();
				Assert.assertTrue(result);
				driver.findElement(Elements.xCHECKBALANCE_under_Funcards).click();
				Thread.sleep(1500);
			}
			String url=driver.getCurrentUrl();
			ec.eWrite(54+i, 2, url);
		}
		logger.log(LogStatus.PASS, "ALL the Subsections under FUNCARD header section are visible and navigated properly URL of the navigated pages are fetched in the excel sheet kindly refer for complete validation");
		//ec.eLaunch(a, 0);
		//ec.eWrite(42, 11, "pass");
	}
	catch(Exception e) {
		logger.log(LogStatus.FAIL, "ALL the Subsections under FUNCARD header section are visible and navigated properly URL of the navigated pages are fetched in the excel sheet kindly refer for complete validation");
	}
	}
}
	

