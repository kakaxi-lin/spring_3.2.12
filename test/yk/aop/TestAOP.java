package yk.aop;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAOP {
	Common common=null;
	public TestAOP(){
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("file:WebRoot/WEB-INF/applicationContext.xml");
		common=(Common)ctx.getBean("common");
	}
	//测试正常的程序
	@Test
	public void testStartWork(){
		common.startWork();
	}
	//测试有异常的程序
	@Test
	public void testExceptionWork() throws Exception{
		common.exceptionWork();
    }
	
}
