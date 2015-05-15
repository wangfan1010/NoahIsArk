package com.systop.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.systop.core.dao.UserMapper;
import com.systop.core.model.User;
import com.systop.core.service.UserService;

/**
 * @author WangFan
 */
@Service("userService")
public class UserServiceImpl implements UserService {

	private UserMapper userMapper;
	
	@Override
	public User getUserById(String id) {
		return userMapper.selectByPrimaryKey(id);
	}

	/*get and set*/
	public UserMapper getUserMapper() {
		return userMapper;
	}

	@Autowired
	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}

	
}
