package com.pathasoft.util;

import java.util.Calendar;
import java.util.Date;

public class DateUtil {
	
	
	
	public static Date getCurrentTimeStamp()
	{
		Calendar cal = Calendar.getInstance();
		return cal.getTime();
		
	}
	
	public static Long getCurrentMills()
	{
		Calendar cal = Calendar.getInstance();
		return cal.getTimeInMillis();
	}
	

}
