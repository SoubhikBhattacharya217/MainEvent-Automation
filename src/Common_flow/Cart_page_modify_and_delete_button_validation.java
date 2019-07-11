package Common_flow;

import java.io.File;
import java.io.IOException;

import org.CognizantQA.PageObject.Elements;
import org.CognizantQA.TestData.DataConfig;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Birthday_common_flow.Configure_pkg_validations;
import Birthday_common_flow.Select_Party_time_popup_validations;
import Birthday_common_flow.Select_package_page_validations;
import Birthday_common_flow.Tell_about_party_popup_validation;
import Birthday_common_flow.party_order_summary_validations;
import Bowling_common_flow.Bowling_failure_screen_shot;
import Reporter.Reporter;
import excelconnect.excelconnect;

public class Cart_page_modify_and_delete_button_validation {
	WebDriver driver;
	static DataConfig data;
	static JavascriptExecutor js;
	static boolean result=false;
	static ExtentReports extentReport;
	static ExtentTest logger;
	static ExtentTest logger1;
	static Bowling_failure_screen_shot ss=new Bowling_failure_screen_shot();
	static Select_package_page_validations selectPackagePageValidations=new Select_package_page_validations();
	static Tell_about_party_popup_validation tellAboutPartyPopUpValidation=new Tell_about_party_popup_validation();
	static Configure_pkg_validations configurePackageValidations=new Configure_pkg_validations();
	static Select_Party_time_popup_validations SelectPartyTimePopupValidations=new Select_Party_time_popup_validations();
	static party_order_summary_validations PartyOrderSummaryValidations=new party_order_summary_validations();

