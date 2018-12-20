package com.dhcc.ict.manage.technology.test.util;

import java.util.Date;

import org.joda.time.Interval;
import org.joda.time.Period;

public class DateUtil {

	// org.joda.time
	public static Integer diff(Date startDate, Date endDate, String type) {
		Interval interval = new Interval(startDate.getTime(), endDate.getTime());
		Period period = interval.toPeriod();

		if (type.equals("year")) {
			return period.getYears();
		}
		if (type.equals("month")) {
			return period.getMonths();
		}
		if (type.equals("day")) {
			return period.getDays();
		}
		if (type.equals("hour")) {

			return period.getHours();
		}

		if (type.equals("minute")) {

			return period.getMinutes();
		}
		if (type.equals("second")) {
			return period.getSeconds();
		}
		return null;

	}

	// 自编
	public static Long difference(Date startDate, Date endDate, String type) {

		// milliseconds
		long different = endDate.getTime() - startDate.getTime();

		long secondsInMilli = 1000;
		long minutesInMilli = secondsInMilli * 60;
		long hoursInMilli = minutesInMilli * 60;
		long daysInMilli = hoursInMilli * 24;

		if (type.equals("day")) {
			long elapsedDays = different / daysInMilli;
			different = different % daysInMilli;
			return elapsedDays;
		}
		if (type.equals("hour")) {
			long elapsedHours = different / hoursInMilli;
			different = different % hoursInMilli;
			return elapsedHours;
		}

		if (type.equals("minute")) {
			long elapsedMinutes = different / minutesInMilli;
			different = different % minutesInMilli;
			return elapsedMinutes;
		}
		if (type.equals("second")) {
			long elapsedSeconds = different / secondsInMilli;
			return elapsedSeconds;
		}
		return null;
	}

}
