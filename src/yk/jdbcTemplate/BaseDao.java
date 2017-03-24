package yk.jdbcTemplate;

import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class BaseDao implements IBaseDao{
	private JdbcTemplate jdbc;
	public void setJdbc(JdbcTemplate jdbc) {
		this.jdbc = jdbc;
	}

	@Override
	public void add(TxBean tx) {
		// TODO Auto-generated method stub
		String sql="insert into tx values(null,?)";
		jdbc.update(sql, tx.getName());
		System.out.println("insert success..");
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		String sql="delete from tx where id = ?";
		jdbc.update(sql, id);
	}

	@Override
	public void update(TxBean tx) {
		// TODO Auto-generated method stub
		String sql="update tx set name = ? where id = ?";
		jdbc.update(sql, tx.getName(),tx.getId());
	}
	
	//获取单个对象
	@Override
	public TxBean select(int id) {
		// TODO Auto-generated method stub
		String sql="select * from tx where id = ?";
		RowMapper<TxBean> rowMapper=new BeanPropertyRowMapper<TxBean>(TxBean.class);
		TxBean tx=jdbc.queryForObject(sql, rowMapper, id);
		return tx;
	}
	
	//获取对象集合
	@Override
	public List<TxBean> select(Object[] args) {
		String sql="select * from tx";
		RowMapper<TxBean> rowMapper=new BeanPropertyRowMapper<TxBean>(TxBean.class);
		List<TxBean> list=jdbc.query(sql,args, rowMapper);
		return list;
	}

	//获取总条数
	@Override
	public int selectCount() {
		String sql="select count(id) from tx";
		// TODO Auto-generated method stub
		int count =jdbc.queryForObject(sql, Integer.class);
		return count;
	}

	//批量插入
	@Override
	public void batchAdd(List<Object[]> batchArgs) {
		String sql="insert into tx values(null,?)";
		// TODO Auto-generated method stub
		jdbc.batchUpdate(sql, batchArgs);
	}

}
