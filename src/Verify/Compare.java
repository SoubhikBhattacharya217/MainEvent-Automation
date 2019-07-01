package Verify;
import org.openqa.selenium.WebDriver;
public class Compare {

	
	public static boolean verifyURL(WebDriver driver,String url) {
		boolean result=false;
		if(driver.getCurrentUrl().equalsIgnoreCase(url)) {
			return result=true;
		}
		return result;
	}
}
