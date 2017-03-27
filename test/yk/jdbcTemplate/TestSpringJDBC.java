package yk.jdbcTemplate;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestSpringJDBC {
	SpringDao sd;
	public TestSpringJDBC(){
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("file:WebRoot/WEB-INF/applicationContext.xml");
		sd=(SpringDao)ctx.getBean("springDao");
	}
	@Test
	public void cc(){
		sd.cc();
	}
}
