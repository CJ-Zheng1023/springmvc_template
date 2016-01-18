package com.zhengcj.core.init;

import javax.servlet.ServletContext;

import org.springframework.web.context.ServletContextAware;

public class GetRoot implements ServletContextAware {

	private ServletContext servletContext;

	private String contextRoot;

	public String getContextRoot() {
		return contextRoot;
	}

	public ServletContext getServletContext() {
		return servletContext;
	}

	public void setContextRoot(String contextRoot) {
		this.contextRoot = contextRoot;
	}

	public void setServletContext(ServletContext servletContext) {
		this.servletContext = servletContext;
	}

	public void init() {
		String version = "1.0.0";
		contextRoot = version + "-";
		this.getServletContext().setAttribute(contextRoot, this.getServletContext().getContextPath());

	}

}
