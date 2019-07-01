package Funleague_common_flow;

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
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Funleague_time_page_validations {
	WebDriver driver;
	static boolean result=false;
	static DataConfig data;
	static Funleague_failure_screenshots ss=new Funleague_failure_screenshots();
	public static void verify_choose_leaguetime_page(WebDriver driver) throws Exception {
		WebDriverWait wait=new WebDriverWait(driver, 60);
		String testDataPath = PropertiesFile.getDataFromProperty("TestData");
        data = new DataConfig(testDataPath);
        wait.until(ExpectedConditions.urlToBe("https://mepreprod.cognizantorderserv.com/findALeague/chooseleaguetime"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(Elements.xheading1));
		result=driver.findElement(Elements.xheading1).isDisplayed();
		Assert.assertTrue(result);
		result=driver.findElement(Elements.xheading2).isDisplayed();
		Assert.assertTrue(result);
		result=driver.findElement(Elements.xheading3).isDisplayed();
		Assert.assertTrue(result);
		List<WebElement> a=driver.findElements(Elements.xheading1);
		for(WebElement item:a)
		{
			String a1=item.getText();
			System.out.println("1."+a1);
			Assert.assertEquals(a1, data.getData(1, 4, 1));
			break;
		}
		List<WebElement> b=driver.findElements(Elements.xheading2);
		for(WebElement item:b)
		{
			Thread.sleep(4000);
			String b1=item.getText();
			System.out.println("2."+b1);
			Assert.assertEquals(b1, data.getData(1, 5, 1));
			break;
		}
		List<WebElement> c=driver.findElements(Elements.xheading3);
		for(WebElement item:c)
		{
			Thread.sleep(4000);
			String c1=item.getText();
			System.out.println("3."+c1);
			Assert.assertEquals(c1, data.getData(1, 6, 1));
			break;
		}
		result=driver.findElement(Elements.xfunleague_time_bttn).isDisplayed();
		if(result==false)
	      {
	    	  ss.takeScreenShot(driver, "funleage time button is not displayed");
	      }
		Assert.assertTrue(result);
		result=driver.findElement(Elements.xfunleague_time_bttn).isEnabled();
		if(result==false)
	      {
			ss.takeScreenShot(driver, "funleage time button is not clickable");
	      }
		Assert.assertTrue(result);
		driver.findElement(Elements.xfunleague_time_bttn).click();
		Thread.sleep(3000);
	}
}
