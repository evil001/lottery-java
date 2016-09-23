package com.lottery.mutual.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public final class DateUtil {

	public static final String PATTERN_YYYY_MM_DD_HH_MM_SS_FORMAT = "yyyy-MM-dd HH:mm:ss";

	public static final String PATTERN_YYYY_MM_DD_FORMAT = "yyyy-MM-dd";

	public static Date parseFull(String time) throws ParseException {
		SimpleDateFormat fullDateFormat = new SimpleDateFormat(PATTERN_YYYY_MM_DD_HH_MM_SS_FORMAT);
		return fullDateFormat.parse(time);
	}

	public static Date parseHalf(String time) throws ParseException {
		SimpleDateFormat fullDateFormat = new SimpleDateFormat(PATTERN_YYYY_MM_DD_FORMAT);
		return fullDateFormat.parse(time);
	}

	public static int getDateY_M_D(String time, String type) throws ParseException {
		Calendar cal = Calendar.getInstance();
		cal.setTime(DateUtil.parseHalf(time));
		switch (type) {
		case "y":
			return cal.get(Calendar.YEAR);
		case "m":
			return cal.get(Calendar.MONTH) + 1;
		case "d":
			return cal.get(Calendar.DAY_OF_MONTH);
		}
		return 0;
	}

	public static void main(String[] args) throws ParseException {
		String date = "2016-02-21";
		System.out.println(DateUtil.getDateY_M_D(date, "y"));
		System.out.println(DateUtil.getDateY_M_D(date, "m"));
		System.out.println(DateUtil.getDateY_M_D(date, "d"));
	}
}
