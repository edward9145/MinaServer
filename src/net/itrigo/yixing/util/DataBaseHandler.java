package net.itrigo.yixing.util;

import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import net.itrigo.yixing.domain.UploadData;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


public class DataBaseHandler {
	
	public static HashMap<String, SqlSessionFactory> sessionFactoryMap;
	public SqlSessionFactory sqlSessionFactory; 
	
	public DataBaseHandler(String dbname) throws IOException{
		if(sessionFactoryMap == null) sessionFactoryMap = new HashMap<String, SqlSessionFactory>();
		if(sessionFactoryMap.get(dbname) == null){
			String resource = dbname + "-mybatis-config.xml";
			InputStream inputStream = Resources.getResourceAsStream(resource);
			sessionFactoryMap.put(dbname, new SqlSessionFactoryBuilder().build(inputStream));
		}
		this.sqlSessionFactory = sessionFactoryMap.get(dbname);
	}

	public boolean saveData(final UploadData uploadData) {
		SqlSession session = sqlSessionFactory.openSession();
		
		uploadData.setGuid(UUID.randomUUID().toString());
		int result = session.insert("net.itrigo.yixing.mapper.UploadDataMapper.insertSelective", 
				uploadData);
		session.commit();
		session.close();
		
		System.out.println("+ " + result + " " + uploadData.getGuid());
		
		new Thread(){
			@Override
			public void run(){
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd%20HH:mm:ss");
				String url = "http://221.122.112.188:8980/fuwai/api/yixing/uploadData";
				Map<String, String> paramMap = new HashMap<String, String>();
				paramMap.put("id", uploadData.getGuid());
				paramMap.put("deviceSn", uploadData.getDeviceID());
				paramMap.put("userNo", "" + uploadData.getUserType());
				paramMap.put("measurementDate", sdf.format(uploadData.getMeasureDate()));
				paramMap.put("systolicPressure", "" + uploadData.getSystolic());
				paramMap.put("diastolicPressure", "" + uploadData.getDiastolic());
				paramMap.put("heartRate", "" + uploadData.getPulse().shortValue());
				
				String param = "";
				for(String key : paramMap.keySet()){
					String kv = "&" + key + "=" + paramMap.get(key); 
					param += kv;
				}
				try{
					String ret = HttpRequest.sendGet(url, param);
					System.out.println(ret + " << " + url + "?" + param);
				}catch(Exception ex){
					ex.printStackTrace();
				}
			}
		}.start();
		
		return result > 0;
	}
	
	
}
