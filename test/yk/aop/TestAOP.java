package yk.aop;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAOP {
	Common common=null;
	public TestAOP(){
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("file:WebRoot/WEB-INF/applicationContext.xml");
		common=(Common)ctx.getBean("common");
	}
	//���������ĳ���
	@Test
	public void testStartWork(){
		common.startWork();
	}
	//�������쳣�ĳ���
	@Test
	public void testExceptionWork() throws Exception{
		common.exceptionWork();
    }
	
}
