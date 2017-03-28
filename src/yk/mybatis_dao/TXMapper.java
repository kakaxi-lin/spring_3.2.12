package yk.mybatis_dao;

import java.util.List;

import yk.mybatis_dao.TX;

public interface TXMapper {
	
	// 普通查询
	List<TX> query();

	// 参数查询
	List<TX> queryParam(TX tx);

	// where标签查询
	List<TX> queryWhere(TX tx);

	// 删除
	void deleteOne(int id);

	// 批量删除
	void deleteBatch(List<Integer> list);

	// 增加
	public void insertOne(TX tx);

	// 更新
	public void updateOne(TX tx);

}