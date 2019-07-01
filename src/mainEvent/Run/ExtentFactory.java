package mainEvent.Run;

import java.io.File;
import com.relevantcodes.extentreports.ExtentReports;

public class ExtentFactory {
	
	public static ExtentReports Instance()
	       {
	              ExtentReports extent;
	              extent = new ExtentReports(System.getProperty("user.dir")+"/test-output/Test.html", true);
	              extent.addSystemInfo("Host name", "Birthday Regression Automated Test Flow")
	              .addSystemInfo("Environment", "Chrome Browser")
	              .addSystemInfo("User Name", "Soubhik");
	              extent.loadConfig(new File(System.getenv("user.dir")+"//extent-config.xml")); 
	              return extent;
	       }

	}

	

