
package com.comcast.crm.generic.webdriverutility;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class JavaUtility {
	public int getRandomNumber() {
		Random ran=new Random();
		
		int RandomNumber=ran.nextInt(50000);
		return RandomNumber;
	}
	public String getSystemDateYYYYDDMM() {
		Date obj=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		String date=sdf.format(obj);
		return date;
	}
	public String getRequiredDateYYYYDDMM(int days) {
		Date obj=new Date();
		Calendar cal=Calendar.getInstance();
		cal.setTime(obj);
		cal.add(Calendar.DAY_OF_MONTH, days);
		SimpleDateFormat sim=new SimpleDateFormat("yyyy-MM-dd");
		String endDate=sim.format(cal.getTime());
		return endDate;
		
	}
	

}
