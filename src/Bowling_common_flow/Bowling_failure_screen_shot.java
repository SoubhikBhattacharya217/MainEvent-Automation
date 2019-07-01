package Bowling_common_flow;
import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
public class Bowling_failure_screen_shot {
	 WebDriver driver;
	    public static void takeScreenShot(WebDriver driver, String screenShotname)
	    {
	                    try 
	                    {
	                                    TakesScreenshot ts =  (TakesScreenshot)driver;
	                                    File src = ts.getScreenshotAs(OutputType.FILE);
	                                    FileUtils.copyFile(src, new File ("./Screenshots/bowling flow/"+screenShotname+".png"));
	                                    System.out.println("ScreenShot Taken");
	                                                                                                                    
	                    }
	                    catch(Exception e)
	                    {
	                                    System.out.println("Exception occur while capturing screenshot"+e.getMessage());
	                    }
	    }
}
