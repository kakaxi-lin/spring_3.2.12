package yk.jdbcTemplate;

import java.util.List;


public interface IBaseDao {
	public void add(TxBean tx);
	public void delete(int id);
	public void update(TxBean tx);
	public TxBean select(int id);
	public List<TxBean> select(Object[] args);
	//查询总条数
	public int selectCount();
	//批量插入
	public void batchAdd(List<Object []> batchArgs);

}
