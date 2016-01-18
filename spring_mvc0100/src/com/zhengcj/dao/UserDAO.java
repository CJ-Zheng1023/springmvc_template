package com.zhengcj.dao;

import java.util.List;

import com.zhengcj.domain.User;

public interface UserDAO {

	public void insert(User user);

	public List<User> queryList();
}
