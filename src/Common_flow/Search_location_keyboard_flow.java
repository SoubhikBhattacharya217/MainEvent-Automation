package Common_flow;

import org.CognizantQA.PageObject.Elements;
import org.CognizantQA.Properties.PropertiesFile;
import org.CognizantQA.TestData.DataConfig;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Search_location_keyboard_flow {

	WebDriver driver;
	static boolean result=false;
	static DataConfig data;
	public static void verifybowling_page_by_keyboard(WebDriver driver) throws Exception {
		  String testDataPath = PropertiesFile.getDataFromProperty("TestData");
          data = new DataConfig(testDataPath);
	      driver.findElement(Elements.xcity_field).sendKeys(data.getData(0, 19, 1));
	      driver.findElement(Elements.xlocationsearchbar).sendKeys(Keys.ARROW_DOWN);
	      driver.findElement(Elements.xlocationsearchbar).sendKeys(Keys.ENTER);
	}
}
