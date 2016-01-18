package com.zhengcj.bizservice;

import java.util.List;

import com.zhengcj.domain.User;

public interface UserBS {

	public void addUser(User user);

	public List<User> getUserList();
}
