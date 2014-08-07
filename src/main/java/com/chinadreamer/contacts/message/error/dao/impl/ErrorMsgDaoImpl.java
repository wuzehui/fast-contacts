package com.chinadreamer.contacts.message.error.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.chinadreamer.contacts.message.error.dao.ErrorMsgDao;
import com.chinadreamer.contacts.message.error.dto.ErrorMsg;

@Repository("errorMsgDao")
public class ErrorMsgDaoImpl implements ErrorMsgDao{
	//@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public String getErrorMsgByCodeAndLocal(String code, Locale locale){
		String sql = "select * from fc_messages where code = ? and locale = ?";
		List<ErrorMsg> msgs = jdbcTemplate.query(sql, new Object[]{code,locale.getCountry()}, 
				new RowMapper<ErrorMsg>(){

					@Override
					public ErrorMsg mapRow(ResultSet rs, int rowNum)
							throws SQLException {
						ErrorMsg msg = new ErrorMsg();
						msg.setCode(rs.getString("code"));
						msg.setLocale(rs.getString("locale"));
						msg.setDescription(rs.getString("description"));
						return msg;
					}
				});
		if (msgs.isEmpty()) {
			return null;
		}
		return msgs.get(0).getDescription();
	}
}
