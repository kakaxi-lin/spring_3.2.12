package yk.mybatis;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;


public class BaseDao {
	private SqlSessionTemplate sqlSession;
	List<TX> txList = null;

	public void setSqlSession(SqlSessionTemplate sqlSession) {
		this.sqlSession = sqlSession;
	}

	// ��ͨ��ѯ
	public List<TX> query() {
		txList = sqlSession.selectList("yk.mybatis.TX.query");

		/*System.out.println(txList.size());
		for (TX tx : txList) {
			System.out.println(tx);
		}*/

		return txList;
	}

	// ������ѯ
	public List<TX> queryParam(TX tx) {
		// ����Ҫ�����Ĳ�����ֵ
		tx.setName(tx.getName());
		// ����ֻ�ܼ�һ��ƥ�����
		txList = sqlSession.selectList("yk.mybatis.TX.queryParam", tx);
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
		txList = sqlSession.selectList("yk.mybatis.TX.queryWhere", tx);
		/*
		 * System.out.println(txList.size()); for(TX txObj:txList){
		 * System.out.println(txObj); }
		 */
		return txList;

	}

	// ɾ��
	public void deleteOne(int id) {
		sqlSession.delete("yk.mybatis.TX.deleteOne", id);
	}

	// ����ɾ��
	public void deleteBatch(List<Integer> list) {
		sqlSession.delete("yk.mybatis.TX.deleteBatch", list);
	}

	// ����
	public void addOne(TX tx) {
		sqlSession.insert("yk.mybatis.TX.insertOne", tx);
	}

	// ����
	public void updateOne(TX tx)  {
		sqlSession.insert("yk.mybatis.TX.updateOne", tx);
	}

}
