package yk.hibernate;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate4.SpringSessionContext;
import org.springframework.stereotype.Repository;

@Repository
public class BaseDao {
	@Resource
	private SessionFactory sessionFactory;
	private Session getSession(){
		Session session=sessionFactory.getCurrentSession();
		return session;
	}
	public void select(){
		Query q = getSession().createQuery("from Kai");
		List<Kai> list=q.list();
		for (Kai kai : list) {
			System.out.println(kai);
		}
	}
	public void save(){
//		SpringSessionContext
//		getSession().beginTransaction();
		Kai kai=new Kai();
		kai.setName("ppxxx");
		getSession().save(kai);
//		getSession().beginTransaction().commit();
		
	}
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("file:WebRoot/WEB-INF/applicationContext.xml");
		BaseDao bd=ctx.getBean(BaseDao.class);
		bd.save();
	}

}
