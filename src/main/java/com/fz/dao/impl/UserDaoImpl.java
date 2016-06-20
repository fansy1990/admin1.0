package com.fz.dao.impl;

import org.springframework.stereotype.Component;

import com.fz.dao.UserDao;
import com.fz.model.User;

@Component
public class UserDaoImpl implements UserDao<User> {

	@Override
	public boolean login(User u) {
		// TODO 完善
		return true;
	}

}
