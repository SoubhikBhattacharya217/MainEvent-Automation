package Birthday_common_flow;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Date {
	
	
	public static void main(String[] args) {
		DateFormat dateFormat=new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		 Date date=new Date();
		 System.out.println(dateFormat.format(date));
		 
		 String date1=dateFormat.format(date);
		 
		 String month=date1.substring(5, 7);
		
	}

}
