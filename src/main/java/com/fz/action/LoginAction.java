package com.fz.action;

import javax.annotation.Resource;

import com.fz.service.UserService;
import com.opensymphony.xwork2.ActionSupport;

@Resource
public class LoginAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private UserService userService;

	private String email;
	private String password;

	public String login() {
		System.out.println("email:" + email + "---->passowrd:" + password);
		return SUCCESS;
	}

	public UserService getUserService() {
		return userService;
	}

	@Resource
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
