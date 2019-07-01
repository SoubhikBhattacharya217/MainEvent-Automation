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
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

public class Registration_flow_production {
	static WebDriver driver;
	static DataConfig data;
	static JavascriptExecutor js;
	WebDriverWait wait;
	XSSFSheet sheet;
	static Boolean result=false;
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
		public void verifypopupclose() throws InterruptedException {
			Thread.sleep(4000);
			result=driver.findElement(Elements.xproductionpopupclose).isDisplayed();
			Assert.assertTrue(result);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			result=driver.findElement(Elements.xproductionpopupclose).isEnabled();
			Assert.assertTrue(result);
			driver.findElement(Elements.xproductionpopupclose).click();
			Thread.sleep(4000);
		}
		@Test(dependsOnMethods="verifypopupclose")
		public void verifyAccountsignin() throws InterruptedException, IOException {
			
//		WebElement place=wait.until(ExpectedConditions.elementToBeClickable(Elements.xdrdforsignin)); 
			FileWriter fr=new FileWriter("C:\\Users\\698531\\Desktop\\Login.txt");
		   	BufferedWriter br=new BufferedWriter(fr); 
		   	result=driver.findElement(Elements.xdrdforsignin).isDisplayed();
			Assert.assertTrue(result);
		   	br.write("1.dropdown sign in button is visible");
		   	br.newLine();
		   	result=driver.findElement(Elements.xdrdforsignin).isEnabled();
			Assert.assertTrue(result);
		   	br.write("2.drop down sign in button is enabled");
		   	br.newLine();
	       	driver.findElement(Elements.xdrdforsignin).click();
	 
}
		@Test(dependsOnMethods="verifyAccountsignin")
		public void verifyAccountregistbttn() {
			result=driver.findElement(Elements.xcreate_accnt_bttn).isDisplayed();
			Assert.assertTrue(result);
			result=driver.findElement(Elements.xcreate_accnt_bttn).isEnabled();
			Assert.assertTrue(result);
			driver.findElement(Elements.xcreate_accnt_bttn).click();
		}
		
