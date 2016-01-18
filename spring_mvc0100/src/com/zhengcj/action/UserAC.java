package com.zhengcj.action;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.zhengcj.bizservice.UserBS;
import com.zhengcj.domain.User;

@Controller
public class UserAC {

	@Autowired
	private UserBS userBS;

	@RequestMapping(value = "/register")
	public String register(User user) {
		user.setId(UUID.randomUUID().toString());
		userBS.addUser(user);
		return "success";
	}

	@RequestMapping(value = "/getList")
	public ModelAndView showUserList() {
		ModelAndView mav = new ModelAndView();
		List<User> userList = userBS.getUserList();
		mav.setViewName("list");
		mav.addObject("userList", userList);
		return mav;
	}
}
