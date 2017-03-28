package yk.mybatis_dao;

import java.util.List;

import yk.mybatis_dao.TX;

public interface TXMapper {
	
	// ��ͨ��ѯ
	List<TX> query();

	// ������ѯ
	List<TX> queryParam(TX tx);

	// where��ǩ��ѯ
	List<TX> queryWhere(TX tx);

	// ɾ��
	void deleteOne(int id);

	// ����ɾ��
	void deleteBatch(List<Integer> list);

	// ����
	public void insertOne(TX tx);

	// ����
	public void updateOne(TX tx);

}