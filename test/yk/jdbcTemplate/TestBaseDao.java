package yk.jdbcTemplate;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBaseDao {
	BaseDao bd;
    TxBean tx;
	public TestBaseDao(){
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("file:WebRoot/WEB-INF/applicationContext.xml");
		bd=(BaseDao)ctx.getBean("baseDao");
		tx=(TxBean)ctx.getBean("txBean");
		
	}
	@Test
	public void testAdd(){
		tx.setName("tx33");
		bd.add(tx);
		int a=9/0;
		tx.setName("tx44");
		bd.add(tx);
	}
	
	@Test
	public void testDelete(){
		bd.delete(5);
	}
	
	@Test
	public void testUpdate(){
		tx.setId(6);
		tx.setName("凯哥");
		bd.update(tx);
	}
	
	@Test
	public void testSelectSingle(){
		tx=bd.select(7);
		System.out.println(tx);
	}
	
	@Test
	public void testSelect(){
		List<TxBean> list = bd.select(new Object[]{});
		for(TxBean tx:list){
			System.out.println(tx);
		}
	}

	@Test
	public void testCount(){
		int count=bd.selectCount();
		System.out.println(count);
	}
	
	@Test
	public void batchAdd(){
		List<Object[]> batchArgs=new ArrayList<Object[]>();
		batchArgs.add(new Object []{"小a"});
		batchArgs.add(new Object []{"小b"});
		batchArgs.add(new Object []{"小c"});
		batchArgs.add(new Object []{"小d"});
		bd.batchAdd(batchArgs);
	}
}
