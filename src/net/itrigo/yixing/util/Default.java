package net.itrigo.yixing.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Default {

	public static final String DB_YIXING = "yixing";
	
	public final static String DEVICEID = "000000";
	public final static int WEIGHT = 65;
	public final static int STRIDE = 70;
	public final static int SPORT_AM_BEGIN = 8;
	public final static int SPORT_AM_END = 12;
	public final static int SPORT_PM_BEGIN = 14;
	public final static int SPORT_PM_END = 18;
	public final static int SLEEP_BEGIN = 22;
	public final static int SLEEP_END = 7;
	public final static int STEP_GOAL = 10000;
	public static final long DAY_MILLIS = 60 * 60 * 24 * 1000;
	
	
	public static String DB_PEDO = "pedo";
	public static String DB_YIKANG = "yikang";
	public static String DB_NAME = DB_YIKANG;

	public static String now() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String s = sdf.format(new Date());
		return s;
	}
}
