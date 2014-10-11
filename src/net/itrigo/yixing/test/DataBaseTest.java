package net.itrigo.yixing.test;

import net.itrigo.yixing.util.DataBaseHandler;

import org.junit.Before;
import org.junit.Test;


public class DataBaseTest {

	@Before
	public void init() {
		
	}
	
	@Test
	public void mybatisConnect() throws Exception{
		DataBaseHandler dbH = new DataBaseHandler("pedo");
//		User userInfo = dbH.getUser("123456");
//		System.out.println(userInfo.getWeight());
	}

}
