package Birthday_common_flow;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.CognizantQA.PageObject.Elements;
import org.CognizantQA.Properties.PropertiesFile;
import org.CognizantQA.TestData.DataConfig;
import org.apache.commons.io.FileUtils;
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

import Funleague_common_flow.Funleague_failure_screenshots;
import excelconnect.excelconnect;

public class Select_package_page_validations {
	WebDriver driver;
	static boolean result=false;
	static DataConfig data;
	excelconnect ec=new excelconnect();
	static Bday_booking_failure_screen_shots ss=new Bday_booking_failure_screen_shots();
	//String a="\\C:\\Users\\698531\\Desktop\\Automation Regression test case suit\\ME One Test Cases - Automation - Regression V2 - Copy.xlsx\\";
	static ExtentReports extentReport;
	static ExtentTest logger;
	
	 public void verify_select_package_page(WebDriver driver, ExtentTest logger) throws Exception {
		// ec.eLaunch(a, 0);
		String testDataPath = PropertiesFile.getDataFromProperty("TestData");
        data = new DataConfig(testDataPath);
        WebDriverWait wait=new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.visibilityOfElementLocated(Elements.xslc_pkg_page_heading1));
        Thread.sleep(2000);
		   List<WebElement> a=driver.findElements(Elements.xslc_pkg_page_heading1);
			for(WebElement item:a)
			{
				String a1=item.getText();
				System.out.println("successfull"+a1);
				Assert.assertEquals(a1, data.getData(0, 19, 1));
				logger.log(LogStatus.PASS, "User is able to view all the heading text correctly in the select a package page");
				break;
			}
			List<WebElement> b=driver.findElements(Elements.xslct_pkg_address_info);
			for(WebElement item:b)
			{
				String b1=item.getText();
				System.out.println("1."+b1);
				Assert.assertEquals(b1, data.getData(0, 20, 1));
				logger.log(LogStatus.PASS, "User is able to view the address information text correctly in the select a package page");
				break;
			}
			try {
				wait.until(ExpectedConditions.elementToBeClickable(Elements.xselect_diff_mainevent_bday_flow));
				logger.log(LogStatus.PASS, "User is able to view and click the select a different Main Event button in the select a package page");
				//ec.eWrite(162, 11, "pass");
			}
			catch(Exception e) {
				System.out.println("change store location validation in Select package BIRTHDAY FLOW Failed");
				logger.log(LogStatus.FAIL, "User is unable to view and click the select a different Main Event button in the select a package page");
			}
			List<WebElement> c=driver.findElements(Elements.xultimate_party_pack_heading);
			for(WebElement item:c)
			{
				Thread.sleep(2000);
				String c1=item.getText();
				System.out.println("1."+c1);
				Assert.assertEquals(c1, data.getData(0, 21, 1));
				//ec.eWrite(170, 11, "pass");
				break;
			}
			List<WebElement> d=driver.findElements(Elements.xultimate_party_packprice_heading);
			for(WebElement item:d)
			{
				String d1=item.getText();
				System.out.println("1."+d1);
				Assert.assertEquals(d1, data.getData(0, 22, 1));
				break;
			}
			List<WebElement> e=driver.findElements(Elements.xultimate_party_pack_subheading1);
			for(WebElement item:e)
			{
				String e1=item.getText();
				System.out.println("1."+e1);
				Assert.assertEquals(e1, data.getData(0, 23, 1));
				break;
			}
			List<WebElement> f=driver.findElements(Elements.xultimate_party_pack_subheading2);
			for(WebElement item:f)
			{
				String f1=item.getText();
				System.out.println("1."+f1);
				Assert.assertEquals(f1, data.getData(0, 24, 1));
				break;
			}
			List<WebElement> g=driver.findElements(Elements.xultimate_party_pack_subheading3);
			for(WebElement item:g)
			{
				String g1=item.getText();
				System.out.println("1."+g1);
				Assert.assertEquals(g1, data.getData(0, 25, 1));
				break;
			}
			List<WebElement> h=driver.findElements(Elements.xultimate_party_pack_subheading4);
			for(WebElement item:h)
			{
				String h1=item.getText();
				System.out.println("1."+h1);
				Assert.assertEquals(h1, data.getData(0, 26, 1));
				break;
			}
			List<WebElement> i=driver.findElements(Elements.xultimate_party_pack_subheading5);
			for(WebElement item:i)
			{
				String i1=item.getText();
				System.out.println("1."+i1);
				Assert.assertEquals(i1, data.getData(0, 27, 1));
				break;
			}
			List<WebElement> j=driver.findElements(Elements.xultimate_party_pack_subheading6);
			for(WebElement item:j)
			{
				String j1=item.getText();
				System.out.println("1."+j1);
				Assert.assertEquals(j1, data.getData(0, 28, 1));
				break;
			}
			List<WebElement> k=driver.findElements(Elements.xultimate_party_pack_subheading7);
			for(WebElement item:k)
			{
				String k1=item.getText();
				System.out.println("1."+k1);
				Assert.assertEquals(k1, data.getData(0, 29, 1));
				break;
			}
			List<WebElement> l=driver.findElements(Elements.xultimate_party_pack_subheading8);
			for(WebElement item:l)
			{
				String l1=item.getText();
				System.out.println("1."+l1);
				Assert.assertEquals(l1, data.getData(0, 30, 1));
				break;
			}
			List<WebElement> m=driver.findElements(Elements.xultimate_party_pack_subheading9);
			for(WebElement item:m)
			{
				String m1=item.getText();
				System.out.println("1."+m1);
				Assert.assertEquals(m1, data.getData(0, 31, 1));
				break;
			}
			logger.log(LogStatus.PASS, "User is able to view all the package details and sub details under the ULTIMATE PARTY PACKAGE : Please note only this package is considered for validation");
			result=driver.findElement(Elements.xslct_the_pkg_bttn).isDisplayed();
			if(result==false)
		      {
				logger.log(LogStatus.FAIL, "User is unable to view the BOOK NOW button under the ULTIMATE PARTY PACKAGE");
		    	ss.takeScreenShot(driver, "select package button is not displayed");
		      }
			Assert.assertTrue(result);
			logger.log(LogStatus.PASS, "User is able to view the BOOK NOW button under the ULTIMATE PARTY PACKAGE");
			result=driver.findElement(Elements.xslct_the_pkg_bttn).isEnabled();
			if(result==false)
		      {
				logger.log(LogStatus.FAIL, "User is unable to click the BOOK NOW button under the ULTIMATE PARTY PACKAGE");
		    	 ss.takeScreenShot(driver, "select package button is not clickable");
		      }
			Assert.assertTrue(result);
			logger.log(LogStatus.PASS, "User is able to click the BOOK NOW button under the ULTIMATE PARTY PACKAGE");
			result=driver.findElement(Elements.xcmp_pkg_bttn).isEnabled();
			if(result==false)
		      {
				 logger.log(LogStatus.FAIL, "User is unable to click the Compare Package button ");
				 ss.takeScreenShot(driver, "compare package button is not clickable");
		      }
			Assert.assertTrue(result);
			logger.log(LogStatus.PASS, "User is able to click the Compare Package button ");
			//ec.eWrite(155, 11, "pass");
			driver.findElement(Elements.xcmp_pkg_bttn).click();
			result=driver.findElement(Elements.xcmp_pkg_popup_close_bttn).isEnabled();
			if(result==false)
		      {
				logger.log(LogStatus.FAIL, "User is unable to close the Compare Package popup ");
				 ss.takeScreenShot(driver, "compare package close button is not clickable");
		      }
			Assert.assertTrue(result);
			logger.log(LogStatus.PASS, "User is able to close the Compare Package popup ");
			//ec.eWrite(156, 11, "pass");
			Thread.sleep(2500);
			driver.findElement(Elements.xcmp_pkg_popup_close_bttn).click();
			//ec.eWrite(158, 11, "pass");
			Thread.sleep(2000);
	 }
	 public void verify_select_package_page_button(WebDriver driver, ExtentTest logger) throws Exception{
		    Thread.sleep(3000);
			try {
			driver.findElement(Elements.xslct_the_pkg_bttn).click();
			logger.log(LogStatus.PASS, "User is able to select the ULTIMATE PARTY PACKAGE");
			//ec.eWrite(164, 11, "pass");
			}
			catch(Exception e1) {
				logger.log(LogStatus.FAIL, "User is unable to select the ULTIMATE PARTY PACKAGE");
			}
			
		   }
	 public void verify_select_package_page_diffPackagebutton(WebDriver driver, ExtentTest logger) throws Exception{
		    Thread.sleep(3000);
			try {
			driver.findElement(Elements.xfuntastic_pkg_bttn).click();
			logger.log(LogStatus.PASS, "User is able to select the FUNTASTIC PARTY PACKAGE");
			//ec.eWrite(164, 11, "pass");
			}
			catch(Exception e1) {
				logger.log(LogStatus.FAIL, "User is unable to select the FUNTASTIC PARTY PACKAGE");
			}
			
		   }
}
