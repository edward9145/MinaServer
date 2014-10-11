package net.itrigo.yixing.util;

import org.apache.log4j.Logger;

public class Log {
	
	public static Logger logger = Logger.getLogger("cn.hlyd.yikang");
	
	public static void info(String msg){
		logger.info(msg);
	}

}