		@Test(dependsOnMethods="verifyAccountregistbttn")
		public static void verifyfname() {
			result=driver.findElement(Elements.xfirstname1).isDisplayed();
			Assert.assertTrue(result);
			result=driver.findElement(Elements.xfirstname1).isEnabled();
			Assert.assertTrue(result);
			driver.findElement(Elements.xfirstname1).sendKeys(data.getData(0, 9, 1));
			}
		@Test(dependsOnMethods="verifyfname")
		public static void verifylname() {
			result=driver.findElement(Elements.xlastname).isDisplayed();
			Assert.assertTrue(result);
			result=driver.findElement(Elements.xlastname).isEnabled();
			Assert.assertTrue(result);
			driver.findElement(Elements.xlastname).sendKeys(data.getData(0, 9, 2));
		}
		@Test(dependsOnMethods="verifylname")
		public static void verifyemail() {
			result=driver.findElement(Elements.xemail1).isDisplayed();
			Assert.assertTrue(result);
			result=driver.findElement(Elements.xemail1).isEnabled();
			Assert.assertTrue(result);
			driver.findElement(Elements.xemail1).sendKeys(data.getData(0, 9, 3));
		}
		@Test(dependsOnMethods="verifyemail")
		public static void verify_inactive_registerbttn() {
			result=driver.findElement(Elements.xregisterbttn).isDisplayed();
			Assert.assertTrue(result);
			result=driver.findElement(Elements.xregisterbttn).isEnabled();
			Assert.assertFalse(result);
		}
		@Test(dependsOnMethods="verify_inactive_registerbttn")
		public static void verifypass() {
			result=driver.findElement(Elements.xpass).isDisplayed();
			Assert.assertTrue(result);
			result=driver.findElement(Elements.xpass).isEnabled();
			Assert.assertTrue(result);
			driver.findElement(Elements.xpass).sendKeys(data.getData(0, 9, 4));
		}
		@Test(dependsOnMethods="verifypass")
		public static void verify_active_registerbttn() {
			result=driver.findElement(Elements.xregisterbttn).isDisplayed();
			Assert.assertTrue(result);
			result=driver.findElement(Elements.xregisterbttn).isEnabled();
			Assert.assertTrue(result);
		}
		@Test(dependsOnMethods="verify_active_registerbttn")
		public static void verifyregistrationsuccess() throws InterruptedException {
			driver.findElement(Elements.xregisterbttn).click();//to verify all the fields in the registration page such as first name ,last name,email etc 
			                                                   //and to verify validity of the registerbutton and if user is able to register successfully or not and 
			                                                   //is he navigated successfully to the required page
			Thread.sleep(4000);
			result=Compare.verifyURL(driver, "https://mepreprod.cognizantorderserv.com/user/login");
			Assert.assertTrue(result);
			List<WebElement> a=driver.findElements(Elements.xaccntcreatemssg) ;
			for(WebElement item:a)
			{
			    String c= item.getText();
			    System.out.println("1."+c);
			    Thread.sleep(2000);
			    Assert.assertEquals(c,"Your Account has been created successfully.Please login");
			    break;
			}
			result=driver.findElement(Elements.xsigninb).isDisplayed();
			Assert.assertTrue(result);
			result=driver.findElement(Elements.xsigninb).isEnabled();  //to check whether sign in button is inactive at first or not
			Assert.assertFalse(result);
			driver.findElement(Elements.xemail2).sendKeys(data.getData(0, 10, 3));
			driver.findElement(Elements.xpass).sendKeys(data.getData(0, 10, 4));
			result=driver.findElement(Elements.xsigninb).isEnabled();  //to check whether sign in button is active after giving email and password
			Assert.assertTrue(result);
			driver.findElement(Elements.xsigninb).click();
			Thread.sleep(4000);
			result=Compare.verifyURL(driver, "https://mepreprod.cognizantorderserv.com/user/my-account");
			Assert.assertTrue(result);
			List<WebElement> y=driver.findElements(Elements.xsuccesslogin_mssg) ;
			for(WebElement item:y)
			{
			    String d= item.getText();
			    System.out.println("2."+d);
			    Assert.assertEquals(d, "You have been logged in successfully!");
			    break;
			}
		}
        @Test(dependsOnMethods="verifyregistrationsuccess")
        public static void verifylogout() throws InterruptedException {
	   result=driver.findElement(Elements.xddacctbttn).isDisplayed();//to verify if user is able to log out successfully after registering itself
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
		result=Compare.verifyURL(driver, "https://mepreprod.cognizantorderserv.com/user/login");
		Assert.assertTrue(result);
		List<WebElement> b=driver.findElements(Elements.xsuccesslogin_mssg) ;
		for(WebElement item:b)
		{
		    String a= item.getText();
		    System.out.println("3."+a);
		    Assert.assertEquals(a, "Logged out successfully");
		    break;
		
   }
  }
        @Test(dependsOnMethods="verifylogout")
        public static void verifypre_existing_reg_cred() throws InterruptedException {
        	driver.findElement(Elements.xdrdforsignin).click();//to verify that is user able to register another person having all the credentials same(negative flow).
        	driver.findElement(Elements.xcreate_accnt_bttn).click();
        	Thread.sleep(4000);
        	//driver.findElement(Elements.xproductionpopupclose).click();
        	driver.findElement(Elements.xfirstname1).sendKeys(data.getData(0, 10, 1));
        	driver.findElement(Elements.xlastname).sendKeys(data.getData(0, 10, 2));
        	driver.findElement(Elements.xemail1).sendKeys(data.getData(0, 10, 3));
        	result=driver.findElement(Elements.xregisterbttn).isDisplayed();
			Assert.assertTrue(result);
			result=driver.findElement(Elements.xregisterbttn).isEnabled();
			Assert.assertFalse(result);
			driver.findElement(Elements.xpass).sendKeys(data.getData(0, 10, 4));
			result=driver.findElement(Elements.xregisterbttn).isDisplayed();
			Assert.assertTrue(result);
			result=driver.findElement(Elements.xregisterbttn).isEnabled();
			Assert.assertTrue(result);
			driver.findElement(Elements.xregisterbttn).click();
			Thread.sleep(4000);
			result=Compare.verifyURL(driver, "https://mepreprod.cognizantorderserv.com/user/login");
			Assert.assertFalse(result);
			List<WebElement> a=driver.findElements(Elements.xalready_reg_accnt_msg) ;
			for(WebElement item:a)
			{
			    String c= item.getText();
			    System.out.println("4."+c);
			    Thread.sleep(2000);
			    Assert.assertEquals(c,"There were problems while creating your account. Please check whether you have already registered with this email-id.");
			    break;
			}
			
        }
        /*@Test(dependsOnMethods="")
        public static void verify_reg_error_mssg_closebttn() throws InterruptedException {
        	Thread.sleep(4000);
        	driver.findElement(Elements.xmssgclosebttn).isDisplayed();
        	Assert.assertTrue(result);
        	driver.findElement(Elements.xmssgclosebttn).isEnabled();
        	Assert.assertTrue(result);
        	
        }*/
        @Test(dependsOnMethods="verifypre_existing_reg_cred")
        public static void verify_reg_invalid_emailid() throws InterruptedException {
        	driver.findElement(Elements.xfirstname1).clear();
        	driver.findElement(Elements.xfirstname1).sendKeys(data.getData(0, 11, 1));//to verify if invalid email message in red is coming or not 
        	                                                                          //and to verify if registration button is remaining inactive after giving invalid email id.
        	driver.findElement(Elements.xlastname).clear();
        	driver.findElement(Elements.xlastname).sendKeys(data.getData(0, 11, 2));
        	driver.findElement(Elements.xemail1).clear();
        	driver.findElement(Elements.xemail1).sendKeys(data.getData(0, 11, 3));
        	result=driver.findElement(Elements.xreginvalidemailmssg).isDisplayed();
        	Assert.assertTrue(result);
        	List<WebElement> a=driver.findElements(Elements.xreginvalidemailmssg) ;
			for(WebElement item:a)
			{
			    String b= item.getText();
			    System.out.println("5."+b);
			    Thread.sleep(2000);
			    Assert.assertEquals(b,"Invalid Email");
			    break;
			}
			driver.findElement(Elements.xemail1).clear();
        	driver.findElement(Elements.xemail1).sendKeys(data.getData(0, 12, 3));
        	result=driver.findElement(Elements.xreginvalidemailmssg).isDisplayed();
        	Assert.assertTrue(result);
        	List<WebElement> b=driver.findElements(Elements.xreginvalidemailmssg) ;
			for(WebElement item:b)
			{
			    String c= item.getText();
			    System.out.println("6."+c);
			    Thread.sleep(2000);
			    Assert.assertEquals(c,"Invalid Email");
			    break;
			}
			driver.findElement(Elements.xpass).clear();
        	driver.findElement(Elements.xpass).sendKeys(data.getData(0, 11, 4));
        	Thread.sleep(2000);
        	((JavascriptExecutor)driver).executeScript("scroll(0,250)");
        	Thread.sleep(3000);
        	result=driver.findElement(Elements.xregisterbttn).isDisplayed();
			Assert.assertTrue(result);
			result=driver.findElement(Elements.xregisterbttn).isEnabled();
			Assert.assertFalse(result);
        }
        @Test(dependsOnMethods="verify_reg_invalid_emailid")
        public static void verify_reg_invalid_psswrd() throws InterruptedException {
        	driver.findElement(Elements.xfirstname1).clear();
        	driver.findElement(Elements.xfirstname1).sendKeys(data.getData(0, 13, 1));//to verify if invalid email message in red is coming or not 
        	                                                                          //and to verify if registration button is remaining inactive after giving invalid email id.
        	driver.findElement(Elements.xlastname).clear();
        	driver.findElement(Elements.xlastname).sendKeys(data.getData(0, 13, 2));
        	driver.findElement(Elements.xemail1).clear();
        	driver.findElement(Elements.xemail1).sendKeys(data.getData(0, 13, 3));
        	driver.findElement(Elements.xpass).clear();
        	driver.findElement(Elements.xpass).sendKeys(data.getData(0, 13, 4));
        	result=driver.findElement(Elements.xreginvalidpswwrdmssg1).isDisplayed();
        	Assert.assertTrue(result);
        	List<WebElement> a=driver.findElements(Elements.xreginvalidpswwrdmssg1) ;
			for(WebElement item:a)
			{
			    String b= item.getText();
			    System.out.println("7."+b);
			    Thread.sleep(2000);
			    Assert.assertEquals(b,"Passwords must be between 8 and 20 characters.");
			    result=driver.findElement(Elements.xregisterbttn).isDisplayed();
				Assert.assertTrue(result);
				result=driver.findElement(Elements.xregisterbttn).isEnabled();
				Assert.assertFalse(result);
			    break;
			}
			driver.findElement(Elements.xpass).clear();
        	driver.findElement(Elements.xpass).sendKeys(data.getData(0, 14, 4));
        	List<WebElement> b=driver.findElements(Elements.xreginvalidpswwrdmssg2) ;
			for(WebElement item:b)
			{
			    String c= item.getText();
			    System.out.println("8."+c);
			    Thread.sleep(2000);
			    Assert.assertEquals(c,"Must contain one lower & uppercase letter, and one non-alpha character (a number or a symbol)");
			    result=driver.findElement(Elements.xregisterbttn).isDisplayed();
				Assert.assertTrue(result);
				result=driver.findElement(Elements.xregisterbttn).isEnabled();
				Assert.assertFalse(result);
			    break;
			}
			driver.findElement(Elements.xpass).clear();
        	driver.findElement(Elements.xpass).sendKeys(data.getData(0, 15, 4));
        	List<WebElement> c=driver.findElements(Elements.xreginvalidpswwrdmssg2) ;
			for(WebElement item:c)
			{
			    String d= item.getText();
			    System.out.println("9."+d);
			    Thread.sleep(2000);
			    Assert.assertEquals(d,"Must contain one lower & uppercase letter, and one non-alpha character (a number or a symbol)");
			    result=driver.findElement(Elements.xregisterbttn).isDisplayed();
				Assert.assertTrue(result);
				result=driver.findElement(Elements.xregisterbttn).isEnabled();
				Assert.assertFalse(result);
			    break;
			}
			driver.findElement(Elements.xpass).clear();
        	driver.findElement(Elements.xpass).sendKeys(data.getData(0, 16, 4));
        	List<WebElement> d=driver.findElements(Elements.xreginvalidpswwrdmssg1) ;
			for(WebElement item:d)
			{
			    String e= item.getText();
			    System.out.println("10."+e);
			    Thread.sleep(2000);
			    Assert.assertEquals(e,"Passwords must be between 8 and 20 characters.");
			    result=driver.findElement(Elements.xregisterbttn).isDisplayed();
				Assert.assertTrue(result);
				result=driver.findElement(Elements.xregisterbttn).isEnabled();
				Assert.assertFalse(result);
			    break;
			}
        }
}