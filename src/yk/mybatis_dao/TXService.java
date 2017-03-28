package yk.mybatis_dao;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

@Service("txService")
public class TXService {
	@Resource
	TXMapper txDao;
	List<TX> txList = null;

	// 普通查询
	public List<TX> query(){
		txList=txDao.query();
		return txList==null?new ArrayList<TX>():txList;
	}

	// 参数查询
	public List<TX> queryParam(TX tx) {
		// 设置要检索的参数及值
		tx.setName(tx.getName());
		// 后面只能加一个匹配参数
		txList = txDao.queryParam(tx);
		/*
		 * System.out.println(txList.size()); for(TX txObj:txList){
		 * System.out.println(txObj); }
		 */
		return txList;
	}

	// where标签查询
	public List<TX> queryWhere(TX tx) {
		// 设置要检索的参数及值
		tx.setName(tx.getName());
		// 后面只能加一个匹配参数
		txList = txDao.queryWhere(tx);
		/*
		 * System.out.println(txList.size()); for(TX txObj:txList){
		 * System.out.println(txObj); }
		 */
		return txList;

	}

	// 删除
	public void deleteOne(int id) {
		txDao.deleteOne(id);
	}

	// 批量删除
	public void deleteBatch(List<Integer> list) {
		txDao.deleteBatch(list);
	}

	// 增加
	public void insertOne(TX tx) {
		txDao.insertOne(tx);
	}

	// 更新
	public void updateOne(TX tx) {
		txDao.updateOne(tx);
	}
	
	//检测事务一致性
	public void checkTrans(){
		TX tx =new TX();
		tx.setName("给我");
		txDao.insertOne(tx);
		int a=8/0;
		
		tx.setName("吹");
		txDao.insertOne(tx);
		
	}

}
