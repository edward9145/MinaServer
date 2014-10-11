package net.itrigo.yixing.util;

import java.util.Date;

import net.itrigo.yixing.domain.UploadData;

import com.google.gson.Gson;


public class DataHandler {

	public static UploadData parseData(byte[] rawData) throws Exception{
		UploadData data = new UploadData();
		data.setRaw(ByteAndStr16.Bytes2HexString(rawData));
		
		try{
			int idx;
			for(idx = 0; rawData[idx] != 0x0C; idx ++);
			
			idx ++;
			data.setUserType((rawData[idx ++] & 0x00FF) ^ 0x80);
			data.setSystolic((double)(rawData[idx ++] & 0x00FF));
			data.setDiastolic((double)(rawData[idx ++] & 0x00FF));
			data.setPulse((double)(rawData[idx ++] & 0x00FF));
			
			// 跳过时间，使用系统时间
			// idx += 4;
			// data.setMeasureDate(new Date());
			
			// 解析时间
			int year = 2000 + (rawData[idx ++] & 0x00FF) - 1900;
			byte DA = rawData[idx ++];
			byte HO = rawData[idx ++];
			int month = ((HO & 0xC0) >> 4) + ((DA & 0xC0) >> 6);
			int day = ((DA & 0x3F) & 0x00FF);
			int hour = ((HO & 0x3F) & 0x00FF);
			int minute = rawData[idx ++] & 0x00FF;
			Date measureDate = new Date(year, month - 1, day, hour, minute);
			System.out.println(measureDate);
			data.setMeasureDate(measureDate);
			
			byte[] device = new byte[5];
			for(int i=0; i<5; i++){
				device[i] = rawData[idx ++]; 
			}
			data.setDeviceID(ByteAndStr16.Bytes2HexString(device).replace(" ", ""));
			
		}catch(Exception ex){
			System.err.println(new Date());
			ex.printStackTrace();
			return null;
		}
		Gson gson = new Gson();
		System.out.println(gson.toJson(data));
		
		return data;
	}
	
	
	public static int hexTodDecimalInt(String hex){
		return Integer.valueOf(hex, 16);
	}
	
}
