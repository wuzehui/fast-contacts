package demo.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import lombok.Getter;
import lombok.Setter;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.stereotype.Repository;

import demo.dao.DemoDao;

@Repository
public class DemoDaoImpl implements DemoDao{
	private @Getter @Setter JdbcTemplate jdbcTemplate;
	
	public void testFindUser(String username){
		String sql = "select * from fc_sys_user";
		jdbcTemplate.query(sql, new RowCallbackHandler() {
			
			@Override
			public void processRow(ResultSet rs) throws SQLException {
				// TODO Auto-generated method stub
				System.out.println(rs.getString("username"));
			}
		});
	}
}
