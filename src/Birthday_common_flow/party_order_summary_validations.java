package Birthday_common_flow;

import org.CognizantQA.PageObject.Elements;
import org.CognizantQA.TestData.DataConfig;
import org.junit.Assert;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Bowling_common_flow.Bowling_failure_screen_shot;
import Verify.Compare;
import excelconnect.excelconnect;

public class party_order_summary_validations {
	WebDriver driver;
	static DataConfig data;
	static JavascriptExecutor js;
	static boolean result=false;
    static Bowling_failure_screen_shot ss=new Bowling_failure_screen_shot();
	static excelconnect ec=new excelconnect();
	//static String a="\\C:\\Users\\698531\\Desktop\\Automation Regression test case suit\\ME One Test Cases - Automation - Regression V2 - Copy.xlsx\\";
	static ExtentReports extentReport;
	static ExtentTest logger;
	public static void party_order_summary(WebDriver driver, ExtentTest logger) throws Exception{
		WebDriverWait wait=new WebDriverWait(driver,40);
		//ec.eLaunch(a, 0);
		try {         
			wait.until(ExpectedConditions.urlToBe("https://www.mainevent.com/planaparty/partyordersummary"));   //validate that in party order summary page the "continue shopping "and "go to cart" buttons are present (row - 177 - 179)
			result=Compare.verifyURL(driver, "https://www.mainevent.com/planaparty/partyordersummary");
			Assert.assertTrue(result);
			logger.log(LogStatus.PASS, "User is able to navigate to the PARTY ORDER SUMMARY page ");
			//ec.eWrite(176, 11, "pass");
			//ec.eWrite(176, 13, "user is situated in the Production environment");
			result=driver.findElement(Elements.xCONTINUESHOPPING1_partyordersummary).isDisplayed();
			Assert.assertTrue(result);
			result=driver.findElement(Elements.xCONTINUESHOPPING2_partyordersummary).isDisplayed();
			Assert.assertTrue(result);
			//ec.eWrite(177, 11, "pass");
			result=driver.findElement(Elements.xgotocart1_partyordersummary).isDisplayed();
			Assert.assertTrue(result);
			result=driver.findElement(Elements.xgotocart2_partyordersummary).isDisplayed();
			Assert.assertTrue(result);
			logger.log(LogStatus.PASS, "continue shopping and go to cart button are present in the PARTY ORDER SUMMARY page");
			//ec.eWrite(178, 11, "pass");
		}
		catch(AssertionError e) {
			try {
			wait.until(ExpectedConditions.urlToBe("https://mainevent.cognizantorderserv.com/planaparty/partyordersummary"));
			result=Compare.verifyURL(driver, "https://mainevent.cognizantorderserv.com/planaparty/partyordersummary");
			Assert.assertTrue(result);
			logger.log(LogStatus.PASS, "User is able to navigate to the PARTY ORDER SUMMARY page ");
			ec.eWrite(176, 11, "pass");
			ec.eWrite(176, 13, "user is situated in the UAT environment");
			result=driver.findElement(Elements.xCONTINUESHOPPING1_partyordersummary).isDisplayed();
			Assert.assertTrue(result);
			result=driver.findElement(Elements.xCONTINUESHOPPING2_partyordersummary).isDisplayed();
			Assert.assertTrue(result);
			ec.eWrite(177, 11, "pass");
			result=driver.findElement(Elements.xgotocart1_partyordersummary).isDisplayed();
			Assert.assertTrue(result);
			result=driver.findElement(Elements.xgotocart2_partyordersummary).isDisplayed();
			Assert.assertTrue(result);
			logger.log(LogStatus.PASS, "continue shopping and go to cart button are present in the PARTY ORDER SUMMARY page");
			ec.eWrite(178, 11, "pass");
			}
			catch(Exception e1) {
				logger.log(LogStatus.FAIL, "User is unable to navigate to the PARTY ORDER SUMMARY page ");
				logger.log(LogStatus.FAIL, "continue shopping and go to cart button cannot be validated due to navigation issue");
			}
		}
		try {                                                                                                        //Valdiate that all the details are showing including price and person number.
			String store_name=driver.findElement(Elements.xstorename_partyordersummary).getText();
			//ec.eLaunch(a, 1);
			//ec.eWrite(82, 2, store_name);
			String pkg_name1=driver.findElement(Elements.xpkgname1_partyordersummary).getText();
			//ec.eWrite(83, 2, pkg_name1);
			String pkg_name2=driver.findElement(Elements.xpkgname2_partyordersummary).getText();
			//ec.eWrite(84, 2, pkg_name2);
			String calender_details=driver.findElement(Elements.xcalenderdetails_partyordersummary).getText();
			//ec.eWrite(85, 2, calender_details);
			String pkg_price_per_person=driver.findElement(Elements.xpkgpriceperperson_partyordersummary).getText();
			//ec.eWrite(86, 2, pkg_price_per_person);
			logger.log(LogStatus.PASS, "store name  , package details , calender details and package price persons are fetched successfully for complete validation status please refer to the excel sheet");
		}
		catch(Exception e){
			logger.log(LogStatus.FAIL, "store name  , package details , calender details and package price persons cannot be fetched successfully and thus cannot be validated");
			//ec.eLaunch(a, 0);
			//ec.eWrite(179, 11, "Fail");
			//ec.eWrite(180, 11, "Fail");
			//ec.eWrite(181, 11, "Fail");
		}
		try {
			result=driver.findElement(Elements.xselect_diff_store_partyordersummary).isDisplayed();
			Assert.assertTrue(result);
			wait.until(ExpectedConditions.elementToBeClickable(Elements.xselect_diff_store_partyordersummary));
			Thread.sleep(2000);
			driver.findElement(Elements.xselect_diff_store_partyordersummary).click();
			wait.until(ExpectedConditions.elementToBeClickable(Elements.xstore_popupclose_bbtn));
			driver.findElement(Elements.xstore_popupclose_bbtn).click();
			logger.log(LogStatus.PASS, "(Select Different Store) button validation successfull in PARTY ORDER SUMMARY page ");
			//ec.eLaunch(a, 0);
			//ec.eWrite(182, 11, "pass");
			result=driver.findElement(Elements.xselect_diff_pkg_partyordersummary).isDisplayed();
			Assert.assertTrue(result);
			wait.until(ExpectedConditions.elementToBeClickable(Elements.xselect_diff_pkg_partyordersummary));
			driver.findElement(Elements.xselect_diff_pkg_partyordersummary).click();
			try {
				result=Compare.verifyURL(driver, "https://www.mainevent.com/planaparty/selectpackage");
				Assert.assertTrue(result);
				driver.navigate().back();
				logger.log(LogStatus.PASS, "(Select Different Package) button validation successfull in PARTY ORDER SUMMARY page ");
				//ec.eWrite(183, 11, "pass");
			}
			catch(AssertionError e) {
				try {
				result=Compare.verifyURL(driver, "https://mainevent.cognizantorderserv.com/planaparty/selectpackage");
				Assert.assertTrue(result);
				driver.navigate().back();
				logger.log(LogStatus.PASS, "(Select Different Package) button validation successfull in PARTY ORDER SUMMARY page ");
				//ec.eWrite(183, 11, "pass");
				}
				catch(AssertionError e1) {
					logger.log(LogStatus.FAIL, "(Select Different Package) button validation successfull in PARTY ORDER SUMMARY page ");
					//ec.eWrite(183, 11, "Fail");
					}
			}
			result=driver.findElement(Elements.xselect_diff_guestcount_partyordersummary).isDisplayed();
			Assert.assertTrue(result);
			result=driver.findElement(Elements.xselect_diff_time_partyordersummary).isDisplayed();
			Assert.assertTrue(result);
			try {
			wait.until(ExpectedConditions.urlToBe("https://mainevent.cognizantorderserv.com/planaparty/partyordersummary"));
			}
			catch(Exception e) {
			wait.until(ExpectedConditions.urlToBe("https://www.mainevent.com/planaparty/partyordersummary"));
			}
			wait.until(ExpectedConditions.elementToBeClickable(Elements.xselect_diff_guestcount_partyordersummary));
			driver.findElement(Elements.xselect_diff_guestcount_partyordersummary).click();
			wait.until(ExpectedConditions.elementToBeClickable(Elements.xdate_cross_bttn));
			driver.findElement(Elements.xdate_cross_bttn).click();
			wait.until(ExpectedConditions.elementToBeClickable(Elements.xselect_diff_time_partyordersummary));
			driver.findElement(Elements.xselect_diff_time_partyordersummary).click();
			wait.until(ExpectedConditions.elementToBeClickable(Elements.xselect_party_time_cross_bttn));
			driver.findElement(Elements.xselect_party_time_cross_bttn).click();
			logger.log(LogStatus.PASS, "(Select Different Guest Count and Different time) buttons validation successfull in PARTY ORDER SUMMARY page ");
			//ec.eWrite(184, 11, "pass");
		}
		catch(AssertionError e) {
			logger.log(LogStatus.FAIL, "(Select Different Store) button validation successfull in PARTY ORDER SUMMARY page ");
			logger.log(LogStatus.FAIL, "(Select Different Package) button validation successfull in PARTY ORDER SUMMARY page ");
			logger.log(LogStatus.FAIL, "(Select Different Guest Count and Different time) buttons validation successfull in PARTY ORDER SUMMARY page ");
			//ec.eWrite(182, 11, "Fail");
			//ec.eWrite(183, 11, "Fail");
			//ec.eWrite(184, 11, "Fail");
		}	
	}
	public static void party_order_summary_ADDON_AND_TAX_VALIDATIONS(WebDriver driver, ExtentTest logger) throws Exception{
		WebDriverWait wait=new WebDriverWait(driver,40);
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(Elements.xbowling_pin_trophy_text));
			wait.until(ExpectedConditions.visibilityOfElementLocated(Elements.xbowling_pin_trophy_bttn));
			wait.until(ExpectedConditions.visibilityOfElementLocated(Elements.xgoodie_bag_text));
			wait.until(ExpectedConditions.visibilityOfElementLocated(Elements.xgoodie_bag_bttn));
			logger.log(LogStatus.PASS, "Bowling pin trophy and Goddie bag ADD ON text and button validation is successfull in PARTY ORDER SUMMARY page : Please note we have only validated 2 Add Ons in this automated test suit");
			//ec.eLaunch(a, 0);
			//ec.eWrite(185, 11, "pass");
		}
		catch(Exception e) {
			logger.log(LogStatus.FAIL, "Bowling pin trophy and Goddie bag ADD ON text and button validation is successfull in PARTY ORDER SUMMARY page : Please note we have only validated 2 Add Ons in this automated test suit");
			//ec.eLaunch(a, 0);
			//ec.eWrite(185, 11, "Fail");
		}
		try {                                                                                               //All of these tax fetching into the excel sheet is when no addons are added in the cart	
			String sales_tax=driver.findElement(Elements.xsalesTax_withoutaddon).getText();
			//ec.eLaunch(a, 1);
			//ec.eWrite(97, 2, sales_tax);
			String service_charge=driver.findElement(Elements.xserviceTax_withoutaddon).getText();
			//ec.eWrite(98, 2, service_charge);
			String amount_due_today=driver.findElement(Elements.xamount_due_today).getText();
			//ec.eWrite(99, 2, amount_due_today);
			String balance_pay=driver.findElement(Elements.xamount_paylater).getText();
			//ec.eWrite(100, 2, balance_pay);
			String total_amount=driver.findElement(Elements.xtotalwithoutaddon).getText();
			//ec.eWrite(101, 2, total_amount);
			logger.log(LogStatus.PASS, "All tax and payment details are fetched successfully please refer to the excel for complete validation status with RAW data");
			
		}
		catch(Exception e) {
			logger.log(LogStatus.FAIL, "All tax and payment details cannot be fetched and thus cannot be validated");
			//ec.eLaunch(a, 1);
			//ec.eWrite(97, 2, "unable to fetch");
			//ec.eWrite(98, 2, "unable to fetch");
			//ec.eWrite(99, 2, "unable to fetch");
			//ec.eWrite(100, 2, "unable to fetch");
			//ec.eWrite(101, 2, "unable to fetch");
		}
		try {                                                                                                //Only bowling pin trophy addon is added	
			driver.findElement(Elements.xbowling_pin_trophy_bttn).click();
			String sales_tax=driver.findElement(Elements.xsalesTax_withoutaddon).getText();
			//ec.eLaunch(a, 1);
			//ec.eWrite(104, 2, sales_tax);
			String service_charge=driver.findElement(Elements.xserviceTax_withoutaddon).getText();
			//ec.eWrite(105, 2, service_charge);
			String total_amount=driver.findElement(Elements.xtotalwithoutaddon).getText();
			//ec.eWrite(106, 2, total_amount);
			logger.log(LogStatus.PASS, "Both the ADD ONS can be successfully added");
			//ec.eLaunch(a, 0);
			//ec.eWrite(187, 11, "Pass");
		}
		catch(Exception e) {
			logger.log(LogStatus.FAIL, "Both the ADD ONS can be successfully added");
			//ec.eLaunch(a, 1);
			//ec.eWrite(104, 2, "unable to fetch");
			//ec.eWrite(105, 2, "unable to fetch");
			//ec.eWrite(106, 2, "unable to fetch");
		}
		try {
			Thread.sleep(2000);
			 wait.until(ExpectedConditions.elementToBeClickable(Elements.xterms_and_conditions_checkbox));
			 Actions act=new Actions(driver);
			 act.moveToElement(driver.findElement(Elements.xterms_and_conditions_checkbox)).click().build().perform();
			try {
			 //Thread.sleep(2000);
			 wait.until(ExpectedConditions.elementToBeClickable(Elements.xgo_to_cart_bttn1));
			 logger.log(LogStatus.FAIL, "terms and conditions uncheck scenario ");
			 //ec.eLaunch(a, 0);
			 //ec.eWrite(188, 11, "Fail");
			 }
			 catch(Exception e){
				 logger.log(LogStatus.PASS, "terms and conditions uncheck scenario ");
				 //ec.eLaunch(a, 0);
				 //ec.eWrite(188, 11, "Pass");
			 }
			 wait.until(ExpectedConditions.elementToBeClickable(Elements.xterms_and_conditions_checkbox));
			 act.moveToElement(driver.findElement(Elements.xterms_and_conditions_checkbox)).click().build().perform();
			 Thread.sleep(1500);
			 try {
				 wait.until(ExpectedConditions.elementToBeClickable(Elements.xgo_to_cart_bttn1));
				 logger.log(LogStatus.PASS, "terms and conditions check scenario ");
				 //ec.eLaunch(a, 0);
				 //ec.eWrite(189, 11, "Pass");
				 //ec.eWrite(192, 11, "Pass");
				 }
				 catch(Exception e) {
					 logger.log(LogStatus.FAIL, "terms and conditions check scenario ");
					 //ec.eLaunch(a, 0);
					 //ec.eWrite(189, 11, "Fail");
					 //ec.eWrite(192, 11, "Fail");
				 }
		}
		catch(AssertionError e) {
			System.out.println("terms and conditions validation in partyordersummary page unsuccessfull");
		}
		try {
			driver.findElement(Elements.xgo_to_cart_bttn1).click();
			logger.log(LogStatus.PASS, "GO TO CART button click is successfully done");
		}
		catch(Exception e) {
			logger.log(LogStatus.FAIL, "GO TO CART button click is successfully done");
			//ec.eWrite(193, 11, "Fail");
			//ec.eWrite(193, 12, "User is unable to click the go to cart button");
		}
	}
	
	
	public static void party_order_summary_ADDON_AND_TAX_VALIDATIONS2(WebDriver driver, ExtentTest logger) throws Exception{
		WebDriverWait wait=new WebDriverWait(driver,40);
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(Elements.xbowling_pin_trophy_text));
			wait.until(ExpectedConditions.visibilityOfElementLocated(Elements.xbowling_pin_trophy_bttn));
			wait.until(ExpectedConditions.visibilityOfElementLocated(Elements.xgoodie_bag_text));
			wait.until(ExpectedConditions.visibilityOfElementLocated(Elements.xgoodie_bag_bttn));
			logger.log(LogStatus.PASS, "Bowling pin trophy and Goddie bag ADD ON text and button validation is successfull in PARTY ORDER SUMMARY page : Please note we have only validated 2 Add Ons in this automated test suit");
		}
		catch(Exception e) {
			logger.log(LogStatus.FAIL, "Bowling pin trophy and Goddie bag ADD ON text and button validation is successfull in PARTY ORDER SUMMARY page : Please note we have only validated 2 Add Ons in this automated test suit");

		}
		
		try {                                                                                                //Only bowling pin trophy addon is added	
			driver.findElement(Elements.xbowling_pin_trophy_bttn).click();
			logger.log(LogStatus.PASS, "Both the ADD ONS can be successfully added");	
		}
		catch(Exception e) {
			logger.log(LogStatus.FAIL, "Both the ADD ONS can be successfully added");
		}
		try {
			driver.findElement(Elements.xgo_to_cart_bttn1).click();
			logger.log(LogStatus.PASS, "GO TO CART button click is successfully done");
		}
		catch(Exception e) {
			logger.log(LogStatus.FAIL, "GO TO CART button click is successfully done");
			//ec.eWrite(193, 11, "Fail");
			//ec.eWrite(193, 12, "User is unable to click the go to cart button");
		}
	}
}
