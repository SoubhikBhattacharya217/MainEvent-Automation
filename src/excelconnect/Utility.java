package excelconnect;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utility {
	
	public static String captureScreenShot(WebDriver driver, String screenshotname)
    {
           try 
           {
                  TakesScreenshot ts =  (TakesScreenshot)driver;
                  File source = ts.getScreenshotAs(OutputType.FILE);
                  String dest = System.getProperty("user.dir") +"\\ErrorScreenshots\\"+screenshotname+".png";
                  File destination = new File(dest);
                  FileUtils.copyFile(source, destination);        
                         
            return dest;
                                                    
           }
           catch(Exception e)
           {
                  System.out.println("Exception occur while capturing screenshot"+e.getMessage());
                  return null;
           }
           
           
    }


}
