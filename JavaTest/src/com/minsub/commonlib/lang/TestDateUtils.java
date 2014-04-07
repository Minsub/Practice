package com.minsub.commonlib.lang;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.apache.commons.lang3.time.FastDateFormat;

import com.minsub.utils.PerformanceTest;

/**
 * DateUtils
 * 
 * StopWatch도 있음
 * @author hmm1115222
 *
 */
public class TestDateUtils {

	public static void main(String[] args) {
		//normalDate();
		usingDateUtils();
	}
	
	// Normally using Date Class
	public static void normalDate() {
		TimeZone seoul = TimeZone.getTimeZone("Asia/Seoul");
		Date date = Calendar.getInstance(seoul).getTime();
		
		// SimpleDateFormat
		SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String sDate = sd.format(date);
		System.out.println(sDate);
		
		Date date2 = new Date(System.currentTimeMillis());
		String sDate2 = sd.format(date2);
		System.out.println(sDate2);
		
		// CAlendar를 이용한 계산
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DAY_OF_YEAR, 1);
		
		System.out.println(TestDateUtils.toString(cal, "yyyy-MM-dd HH:mm:ss", seoul));
	}
	
	private static String toString(Calendar calendar, String pattern, TimeZone zone) {
		SimpleDateFormat format = new SimpleDateFormat(pattern);
		format.setTimeZone(zone);
		return format.format(calendar.getTime());
	}

	
	// Using Commons Lib (UtilDate)
	public static void usingDateUtils() {
		// SimpleDateFormat
		SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date now = Calendar.getInstance().getTime();
		System.out.println("Now: " + sd.format(now)); 

		// after 100 day
		Date after100Day = DateUtils.addDays(now, 100);
		
		PerformanceTest.start();
		sd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println("After 100d: " + sd.format(after100Day));
		System.out.println("TIME: " + PerformanceTest.end());
		
		// using DateFormatUtils
		PerformanceTest.start();
		System.out.println("After 100d: " + DateFormatUtils.format(after100Day, "yyyy-MM-dd HH:mm:ss"));
		System.out.println("TIME: " + PerformanceTest.end());
		
		// using FastDataForamt
		TimeZone seoul = TimeZone.getTimeZone("Asia/Seoul");
		PerformanceTest.start();
		FastDateFormat ff = FastDateFormat.getDateInstance(FastDateFormat.FULL, seoul);
		System.out.println("After 100d: " +   ff.format(after100Day));
		System.out.println("TIME: " + PerformanceTest.end());
	}
	
	
}
