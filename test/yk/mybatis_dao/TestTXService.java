package yk.mybatis_dao;

import java.util.ArrayList;
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
		List<TX> txList = ts.query();
		System.out.println(txList.size());
		for(TX tx:txList){
			System.out.println(tx);
		}
	}
	
	@Test
	public void testQueryParam(){
		TX tx=new TX();
		tx.setName("¹þ¹þ¹þ");
		List<TX> txList = ts.queryParam(tx);
		System.out.println(txList.size());
		for(TX txObj:txList){
			System.out.println(txObj);
		}
		
	}
	
	@Test
	public void testQueryWhere(){
		TX tx=new TX();
		tx.setName("dddd");
		tx.setId(11);
		List<TX> txList = ts.queryWhere(tx);
		System.out.println(txList.size());
		for(TX txObj:txList){
			System.out.println(txObj);
		}
		
	}
	
	@Test
	public void testDeleteOne(){
		ts.deleteOne(9);
		
	}
	
	@Test
	public void testDeleteBatch(){
		List<Integer> list=new ArrayList<Integer>();
		list.add(4);
		list.add(5);
		ts.deleteBatch(list);
		
	}
	
	@Test
	public void insertOne(){
		TX tx=new TX();
		tx.setName("²ÁÄãxxx");
		ts.insertOne(tx);
		
	}
	
	@Test
	public void testUpdateOne(){
		TX tx=new TX();
		tx.setName("¿¨¿¨2");
		tx.setId(11);
		ts.updateOne(tx);
		
	}
	
	@Test
	public void testCheckTrans(){
		ts.checkTrans();
		
	}
}
