package yk.mybatis;


public class BaseService {
	BaseDao baseDao;


	public void setBaseDao(BaseDao baseDao) {
		this.baseDao = baseDao;
	}
	
	public void add(){
		TX tx=new TX();
		tx.setName("tx66");
		baseDao.addOne(tx);
		//抛出一个异常，检测事务是否加上
		int a=9/0;
		tx.setName("tx77");
		baseDao.addOne(tx);
	}
	public void delete(){
		baseDao.deleteOne(32);
		throw new RuntimeException("hahah");
	}
}
