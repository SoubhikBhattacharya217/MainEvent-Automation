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
public class Birthday_booking_flow_production extends Birthday_booking_landingpage_validations_production {
    /*@Test(dependsOnMethods="verify_birthday_book_bttn")
	public static void verifybook_birthday_page_by_click() throws InterruptedException, IOException {
	      Thread.sleep(4000);
	      result=Compare.verifyURL(driver, "https://mepreprod.cognizantorderserv.com/planaparty/find/");
	      if(result==false)
	      {
	    	  Thread.sleep(2000);
	    	  TakesScreenshot ts=(TakesScreenshot)driver;
	    	  File source=ts.getScreenshotAs(OutputType.FILE);
	    	  FileUtils.copyFile(source, new File("./Screenshots/birthday flow/"+ss+".png"));
	    	  ss++;
	      }
	      Assert.assertTrue(result);
	      result=driver.findElement(Elements.xbook_bday_place_heading1).isDisplayed();
	      if(result==false)
	      {
	    	  Thread.sleep(2000);
	    	  TakesScreenshot ts=(TakesScreenshot)driver;
	    	  File source=ts.getScreenshotAs(OutputType.FILE);
	    	  FileUtils.copyFile(source, new File("./Screenshots/birthday flow/"+ss+".png"));
	    	  ss++;
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
	    	  TakesScreenshot ts=(TakesScreenshot)driver;
	    	  File source=ts.getScreenshotAs(OutputType.FILE);
	    	  FileUtils.copyFile(source, new File("./Screenshots/birthday flow/"+ss+".png"));
	    	  ss++;
	      }
	      Assert.assertTrue(result);
	      List<WebElement> b=driver.findElements(Elements.xbook_bday_place_heading2);
			for(WebElement item:b)
			{
				Thread.sleep(2000);
				String b1=item.getText();
				System.out.println("1."+b1);
				Assert.assertEquals(b1, data.getData(1, 15, 1));
				break;
			}
	      result=driver.findElement(Elements.xbook_bday_place_heading3).isDisplayed();
	      if(result==false)
	      {
	    	  Thread.sleep(2000);
	    	  TakesScreenshot ts=(TakesScreenshot)driver;
	    	  File source=ts.getScreenshotAs(OutputType.FILE);
	    	  FileUtils.copyFile(source, new File("./Screenshots/birthday flow/"+ss+".png"));
	    	  ss++;
	      }
	      Assert.assertTrue(result);
	      List<WebElement> c=driver.findElements(Elements.xbook_bday_place_heading3);
			for(WebElement item:c)
			{
				Thread.sleep(2000);
				String c1=item.getText();
				System.out.println("1."+c1);
				Assert.assertEquals(c1, data.getData(1, 16, 1));
				break;
			}
	      result=driver.findElement(Elements.xbook_bday_place_heading4).isDisplayed();
	      if(result==false)
	      {
	    	  Thread.sleep(2000);
	    	  TakesScreenshot ts=(TakesScreenshot)driver;
	    	  File source=ts.getScreenshotAs(OutputType.FILE);
	    	  FileUtils.copyFile(source, new File("./Screenshots/birthday flow/"+ss+".png"));
	    	  ss++;
	      }
	      Assert.assertTrue(result);
	      List<WebElement> d=driver.findElements(Elements.xbook_bday_place_heading4);
			for(WebElement item:d)
			{
				Thread.sleep(2000);
				String d1=item.getText();
				System.out.println("1."+d1);
				Assert.assertEquals(d1, data.getData(1, 17, 1));
				break;
			}
	      driver.findElement(Elements.xlocation_bar_bday).clear();
	      Thread.sleep(3000);
	      driver.findElement(Elements.xlocation_bar_bday).sendKeys("m");
	      driver.findElement(Elements.xlocation_bar_bday).sendKeys(Keys.BACK_SPACE);
	      Thread.sleep(3000);
	      driver.findElement(Elements.xexternalclickfindpage).click();
	      result=driver.findElement(Elements.xinactivetype_city_field).isDisplayed();
	      if(result==false)
	      {
	    	  Thread.sleep(2000);
	    	  TakesScreenshot ts=(TakesScreenshot)driver;
	    	  File source=ts.getScreenshotAs(OutputType.FILE);
	    	  FileUtils.copyFile(source, new File("./Screenshots/birthday flow/"+ss+".png"));
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
	    	  FileUtils.copyFile(source, new File("./Screenshots/birthday flow/"+ss+".png"));
	    	  ss++;
	      }
	      Assert.assertTrue(result);
	      result=driver.findElement(Elements.xfind_mevent_bttn_bday).isDisplayed();
	      if(result==false)
	      {
	    	  Thread.sleep(2000);
	    	  TakesScreenshot ts=(TakesScreenshot)driver;
	    	  File source=ts.getScreenshotAs(OutputType.FILE);
	    	  FileUtils.copyFile(source, new File("./Screenshots/birthday flow/"+ss+".png"));
	    	  ss++;
	      }
	      Assert.assertTrue(result);
	      result=driver.findElement(Elements.xfind_mevent_bttn_bday).isEnabled();
	      if(result==true)
	      {
	    	  Thread.sleep(2000);
	    	  TakesScreenshot ts=(TakesScreenshot)driver;
	    	  File source=ts.getScreenshotAs(OutputType.FILE);
	    	  FileUtils.copyFile(source, new File("./Screenshots/birthday flow/"+ss+".png"));
	    	  ss++;
	      }
	      Assert.assertFalse(result);
	      driver.findElement(Elements.xcity_field).sendKeys(data.getData(0, 19, 1));
	      Thread.sleep(3000);
	      driver.findElement(Elements.xexternalclickfindpage_bday).click();
	      Thread.sleep(3000);
	      result=driver.findElement(Elements.xfind_mevent_bttn_bday).isEnabled();
	      if(result==false)
	      {
	    	  Thread.sleep(2000);
	    	  TakesScreenshot ts=(TakesScreenshot)driver;
	    	  File source=ts.getScreenshotAs(OutputType.FILE);
	    	  FileUtils.copyFile(source, new File("./Screenshots/birthday flow/"+ss+".png"));
	    	  ss++;
	      }
	      Assert.assertTrue(result);
	      driver.findElement(Elements.xfind_mevent_bttn_bday).click();
	      Thread.sleep(3000);*/
	      
