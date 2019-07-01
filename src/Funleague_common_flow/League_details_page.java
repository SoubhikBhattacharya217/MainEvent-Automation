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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class League_details_page {
	WebDriver driver;
	static boolean result=false;
	static DataConfig data;
	static Funleague_failure_screenshots ss=new Funleague_failure_screenshots();
	public static void verify_enter_league_details_page(WebDriver driver) throws Exception {
		String testDataPath = PropertiesFile.getDataFromProperty("TestData");
        data = new DataConfig(testDataPath);
        WebDriverWait wait=new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.visibilityOfElementLocated(Elements.xleague_details_heading1));
		result=driver.findElement(Elements.xleague_details_heading1).isDisplayed();
		Assert.assertTrue(result);
		result=driver.findElement(Elements.xleague_details_heading2).isDisplayed();
		Assert.assertTrue(result);
		List<WebElement> d=driver.findElements(Elements.xleague_details_heading1);
		for(WebElement item:d)
		{
			Thread.sleep(4000);
			String d1=item.getText();
			System.out.println("1."+d1);
			Assert.assertEquals(d1, data.getData(1, 8, 1));
			break;
		}
		List<WebElement> e=driver.findElements(Elements.xleague_details_heading2);
		for(WebElement item:e)
		{
			Thread.sleep(4000);
			String e1=item.getText();
			System.out.println("1."+e1);
			Assert.assertEquals(e1, data.getData(1, 9, 1));
			break;
		}
		driver.findElement(Elements.xteam_name_field).sendKeys(data.getData(0, 31, 1));
		result=driver.findElement(Elements.xcontinue_bttn).isDisplayed();
		if(result==false)
	      {
	    	  Thread.sleep(2000);
	    	  ss.takeScreenShot(driver, "continue button in league detail page is not present");
	      }
		Assert.assertTrue(result);
		result=driver.findElement(Elements.xcontinue_bttn).isEnabled();
		if(result==true)
	      {
	    	  Thread.sleep(2000);
	    	  ss.takeScreenShot(driver, "continue button in league detail page is not clickable");
	      }
		Assert.assertFalse(result);
		driver.findElement(Elements.xgenderdd1).click();
		driver.findElement(Elements.xddmale1).click();
		result=driver.findElement(Elements.xcontinue_bttn).isEnabled();
		Assert.assertFalse(result);
		driver.findElement(Elements.xshoesizedd1).click();
		driver.findElement(Elements.xddshoesize4).click();
		result=driver.findElement(Elements.xcontinue_bttn).isEnabled();
		Assert.assertFalse(result);
		driver.findElement(Elements.xgenderdd2).click();
		driver.findElement(Elements.xddfemale2).click();
		result=driver.findElement(Elements.xcontinue_bttn).isEnabled();
		Assert.assertFalse(result);
		driver.findElement(Elements.xshoesizedd2).click();
		driver.findElement(Elements.xddshoesize8).click();
		result=driver.findElement(Elements.xcontinue_bttn).isEnabled();
		Assert.assertFalse(result);
		driver.findElement(Elements.xgenderdd3).click();
		driver.findElement(Elements.xddboys1).click();
		result=driver.findElement(Elements.xcontinue_bttn).isEnabled();
		Assert.assertFalse(result);
		driver.findElement(Elements.xshoesizedd3).click();
		driver.findElement(Elements.xddshoesize10).click();
		result=driver.findElement(Elements.xcontinue_bttn).isEnabled();
		Assert.assertFalse(result);
		driver.findElement(Elements.xgenderdd4).click();
		driver.findElement(Elements.xddgirls1).click();
		result=driver.findElement(Elements.xcontinue_bttn).isEnabled();
		Assert.assertFalse(result);
		driver.findElement(Elements.xshoesizedd4).click();
		driver.findElement(Elements.xddshoesize12).click();
		result=driver.findElement(Elements.xcontinue_bttn).isEnabled();
		Assert.assertFalse(result);
		driver.findElement(Elements.xpname1).sendKeys(data.getData(0, 31, 2));
		result=driver.findElement(Elements.xcontinue_bttn).isEnabled();
		Assert.assertTrue(result);
		driver.findElement(Elements.xpname2).sendKeys(data.getData(0, 32, 2));
		result=driver.findElement(Elements.xcontinue_bttn).isEnabled();
		Assert.assertTrue(result);
		driver.findElement(Elements.xpname3).sendKeys(data.getData(0, 33, 2));
		result=driver.findElement(Elements.xcontinue_bttn).isEnabled();
		Assert.assertTrue(result);
		driver.findElement(Elements.xpname4).sendKeys(data.getData(0, 34, 2));
		result=driver.findElement(Elements.xcontinue_bttn).isEnabled();
		Assert.assertTrue(result);
		driver.findElement(Elements.xcontinue_bttn).click();
	}
}
