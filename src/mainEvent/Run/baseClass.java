package mainEvent.Run;

import java.util.concurrent.TimeUnit;

import org.CognizantQA.Driver.CreateDriver;
import org.CognizantQA.PageObject.Elements;
import org.CognizantQA.Properties.PropertiesFile;
import org.CognizantQA.TestData.DataConfig;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;

import Verify.Compare;
import excelconnect.excelconnect;

public class baseClass {
	
	public WebDriver driver;
	public DataConfig data;
	public excelconnect ec=new excelconnect();
	WebDriverWait wait;
	
	public WebDriver getDriver()
	{
		return driver;
	}
	
	
	@BeforeClass
	 public  void launchdriver() throws Exception{
		 Thread.sleep(3000);
		 Boolean resulturl=false;
		  String testDataPath = PropertiesFile.getDataFromProperty("TestData");
	      DataConfig data = new DataConfig(testDataPath);
	      driver = CreateDriver.selectBrowser(data.getData(1, 1, 1),driver);
	      WebDriverWait wait = new WebDriverWait (driver, 20);
	      driver.get(data.getData(1, 1,4));
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      driver.manage().window().maximize();
	      Thread.sleep(2000);
	      driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	     // ec.eLaunch("\\C:\\Users\\698531\\Desktop\\Automation Regression test case suit\\ME One Test Cases - Automation - Regression V2 - Copy.xlsx\\", 0);
	      //ec.eWrite(1, 11, "pass");
	      resulturl=Compare.verifyURL(driver, "https://mainevent.cognizantorderserv.com/secureuat/secureuat");
	      if(resulturl==true) {
	    	  driver.findElement(Elements.xuser_id).sendKeys("meoserv");
	    	  driver.findElement(Elements.xpassword_secureUAT).sendKeys("UTxv34ERTmmv");
	    	  driver.findElement(Elements.xlogin_secureUAT).click(); 
	      }
		  }

}
