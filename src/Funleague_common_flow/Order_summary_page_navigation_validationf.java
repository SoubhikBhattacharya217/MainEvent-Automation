package Funleague_common_flow;

import org.CognizantQA.PageObject.Elements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Bowling_common_flow.Bowling_failure_screen_shot;

public class Order_summary_page_navigation_validationf {
	WebDriver driver;
	static boolean result=false;
	Bowling_failure_screen_shot ss=new Bowling_failure_screen_shot();
	public void verify_snavi_order_summary_page(WebDriver driver) throws InterruptedException {   
		WebDriverWait wait=new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(Elements.xgo_to_cart_bttn));
	  result=Verify.Compare.verifyURL(driver, "https://mepreprod.cognizantorderserv.com/findALeague/leagueOrderSummary");
	  if(result==false)
    {
  	  Thread.sleep(2000);
  	  ss.takeScreenShot(driver, "order summary page is not successfully navigated");
    }
	  Assert.assertTrue(result);
}
}
