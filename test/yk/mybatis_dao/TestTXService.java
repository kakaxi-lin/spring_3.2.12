package yk.mybatis_dao;

import java.util.List;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestTXService {
	TXService ts;
	public TestTXService(){
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("file:WebRoot/WEB-INF/applicationContext.xml");
		ts=(TXService)ctx.getBean("txService");
		
	}
	@Test
	public void testQuery(){
		List<TX> list=ts.query();
		System.out.println(list.size());
		for(TX tx:list){
			System.out.println(tx.toString());
		}
	}
}
