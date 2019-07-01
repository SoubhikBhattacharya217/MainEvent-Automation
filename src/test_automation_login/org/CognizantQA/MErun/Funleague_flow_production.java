package test_automation_login.org.CognizantQA.MErun;
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
public class Funleague_flow_production {
	static WebDriver driver;
	static DataConfig data;
	static JavascriptExecutor js;
	WebDriverWait wait;
	XSSFSheet sheet;
	static Boolean result=false;
	static int ss=1;
	public static final By xstorename_txt_in_popup=By.cssSelector("#storeModal > div > div.col-xs-12.storeListContainer.ng-scope > ul > li:nth-child(1) > div.col-xs-8 > span:nth-child(1)");
	@BeforeClass
	  public void launchdriver() throws Exception{
       String testDataPath = PropertiesFile.getDataFromProperty("TestData");
       data = new DataConfig(testDataPath);
       driver = CreateDriver.selectBrowser(data.getData(0, 1, 1));
       WebDriverWait wait = new WebDriverWait (driver, 10);
       driver.get(data.getData(0, 1, 4));
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       driver.manage().window().maximize();
       Thread.sleep(2000);
       driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  }
	@Test
	public void verifypopupclose() throws InterruptedException {
		Thread.sleep(3000);
		result=driver.findElement(Elements.xproductionpopupclose).isDisplayed();
		Assert.assertTrue(result);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		result=driver.findElement(Elements.xproductionpopupclose).isEnabled();
		Assert.assertTrue(result);
		driver.findElement(Elements.xproductionpopupclose).click();
		Thread.sleep(4000);
		((JavascriptExecutor)driver).executeScript("scroll(0,800)");
		Thread.sleep(2000);
	}
	@Test(dependsOnMethods="verifypopupclose")
	/*public void verify_join_funleague_bttn() throws InterruptedException, IOException {
		result=driver.findElement(Elements.xjoin_funleague_bttn).isDisplayed();
		if(result==false)//this if block is for screen shot taking if anything is failed only then it will take screenshots !!
	      {
	    	  Thread.sleep(2000);
	    	  TakesScreenshot ts=(TakesScreenshot)driver;//type casting done on TakesScreenshot.
	    	  File source=ts.getScreenshotAs(OutputType.FILE);//saving the screenshot as a file type.
	    	  FileUtils.copyFile(source, new File("./Screenshots/funleague flow/"+ss+".png"));//saving the file type screen shot in a directory under the Fileutils class.
	          ss++;
	      }
		Assert.assertTrue(result);
		result=driver.findElement(Elements.xjoin_funleague_bttn).isEnabled();
		if(result==false)//this if block is for screen shot taking if anything is failed only then it will take screenshots !!
	      {
	    	  Thread.sleep(2000);
	    	  TakesScreenshot ts=(TakesScreenshot)driver;//type casting done on TakesScreenshot.
	    	  File source=ts.getScreenshotAs(OutputType.FILE);//saving the screenshot as a file type.
	    	  FileUtils.copyFile(source, new File("./Screenshots/funleague flow/"+ss+".png"));//saving the file type screen shot in a directory under the Fileutils class.
	          ss++;
	      }
		Assert.assertTrue(result);
		driver.findElement(Elements.xjoin_funleague_bttn).click();
	}*/
	@Test(dependsOnMethods="verify_join_funleague_bttn")
	/*public void verify_funleague_findpage_byclick() throws InterruptedException, IOException {
		Thread.sleep(4000);
		result=Compare.verifyURL(driver, "https://mepreprod.cognizantorderserv.com/findALeague/find/");
	      if(result==false)
	      {
	    	  Thread.sleep(2000);
	    	  TakesScreenshot ts=(TakesScreenshot)driver;
	    	  File source=ts.getScreenshotAs(OutputType.FILE);
	    	  FileUtils.copyFile(source, new File("./Screenshots/funleague flow/"+ss+".png"));
	    	  ss++;
	      }
	      Assert.assertTrue(result);
	      result=driver.findElement(Elements.xfind_fun_league_heading1).isDisplayed();
	      if(result==false)
	      {
	    	  Thread.sleep(2000);
	    	  TakesScreenshot ts=(TakesScreenshot)driver;
	    	  File source=ts.getScreenshotAs(OutputType.FILE);
	    	  FileUtils.copyFile(source, new File("./Screenshots/funleague flow/"+ss+".png"));
	    	  ss++;
	      }
	      Assert.assertTrue(result);
	      result=driver.findElement(Elements.xfind_fun_league_heading2).isDisplayed();
	      if(result==false)
	      {
	    	  Thread.sleep(2000);
	    	  TakesScreenshot ts=(TakesScreenshot)driver;
	    	  File source=ts.getScreenshotAs(OutputType.FILE);
	    	  FileUtils.copyFile(source, new File("./Screenshots/funleague flow/"+ss+".png"));
	    	  ss++;
	      }
	      Assert.assertTrue(result);
	      result=driver.findElement(Elements.xfind_fun_league_heading3).isDisplayed();
	      if(result==false)
	      {
	    	  Thread.sleep(2000);
	    	  TakesScreenshot ts=(TakesScreenshot)driver;
	    	  File source=ts.getScreenshotAs(OutputType.FILE);
	    	  FileUtils.copyFile(source, new File("./Screenshots/funleague flow/"+ss+".png"));
	    	  ss++;
	      }
	      Assert.assertTrue(result);
	      result=driver.findElement(Elements.xfind_fun_league_heading4).isDisplayed();
	      if(result==false)
	      {
	    	  Thread.sleep(2000);
	    	  TakesScreenshot ts=(TakesScreenshot)driver;
	    	  File source=ts.getScreenshotAs(OutputType.FILE);
	    	  FileUtils.copyFile(source, new File("./Screenshots/funleague flow/"+ss+".png"));
	    	  ss++;
	      }
	      Assert.assertTrue(result);*/
	      driver.findElement(Elements.xlocationsearchbar).clear();
	      Thread.sleep(3000);
	      driver.findElement(Elements.xlocationsearchbar).sendKeys("m");
	      driver.findElement(Elements.xlocationsearchbar).sendKeys(Keys.BACK_SPACE);
	      Thread.sleep(3000);
	      driver.findElement(Elements.xexternalclickfindpage).click();
	      result=driver.findElement(Elements.xinactivetype_city_field).isDisplayed();
	      if(result==false)
	      {
	    	  Thread.sleep(2000);
	    	  TakesScreenshot ts=(TakesScreenshot)driver;
	    	  File source=ts.getScreenshotAs(OutputType.FILE);
	    	  FileUtils.copyFile(source, new File("./Screenshots/funleague flow/"+ss+".png"));
	    	  ss++;
	      }
	      Assert.assertTrue(result);
	      driver.findElement(Elements.xinactivetype_city_field).click();
	      result=driver.findElement(Elements.xactivetype_city_field).isDisplayed();
	      if(result==false)
	      {
	    	  Thread.sleep(2000);
	    	  TakesScreenshot ts=(TakesScreenshot)driver;
	    	  File source=ts.getScreenshotAs(OutputType.FILE);
	    	  FileUtils.copyFile(source, new File("./Screenshots/funleague flow/"+ss+".png"));
	    	  ss++;
	      }
	      Assert.assertTrue(result);
	     /* result=driver.findElement(Elements.xfind_location).isDisplayed();
	      if(result==false)
	      {
	    	  Thread.sleep(2000);
	    	  TakesScreenshot ts=(TakesScreenshot)driver;
	    	  File source=ts.getScreenshotAs(OutputType.FILE);
	    	  FileUtils.copyFile(source, new File("./Screenshots/funleague flow/"+ss+".png"));
	    	  ss++;
	      }
	      Assert.assertTrue(result);
	      result=driver.findElement(Elements.xfind_location).isEnabled();
	      if(result==true)
	      {
	    	  Thread.sleep(2000);
	    	  TakesScreenshot ts=(TakesScreenshot)driver;
	    	  File source=ts.getScreenshotAs(OutputType.FILE);
	    	  FileUtils.copyFile(source, new File("./Screenshots/funleague flow/"+ss+".png"));
	    	  ss++;
	      }
	      Assert.assertFalse(result);
	      driver.findElement(Elements.xcity_field).sendKeys(data.getData(0, 19, 1));
	      Thread.sleep(3000);
	      driver.findElement(Elements.xexternalclickfindpage1).click();
	      Thread.sleep(3000);
	      result=driver.findElement(Elements.xfind_location).isEnabled();
	      if(result==false)
	      {
	    	  Thread.sleep(2000);
	    	  TakesScreenshot ts=(TakesScreenshot)driver;
	    	  File source=ts.getScreenshotAs(OutputType.FILE);
	    	  FileUtils.copyFile(source, new File("./Screenshots/funleague flow/"+ss+".png"));
	    	  ss++;
	      }
	      Assert.assertTrue(result);
	      driver.findElement(Elements.xfind_location).click();
	      Thread.sleep(3000);
	}*/
/*	@Test(dependsOnMethods="verify_funleague_findpage_byclick")
	public static void verifystorepopup_close() throws IOException, InterruptedException {
		Thread.sleep(2000);
		result=driver.findElement(Elements.xstore_popupclose_bbtn).isDisplayed();
		   if(result==false)
		      {
		    	  Thread.sleep(2000);
		    	  TakesScreenshot ts=(TakesScreenshot)driver;
		    	  File source=ts.getScreenshotAs(OutputType.FILE);
		    	  FileUtils.copyFile(source, new File("./Screenshots/funleague flow/"+ss+".png"));
		    	  ss++;
		      }
		Assert.assertTrue(result);
		result=driver.findElement(Elements.xstore_popupclose_bbtn).isEnabled();
		   if(result==false)
		      {
		    	  Thread.sleep(2000);
		    	  TakesScreenshot ts=(TakesScreenshot)driver;
		    	  File source=ts.getScreenshotAs(OutputType.FILE);
		    	  FileUtils.copyFile(source, new File("./Screenshots/funleague flow/"+ss+".png"));
		    	  ss++;
		      }
		Assert.assertTrue(result);
		driver.findElement(Elements.xstore_popupclose_bbtn).click();
	}
	@Test(dependsOnMethods="verifystorepopup_close")
	public static void verifybowling_page_by_keyboard() {
	     driver.findElement(Elements.xcity_field).sendKeys(data.getData(0, 19, 1));
	      driver.findElement(Elements.xlocationsearchbar).sendKeys(Keys.ARROW_DOWN);
	      driver.findElement(Elements.xlocationsearchbar).sendKeys(Keys.ENTER);
	}
	@Test(dependsOnMethods="verifybowling_page_by_keyboard")
	public static void verifystore_popup() throws InterruptedException, IOException {
		//driver.switchTo().frame("storeModalContent");
		result=driver.findElement(Elements.xfind_bttn_in_popup).isDisplayed();//to verify the list view flow in the store pop up
		   if(result==false)
		      {
		    	  Thread.sleep(2000);
		    	  TakesScreenshot ts=(TakesScreenshot)driver;
		    	  File source=ts.getScreenshotAs(OutputType.FILE);
		    	  FileUtils.copyFile(source, new File("./Screenshots/funleague flow/"+ss+".png"));
		    	  ss++;
		      }
		Assert.assertTrue(result);
		result=driver.findElement(Elements.xfind_bttn_in_popup).isEnabled();
		   if(result==false)
		      {
		    	  Thread.sleep(2000);
		    	  TakesScreenshot ts=(TakesScreenshot)driver;
		    	  File source=ts.getScreenshotAs(OutputType.FILE);
		    	  FileUtils.copyFile(source, new File("./Screenshots/funleague flow/"+ss+".png"));
		    	  ss++;
		      }
		Assert.assertTrue(result);
		List<WebElement> a=driver.findElements(Bowling_lane_flow_production_site.xstorename_txt_in_popup) ;
		for(WebElement item:a)
		{
		    String a1= item.getText();
		    System.out.println("1."+a1);
		    break;
		}
		Set<String> windows=driver.getWindowHandles();//to see how many windows are handled at that particular moment
		System.out.println(windows);
	}
	@Test(dependsOnMethods="verifystore_popup")
	public static void verifystore_popupmapviewflow() throws InterruptedException, IOException {
		result=driver.findElement(Elements.xmapbttn_store_popup).isDisplayed();//verifying the pop field with using the map view flow
		   if(result==false)
		      {
		    	  Thread.sleep(2000);
		    	  TakesScreenshot ts=(TakesScreenshot)driver;
		    	  File source=ts.getScreenshotAs(OutputType.FILE);
		    	  FileUtils.copyFile(source, new File("./Screenshots/funleague flow/"+ss+".png"));
		    	  ss++;
		      }
		Assert.assertTrue(result);
		   if(result==false)
		      {
		    	  Thread.sleep(2000);
		    	  TakesScreenshot ts=(TakesScreenshot)driver;
		    	  File source=ts.getScreenshotAs(OutputType.FILE);
		    	  FileUtils.copyFile(source, new File("./Screenshots/funleague flow/"+ss+".png"));
		    	  ss++;
		      }
		result=driver.findElement(Elements.xmapbttn_store_popup).isEnabled();
		Assert.assertTrue(result);
		driver.findElement(Elements1.xmapbttn_store_popup).click();
		WebElement p = driver.findElement(Elements.xmapview_placename);//different approach to store webelement text rather than using arraylist
		String placename=p.getText();
		Assert.assertEquals(placename, data.getData(1, 0, 0));
		Thread.sleep(2000);
		driver.findElement(Elements.xselect_and_continue).click();
}*/
	@Test(dependsOnMethods="verifystore_popupmapviewflow")
	/*public static void verify_choose_leaguetime_page() throws InterruptedException, IOException {
		Thread.sleep(3000);
		result=driver.findElement(Elements.xheading1).isDisplayed();
		Assert.assertTrue(result);
		result=driver.findElement(Elements.xheading2).isDisplayed();
		Assert.assertTrue(result);
		result=driver.findElement(Elements.xheading3).isDisplayed();
		Assert.assertTrue(result);
		List<WebElement> a=driver.findElements(Elements.xheading1);
		for(WebElement item:a)
		{
			Thread.sleep(4000);
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
	    	  Thread.sleep(2000);
	    	  TakesScreenshot ts=(TakesScreenshot)driver;
	    	  File source=ts.getScreenshotAs(OutputType.FILE);
	    	  FileUtils.copyFile(source, new File("./Screenshots/funleague flow/"+ss+".png"));
	    	  ss++;
	      }
		Assert.assertTrue(result);
		result=driver.findElement(Elements.xfunleague_time_bttn).isEnabled();
		if(result==false)
	      {
	    	  Thread.sleep(2000);
	    	  TakesScreenshot ts=(TakesScreenshot)driver;
	    	  File source=ts.getScreenshotAs(OutputType.FILE);
	    	  FileUtils.copyFile(source, new File("./Screenshots/funleague flow/"+ss+".png"));
	    	  ss++;
	      }
		Assert.assertTrue(result);
		driver.findElement(Elements.xfunleague_time_bttn).click();
		Thread.sleep(3000);
	}*/
	@Test(dependsOnMethods="verify_choose_leaguetime_page")
	/*public static void verify_enter_league_details_page( ) throws InterruptedException, IOException {
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
	    	  TakesScreenshot ts=(TakesScreenshot)driver;
	    	  File source=ts.getScreenshotAs(OutputType.FILE);
	    	  FileUtils.copyFile(source, new File("./Screenshots/funleague flow/"+ss+".png"));
	    	  ss++;
	      }
		Assert.assertTrue(result);
		result=driver.findElement(Elements.xcontinue_bttn).isEnabled();
		if(result==true)
	      {
	    	  Thread.sleep(2000);
	    	  TakesScreenshot ts=(TakesScreenshot)driver;
	    	  File source=ts.getScreenshotAs(OutputType.FILE);
	    	  FileUtils.copyFile(source, new File("./Screenshots/funleague flow/"+ss+".png"));
	    	  ss++;
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
	}*/
	@Test(dependsOnMethods="verify_enter_league_details_page")
	public static void verify_order_summary_page() throws InterruptedException {
		Thread.sleep(3000);
		result=driver.findElement(Elements.xgo_to_cart_funleague).isDisplayed();
		Assert.assertTrue(result);
		result=driver.findElement(Elements.xgo_to_cart_funleague).isEnabled();
		Assert.assertTrue(result);
		driver.findElement(Elements.xgo_to_cart_funleague).click();
	}
	@Test(dependsOnMethods="verify_order_summary_page")
	  public static void verify_cart_page() throws InterruptedException, IOException{
		  Thread.sleep(2000);
		  result=Verify.Compare.verifyURL(driver, "https://mepreprod.cognizantorderserv.com/checkout/cart");
		  if(result==false)
	      {
	    	  Thread.sleep(2000);
	    	  TakesScreenshot ts=(TakesScreenshot)driver;
	    	  File source=ts.getScreenshotAs(OutputType.FILE);
	    	  FileUtils.copyFile(source, new File("./Screenshots/funleague flow/"+ss+".png"));
	    	  ss++;
	      }
		  Assert.assertTrue(result);
		  result=driver.findElement(Elements.xmodify_bttn).isDisplayed();
		  if(result==false)
	      {
	    	  Thread.sleep(2000);
	    	  TakesScreenshot ts=(TakesScreenshot)driver;
	    	  File source=ts.getScreenshotAs(OutputType.FILE);
	    	  FileUtils.copyFile(source, new File("./Screenshots/funleague flow/"+ss+".png"));
	    	  ss++;
	      }
		  Assert.assertTrue(result);
		  result=driver.findElement(Elements.xmodify_bttn).isEnabled();
		  if(result==false)
	      {
	    	  Thread.sleep(2000);
	    	  TakesScreenshot ts=(TakesScreenshot)driver;
	    	  File source=ts.getScreenshotAs(OutputType.FILE);
	    	  FileUtils.copyFile(source, new File("./Screenshots/funleague flow/"+ss+".png"));
	    	  ss++;
	      }
		  Assert.assertTrue(result);
		  result=driver.findElement(Elements.xdelete_icon_bttn_funleague).isDisplayed();
		  if(result==false)
	      {
	    	  Thread.sleep(2000);
	    	  TakesScreenshot ts=(TakesScreenshot)driver;
	    	  File source=ts.getScreenshotAs(OutputType.FILE);
	    	  FileUtils.copyFile(source, new File("./Screenshots/funleague flow/"+ss+".png"));
	    	  ss++;
	      }
		  Assert.assertTrue(result);
		  result=driver.findElement(Elements.xdelete_icon_bttn_funleague).isEnabled();
		  if(result==false)
	      {
	    	  Thread.sleep(2000);
	    	  TakesScreenshot ts=(TakesScreenshot)driver;
	    	  File source=ts.getScreenshotAs(OutputType.FILE);
	    	  FileUtils.copyFile(source, new File("./Screenshots/funleague flow/"+ss+".png"));
	    	  ss++;
	      }
		  Assert.assertTrue(result);
		  result=driver.findElement(Elements.xcheckout_bttn1).isDisplayed();
		  if(result==false)
	      {
	    	  Thread.sleep(2000);
	    	  TakesScreenshot ts=(TakesScreenshot)driver;
	    	  File source=ts.getScreenshotAs(OutputType.FILE);
	    	  FileUtils.copyFile(source, new File("./Screenshots/funleague flow/"+ss+".png"));
	    	  ss++;
	      }
		  Assert.assertTrue(result);
		  result=driver.findElement(Elements.xcheckout_bttn1).isEnabled();
		  if(result==false)
	      {
	    	  Thread.sleep(2000);
	    	  TakesScreenshot ts=(TakesScreenshot)driver;
	    	  File source=ts.getScreenshotAs(OutputType.FILE);
	    	  FileUtils.copyFile(source, new File("./Screenshots/funleague flow/"+ss+".png"));
	    	  ss++;
	      }
		  Assert.assertTrue(result);
		  result=driver.findElement(Elements.xcheckout_bttn2).isDisplayed();
		  if(result==false)
	      {
	    	  Thread.sleep(2000);
	    	  TakesScreenshot ts=(TakesScreenshot)driver;
	    	  File source=ts.getScreenshotAs(OutputType.FILE);
	    	  FileUtils.copyFile(source, new File("./Screenshots/funleague flow/"+ss+".png"));
	    	  ss++;
	      }
		  Assert.assertTrue(result);
		  result=driver.findElement(Elements.xcheckout_bttn2).isEnabled();
		  if(result==false)
	      {
	    	  Thread.sleep(2000);
	    	  TakesScreenshot ts=(TakesScreenshot)driver;
	    	  File source=ts.getScreenshotAs(OutputType.FILE);
	    	  FileUtils.copyFile(source, new File("./Screenshots/funleague flow/"+ss+".png"));
	    	  ss++;
	      }
		  Assert.assertTrue(result);
		  driver.findElement(Elements.xcheckout_bttn1).click();
	  }
	  @Test(dependsOnMethods="verify_cart_page")
	  public static void verify_register_page() throws InterruptedException, IOException {
		  result=driver.findElement(Elements.xcheckout_heading1).isDisplayed();
		  if(result==false)
	      {
	    	  Thread.sleep(2000);
	    	  TakesScreenshot ts=(TakesScreenshot)driver;
	    	  File source=ts.getScreenshotAs(OutputType.FILE);
	    	  FileUtils.copyFile(source, new File("./Screenshots/funleague flow/"+ss+".png"));
	    	  ss++;
	      }
		  Assert.assertTrue(result);
		  result=driver.findElement(Elements.xcheckout_heading2).isDisplayed();
		  if(result==false)
	      {
	    	  Thread.sleep(2000);
	    	  TakesScreenshot ts=(TakesScreenshot)driver;
	    	  File source=ts.getScreenshotAs(OutputType.FILE);
	    	  FileUtils.copyFile(source, new File("./Screenshots/funleague flow/"+ss+".png"));
	    	  ss++;
	      }
		  Assert.assertTrue(result);
		  Thread.sleep(4000);
		  driver.findElement(Elements.xfirstname1).sendKeys(data.getData(0, 22, 1));
		  result=driver.findElement(Elements.xgo_to_payment_bttn).isEnabled();
		  Assert.assertFalse(result);
		  driver.findElement(Elements.xlastname).sendKeys(data.getData(0, 22, 2));
		  result=driver.findElement(Elements.xgo_to_payment_bttn).isEnabled();
		  Assert.assertFalse(result);
		  driver.findElement(Elements.xemail_checkout).sendKeys(data.getData(0, 22, 3));
		  result=driver.findElement(Elements.xgo_to_payment_bttn).isEnabled();
		  Assert.assertFalse(result);
		  driver.findElement(Elements.xph_no_checkout).sendKeys("1234567890");
		  result=driver.findElement(Elements.xgo_to_payment_bttn).isDisplayed();
		  if(result==false)
	      {
	    	  Thread.sleep(2000);
	    	  TakesScreenshot ts=(TakesScreenshot)driver;
	    	  File source=ts.getScreenshotAs(OutputType.FILE);
	    	  FileUtils.copyFile(source, new File("./Screenshots/funleague flow/"+ss+".png"));
	    	  ss++;
	      }
		  Assert.assertTrue(result);
		  result=driver.findElement(Elements.xgo_to_payment_bttn).isEnabled();
		  if(result==false)
	      {
	    	  Thread.sleep(2000);
	    	  TakesScreenshot ts=(TakesScreenshot)driver;
	    	  File source=ts.getScreenshotAs(OutputType.FILE);
	    	  FileUtils.copyFile(source, new File("./Screenshots/funleague flow/"+ss+".png"));
	    	  ss++;
	      }
		  Assert.assertTrue(result);
		  driver.findElement(Elements.xgo_to_payment_bttn).click();
	  }
	  @Test(dependsOnMethods="verify_register_page")
	  public static void verify_payment_page() throws InterruptedException, IOException {
		  Thread.sleep(3000);
		  result=Verify.Compare.verifyURL(driver, "https://mepreprod.cognizantorderserv.com/checkout/payment");
		  if(result==false)
	      {
	    	  Thread.sleep(2000);
	    	  TakesScreenshot ts=(TakesScreenshot)driver;
	    	  File source=ts.getScreenshotAs(OutputType.FILE);
	    	  FileUtils.copyFile(source, new File("./Screenshots/funleague flow/"+ss+".png"));
	    	  ss++;
	      }
		  Assert.assertTrue(result);
		  result=driver.findElement(Elements.xmake_payment_bttn).isDisplayed();
		  Assert.assertTrue(result);
		  driver.findElement(Elements.xnamefield_card).sendKeys(data.getData(0, 26, 0));
		  result=driver.findElement(Elements.xmake_payment_bttn).isEnabled();
		  Assert.assertFalse(result);
		  driver.findElement(Elements.xcard_no).sendKeys(data.getData(0, 26, 1));
		  result=driver.findElement(Elements.xmake_payment_bttn).isEnabled();
		  Assert.assertFalse(result);
		  driver.findElement(Elements.xexpiry_month1).click();
		  driver.findElement(Elements.xexpiry_month2).click();
		  result=driver.findElement(Elements.xmake_payment_bttn).isEnabled();
		  Assert.assertFalse(result);
		  driver.findElement(Elements.xexpiry_year1).click();
		  driver.findElement(Elements.xexpiry_year2).click();
		  result=driver.findElement(Elements.xmake_payment_bttn).isEnabled();
		  Assert.assertFalse(result);
		  driver.findElement(Elements.xCVV).sendKeys("123");
		  result=driver.findElement(Elements.xmake_payment_bttn).isEnabled();
		  if(result==false)
	      {
	    	  Thread.sleep(2000);
	    	  TakesScreenshot ts=(TakesScreenshot)driver;
	    	  File source=ts.getScreenshotAs(OutputType.FILE);
	    	  FileUtils.copyFile(source, new File("./Screenshots/funleague flow/"+ss+".png"));
	    	  ss++;
	      }
		  Assert.assertTrue(result);
		  driver.findElement(Elements.xmake_payment_bttn).click();
	  }
	  @Test(dependsOnMethods="verify_payment_page")
	  public static void verify_confirmation_page() throws InterruptedException, IOException {
		  Thread.sleep(15000);
		  result=Verify.Compare.verifyURL(driver, "https://mepreprod.cognizantorderserv.com/checkout/confirmation");
		  if(result==false)
	      {
	    	  Thread.sleep(2000);
	    	  TakesScreenshot ts=(TakesScreenshot)driver;
	    	  File source=ts.getScreenshotAs(OutputType.FILE);
	    	  FileUtils.copyFile(source, new File("./Screenshots/funleague flow/"+ss+".png"));
	    	  ss++;
	      }
		  Assert.assertTrue(result);
	  }
	  @AfterClass 
	  public void closedriver() throws Exception {
		  Thread.sleep(9000);
		  driver.quit();
	  }
}   

