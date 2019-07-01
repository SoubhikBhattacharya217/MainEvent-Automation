package Birthday_common_flow;

import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.javascript.host.Element;

import Verify.Compare;
import Verify.insertintoLOGfile;

import org.testng.annotations.BeforeTest;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.CognizantQA.Driver.CreateDriver;
import org.CognizantQA.PageObject.Elements;
import org.CognizantQA.PageObject.Elements1;
import org.CognizantQA.Properties.PropertiesFile;
import org.CognizantQA.TestData.DataConfig;
import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

public class Plan_a_party_4heading_validations {
	static WebDriver driver;
	static DataConfig data;
	static JavascriptExecutor js;
	WebDriverWait wait;
	XSSFSheet sheet;
	static Boolean result=false;
    static Bday_booking_failure_screen_shots ss=new Bday_booking_failure_screen_shots();
    public void verifybook_birthday_page_by_click(WebDriver driver) throws Exception {
    	String testDataPath = PropertiesFile.getDataFromProperty("TestData");
        data = new DataConfig(testDataPath);
    	  Thread.sleep(4000);
	      result=Compare.verifyURL(driver, "https://mepreprod.cognizantorderserv.com/planaparty/find/");
	      if(result==false)
      {
  	  Thread.sleep(2000);
  	  ss.takeScreenShot(driver, "Plan a party page not navigated");
    }
    Assert.assertTrue(result);
    result=driver.findElement(Elements.xbook_bday_place_heading1).isDisplayed();
    if(result==false)
    {
  	  Thread.sleep(2000);
  	  ss.takeScreenShot(driver, "Plan a party page heading 1 not displayed");
    }
    Assert.assertTrue(result);
    List<WebElement> a=driver.findElements(Elements.xbook_bday_place_heading1);
		for(WebElement item:a)
		{
			Thread.sleep(2000);
			String a1=item.getText();
			System.out.println("1."+a1);
			Assert.assertEquals(a1, data.getData(1, 14, 1));
			break;
		}
    result=driver.findElement(Elements.xbook_bday_place_heading2).isDisplayed();
    if(result==false)
    {
  	  Thread.sleep(2000);
  	  ss.takeScreenShot(driver, "Plan a party page heading 2 not displayed");

    }
    Assert.assertTrue(result);
    List<WebElement> b=driver.findElements(Elements.xbook_bday_place_heading2);
		for(WebElement item:b)
		{
			Thread.sleep(2000);
			String b1=item.getText();
			System.out.println("2."+b1);
			Assert.assertEquals(b1, data.getData(1, 15, 1));
			break;
		}
    result=driver.findElement(Elements.xbook_bday_place_heading3).isDisplayed();
    if(result==false)
    {
  	  Thread.sleep(2000);
  	  ss.takeScreenShot(driver, "Plan a party page heading 3 not displayed");

    }
    Assert.assertTrue(result);
    List<WebElement> c=driver.findElements(Elements.xbook_bday_place_heading3);
		for(WebElement item:c)
		{
			Thread.sleep(2000);
			String c1=item.getText();
			System.out.println("3."+c1);
			Assert.assertEquals(c1, data.getData(1, 16, 1));
			break;
		}
    result=driver.findElement(Elements.xbook_bday_place_heading4).isDisplayed();
    if(result==false)
    {
  	  Thread.sleep(2000);
  	  ss.takeScreenShot(driver, "Plan a party page heading 4 not displayed");

    }
    Assert.assertTrue(result);
    List<WebElement> d=driver.findElements(Elements.xbook_bday_place_heading4);
		for(WebElement item:d)
		{
			Thread.sleep(2000);
			String d1=item.getText();
			System.out.println("4."+d1);
			Assert.assertEquals(d1, data.getData(1, 17, 1));
			break;
		}
}
}
