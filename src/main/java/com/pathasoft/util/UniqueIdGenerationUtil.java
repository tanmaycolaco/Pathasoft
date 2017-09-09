package com.pathasoft.util;

import java.util.Calendar;

public class UniqueIdGenerationUtil {
	
	
	public static String getUniqueId(String prefix)
	{
		Calendar cal = Calendar.getInstance();
		return prefix+cal.getTimeInMillis();
	}
	

}
