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
public class Bowling_lane_flow_production_site {
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
       Thread.sleep(4000);
       driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  }
/*	@Test
	public void verifypopupclose() throws InterruptedException {
		Thread.sleep(4000);
		result=driver.findElement(Elements.xproductionpopupclose).isDisplayed();
		Assert.assertTrue(result);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		result=driver.findElement(Elements.xproductionpopupclose).isEnabled();
		Assert.assertTrue(result);
		driver.findElement(Elements.xproductionpopupclose).click();
		Thread.sleep(4000);
		((JavascriptExecutor)driver).executeScript("scroll(0,550)");
	}
	@Test(dependsOnMethods="verifypopupclose")
	public static void verifyreserve_bttn() throws IOException, InterruptedException {
	      result=driver.findElement(Elements.xbowlingreservebttn).isDisplayed();
	      if(result==false)//this if block is for screen shot taking if anything is failed only then it will take screenshots !!
	      {
	    	  Thread.sleep(2000);
	    	  TakesScreenshot ts=(TakesScreenshot)driver;//type casting done on TakesScreenshot.
	    	  File source=ts.getScreenshotAs(OutputType.FILE);//saving the screenshot as a file type.
	    	  FileUtils.copyFile(source, new File("./Screenshots/bowling flow/"+ss+".png"));//saving the file type screen shot in a directory under the Fileutils class.
	          ss++;
	      }
	      Assert.assertTrue(result);
	      result=driver.findElement(Elements.xbowlingreservebttn).isDisplayed();
	      if(result==false)
	      {
	    	  Thread.sleep(2000);
	    	  TakesScreenshot ts=(TakesScreenshot)driver;
	    	  File source=ts.getScreenshotAs(OutputType.FILE);
	    	  FileUtils.copyFile(source, new File("./Screenshots/bowling flow/"+ss+".png"));
	    	  ss++;
	      }
	      Assert.assertTrue(result);
	      driver.findElement(Elements.xbowlingreservebttn).click();
	      result=Compare.verifyURL(driver, "https://mepreprod.cognizantorderserv.com/findALane/find/");
	      if(result==false)
	      {
	    	  Thread.sleep(2000);
	    	  TakesScreenshot ts=(TakesScreenshot)driver;
	    	  File source=ts.getScreenshotAs(OutputType.FILE);
	    	  FileUtils.copyFile(source, new File("./Screenshots/bowling flow/"+ss+".png"));
	    	  ss++;
	      }
	      Assert.assertTrue(result);
	      
	}
	@Test(dependsOnMethods="verifyreserve_bttn")
	public static void verifybowling_page_by_click() throws InterruptedException, IOException {
	      Thread.sleep(4000);
	      result=Compare.verifyURL(driver, "https://mepreprod.cognizantorderserv.com/findALane/find/");
	      if(result==false)
	      {
	    	  Thread.sleep(2000);
	    	  TakesScreenshot ts=(TakesScreenshot)driver;
	    	  File source=ts.getScreenshotAs(OutputType.FILE);
	    	  FileUtils.copyFile(source, new File("./Screenshots/bowling flow/"+ss+".png"));
	    	  ss++;
	      }
	      Assert.assertTrue(result);
	      result=driver.findElement(Elements.xfind_bowling_lane_heading1).isDisplayed();
	      if(result==false)
	      {
	    	  Thread.sleep(2000);
	    	  TakesScreenshot ts=(TakesScreenshot)driver;
	    	  File source=ts.getScreenshotAs(OutputType.FILE);
	    	  FileUtils.copyFile(source, new File("./Screenshots/bowling flow/"+ss+".png"));
	    	  ss++;
	      }
	      Assert.assertTrue(result);
	      List<WebElement> a=driver.findElements(Elements.xfind_bowling_lane_heading1);
	      for(WebElement Item:a)
	      {
	    	String a1=Item.getText();
	    	Assert.assertEquals(a1, data.getData(1, 47, 1));
	    	break;
	      }
	      result=driver.findElement(Elements.xfind_bowling_lane_heading2).isDisplayed();
	      if(result==false)
	      {
	    	  Thread.sleep(2000);
	    	  TakesScreenshot ts=(TakesScreenshot)driver;
	    	  File source=ts.getScreenshotAs(OutputType.FILE);
	    	  FileUtils.copyFile(source, new File("./Screenshots/bowling flow/"+ss+".png"));
	    	  ss++;
	      }
	      Assert.assertTrue(result);
	      List<WebElement> b=driver.findElements(Elements.xfind_bowling_lane_heading1);
	      for(WebElement Item:b)
	      {
	    	String b1=Item.getText();
	    	Assert.assertEquals(b1, data.getData(1, 47, 1));
	    	break;
	      }
	      result=driver.findElement(Elements.xfind_bowling_lane_heading3).isDisplayed();
	      if(result==false)
	      {
	    	  Thread.sleep(2000);
	    	  TakesScreenshot ts=(TakesScreenshot)driver;
	    	  File source=ts.getScreenshotAs(OutputType.FILE);
	    	  FileUtils.copyFile(source, new File("./Screenshots/bowling flow/"+ss+".png"));
	    	  ss++;
	      }
	      Assert.assertTrue(result);
	      List<WebElement> c=driver.findElements(Elements.xfind_bowling_lane_heading1);
	      for(WebElement Item:c)
	      {
	    	String c1=Item.getText();
	    	Assert.assertEquals(c1, data.getData(1, 47, 1));
	    	break;
	      }
	      result=driver.findElement(Elements.xfind_bowling_lane_heading4).isDisplayed();
	      if(result==false)
	      {
	    	  Thread.sleep(2000);
	    	  TakesScreenshot ts=(TakesScreenshot)driver;
	    	  File source=ts.getScreenshotAs(OutputType.FILE);
	    	  FileUtils.copyFile(source, new File("./Screenshots/bowling flow/"+ss+".png"));
	    	  ss++;
	      }
	      Assert.assertTrue(result);
	      List<WebElement> d=driver.findElements(Elements.xfind_bowling_lane_heading1);
	      for(WebElement Item:d)
	      {
	    	String d1=Item.getText();
	    	Assert.assertEquals(d1, data.getData(1, 47, 1));
	    	break;
	      }
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
	    	  FileUtils.copyFile(source, new File("./Screenshots/bowling flow/"+ss+".png"));
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
	    	  FileUtils.copyFile(source, new File("./Screenshots/bowling flow/"+ss+".png"));
	    	  ss++;
	      }
	      Assert.assertTrue(result);
	      result=driver.findElement(Elements.xfind_a_mainevent_bttn).isDisplayed();
	      if(result==false)
	      {
	    	  Thread.sleep(2000);
	    	  TakesScreenshot ts=(TakesScreenshot)driver;
	    	  File source=ts.getScreenshotAs(OutputType.FILE);
	    	  FileUtils.copyFile(source, new File("./Screenshots/bowling flow/"+ss+".png"));
	    	  ss++;
	      }
	      Assert.assertTrue(result);
	      result=driver.findElement(Elements.xfind_a_mainevent_bttn).isEnabled();
	      if(result==true)
	      {
	    	  Thread.sleep(2000);
	    	  TakesScreenshot ts=(TakesScreenshot)driver;
	    	  File source=ts.getScreenshotAs(OutputType.FILE);
	    	  FileUtils.copyFile(source, new File("./Screenshots/bowling flow/"+ss+".png"));
	    	  ss++;
	      }
	      Assert.assertFalse(result);
	      driver.findElement(Elements.xcity_field).sendKeys(data.getData(0, 19, 1));
	      Thread.sleep(3000);
	      driver.findElement(Elements.xexternalclickfindpage1).click();
	      Thread.sleep(3000);
	      result=driver.findElement(Elements.xfind_a_mainevent_bttn).isEnabled();
	      if(result==false)
	      {
	    	  Thread.sleep(2000);
	    	  TakesScreenshot ts=(TakesScreenshot)driver;
	    	  File source=ts.getScreenshotAs(OutputType.FILE);
	    	  FileUtils.copyFile(source, new File("./Screenshots/bowling flow/"+ss+".png"));
	    	  ss++;
	      }
	      Assert.assertTrue(result);
	      driver.findElement(Elements.xfind_a_mainevent_bttn).click();
	      Thread.sleep(3000);
	      
	      driver.findElement(Elements1.xstorepopup).click();
	  	((JavascriptExecutor)driver).executeScript("scroll(0,550)");
	}*/
	/*@Test(dependsOnMethods="verifybowling_page_by_click")
	public static void verifystorepopup_close() throws IOException, InterruptedException {
		Thread.sleep(2000);
		result=driver.findElement(Elements.xstore_popupclose_bbtn).isDisplayed();
		   if(result==false)
		      {
		    	  Thread.sleep(2000);
		    	  TakesScreenshot ts=(TakesScreenshot)driver;
		    	  File source=ts.getScreenshotAs(OutputType.FILE);
		    	  FileUtils.copyFile(source, new File("./Screenshots/bowling flow/"+ss+".png"));
		    	  ss++;
		      }
		Assert.assertTrue(result);
		result=driver.findElement(Elements.xstore_popupclose_bbtn).isEnabled();
		   if(result==false)
		      {
		    	  Thread.sleep(2000);
		    	  TakesScreenshot ts=(TakesScreenshot)driver;
		    	  File source=ts.getScreenshotAs(OutputType.FILE);
		    	  FileUtils.copyFile(source, new File("./Screenshots/bowling flow/"+ss+".png"));
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
	}*/
	/*@Test(dependsOnMethods="verifybowling_page_by_keyboard")
	public static void verifystore_popup() throws InterruptedException, IOException {
		//driver.switchTo().frame("storeModalContent");
		result=driver.findElement(Elements.xfind_bttn_in_popup).isDisplayed();//to verify the list view flow in the store pop up
		   if(result==false)
		      {
		    	  Thread.sleep(2000);
		    	  TakesScreenshot ts=(TakesScreenshot)driver;
		    	  File source=ts.getScreenshotAs(OutputType.FILE);
		    	  FileUtils.copyFile(source, new File("./Screenshots/bowling flow/"+ss+".png"));
		    	  ss++;
		      }
		Assert.assertTrue(result);
		result=driver.findElement(Elements.xfind_bttn_in_popup).isEnabled();
		   if(result==false)
		      {
		    	  Thread.sleep(2000);
		    	  TakesScreenshot ts=(TakesScreenshot)driver;
		    	  File source=ts.getScreenshotAs(OutputType.FILE);
		    	  FileUtils.copyFile(source, new File("./Screenshots/bowling flow/"+ss+".png"));
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
		    	  FileUtils.copyFile(source, new File("./Screenshots/bowling flow/"+ss+".png"));
		    	  ss++;
		      }
		Assert.assertTrue(result);
		   if(result==false)
		      {
		    	  Thread.sleep(2000);
		    	  TakesScreenshot ts=(TakesScreenshot)driver;
		    	  File source=ts.getScreenshotAs(OutputType.FILE);
		    	  FileUtils.copyFile(source, new File("./Screenshots/bowling flow/"+ss+".png"));
		    	  ss++;
		      }result=driver.findElement(Elements.xmapbttn_store_popup).isEnabled();
		Assert.assertTrue(result);
		driver.findElement(Elements1.xmapbttn_store_popup).click();
		WebElement p = driver.findElement(Elements.xmapview_placename);//different approach to store webelement text rather than using arraylist
		String placename=p.getText();
		Assert.assertEquals(placename, data.getData(1, 0, 0));
		Thread.sleep(2000);
		driver.findElement(Elements.xselect_and_continue).click();
	}*/
	@Test(dependsOnMethods="verifystore_popupmapviewflow")
	public static void verify_slct_time_PAGE_only_buttons() throws IOException, InterruptedException {
		result=driver.findElement(Elements.xslctdate).isDisplayed();
		if(result==false)
	      {
	    	  Thread.sleep(2000);
	    	  TakesScreenshot ts=(TakesScreenshot)driver;
	    	  File source=ts.getScreenshotAs(OutputType.FILE);
	    	  FileUtils.copyFile(source, new File("./Screenshots/bowling flow/"+ss+".png"));
	    	  ss++;
	      }
		Assert.assertTrue(result);
		result=driver.findElement(Elements.xslctdate).isEnabled();
		if(result==false)
	      {
	    	  Thread.sleep(2000);
	    	  TakesScreenshot ts=(TakesScreenshot)driver;
	    	  File source=ts.getScreenshotAs(OutputType.FILE);
	    	  FileUtils.copyFile(source, new File("./Screenshots/bowling flow/"+ss+".png"));
	    	  ss++;
	      }
		Assert.assertTrue(result);
		List<WebElement> a=driver.findElements(Elements.xslctdate_txt);
		for(WebElement item:a)
		{
			Thread.sleep(4000);
			String a1=item.getText();
			System.out.println("2."+a1);
			Assert.assertEquals(a1, "Booking available 1 hours to 45 days in advance");
			break;
		}
		result=driver.findElement(Elements.xchooseduration).isDisplayed();
		if(result==false)
	      {
	    	  Thread.sleep(2000);
	    	  TakesScreenshot ts=(TakesScreenshot)driver;
	    	  File source=ts.getScreenshotAs(OutputType.FILE);
	    	  FileUtils.copyFile(source, new File("./Screenshots/bowling flow/"+ss+".png"));
	    	  ss++;
	      }
		Assert.assertTrue(result);
		result=driver.findElement(Elements.xchooseduration).isEnabled();
		if(result==false)
	      {
	    	  Thread.sleep(2000);
	    	  TakesScreenshot ts=(TakesScreenshot)driver;
	    	  File source=ts.getScreenshotAs(OutputType.FILE);
	    	  FileUtils.copyFile(source, new File("./Screenshots/bowling flow/"+ss+".png"));

	    	  ss++;
	      }
		Assert.assertTrue(result);
		result=driver.findElement(Elements.xnooflanes).isDisplayed();
		if(result==false)
	      {
	    	  Thread.sleep(2000);
	    	  TakesScreenshot ts=(TakesScreenshot)driver;
	    	  File source=ts.getScreenshotAs(OutputType.FILE);
	    	  FileUtils.copyFile(source, new File("./Screenshots/bowling flow/"+ss+".png"));
	    	  ss++;
	      }
		Assert.assertTrue(result);
		result=driver.findElement(Elements.xnooflanes).isEnabled();
		if(result==false)
	      {
	    	  Thread.sleep(2000);
	    	  TakesScreenshot ts=(TakesScreenshot)driver;
	    	  File source=ts.getScreenshotAs(OutputType.FILE);
	    	  FileUtils.copyFile(source, new File("./Screenshots/bowling flow/"+ss+".png"));
	    	  ss++;
	      }
		Assert.assertTrue(result);
		result=driver.findElement(Elements.xnoofbowlers).isDisplayed();
		if(result==false)
	      {
	    	  Thread.sleep(2000);
	    	  TakesScreenshot ts=(TakesScreenshot)driver;
	    	  File source=ts.getScreenshotAs(OutputType.FILE);
	    	  FileUtils.copyFile(source, new File("./Screenshots/bowling flow/"+ss+".png"));
	    	  ss++;
	      }
		Assert.assertTrue(result);
		result=driver.findElement(Elements.xnoofbowlers).isEnabled();
		if(result==false)
	      {
	    	  Thread.sleep(2000);
	    	  TakesScreenshot ts=(TakesScreenshot)driver;
	    	  File source=ts.getScreenshotAs(OutputType.FILE);
	    	  FileUtils.copyFile(source, new File("./Screenshots/bowling flow/"+ss+".png"));	    	
	    	  ss++;
	      }
		Assert.assertTrue(result);
		result=driver.findElement(Elements.xse_av_times_bttn).isDisplayed();
		if(result==false)
	      {
	    	  Thread.sleep(2000);
	    	  TakesScreenshot ts=(TakesScreenshot)driver;
	    	  File source=ts.getScreenshotAs(OutputType.FILE);
	    	  FileUtils.copyFile(source, new File("./Screenshots/bowling flow/"+ss+".png"));
	    	  System.out.println("9");
	    	  ss++;
	      }
		Assert.assertTrue(result);
		result=driver.findElement(Elements.xse_av_times_bttn).isEnabled();
		if(result==true)
	      {
	    	  Thread.sleep(2000);
	    	  TakesScreenshot ts=(TakesScreenshot)driver;
	    	  File source=ts.getScreenshotAs(OutputType.FILE);
	    	  FileUtils.copyFile(source, new File("./Screenshots/bowling flow/"+ss+".png"));
	    	  System.out.println("10");
	    	  ss++;
	      }
		
	}
  /*@Test(dependsOnMethods="verify_slct_time_PAGE_only_buttons")
  public static void verify_slct_time_PAGE() throws InterruptedException, IOException {
	  SimpleDateFormat formatter=new SimpleDateFormat("MM/dd/yyyy");
	  Date date=new Date();
	  String date1=formatter.format(date);
	  driver.findElement(Elements.xslctdate).click();
	  result=driver.findElement(Elements.xtoday_bttn_calender).isDisplayed();
	  if(result==false)
      {
    	  Thread.sleep(2000);
    	  TakesScreenshot ts=(TakesScreenshot)driver;
    	  File source=ts.getScreenshotAs(OutputType.FILE);
    	  FileUtils.copyFile(source, new File("./Screenshots/bowling flow/"+ss+".png"));
    	  ss++;
      }
	  Assert.assertTrue(result);
	  result=driver.findElement(Elements.xtoday_bttn_calender).isEnabled();
	  if(result==false)
      {
    	  Thread.sleep(2000);
    	  TakesScreenshot ts=(TakesScreenshot)driver;
    	  File source=ts.getScreenshotAs(OutputType.FILE);
    	  FileUtils.copyFile(source, new File("./Screenshots/bowling flow/"+ss+".png"));
    	  ss++;
      }
	  Assert.assertTrue(result);
	  driver.findElement(Elements.xdate_slct).click();
	  Thread.sleep(2000);
	  List<WebElement> b=driver.findElements(Elements.xslctdate1);
		for(WebElement item:b)
		{
			Thread.sleep(4000);
			String b1=item.getText();
			System.out.println("3."+b1);
			break;
		}
		driver.findElement(Elements.xnoofbowlers).click();
		result=driver.findElement(Elements.xno_of_bowlers_popup).isDisplayed();
		if(result==false)
	      {
	    	  Thread.sleep(2000);
	    	  TakesScreenshot ts=(TakesScreenshot)driver;
	    	  File source=ts.getScreenshotAs(OutputType.FILE);
	    	  FileUtils.copyFile(source, new File("./Screenshots/bowling flow/"+ss+".png"));
	    	  ss++;
	      }
		Assert.assertTrue(result);
		result=driver.findElement(Elements.xdone_bttn).isEnabled();
		Assert.assertFalse(result);
		Thread.sleep(2000);
		driver.findElement(Elements.xadults).click();
		Thread.sleep(2000);
		driver.findElement(Elements.xadults_3).click();
		driver.findElement(Elements.xchild).click();
		driver.findElement(Elements.xchilds_2).click();
		result=driver.findElement(Elements.xdone_bttn).isDisplayed();
		Assert.assertTrue(result);
		result=driver.findElement(Elements.xdone_bttn).isEnabled();
		Assert.assertTrue(result);
		driver.findElement(Elements.xdone_bttn).click();
		Thread.sleep(2000);
		result=driver.findElement(Elements.xse_av_times_bttn).isEnabled();
		Assert.assertTrue(result);
		driver.findElement(Elements.xse_av_times_bttn).click();
		driver.findElement(Elements.xtime_slct).click();//selection 12.00 am from the select time pop-up
  }*/
 /* @Test(dependsOnMethods="verify_slct_time_PAGE")
  public static void verify_order_summary_page() throws InterruptedException, IOException {
	  Thread.sleep(5000);
	  result=Verify.Compare.verifyURL(driver, "https://mepreprod.cognizantorderserv.com/findALane/laneOrderSummary");
	  if(result==false)
      {
    	  Thread.sleep(2000);
    	  TakesScreenshot ts=(TakesScreenshot)driver;
    	  File source=ts.getScreenshotAs(OutputType.FILE);
    	  FileUtils.copyFile(source, new File("./Screenshots/bowling flow/"+ss+".png"));
    	  ss++;
      }
	  Assert.assertTrue(result);
	  result=driver.findElement(Elements.xgo_to_cart_bttn).isDisplayed();
	  if(result==false)
      {
    	  Thread.sleep(2000);
    	  TakesScreenshot ts=(TakesScreenshot)driver;
    	  File source=ts.getScreenshotAs(OutputType.FILE);
    	  FileUtils.copyFile(source, new File("./Screenshots/bowling flow/"+ss+".png"));
    	  ss++;
      }
	  Assert.assertTrue(result);
	  result=driver.findElement(Elements.xgo_to_cart_bttn).isEnabled();
	  if(result==false)
      {
    	  Thread.sleep(2000);
    	  TakesScreenshot ts=(TakesScreenshot)driver;
    	  File source=ts.getScreenshotAs(OutputType.FILE);
    	  FileUtils.copyFile(source, new File("./Screenshots/bowling flow/"+ss+".png"));
    	  ss++;
      }
	  Assert.assertTrue(result);
	  driver.findElement(Elements.xgo_to_cart_bttn).click();
  }*/
  @Test(dependsOnMethods="verify_order_summary_page")
 /* public static void verify_cart_page() throws InterruptedException, IOException{
	  Thread.sleep(2000);
	  result=Verify.Compare.verifyURL(driver, "https://mepreprod.cognizantorderserv.com/checkout/cart");
	  if(result==false)
      {
    	  Thread.sleep(2000);
    	  TakesScreenshot ts=(TakesScreenshot)driver;
    	  File source=ts.getScreenshotAs(OutputType.FILE);
    	  FileUtils.copyFile(source, new File("./Screenshots/bowling flow/"+ss+".png"));
    	  ss++;
      }
	  Assert.assertTrue(result);
	  result=driver.findElement(Elements.xmodify_bttn).isDisplayed();
	  if(result==false)
      {
    	  Thread.sleep(2000);
    	  TakesScreenshot ts=(TakesScreenshot)driver;
    	  File source=ts.getScreenshotAs(OutputType.FILE);
    	  FileUtils.copyFile(source, new File("./Screenshots/bowling flow/"+ss+".png"));
    	  ss++;
      }
	  Assert.assertTrue(result);
	  result=driver.findElement(Elements.xmodify_bttn).isEnabled();
	  if(result==false)
      {
    	  Thread.sleep(2000);
    	  TakesScreenshot ts=(TakesScreenshot)driver;
    	  File source=ts.getScreenshotAs(OutputType.FILE);
    	  FileUtils.copyFile(source, new File("./Screenshots/bowling flow/"+ss+".png"));
    	  ss++;
      }
	  Assert.assertTrue(result);
	  result=driver.findElement(Elements.xdelete_icon_bttn).isDisplayed();
	  if(result==false)
      {
    	  Thread.sleep(2000);
    	  TakesScreenshot ts=(TakesScreenshot)driver;
    	  File source=ts.getScreenshotAs(OutputType.FILE);
    	  FileUtils.copyFile(source, new File("./Screenshots/bowling flow/"+ss+".png"));
    	  ss++;
      }
	  Assert.assertTrue(result);
	  result=driver.findElement(Elements.xdelete_icon_bttn).isEnabled();
	  if(result==false)
      {
    	  Thread.sleep(2000);
    	  TakesScreenshot ts=(TakesScreenshot)driver;
    	  File source=ts.getScreenshotAs(OutputType.FILE);
    	  FileUtils.copyFile(source, new File("./Screenshots/bowling flow/"+ss+".png"));
    	  ss++;
      }
	  Assert.assertTrue(result);*/
	  result=driver.findElement(Elements.xcheckout_bttn1).isDisplayed();
	  if(result==false)
      {
    	  Thread.sleep(2000);
    	  TakesScreenshot ts=(TakesScreenshot)driver;
    	  File source=ts.getScreenshotAs(OutputType.FILE);
    	  FileUtils.copyFile(source, new File("./Screenshots/bowling flow/"+ss+".png"));
    	  ss++;
      }
	  Assert.assertTrue(result);
	  result=driver.findElement(Elements.xcheckout_bttn1).isEnabled();
	  if(result==false)
      {
    	  Thread.sleep(2000);
    	  TakesScreenshot ts=(TakesScreenshot)driver;
    	  File source=ts.getScreenshotAs(OutputType.FILE);
    	  FileUtils.copyFile(source, new File("./Screenshots/bowling flow/"+ss+".png"));
    	  ss++;
      }
	  Assert.assertTrue(result);
	  result=driver.findElement(Elements.xcheckout_bttn2).isDisplayed();
	  if(result==false)
      {
    	  Thread.sleep(2000);
    	  TakesScreenshot ts=(TakesScreenshot)driver;
    	  File source=ts.getScreenshotAs(OutputType.FILE);
    	  FileUtils.copyFile(source, new File("./Screenshots/bowling flow/"+ss+".png"));
    	  ss++;
      }
	  Assert.assertTrue(result);
	  result=driver.findElement(Elements.xcheckout_bttn2).isEnabled();
	  if(result==false)
      {
    	  Thread.sleep(2000);
    	  TakesScreenshot ts=(TakesScreenshot)driver;
    	  File source=ts.getScreenshotAs(OutputType.FILE);
    	  FileUtils.copyFile(source, new File("./Screenshots/bowling flow/"+ss+".png"));
    	  ss++;
      }
	  Assert.assertTrue(result);
	  driver.findElement(Elements.xcheckout_bttn1).click();
  }
  @Test(dependsOnMethods="verify_cart_page")
  /*public static void verify_register_page() throws InterruptedException, IOException {
	  result=driver.findElement(Elements.xcheckout_heading1).isDisplayed();
	  if(result==false)
      {
    	  Thread.sleep(2000);
    	  TakesScreenshot ts=(TakesScreenshot)driver;
    	  File source=ts.getScreenshotAs(OutputType.FILE);
    	  FileUtils.copyFile(source, new File("./Screenshots/bowling flow/"+ss+".png"));
    	  ss++;
      }
	  Assert.assertTrue(result);
	  result=driver.findElement(Elements.xcheckout_heading2).isDisplayed();
	  if(result==false)
      {
    	  Thread.sleep(2000);
    	  TakesScreenshot ts=(TakesScreenshot)driver;
    	  File source=ts.getScreenshotAs(OutputType.FILE);
    	  FileUtils.copyFile(source, new File("./Screenshots/bowling flow/"+ss+".png"));
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
    	  FileUtils.copyFile(source, new File("./Screenshots/bowling flow/"+ss+".png"));
    	  ss++;
      }
	  Assert.assertTrue(result);
	  result=driver.findElement(Elements.xgo_to_payment_bttn).isEnabled();
	  if(result==false)
      {
    	  Thread.sleep(2000);
    	  TakesScreenshot ts=(TakesScreenshot)driver;
    	  File source=ts.getScreenshotAs(OutputType.FILE);
    	  FileUtils.copyFile(source, new File("./Screenshots/bowling flow/"+ss+".png"));
    	  ss++;
      }
	  Assert.assertTrue(result);
	  driver.findElement(Elements.xgo_to_payment_bttn).click();
  }*/
  @Test(dependsOnMethods="verify_register_page")
  public static void verify_payment_page() throws InterruptedException, IOException {
	  Thread.sleep(3000);
	  result=Verify.Compare.verifyURL(driver, "https://mepreprod.cognizantorderserv.com/checkout/payment");
	  if(result==false)
      {
    	  Thread.sleep(2000);
    	  TakesScreenshot ts=(TakesScreenshot)driver;
    	  File source=ts.getScreenshotAs(OutputType.FILE);
    	  FileUtils.copyFile(source, new File("./Screenshots/bowling flow/"+ss+".png"));
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
    	  FileUtils.copyFile(source, new File("./Screenshots/bowling flow/"+ss+".png"));
    	  ss++;
      }
	  Assert.assertTrue(result);
	  driver.findElement(Elements.xmake_payment_bttn).click();
  }
  @Test(dependsOnMethods="verify_payment_page")
  public static void verify_confirmation_page() throws InterruptedException, IOException {
	  Thread.sleep(10000);
	  result=Verify.Compare.verifyURL(driver, "https://mepreprod.cognizantorderserv.com/checkout/confirmation");
	  if(result==false)
      {
    	  Thread.sleep(2000);
    	  TakesScreenshot ts=(TakesScreenshot)driver;
    	  File source=ts.getScreenshotAs(OutputType.FILE);
    	  FileUtils.copyFile(source, new File("./Screenshots/bowling flow/"+ss+".png"));
    	  ss++;
      }
	  Assert.assertTrue(result);
  }
  @AfterClass 
  public void closedriver() throws Exception {
	  //Thread.sleep(9000);
	  //driver.quit();
  }
  
}
