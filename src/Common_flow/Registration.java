package Common_flow;
import static org.testng.Assert.assertEquals;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import org.CognizantQA.PageObject.Elements;
import org.CognizantQA.Properties.PropertiesFile;
import org.CognizantQA.TestData.DataConfig;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import Bowling_common_flow.Bowling_failure_screen_shot;
import excelconnect.excelconnect;
public class Registration {
	static JavascriptExecutor js;
	XSSFSheet sheet;
	static excelconnect ec=new excelconnect();
	static boolean result=false;
	static DataConfig data;
	@Test
	public void verify_registration_page(WebDriver driver) throws Exception {
		ec.eLaunch("\\C:\\Users\\698531\\Desktop\\Automation Regression test case suit\\ME One Test Cases - Automation - Regression V2 - Copy.xlsx\\", 0);
		WebDriverWait wait=new WebDriverWait(driver, 60);
		driver.findElement(Elements.xdrdforsignin).click();
       	ec.eWrite(13, 11, "pass");
		driver.findElement(Elements.xsignin1).click();
		//WebElement email=wait.until(ExpectedConditions.visibilityOfElementLocated(Elements.xsignin2));
		Thread.sleep(4000);
		ec.eWrite(14, 11, "pass");
		driver.findElement(Elements.xregister_bttn_in_sign_in).click();
		ec.eWrite(15, 11, "pass");
		//driver.findElement(Elements.xcreate_an_account_bttn).click();
		result=driver.findElement(Elements.xfirstname1).isDisplayed();
		Assert.assertTrue(result);
		result=driver.findElement(Elements.xlastname).isDisplayed();
		Assert.assertTrue(result);
		result=driver.findElement(Elements.xregister_email).isDisplayed();
		Assert.assertTrue(result);
		result=driver.findElement(Elements.xregister_phoneno).isDisplayed();
		Assert.assertTrue(result);
		result=driver.findElement(Elements.xpassword).isDisplayed();
		Assert.assertTrue(result);
		ec.eWrite(16, 11, "pass");
		wait.until(ExpectedConditions.visibilityOfElementLocated(Elements.xHEADER_MAIN_EVENT_LOGO));
		Thread.sleep(2000);
		driver.findElement(Elements.xHEADER_MAIN_EVENT_LOGO).click();
		Thread.sleep(2000);
		ec.eWrite(17, 11, "pass");
	}
	

}
