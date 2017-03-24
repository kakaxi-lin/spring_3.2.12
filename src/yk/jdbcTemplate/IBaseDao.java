package yk.jdbcTemplate;

import java.util.List;


public interface IBaseDao {
	public void add(TxBean tx);
	public void delete(int id);
	public void update(TxBean tx);
	public TxBean select(int id);
	public List<TxBean> select(Object[] args);
	//��ѯ������
	public int selectCount();
	//��������
	public void batchAdd(List<Object []> batchArgs);

}
