package yk.service;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestKaiService {
	KaiService kaiService=null;
	public TestKaiService(){
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("file:WebRoot/WEB-INF/applicationContext.xml");
		kaiService=(KaiService)ctx.getBean("kaiService");
	}
	@Test
	public void marryWho(){
		kaiService.marryWho("xiao ying");
	}
	@Test
	public void insert(){
		
		kaiService.insert();
//		kaiService.insert();
//		throw new RuntimeException();
	}
}
