package yk.mybatis;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestBaseService {
	BaseService bs;
	public TestBaseService(){
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("file:WebRoot/WEB-INF/applicationContext.xml");
		bs=(BaseService)ctx.getBean("baseService");
		
	}
	@Test
	public void testAdd(){
		bs.add();
	}
	
	@Test
	public void testDelete(){
		bs.delete();
	}
}
