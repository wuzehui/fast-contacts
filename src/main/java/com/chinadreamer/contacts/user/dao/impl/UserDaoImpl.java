package com.chinadreamer.contacts.user.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.chinadreamer.contacts.user.constant.UserStatus;
import com.chinadreamer.contacts.user.dao.UserDao;
import com.chinadreamer.contacts.user.dto.User;

@Repository("userDao")
public class UserDaoImpl implements UserDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public User userLogin(String username, String password) {
		String sql = "select * from fc_sys_user where username = ? and password = ?";
		List<User> users = this.jdbcTemplate.query(sql, new Object[]{username,password}, 
				new RowMapper<User>(){

					@Override
					public User mapRow(ResultSet rs, int rowNum)
							throws SQLException {
						User user = new User();
						user.setUsername(rs.getString("username"));
						user.setPassword(rs.getString("password"));
						user.setName(rs.getString("name"));
						user.setStatus(UserStatus.getUserStatus(rs.getString("status")));
						user.setCustCode(rs.getString("cust_code"));
						return user;
					}
			
		});
		if (users.isEmpty()) {
			return null;
		}
		return users.get(0);
	}
	
	public User findByUsername(String username){
		String sql = "select * from fc_sys_user where username = ? ";
		List<User> users = this.jdbcTemplate.query(sql, new Object[]{username}, 
				new RowMapper<User>(){

					@Override
					public User mapRow(ResultSet rs, int rowNum)
							throws SQLException {
						User user = new User();
						user.setUsername(rs.getString("username"));
						user.setPassword(rs.getString("password"));
						user.setName(rs.getString("name"));
						user.setStatus(UserStatus.getUserStatus(rs.getString("status")));
						user.setCustCode(rs.getString("cust_code"));
						return user;
					}
			
		});
		if (users.isEmpty()) {
			return null;
		}
		return users.get(0);
	}
}
