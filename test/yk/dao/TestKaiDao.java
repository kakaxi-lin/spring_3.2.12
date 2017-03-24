package yk.dao;

import java.sql.Connection;
import java.sql.SQLException;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestKaiDao {
	KaiDao kaiDao;
	public TestKaiDao(){
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("file:WebRoot/WEB-INF/applicationContext.xml");
		kaiDao=(KaiDao) ctx.getBean("kaiDao");
	}
	@Test
	public void testInsert(){
		Connection conn = kaiDao.conn;
		try {
			conn.setAutoCommit(false);
			kaiDao.insert("g");
			//int a =9/0;
			kaiDao.insert("gg");
			conn.commit();
			kaiDao.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			try {
				conn.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
		
		
	}

}
