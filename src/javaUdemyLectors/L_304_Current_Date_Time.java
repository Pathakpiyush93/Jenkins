package javaUdemyLectors;

import java.text.SimpleDateFormat;
import java.util.Date;

public class L_304_Current_Date_Time {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date.toString());
		
//		SimpleDateFormat is used to change the format of the date and time
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		SimpleDateFormat sdf1 = new SimpleDateFormat("MM/dd/yyyy  hh:mm:ss");
		System.out.println("Current Date: "+ sdf.format(date));
		System.out.println("Current Date and Time: "+ sdf1.format(date));
		

		
			
	}

}
