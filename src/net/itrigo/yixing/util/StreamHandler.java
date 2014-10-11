package net.itrigo.yixing.util;

public class StreamHandler {
	
	public static byte[] stringToByte(String str){
		if(str == null) return null;
		
		byte[] buf = new byte[str.length()];
		for(int i=0; i<str.length(); i++){
			buf[i] = (byte)str.charAt(i);
		}
		return buf;
	}
	
	public static String byteToString(byte[] buf){
		if(buf == null) return null;
		StringBuffer sb = new StringBuffer(buf.length);
		for(int i=0; i<buf.length; i++){
			sb.append(buf[i]);
		}
		return sb.toString();
	}

}
