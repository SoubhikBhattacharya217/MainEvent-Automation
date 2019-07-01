package org.CognizantQA.Driver;

import org.CognizantQA.PageObject.POMabstract;
import org.CognizantQA.Properties.PropertiesFile;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class CreateDriver extends POMabstract{
	
	//static WebDriver driver = null;
	public static WebDriver selectBrowser (String browser,WebDriver driver) {
		if(browser.equalsIgnoreCase("Chrome")) {
			try {
				String cd = PropertiesFile.getDataFromProperty("ChromeDriver");
				System.setProperty("webdriver.chrome.driver", cd);
				ChromeOptions options = new ChromeOptions(); 
				options.addArguments("disable-infobars"); 
				options.addArguments("disable-geolocation");
				//options.addArguments("disable-notifications");
				driver = new ChromeDriver(options);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		else if(browser.equalsIgnoreCase("Firefox")) {
			String cd;
			try {
				cd = PropertiesFile.getDataFromProperty("GeckoDriver");
				System.setProperty("webdriver.gecko.driver", cd);
				driver = new FirefoxDriver();
		} catch (Exception e) {
				e.printStackTrace();
			}
		}	
		else if(browser.equalsIgnoreCase("IE")) {
			try {
				DesiredCapabilities cap = DesiredCapabilities.internetExplorer();
				cap.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
				cap.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
				String cd = PropertiesFile.getDataFromProperty("IEDriver");
				System.setProperty("webdriver.ie.driver", cd);
				driver = new InternetExplorerDriver(cap);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		return driver;
	}
	

}
