package Reporter;


import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;



public class Reporter {


	static ExtentTest	test;
	static ExtentReports report;	


	public static void startTest(String Test_Case_Name) {

		File reportsFolder = new File(".\\Reports");

		//creating a new Folder named Reports
		if(!reportsFolder.exists())
		{
			boolean created =  reportsFolder.mkdir();
			if(created)
				System.out.println("Reports Folder was created !");
			else
				System.out.println("Unable to create Reports folder");	
		}

		String pattern = "dd-MM-yyyy";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		String date = simpleDateFormat.format(new Date());
		String filepath=".//Reports//"+date+"Report.html";

		File reportfile = new File(filepath);


		report= new ExtentReports(filepath);
	}
	
	
	public static void testCasename(String Test_Case_Name) {

		test = report.startTest(Test_Case_Name);


	}




	public static void testSteps(String status,String msg)
	{

		if(status.equalsIgnoreCase("Pass")) {
			test.log(LogStatus.PASS, msg);
		}
		else if(status.equalsIgnoreCase("Skip")) {
			test.log(LogStatus.SKIP, msg);
		}
		else if(status.equalsIgnoreCase("Fail")) {
			test.log(LogStatus.FAIL, msg);
		}
		else {
			test.log(LogStatus.UNKNOWN, "Please enter status : Pass/Fail/Skip");
		}
	}


	public void endTest()
	{
		report.endTest(test);
		report.flush();
	}



}