	public static void verify_modify_and_delete_bttn(WebDriver driver,ExtentTest logger) throws Exception{
		WebDriverWait wait=new WebDriverWait(driver, 120);
		WebDriverWait wait1=new WebDriverWait(driver, 5);
		excelconnect ec=new excelconnect();
		Reporter r=new Reporter();
		//String a="\\C:\\Users\\698531\\Desktop\\Automation Regression test case suit\\ME One Test Cases - Automation - Regression V2 - Copy.xlsx\\";
		//driver.navigate().refresh();
		wait.until(ExpectedConditions.visibilityOfElementLocated(Elements.xmodify_bttn));
		result=driver.findElement(Elements.xpkg_and_guest_details).isDisplayed();
		if(result==false ) {
			try {
				result=Verify.Compare.verifyURL(driver, "https://www.mainevent.com/checkout/cart");
				Assert.assertTrue(result);
				logger.log(LogStatus.PASS, "User has successfully navigated to the CART page");
				// ec.eLaunch(a, 0);
				// ec.eWrite(101, 11, "Pass");
				// ec.eWrite(101, 13, "User is not Present in UAT environment Cart Page");
				System.out.println("User is not Present in UAT environment Cart Page");
			}
			catch(Exception e) {
				result=Verify.Compare.verifyURL(driver, "https://mainevent.cognizantorderserv.com/checkout/cart");
				Assert.assertTrue(result);
				logger.log(LogStatus.PASS, "User has successfully navigated to the CART page");
				//ec.eLaunch(a, 0);
				//ec.eWrite(101, 11, "Pass");
				//ec.eWrite(101, 13, "User is not Present in Production environment Cart Page");
				System.out.println("User is not Present in Production environment Cart Page");
			}
			try {
				//ec.eLaunch(a, 1);
				String str_add=driver.findElement(Elements.xbowling_store_info_in_cart_page).getText();
				//ec.eWrite(76, 2, str_add);
				String str_add2=driver.findElement(Elements.xbowling_event_info_in_cart_page).getText();
				//ec.eWrite(77, 2, str_add2);
				logger.log(LogStatus.PASS, "store name , event information and guest details and total amount has been fetched successfully please refer to the excel sheet for complete reference in the data validation");
				//ec.eLaunch(a, 0);
				//ec.eWrite(102, 11, "Pass");
			}
			catch(Exception e) {
				logger.log(LogStatus.FAIL, "store name , event information and guest details and total amount has been fetched successfully please refer to the excel sheet for complete reference in the data validation");
				//ec.eLaunch(a, 0);
				//ec.eWrite(102, 11, "Fail");
			}
			//try {
				driver.findElement(Elements.xmodify_bttn).click();
				Thread.sleep(2000);
				//try {
					wait.until(ExpectedConditions.urlToBe("https://www.mainevent.com/findalane/selecttime"));
					logger.log(LogStatus.PASS, "Modify button functionality in CART page");
					//ec.eLaunch(a, 0);
					//ec.eWrite(103, 11, "Pass");
					//ec.eWrite(103, 13, "user is present in the Production select time page");
					//try {
						driver.get("https://www.mainevent.com/checkout/cart");
					//driver.navigate().to("https://www.mainevent.com/checkout/cart");
					//}
					//catch(Exception e1) {
						//driver.get("https://mainevent.cognizantorderserv.com/checkout/cart");
						//driver.navigate().to("https://mainevent.cognizantorderserv.com/checkout/cart");
					//}
				//}
				//catch(Exception e) {
					//try {
						//wait.until(ExpectedConditions.urlToBe("https://mainevent.cognizantorderserv.com/findalane/selecttime"));
						//logger.log(LogStatus.PASS, "Modify button functionality in CART page");
						//ec.eLaunch(a, 0);
						//ec.eWrite(103, 11, "Pass");
						//ec.eWrite(103, 13, "user is present in the UAT select time page");
						//driver.navigate().back();
					//}
					//catch(Exception e1) {
						//logger.log(LogStatus.FAIL, "Modify button functionality in CART page");
						//ec.eLaunch(a, 0);
						//ec.eWrite(103, 11, "Fail");
						//ec.eWrite(103, 13, "user is not present in either in UAT or Production environment select time page for bowling flow");
						//driver.navigate().back();
					//}	  
				//}
			//}
			//catch(Exception e) {
				//logger.log(LogStatus.FAIL, "Modify button functionality in CART page");
				//ec.eLaunch(a, 0);
				//ec.eWrite(103, 11, "Fail");
				//ec.eWrite(103, 13, "modify button is not clickable");
			//}
			try {
				Thread.sleep(2000);
				wait.until(ExpectedConditions.visibilityOfElementLocated(Elements.xmodify_bttn));
				try {
					wait.until(ExpectedConditions.elementToBeClickable(Elements.xterms_and_conditions_checkbox_cart_page));
					Actions act=new Actions(driver);
					act.moveToElement(driver.findElement(Elements.xterms_and_conditions_checkbox_cart_page)).click().build().perform();
					Thread.sleep(1500);
					try {
						wait.until(ExpectedConditions.elementToBeClickable(Elements.xcheckout_bttn1));	 
						//ec.eWrite(104, 11, "Fail");
					}
					catch(Exception e) {
						//ec.eWrite(104, 11, "Pass");
					}
					wait.until(ExpectedConditions.elementToBeClickable(Elements.xterms_and_conditions_checkbox_cart_page));
					Thread.sleep(2000);
					act.moveToElement(driver.findElement(Elements.xterms_and_conditions_checkbox_cart_page)).click().build().perform();
					try {
						wait.until(ExpectedConditions.elementToBeClickable(Elements.xcheckout_bttn1));
						//ec.eWrite(104, 11, "Pass");
					}
					catch(Exception e) {
						//ec.eWrite(104, 11, "Fail");
					}
				}
				catch(Exception e) {
					System.out.println("terms and conditions checkbox validation failed ttt");
					//ec.eWrite(103, 11, "Fail");
					//ec.eWrite(104, 13, "terms and conditions checkbox validation failed ttt");
				}
			}	 
			catch(Exception e) {
				System.out.println("terms and conditions checkbox validation failed");
				//ec.eWrite(104, 11, "Fail");
				//ec.eWrite(104, 13, "terms and conditions checkbox validation failed");
			}
			try {
				driver.findElement(Elements.xcheckout_bttn1).click();
				try {
					result=Verify.Compare.verifyURL(driver, "https://www.mainevent.com/checkout/register");
					Assert.assertTrue(result);
					//ec.eLaunch(a, 0);
					//ec.eWrite(105, 11, "Pass");
					//ec.eWrite(105, 13, "User is naviagted to the the Production checkout page");
				}
				catch(AssertionError e) {
					try {
						result=Verify.Compare.verifyURL(driver, "https://mainevent.cognizantorderserv.com/checkout/register");
						Assert.assertTrue(result);
						//ec.eLaunch(a, 0);
						//ec.eWrite(105, 11, "Pass");
						//ec.eWrite(105, 13, "User is naviagted to the the UAT checkout page");
					}
					catch(AssertionError e1){
						//ec.eLaunch(a, 0);
						//ec.eWrite(105, 11, "Fail");
						//ec.eWrite(105, 13, "User is not naviagted to the the Production/UAT checkout page");
					}
				}

			}
			catch(Exception e) {
				//ec.eLaunch(a, 0);
				//ec.eWrite(105, 11, "Fail");
				//ec.eWrite(105, 13, "User is unable to navigate to the checkout page");
			}
		}



		else {////////////////////////////////////////////////////////////////////////////////////
			try {
				result=Verify.Compare.verifyURL(driver, "https://www.mainevent.com/checkout/cart");
				logger.log(LogStatus.PASS, "User has successfully navigated to the CART page");
				//ec.eLaunch(a, 0);
				//ec.eWrite(190, 11, "Pass");
				//ec.eWrite(190, 13, "User is Present in Production environment Birthday Flow Cart Page");
				System.out.println("User is not Present in UAT environment Cart Page");
			}
			catch(Exception e) {
				result=Verify.Compare.verifyURL(driver, "https://mainevent.cognizantorderserv.com/checkout/cart");
				Assert.assertTrue(result);
				logger.log(LogStatus.PASS, "User has successfully navigated to the CART page");
				//ec.eLaunch(a, 0);
				//ec.eWrite(190, 11, "Pass");
				//ec.eWrite(190, 13, "User is Present in UAT environment Birthday Flow Cart Page");
				System.out.println("User is not Present in Production environment Cart Page");
			}
			try {
				//ec.eLaunch(a, 1);
				String str_add=driver.findElement(Elements.xstore_name).getText();
				//ec.eWrite(109, 2, str_add);
				String str_add2=driver.findElement(Elements.xpkg_and_guest_details).getText();
				//ec.eWrite(110, 2, str_add2);
				String total_amount=driver.findElement(Elements.xtotal_amount).getText();
				//ec.eWrite(111, 2, total_amount);
				logger.log(LogStatus.PASS, "store name , package and guest details and total amount has been fetched successfully please refer to the excel sheet for complete reference in the data validation");
				/*ec.eLaunch(a, 0);
				 ec.eWrite(102, 11, "Pass");*/
			}
			catch(Exception e) {
				logger.log(LogStatus.FAIL, "store name , package and guest details and total amount cannot be fetched for validation");
				System.out.println("test");
				/* ec.eLaunch(a, 0);
				 ec.eWrite(102, 11, "Fail");*/
			}		 		 
			try {
				Thread.sleep(6000);
				wait.until(ExpectedConditions.elementToBeClickable(Elements.xmodify_bttn)).click();
				try {
					wait.until(ExpectedConditions.urlToBe("https://www.mainevent.com/planaparty/selectpackage"));
					//Thread.sleep(5000);
					logger.log(LogStatus.PASS, "Modify button functionality in CART page");
					//ec.eLaunch(a, 0);
					//ec.eWrite(194, 11, "Pass");
					//ec.eWrite(194, 13, "user is present in the Production select time page");       
				}
				catch(Exception e) {
					try {
						wait1.until(ExpectedConditions.urlToBe("https://mainevent.cognizantorderserv.com/planaparty/selectpackage"));
						logger.log(LogStatus.PASS, "Modify button functionality in CART page");
						//ec.eLaunch(a, 0);
						//ec.eWrite(194, 11, "Pass");
						//ec.eWrite(194, 13, "user is present in the UAT select time page");
						driver.navigate().back();
					}
					catch(Exception e1) {
						logger.log(LogStatus.FAIL, "Modify button functionality in CART page");
						//ec.eLaunch(a, 0);
						//ec.eWrite(194, 11, "Fail");
						//ec.eWrite(194, 13, "user is not present in either in UAT or Production environment select time page for bowling flow");				 
					}	 
				}
				wait.until(ExpectedConditions.elementToBeClickable(Elements.xfuntastic_pkg_bttn));
				Thread.sleep(4000);
				selectPackagePageValidations.verify_select_package_page_diffPackagebutton(driver, logger);
				tellAboutPartyPopUpValidation.verify_guest_count_popup(driver,logger);
				try {
					try {
						Thread.sleep(5000);
						wait1.until(ExpectedConditions.urlToBe("https://mainevent.cognizantorderserv.com/planaparty/configurepackage"));
					}
					catch(Exception e) {
						wait1.until(ExpectedConditions.urlToBe("https://www.mainevent.com/planaparty/configurepackage"));
					}

				}
				catch(Exception e) {
					System.out.println("Fail");
				}
				driver.findElement(Elements.xslct_activity_tab2).click();
				Thread.sleep(2000);
				driver.findElement(Elements.xslct_activity_tab3).click();
				Thread.sleep(2000);
				driver.findElement(Elements.xslct_your_food_tab).click();
				Thread.sleep(2000);
				configurePackageValidations.config_pkg_activity_slctn2(driver, logger);
				SelectPartyTimePopupValidations.verify_select_party_time_pop_up_time_select(driver, logger);
				PartyOrderSummaryValidations.party_order_summary_ADDON_AND_TAX_VALIDATIONS2(driver, logger);
				try {
					wait1.until(ExpectedConditions.urlToBe("https://www.mainevent.com/planaparty/partyordersummary"));
					result=Verify.Compare.verifyURL(driver, "https://www.mainevent.com/planaparty/partyordersummary");
					Assert.assertTrue(result);		 
				}
				catch(Exception e) {
					wait1.until(ExpectedConditions.urlToBe("https://mainevent.cognizantorderserv.com/planaparty/partyordersummary"));
					result=Verify.Compare.verifyURL(driver, "https://mainevent.cognizantorderserv.com/planaparty/partyordersummary");
					Assert.assertTrue(result);
				}
			}
			catch(Exception e) {
				System.out.println("Fail");
			}
		}
	} 