	     /* driver.findElement(Elements1.xstorepopup).click();
	  	((JavascriptExecutor)driver).executeScript("scroll(0,550)");*/
	     }
   /* @Test(dependsOnMethods="verifybook_birthday_page_by_click")
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
	public static void verifybday_page_by_keyboard() {
	     driver.findElement(Elements.xcity_field).sendKeys(data.getData(0, 19, 1));
	      driver.findElement(Elements.xlocationsearchbar).sendKeys(Keys.ARROW_DOWN);
	      driver.findElement(Elements.xlocationsearchbar).sendKeys(Keys.ENTER);
	}
    @Test(dependsOnMethods="verifybday_page_by_keyboard")
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
  /* public void verify_select_package_page() throws InterruptedException, IOException {
	   Thread.sleep(4000);
	   List<WebElement> a=driver.findElements(Elements.xslc_pkg_page_heading1);
		for(WebElement item:a)
		{
			String a1=item.getText();
			System.out.println("dhinchak"+a1);
			Assert.assertEquals(a1, data.getData(1, 19, 1));
			break;
		}
		List<WebElement> b=driver.findElements(Elements.xslct_pkg_address_info);
		for(WebElement item:b)
		{
			String b1=item.getText();
			System.out.println("1."+b1);
			Assert.assertEquals(b1, data.getData(1, 20, 1));
			break;
		}
		List<WebElement> c=driver.findElements(Elements.xultimate_party_pack_heading);
		for(WebElement item:c)
		{
			Thread.sleep(2000);
			String c1=item.getText();
			System.out.println("1."+c1);
			Assert.assertEquals(c1, data.getData(1, 21, 1));
			break;
		}
		List<WebElement> d=driver.findElements(Elements.xultimate_party_packprice_heading);
		for(WebElement item:d)
		{
			String d1=item.getText();
			System.out.println("1."+d1);
			Assert.assertEquals(d1, "$29.95");
			break;
		}
		List<WebElement> e=driver.findElements(Elements.xultimate_party_pack_subheading1);
		for(WebElement item:e)
		{
			String e1=item.getText();
			System.out.println("1."+e1);
			Assert.assertEquals(e1, data.getData(1, 23, 1));
			break;
		}
		List<WebElement> f=driver.findElements(Elements.xultimate_party_pack_subheading2);
		for(WebElement item:f)
		{
			String f1=item.getText();
			System.out.println("1."+f1);
			Assert.assertEquals(f1, data.getData(1, 24, 1));
			break;
		}
		List<WebElement> g=driver.findElements(Elements.xultimate_party_pack_subheading3);
		for(WebElement item:g)
		{
			String g1=item.getText();
			System.out.println("1."+g1);
			Assert.assertEquals(g1, data.getData(1, 25, 1));
			break;
		}
		List<WebElement> h=driver.findElements(Elements.xultimate_party_pack_subheading4);
		for(WebElement item:h)
		{
			String h1=item.getText();
			System.out.println("1."+h1);
			Assert.assertEquals(h1, data.getData(1, 26, 1));
			break;
		}
		List<WebElement> i=driver.findElements(Elements.xultimate_party_pack_subheading5);
		for(WebElement item:i)
		{
			String i1=item.getText();
			System.out.println("1."+i1);
			Assert.assertEquals(i1, data.getData(1, 27, 1));
			break;
		}
		List<WebElement> j=driver.findElements(Elements.xultimate_party_pack_subheading6);
		for(WebElement item:j)
		{
			String j1=item.getText();
			System.out.println("1."+j1);
			Assert.assertEquals(j1, data.getData(1, 28, 1));
			break;
		}
		List<WebElement> k=driver.findElements(Elements.xultimate_party_pack_subheading7);
		for(WebElement item:k)
		{
			String k1=item.getText();
			System.out.println("1."+k1);
			Assert.assertEquals(k1, data.getData(1, 29, 1));
			break;
		}
		List<WebElement> l=driver.findElements(Elements.xultimate_party_pack_subheading8);
		for(WebElement item:l)
		{
			String l1=item.getText();
			System.out.println("1."+l1);
			Assert.assertEquals(l1, data.getData(1, 30, 1));
			break;
		}
		List<WebElement> m=driver.findElements(Elements.xultimate_party_pack_subheading9);
		for(WebElement item:m)
		{
			String m1=item.getText();
			System.out.println("1."+m1);
			Assert.assertEquals(m1, data.getData(1, 31, 1));
			break;
		}
		result=driver.findElement(Elements.xslct_the_pkg_bttn).isDisplayed();
		if(result==false)
	      {
	    	  Thread.sleep(2000);
	    	  TakesScreenshot ts=(TakesScreenshot)driver;
	    	  File source=ts.getScreenshotAs(OutputType.FILE);
	    	  FileUtils.copyFile(source, new File("./Screenshots/birthday flow/"+ss+".png"));
	    	  ss++;
	      }
		Assert.assertTrue(result);
		result=driver.findElement(Elements.xslct_the_pkg_bttn).isEnabled();
		if(result==false)
	      {
	    	  Thread.sleep(2000);
	    	  TakesScreenshot ts=(TakesScreenshot)driver;
	    	  File source=ts.getScreenshotAs(OutputType.FILE);
	    	  FileUtils.copyFile(source, new File("./Screenshots/birthday flow/"+ss+".png"));
	    	  ss++;
	      }
		Assert.assertTrue(result);
		result=driver.findElement(Elements.xcmp_pkg_bttn).isEnabled();
		if(result==false)
	      {
	    	  Thread.sleep(2000);
	    	  TakesScreenshot ts=(TakesScreenshot)driver;
	    	  File source=ts.getScreenshotAs(OutputType.FILE);
	    	  FileUtils.copyFile(source, new File("./Screenshots/birthday flow/"+ss+".png"));
	    	  ss++;
	      }
		Assert.assertTrue(result);
		driver.findElement(Elements.xcmp_pkg_bttn).click();
		result=driver.findElement(Elements.xcmp_pkg_popup_close_bttn).isEnabled();
		if(result==false)
	      {
	    	  Thread.sleep(2000);
	    	  TakesScreenshot ts=(TakesScreenshot)driver;
	    	  File source=ts.getScreenshotAs(OutputType.FILE);
	    	  FileUtils.copyFile(source, new File("./Screenshots/birthday flow/"+ss+".png"));
	    	  ss++;
	      }
		Assert.assertTrue(result);
		Thread.sleep(2500);
		driver.findElement(Elements.xcmp_pkg_popup_close_bttn).click();
		Thread.sleep(2000);
		driver.findElement(Elements.xslct_the_pkg_bttn).click();
	   }*/
   @Test(dependsOnMethods="verify_select_package_page")
   public void verify_guest_count_popup() throws InterruptedException, IOException {
	   List<WebElement> a=driver.findElements(Elements.xconditions_txt_pkg_popup);
		for(WebElement item:a)
		{
			String a1=item.getText();
			System.out.println("1."+a1);
			Assert.assertEquals(a1, data.getData(1, 32, 1));
			break;
		}
		List<WebElement> b=driver.findElements(Elements.xguest_count_dd);
		for(WebElement item:b)
		{
			String b1=item.getText();
			System.out.println("1."+b1);
			Assert.assertEquals(b1, data.getData(1, 34, 1));
			break;
		}
		List<WebElement> c=driver.findElements(Elements.xtxt_under_date_field);
		for(WebElement item:c)
		{
			String c1=item.getText();
			System.out.println("1."+c1);
			Assert.assertEquals(c1, data.getData(1, 33, 1));
			break;
		}
		driver.findElement(Elements.xdate_picker_field).click();
		result=driver.findElement(Elements.xdate_close_bttn).isEnabled();
		if(result==false)
	      {
	    	  Thread.sleep(2000);
	    	  TakesScreenshot ts=(TakesScreenshot)driver;
	    	  File source=ts.getScreenshotAs(OutputType.FILE);
	    	  FileUtils.copyFile(source, new File("./Screenshots/birthday flow/"+ss+".png"));
	    	  ss++;
	      }
		Assert.assertTrue(result);
		driver.findElement(Elements.xdate_close_bttn).click();
		result=driver.findElement(Elements.xproceed_bttn).isDisplayed();
		if(result==false)
	      {
	    	  Thread.sleep(2000);
	    	  TakesScreenshot ts=(TakesScreenshot)driver;
	    	  File source=ts.getScreenshotAs(OutputType.FILE);
	    	  FileUtils.copyFile(source, new File("./Screenshots/birthday flow/"+ss+".png"));
	    	  ss++;
	      }
		Assert.assertTrue(result);
		result=driver.findElement(Elements.xproceed_bttn).isEnabled();
		if(result==true)
	      {
	    	  Thread.sleep(2000);
	    	  TakesScreenshot ts=(TakesScreenshot)driver;
	    	  File source=ts.getScreenshotAs(OutputType.FILE);
	    	  FileUtils.copyFile(source, new File("./Screenshots/birthday flow/"+ss+".png"));
	    	  ss++;
	      }
		Assert.assertFalse(result);
		driver.findElement(Elements.xdate_picker_field).click();
		driver.findElement(Elements.xdate_slct_bday).click();
		result=driver.findElement(Elements.xproceed_bttn).isEnabled();
		if(result==false)
	      {
	    	  Thread.sleep(2000);
	    	  TakesScreenshot ts=(TakesScreenshot)driver;
	    	  File source=ts.getScreenshotAs(OutputType.FILE);
	    	  FileUtils.copyFile(source, new File("./Screenshots/birthday flow/"+ss+".png"));
	    	  ss++;
	      }
		Assert.assertTrue(result);
		driver.findElement(Elements.xproceed_bttn).click();
   }
   
 }
