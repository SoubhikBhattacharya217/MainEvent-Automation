package test_automation_login.org.CognizantQA.MErun;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.javascript.host.Element;

import org.testng.annotations.BeforeTest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.CognizantQA.Driver.CreateDriver;
import org.CognizantQA.PageObject.Elements;
import org.CognizantQA.Properties.PropertiesFile;
import org.CognizantQA.TestData.DataConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

public class Registraion_flow {
	static WebDriver driver;
	static DataConfig data;
	static JavascriptExecutor js;
	WebDriverWait wait;
	 @BeforeClass
	  public void launchdriver() throws Exception{
        String testDataPath = PropertiesFile.getDataFromProperty("TestData");
        data = new DataConfig(testDataPath);
        driver = CreateDriver.selectBrowser(data.getData(0, 0, 0));
        WebDriverWait wait = new WebDriverWait (driver, 10);
        driver.get(data.getData(0, 0, 1));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
      
      Thread.sleep(4000);
	  }
	@Test
 public void verifypopupclose() throws InterruptedException {
		driver.findElement(Elements.xpopupclose).click();
		Thread.sleep(4000);
		((JavascriptExecutor)driver).executeScript("scroll(0,800)");
		Thread.sleep(4000);
 }
	@Test(dependsOnMethods="verifypopupclose")
	public static void verifycreateaccntbttn() throws InterruptedException {
		driver.findElement(Elements.xdrdforsignin).click();
		Thread.sleep(2000);
		driver.findElement(Elements.xcreate_accnt_bttn).click();
		
	}
	

	}


