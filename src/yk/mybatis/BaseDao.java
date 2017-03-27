package yk.mybatis;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;


public class BaseDao {
	private SqlSessionTemplate sqlSession;
	List<TX> txList = null;

	public void setSqlSession(SqlSessionTemplate sqlSession) {
		this.sqlSession = sqlSession;
	}

	// 普通查询
	public List<TX> query() {
		txList = sqlSession.selectList("yk.mybatis.TX.query");

		/*System.out.println(txList.size());
		for (TX tx : txList) {
			System.out.println(tx);
		}*/

		return txList;
	}

	// 参数查询
	public List<TX> queryParam(TX tx) {
		// 设置要检索的参数及值
		tx.setName(tx.getName());
		// 后面只能加一个匹配参数
		txList = sqlSession.selectList("yk.mybatis.TX.queryParam", tx);
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
		txList = sqlSession.selectList("yk.mybatis.TX.queryWhere", tx);
		/*
		 * System.out.println(txList.size()); for(TX txObj:txList){
		 * System.out.println(txObj); }
		 */
		return txList;

	}

	// 删除
	public void deleteOne(int id) {
		sqlSession.delete("yk.mybatis.TX.deleteOne", id);
	}

	// 批量删除
	public void deleteBatch(List<Integer> list) {
		sqlSession.delete("yk.mybatis.TX.deleteBatch", list);
	}

	// 增加
	public void addOne(TX tx) {
		sqlSession.insert("yk.mybatis.TX.insertOne", tx);
	}

	// 更新
	public void updateOne(TX tx)  {
		sqlSession.insert("yk.mybatis.TX.updateOne", tx);
	}

}
