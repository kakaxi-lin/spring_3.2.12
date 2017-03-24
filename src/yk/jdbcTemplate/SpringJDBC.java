package yk.jdbcTemplate;

import java.util.List;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class SpringJDBC {
	public static void main(String[] args) {
		/*String url="jdbc:mysql://130.10.7.122:3306/tx";
		String uname="root";
		String pwd="fendou";
		DriverManagerDataSource ds=new DriverManagerDataSource(url, uname, pwd);
		JdbcTemplate tem=new JdbcTemplate(ds);
//		tem.update("insert into tx values(?,?)",null,888);
		String sql="select * from tx where id = ?";
		RowMapper<TxBean> rowMapper=new BeanPropertyRowMapper<TxBean>(TxBean.class);
		TxBean txBean = tem.queryForObject(sql, rowMapper, 1);
//		System.out.println(txBean.toString());
		String sql1="select * from tx ";
		List<TxBean> txs =tem.query(sql1, rowMapper);
		for(TxBean tx:txs){
			System.out.println(tx);
		}*/
		
//≈‰÷√dbcp
		JdbcTemplate tem=new JdbcTemplate();
		//tem.setDataSource(dataSource);
//		tem.update("insert into tx values(?,?)",null,888);
		String sql="select * from tx where id = ?";
		RowMapper<TxBean> rowMapper=new BeanPropertyRowMapper<TxBean>(TxBean.class);
		TxBean txBean = tem.queryForObject(sql, rowMapper, 1);
//		System.out.println(txBean.toString());
		String sql1="select * from tx ";
		List<TxBean> txs =tem.query(sql1, rowMapper);
		for(TxBean tx:txs){
			System.out.println(tx);
		}
		
	}
	

}
