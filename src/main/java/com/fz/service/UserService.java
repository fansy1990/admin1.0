package com.fz.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.fz.dao.UserDao;
import com.fz.model.User;

@Service
public class UserService {
	private UserDao<User> userDao;

	public boolean login(String email, String password) {
		return this.userDao.login(new User(email, password));
	}

	public UserDao<User> getUserDao() {
		return userDao;
	}

	@Resource
	public void setUserDao(UserDao<User> userDao) {
		this.userDao = userDao;
	}
}
