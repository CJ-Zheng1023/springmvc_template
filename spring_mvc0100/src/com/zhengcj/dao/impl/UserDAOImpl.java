package com.zhengcj.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.zhengcj.dao.UserDAO;
import com.zhengcj.domain.User;

@Repository
public class UserDAOImpl implements UserDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	private static final String INSERT_USER = "INSERT INTO USERS(ID,NAME,PASSWORD) VALUES(?,?,?)";

	private static final String QUERY_USER_LIST = "SELECT ID,NAME,PASSWORD FROM USERS";

	public void insert(User user) {
		this.jdbcTemplate.update(INSERT_USER, new Object[] { user.getId(), user.getName(), user.getPassWord() });
	}

	public List<User> queryList() {
		return this.jdbcTemplate.query(QUERY_USER_LIST, new UserRowMapper());
	}

	private class UserRowMapper implements RowMapper {

		public Object mapRow(ResultSet rs, int arg1) throws SQLException {
			User user = new User();
			user.setId(rs.getString("ID"));
			user.setName(rs.getString("NAME"));
			user.setPassWord(rs.getString("PASSWORD"));
			return user;
		}

	}

}
