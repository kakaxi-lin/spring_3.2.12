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

	// ��ͨ��ѯ
	public List<TX> query(){
		txList=txDao.query();
		return txList==null?new ArrayList<TX>():txList;
	}

	// ������ѯ
	public List<TX> queryParam(TX tx) {
		// ����Ҫ�����Ĳ�����ֵ
		tx.setName(tx.getName());
		// ����ֻ�ܼ�һ��ƥ�����
		txList = txDao.queryParam(tx);
		/*
		 * System.out.println(txList.size()); for(TX txObj:txList){
		 * System.out.println(txObj); }
		 */
		return txList;
	}

	// where��ǩ��ѯ
	public List<TX> queryWhere(TX tx) {
		// ����Ҫ�����Ĳ�����ֵ
		tx.setName(tx.getName());
		// ����ֻ�ܼ�һ��ƥ�����
		txList = txDao.queryWhere(tx);
		/*
		 * System.out.println(txList.size()); for(TX txObj:txList){
		 * System.out.println(txObj); }
		 */
		return txList;

	}

	// ɾ��
	public void deleteOne(int id) {
		txDao.deleteOne(id);
	}

	// ����ɾ��
	public void deleteBatch(List<Integer> list) {
		txDao.deleteBatch(list);
	}

	// ����
	public void addOne(TX tx) {
		txDao.addOne(tx);
	}

	// ����
	public void updateOne(TX tx) {
		txDao.updateOne(tx);
	}

}
