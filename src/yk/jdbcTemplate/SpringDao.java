package yk.jdbcTemplate;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class SpringDao {
	private JdbcTemplate jdbcTemplate; 
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	public void cc(){
		String sql="select * from tx where id = ?";
		RowMapper<TxBean> rowMapper=new BeanPropertyRowMapper<TxBean>(TxBean.class);
		TxBean txBean = jdbcTemplate.queryForObject(sql, rowMapper, 1);
//		System.out.println(txBean.toString());
		String sql1="select * from tx ";
		List<TxBean> txs =jdbcTemplate.query(sql1, rowMapper);
		for(TxBean tx:txs){
			System.out.println(tx);
		}
	}

}
