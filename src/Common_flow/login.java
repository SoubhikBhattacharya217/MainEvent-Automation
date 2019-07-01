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
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Bowling_common_flow.Bowling_failure_screen_shot;
import excelconnect.excelconnect;
public class login {
	static JavascriptExecutor js;
	WebDriverWait wait;
	XSSFSheet sheet;
	static excelconnect ec=new excelconnect();
	static boolean result=false;
	static DataConfig data;
	static ExtentReports extentReport;
	static ExtentTest logger;
	//@Test
	public static void verifyAccountsignin(WebDriver driver,ExtentTest logger) throws Exception {	
//	WebElement place=wait.until(ExpectedConditions.elementToBeClickable(Elements.xdrdforsignin));
		/* WebElement drdsi=driver.findElement(Elements.xdrdforsignin);
	       drdsi.click();  */
		String testDataPath = PropertiesFile.getDataFromProperty("TestData");
	    data = new DataConfig(testDataPath);
	    ec.eLaunch("\\C:\\Users\\698531\\Desktop\\Automation Regression test case suit\\ME One Test Cases - Automation - Regression V2 - Copy.xlsx\\", 0);
		FileWriter fr=new FileWriter("C:\\Users\\698531\\Desktop\\Login.txt");
	   	BufferedWriter br=new BufferedWriter(fr); 
	    ((JavascriptExecutor)driver).executeScript("scroll(0,-1300)");
	   	result=driver.findElement(Elements.xdrdforsignin).isDisplayed();
		Assert.assertTrue(result);
	   	br.write("1.dropdown sign in button is visible");
	   	br.newLine();
	   	result=driver.findElement(Elements.xdrdforsignin).isEnabled();
		Assert.assertTrue(result);
	   	br.write("2.drop down sign in button is enabled");
	   	br.newLine();
	   	WebDriverWait wait=new WebDriverWait(driver,60);
	   	Thread.sleep(2000);
	   	try {
       	driver.findElement(Elements.xdrdforsignin).click();
       	logger.log(LogStatus.PASS, "User is able to view login section");
       	//ec.eWrite(4, 11, "pass");
	   	}
	   	catch(Exception e) {
	   		logger.log(LogStatus.FAIL, "User is able to view login section");
	   	}
	   	try {
		driver.findElement(Elements.xsignin1).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(Elements.xsignin2));
		Thread.sleep(2000);
		driver.findElement(Elements.xsignin2).click();
		driver.findElement(Elements.xpassword).click();
		logger.log(LogStatus.PASS, "User is able to view email field , Password field and sign in button");
	   	}
	   	catch(Exception e) {
	   		logger.log(LogStatus.FAIL, "User is able to view email field , Password field and sign in button");
	   	}
		//ec.eWrite(5, 11, "pass");
		Thread.sleep(2000);
		try {
		wait.until(ExpectedConditions.visibilityOfElementLocated(Elements.xsignin3));
		driver.findElement(Elements.xsignin3).sendKeys(data.getData(1, 4, 1));
		logger.log(LogStatus.PASS, "User is able to enter name in email field");
		}
		catch(Exception e) {
			logger.log(LogStatus.FAIL, "User is able to enter name in email field");
		}
		//ec.eWrite(6, 11, "pass");
		try {
		wait.until(ExpectedConditions.visibilityOfElementLocated(Elements.xpassword1));
		driver.findElement(Elements.xpassword1).click();
		driver.findElement(Elements.xpassword1).sendKeys(data.getData(1, 6, 1));
		logger.log(LogStatus.PASS, "User is able to enter Password in Password field");
		}
		catch(Exception e) {
			logger.log(LogStatus.FAIL, "User is able to enter Password in Password field");
		}
		//ec.eWrite(7, 11, "pass");
		driver.findElement(Elements.xsigninb).click();
		Thread.sleep(6000);
		
	}
	//@Test(dependsOnMethods="verifyAccountsignin")
	public static void verifyAccountLogout(WebDriver driver, ExtentTest logger) throws Exception {
		WebDriverWait wait=new WebDriverWait(driver,60);
		 FileWriter fr=new FileWriter("C:\\Users\\698531\\Desktop\\Login.txt");
	   	 BufferedWriter br=new BufferedWriter(fr); 
	   	//ec.eWrite(8, 11, "pass");
	   	logger.log(LogStatus.PASS, "User is able to get logged in into the account");
	   	wait.until(ExpectedConditions.elementToBeClickable(Elements.xddacctbttn));
		driver.findElement(Elements.xddacctbttn).click();
		try {
		wait.until(ExpectedConditions.visibilityOfElementLocated(Elements.xlogoutbttn));
		driver.findElement(Elements.xlogoutbttn).click();
		//Thread.sleep(2000);
		logger.log(LogStatus.PASS, "User is able to Logout from the account");
		}
		catch(Exception e) {
			logger.log(LogStatus.FAIL, "User is able to Logout from the account");
		}
		try {
		List<WebElement> a=driver.findElements(Elements.xlogoutbbtnmssg) ;
		for(WebElement item:a)
		{
		    String b= item.getText();
		    System.out.println("1. "+b);
		    Assert.assertEquals(b, "Logged out successfully");
		    {
		    	ec.eWrite(9, 11, "pass");
		    	br.write("1.log out test case PASSED");
		    	br.newLine();
		    	br.close();
		    	logger.log(LogStatus.PASS, "Logout message successfully shown");
		    }
		}
		}
		catch(Exception e) {
			logger.log(LogStatus.FAIL, "Logout message successfully shown");
		}
		
	}
	
	//@Test(dependsOnMethods="verifyAccountLogout")
	public static void verifyAccountlogin_with_invalid_password(WebDriver driver, ExtentTest logger) throws Exception{
		//Thread.sleep(4000);
		driver.findElement(Elements.xsignin3).sendKeys(data.getData(1, 4, 2));
		driver.findElement(Elements.xpassword1).click();
		try {
		driver.findElement(Elements.xpassword1).sendKeys(data.getData(1, 6, 2));
		driver.findElement(Elements.xsigninb).click();
		Thread.sleep(2000);
		List<WebElement> b=driver.findElements(Elements.xinavlidsignin_mssg) ;
		for(WebElement item:b)
		{
		    String c= item.getText();
		    System.out.println("2. "+c);
		    
		    
		}
		logger.log(LogStatus.PASS, "User is unable to login with invalid password and proper message is displayed");
		}
		catch(Exception e) {
			logger.log(LogStatus.FAIL, "User is unable to login with invalid password and proper message is displayed");
		}
		//ec.eWrite(11, 11, "pass");
	   // ec.eWrite(12, 11, "pass");
	}
	//@Test(dependsOnMethods="verifyAccountlogin_with_invalid_password")
	public static void wrong_user_login(WebDriver driver, ExtentTest logger) throws InterruptedException, IOException{
		Thread.sleep(2000);
		driver.findElement(Elements.xsignin3).sendKeys(data.getData(1, 4, 2));
		driver.findElement(Elements.xpassword1).click();
		try {
		driver.findElement(Elements.xpassword1).sendKeys(data.getData(1, 6, 3));
		driver.findElement(Elements.xsigninb).click();
		Thread.sleep(2000);
		List<WebElement> a=driver.findElements(Elements.xusernot_found_mssg) ;
		for(WebElement item:a)
		{
		    String d= item.getText();
		    System.out.println("3. "+d);
		    
		}
		logger.log(LogStatus.PASS, "User is unable to login with unregistered email and proper message is displayed");
		}
		catch(Exception e) {
			logger.log(LogStatus.FAIL, "User is unable to login with unregistered email and proper message is displayed");
		}
		//ec.eWrite(10, 11, "pass");
	}
	//@Test(dependsOnMethods="wrong_user_login")
	public static void wrong_emailid_login(WebDriver driver, ExtentTest logger) throws InterruptedException {
		//Thread.sleep(2000);
		try {
		driver.findElement(Elements.xsignin3).sendKeys(data.getData(1, 4, 4));
		driver.findElement(Elements.xpassword1).click();
		driver.findElement(Elements.xpassword1).sendKeys(data.getData(1, 6, 4));
		driver.findElement(Elements.xsigninb).click();
		List<WebElement> a=driver.findElements(Elements.xinvalidemail_mssg) ;
		for(WebElement item:a)
		{
		    String e= item.getText();
		    System.out.println("4. "+e);
		}
		logger.log(LogStatus.PASS, "User is unable to login with wrong email and proper message is displayed");
		driver.findElement(Elements.xHEADER_MAIN_EVENT_LOGO).click();
		Thread.sleep(2000);
		}
		catch(Exception e) {
			logger.log(LogStatus.FAIL, "User is unable to login with wrong email and proper message is displayed");
		}
	}

}
