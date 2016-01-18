package com.zhengcj.bizservice.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhengcj.bizservice.UserBS;
import com.zhengcj.dao.UserDAO;
import com.zhengcj.domain.User;

@Service
public class UserBSImpl implements UserBS {

	@Autowired
	private UserDAO userDAO;

	public void addUser(User user) {
		userDAO.insert(user);
	}

	public List<User> getUserList() {
		return userDAO.queryList();
	}

}
