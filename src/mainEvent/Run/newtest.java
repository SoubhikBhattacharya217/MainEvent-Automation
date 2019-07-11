package mainEvent.Run;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

public class newtest {

  @Test(priority=1 , retryAnalyzer=mainEvent.Run.RetryAnalyzer.class)
  public void f() {
	  System.out.println("try");
	  Assert.assertEquals(true, false);
  }
  
  
}
