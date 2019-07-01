package test_automation_login.org.CognizantQA.MErun;

import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.javascript.host.Element;

import Verify.Compare;
import Verify.insertintoLOGfile;

import org.testng.annotations.BeforeTest;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.CognizantQA.Driver.CreateDriver;
import org.CognizantQA.PageObject.Elements;
import org.CognizantQA.Properties.PropertiesFile;
import org.CognizantQA.TestData.DataConfig;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

public class Logintest_for_production {
	static WebDriver driver;
	static DataConfig data;
	WebDriverWait wait;
	XSSFSheet sheet;
	Boolean result=false;

    //public static Logger log;
	 @BeforeClass
	  public void launchdriver() throws Exception{
         String testDataPath = PropertiesFile.getDataFromProperty("TestData");
         data = new DataConfig(testDataPath);
         driver = CreateDriver.selectBrowser(data.getData(0, 1, 1));
         WebDriverWait wait = new WebDriverWait (driver, 10);
         driver.get(data.getData(0, 1, 4));
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         driver.manage().window().maximize();
      
         
       Thread.sleep(4000);
	  }
		@Test
		  public void verifypopupclose() throws Exception {
			Thread.sleep(4000);
				result=driver.findElement(Elements.xproductionpopupclose).isDisplayed();
				Assert.assertTrue(result);
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				insertintoLOGfile.InsertToLog("1.pop-up close button is displayed");
				result=driver.findElement(Elements.xproductionpopupclose).isEnabled();
				Assert.assertTrue(result);
				insertintoLOGfile.InsertToLog("2.pop-up close button is enabled");
				driver.findElement(Elements.xproductionpopupclose).click();
				Thread.sleep(4000);
				 
		  }
	@Test(dependsOnMethods="verifypopupclose")
	public void verifyAccountsignin() throws Exception {
		
//	WebElement place=wait.until(ExpectedConditions.elementToBeClickable(Elements.xdrdforsignin));
		/* WebElement drdsi=driver.findElement(Elements.xdrdforsignin);
	       drdsi.click();  */
	   	result=driver.findElement(Elements.xdrdforsignin).isDisplayed();
		Assert.assertTrue(result);
	   	insertintoLOGfile.InsertToLog("1.dropdown sign in button is visible");
	   	result=driver.findElement(Elements.xdrdforsignin).isEnabled();
		Assert.assertTrue(result);
	   	insertintoLOGfile.InsertToLog("2.drop down sign in button is enabled");
	 	driver.findElement(Elements.xdrdforsignin).click();
	    driver.findElement(Elements.xsignin1).click();
		
	}
	@Test(dependsOnMethods="verifypopupclose")
	public void verifysignin_valid_cred() throws Exception {
		result=driver.findElement(Elements.xsignin2).isDisplayed();
		Assert.assertTrue(result);
		insertintoLOGfile.InsertToLog("3.name field is visible");
		result=driver.findElement(Elements.xsignin2).isDisplayed();
		Assert.assertTrue(result);
		insertintoLOGfile.InsertToLog("3.name field is visible");
		//WebElement email=wait.until(ExpectedConditions.visibilityOfElementLocated(Elements.xsignin2));
		Thread.sleep(2000);
		driver.findElement(Elements.xsignin2).click();
		driver.findElement(Elements.xpassword).click();
		Thread.sleep(4000);
		driver.findElement(Elements.xsignin3).sendKeys(data.getData(0, 4, 1));
		result=driver.findElement(Elements.xpassword1).isDisplayed();
		Assert.assertTrue(result);
		result=driver.findElement(Elements.xpassword1).isEnabled();
		Assert.assertTrue(result);
		driver.findElement(Elements.xpassword1).click();
		driver.findElement(Elements.xpassword1).sendKeys(data.getData(0, 6, 1));
		driver.findElement(Elements.xsigninb).click();
		Thread.sleep(4000);
	}
	@Test(dependsOnMethods="verifysignin_valid_cred")
	public void verifyAccountLogout() throws InterruptedException, IOException {
		result=driver.findElement(Elements.xddacctbttn).isDisplayed();
		Assert.assertTrue(result);
		result=driver.findElement(Elements.xddacctbttn).isEnabled();
		Assert.assertTrue(result);
		driver.findElement(Elements.xddacctbttn).click();
		Thread.sleep(2000);
		result=driver.findElement(Elements.xlogoutbttn).isDisplayed();
		Assert.assertTrue(result);
		result=driver.findElement(Elements.xlogoutbttn).isEnabled();
		Assert.assertTrue(result);
		driver.findElement(Elements.xlogoutbttn).click();
		Thread.sleep(2000);
		
		List<WebElement> a=driver.findElements(Elements.xlogoutbbtnmssg) ;
		for(WebElement item:a)
		{
		    String b= item.getText();
		    System.out.println("1. "+b);
		    }
		}
		
	
	@Test(dependsOnMethods="verifyAccountLogout")
	public static void verifyAccountlogin_with_invalid_password() throws InterruptedException{
		Thread.sleep(4000);
		driver.findElement(Elements.xsignin3).sendKeys(data.getData(0, 4, 1));
		driver.findElement(Elements.xpassword1).click();
		driver.findElement(Elements.xpassword1).sendKeys(data.getData(0, 6, 2));
		driver.findElement(Elements.xsigninb).click();
		Thread.sleep(2000);
		List<WebElement> b=driver.findElements(Elements.xinavlidsignin_mssg) ;
		for(WebElement item:b)
		{
		    String c= item.getText();
		    System.out.println("2. "+c);
		    
		}
	}
	@Test(dependsOnMethods="verifyAccountlogin_with_invalid_password")
	public static void wrong_user_login() throws InterruptedException{
		Thread.sleep(2000);
		driver.findElement(Elements.xsignin3).sendKeys(data.getData(0, 4, 3));
		driver.findElement(Elements.xpassword1).click();
		driver.findElement(Elements.xpassword1).sendKeys(data.getData(0, 6, 3));
		driver.findElement(Elements.xsigninb).click();
		Thread.sleep(2000);
		List<WebElement> a=driver.findElements(Elements.xusernot_found_mssg) ;
		for(WebElement item:a)
		{
		    String d= item.getText();
		    System.out.println("3. "+d);
		}
		
	}
	@Test(dependsOnMethods="wrong_user_login")
	public static void wrong_emailid_login() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(Elements.xsignin3).sendKeys(data.getData(0, 4, 4));
		driver.findElement(Elements.xpassword1).click();
		driver.findElement(Elements.xpassword1).sendKeys(data.getData(0, 6, 4));
		driver.findElement(Elements.xsigninb).click();
		List<WebElement> a=driver.findElements(Elements.xinvalidemail_mssg) ;
		for(WebElement item:a)
		{
		    String e= item.getText();
		    System.out.println("4. "+e);
		}
	}
  @AfterClass
  public void afterTest() {
	  //driver.quit();
  }

}
