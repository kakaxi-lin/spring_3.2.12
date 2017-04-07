package yk.hibernate;

import org.springframework.context.support.ClassPathXmlApplicationContext;
public class BaseService {
	public void testTX(){
		
	}
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("file:WebRoot/WEB-INF/applicationContext.xml");
		BaseDao bd=ctx.getBean(BaseDao.class);
		bd.select();
	}

}
