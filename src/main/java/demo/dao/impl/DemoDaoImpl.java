package demo.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.stereotype.Repository;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import demo.dao.DemoDao;

@Repository("demoDao")
public class DemoDaoImpl implements DemoDao{
	
	@Autowired
	DataSource dataSource;
	
	//@Autowired
	private JdbcTemplate jdbcTemplate;

	public void testFindUser(String username){
		String sql = "select * from fc_sys_user";
		java.sql.Connection conn = null;
		java.sql.PreparedStatement ps = null;
        ResultSet rs = null;
		try {
			conn = dataSource.getConnection();
			 ps = conn.prepareStatement(sql);
	            rs = ps.executeQuery();
	            while (rs.next()) {
	                System.out.println(rs.getString("username"));
	                System.out.println(rs.getString("name"));
	            }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.jdbcTemplate.query(sql, new RowCallbackHandler() {
			
			@Override
			public void processRow(ResultSet rs) throws SQLException {
				// TODO Auto-generated method stub
				System.out.println(rs.getString("username"));
			}
		});
	}
}