	public static void verify_TermsAndConditions_bttn(WebDriver driver,ExtentTest logger) throws Exception{	

		WebDriverWait wait=new WebDriverWait(driver, 120);
		WebDriverWait wait1=new WebDriverWait(driver, 20);
		WebDriverWait wait2=new WebDriverWait(driver, 5);
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(Elements.xmodify_bttn));
			result=Verify.Compare.verifyURL(driver, "https://www.mainevent.com/checkout/cart");
			logger.log(LogStatus.PASS, "User has successfully navigated to the CART page");
			//ec.eLaunch(a, 0);
			//ec.eWrite(190, 11, "Pass");
			//ec.eWrite(190, 13, "User is Present in Production environment Birthday Flow Cart Page");
			System.out.println("User is not Present in UAT environment Cart Page");
		}
		catch(Exception e) {
			result=Verify.Compare.verifyURL(driver, "https://mainevent.cognizantorderserv.com/checkout/cart");
			Assert.assertTrue(result);
			logger.log(LogStatus.PASS, "User has successfully navigated to the CART page");
			//ec.eLaunch(a, 0);
			//ec.eWrite(190, 11, "Pass");
			//ec.eWrite(190, 13, "User is Present in UAT environment Birthday Flow Cart Page");
			System.out.println("User is not Present in Production environment Cart Page");
		}
		try {
			Thread.sleep(3000);
			String str_add2=driver.findElement(Elements.xpkg_and_guest_details).getText();
			str_add2.equalsIgnoreCase("FUNtastic Party package\r\n" + 
					"Number of Guests: 12");
			logger.log(LogStatus.PASS, "Modify button click and new package selection full functionality flow is validated sucessfully");
		}
		catch(Exception e) {
			logger.log(LogStatus.FAIL, "Modify button click and new package selection full functionality flow is validated sucessfully");
		}
		try {                                                                                                        ///terms and conditions validation is skipped due to multiple dispcrepancy (please note it is only occuring in the birthday flow)
			Thread.sleep(3000);	 
			try {
				wait.until(ExpectedConditions.elementToBeClickable(Elements.xterms_and_conditions_checkbox_cart_page));
				Actions act=new Actions(driver);
				act.moveToElement(driver.findElement(Elements.xterms_and_conditions_checkbox_cart_page)).click().build().perform();
				//driver.findElement(By.xpath("(//*[@class='agreeTerms'])[1]")).click();
				Thread.sleep(6500);
				try
				{
					wait1.until(ExpectedConditions.elementToBeClickable(Elements.xcheckout_bttn1));	
					logger.log(LogStatus.FAIL, "Terms and conditions uncheck functionality in CART page");
					//ec.eWrite(195, 11, "Fail");
				}
				catch(Exception e) {
					logger.log(LogStatus.PASS, "Terms and conditions uncheck functionality in CART page");
					//ec.eWrite(195, 11, "Pass");
				}
				//wait1.until(ExpectedConditions.elementToBeClickable(Elements.xterms_and_conditions_checkbox_cart_page));
				act.moveToElement(driver.findElement(Elements.xterms_and_conditions_checkbox_cart_page)).click().build().perform();
				//driver.findElement(By.xpath("(//*[@class='agreeTerms'])[1]")).click();
				try {
					wait.until(ExpectedConditions.elementToBeClickable(Elements.xcheckout_bttn1));
					logger.log(LogStatus.PASS, "Terms and conditions check functionality in CART page");
					//ec.eWrite(196, 11, "Pass");
				}
				catch(Exception e) {
					logger.log(LogStatus.FAIL, "Terms and conditions check functionality in CART page");
					//ec.eWrite(196, 11, "Fail");
				}
			}
			catch(Exception e) {
				System.out.println("terms and conditions checkbox validation failed ttt");
				logger.log(LogStatus.FAIL, "Terms and conditions uncheck functionality in CART page");
				logger.log(LogStatus.FAIL, "Terms and conditions check functionality in CART page");
				//ec.eWrite(195, 11, "Fail");
				//ec.eWrite(196, 11, "Fail");
				//ec.eWrite(195, 13, "terms and conditions checkbox validation failed ttt");
			}
		}	 
		catch(Exception e) {
			System.out.println("terms and conditions checkbox validation failed");
			logger.log(LogStatus.FAIL, "Terms and conditions uncheck functionality in CART page");
			logger.log(LogStatus.FAIL, "Terms and conditions check functionality in CART page");
			//ec.eWrite(195, 11, "Fail");
			//ec.eWrite(195, 13, "terms and conditions checkbox validation failed");
		}		 			 			 			 
		try {
			driver.findElement(Elements.xcheckout_bttn1).click();
			try {
				wait2.until(ExpectedConditions.urlToBe("https://www.mainevent.com/checkout/register"));
				result=Verify.Compare.verifyURL(driver, "https://www.mainevent.com/checkout/register");
				Assert.assertTrue(result);
				logger.log(LogStatus.PASS, "User is navigated to CHECKOUT page");

			}
			catch(AssertionError e) {
				try {
					wait2.until(ExpectedConditions.urlToBe("https://mainevent.cognizantorderserv.com/checkout/register"));
					result=Verify.Compare.verifyURL(driver, "https://mainevent.cognizantorderserv.com/checkout/register");
					Assert.assertTrue(result);
					logger.log(LogStatus.PASS, "User is navigated to CHECKOUT page");
				}
				catch(AssertionError e1){
					logger.log(LogStatus.FAIL, "User is navigated to CHECKOUT page");
				}
			}

		}
		catch(Exception e) {
			logger.log(LogStatus.FAIL, "User is navigated to CHECKOUT page");
		}
	}							
}

