package yk.hibernate;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;
@Service
public class BaseService {
	static BaseDao bd=null;
	public void add(){
		bd.save();
		int a=9/0;
		bd.save();
	}
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("file:WebRoot/WEB-INF/applicationContext.xml");
		BaseService bs=ctx.getBean(BaseService.class);
		bd=ctx.getBean(BaseDao.class);
		bs.add();
	}

}
