package Common_flow;
import java.util.concurrent.TimeUnit;

import org.CognizantQA.PageObject.Elements;
import org.CognizantQA.TestData.DataConfig;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class OnlinePopupClose {
	WebDriver driver;
	static DataConfig data;
	static JavascriptExecutor js;
	
	WebElement cross;
	static boolean result =false;
	public Boolean verifyonlinepopupclose(WebDriver driver) {
		try 
		{
			WebDriverWait wait=new WebDriverWait(driver,30);
			wait.until(ExpectedConditions.visibilityOfElementLocated(Elements.xonline_pop_up_close_bttn));
			driver.findElement(Elements.xonline_pop_up_close_bttn).click();
			return true;
		}
		catch(Exception e)
		{
			System.out.println("issue");
			return false;
		}
	}

}
