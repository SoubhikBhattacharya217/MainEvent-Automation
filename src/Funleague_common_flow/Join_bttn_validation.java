package Funleague_common_flow;

import java.io.File;
import java.io.IOException;

import org.CognizantQA.PageObject.Elements;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Bowling_common_flow.Bowling_failure_screen_shot;

public class Join_bttn_validation {

	WebDriver driver;
	static boolean result=false;
	Funleague_failure_screenshots ss=new Funleague_failure_screenshots();
	public void verify_join_funleague_bttn(WebDriver driver) throws InterruptedException, IOException {
		result=driver.findElement(Elements.xjoin_funleague_bttn).isDisplayed();
		if(result==false)//this if block is for screen shot taking if anything is failed only then it will take screenshots !!
	      {
	    	  Thread.sleep(2000);
	    	  ss.takeScreenShot(driver, "funleague join button is not displayed");
	      }
		Assert.assertTrue(result);
		result=driver.findElement(Elements.xjoin_funleague_bttn).isEnabled();
		if(result==false)//this if block is for screen shot taking if anything is failed only then it will take screenshots !!
	      {
	    	  Thread.sleep(2000);
	    	  ss.takeScreenShot(driver, "funleague join button is not enabled");
	      }
		Assert.assertTrue(result);
		driver.findElement(Elements.xjoin_funleague_bttn).click();
	}
}
