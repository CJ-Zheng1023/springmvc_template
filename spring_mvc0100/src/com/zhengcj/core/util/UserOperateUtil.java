package com.zhengcj.core.util;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;

public class UserOperateUtil {

	public static String getUserName() {
		SecurityContext context = SecurityContextHolder.getContext();

		Authentication auth = context.getAuthentication();

		Object principal = auth.getPrincipal();
		String userName = "";
		if (principal instanceof UserDetails) {
			userName = ((UserDetails) principal).getUsername();
		} else {
			userName = principal.toString();
		}
		return userName;

	}
}
