package yk.jdbcTemplate;

public class BaseService {
	BaseDao baseDao;
	TxBean tx;

	public void setTx(TxBean tx) {
		this.tx = tx;
	}

	public void setBaseDao(BaseDao baseDao) {
		this.baseDao = baseDao;
	}
	
	public void add(){
		tx.setName("tx66");
		baseDao.add(tx);
		//抛出一个异常，检测事务是否加上
		int a=9/0;
		tx.setName("tx77");
		baseDao.add(tx);
	}
	public void delete(){
		baseDao.delete(29);
	    throw new RuntimeException("hahah");
	}
}
