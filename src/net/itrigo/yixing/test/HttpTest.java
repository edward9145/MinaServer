package net.itrigo.yixing.test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import net.itrigo.yixing.util.HttpRequest;

public class HttpTest {

	public static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd%20HH:mm:ss");
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String url = "http://localhost:8080/YiKangXYJ/api/yixing/uploadData";
		String server = "http://221.122.112.188:8980/YiKangXYJ/api/yixing/uploadData";
		Map<String, String> paramMap = new HashMap<String, String>();
		paramMap.put("id", "test2");
		paramMap.put("deviceSn", "1100101");
		paramMap.put("userNo", "1");
		paramMap.put("measurementDate", sdf.format(new Date()));
		paramMap.put("systolicPressure", "124");
		paramMap.put("diastolicPressure", "21");
		paramMap.put("heartRate", "75");
		
		String param = "";
		for(String key : paramMap.keySet()){
			String kv = "&" + key + "=" + paramMap.get(key); 
			param += kv;
		}
		
		System.out.println(sdf.format(new Date()));
		String ret = HttpRequest.sendGet(url, param);
//		Log.info(ret + " << " + url + "?" + param);
	}

}
