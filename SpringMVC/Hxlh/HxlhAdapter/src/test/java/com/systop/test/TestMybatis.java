package com.systop.test;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.systop.core.model.User;
import com.systop.core.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring.xml", "classpath:spring-mybatis.xml" })
public class TestMybatis {

	private static final Logger logger = Logger.getLogger(TestMybatis.class);

	@Autowired
	private UserService userService;

	@Test
	public void test1() {
		User u = userService.getUserById("1");
		logger.info(JSON.toJSONStringWithDateFormat(u, "yyyy-MM-dd HH:mm:ss"));
	}
	
	/*get and set*/
	public UserService getUserService() {
		return userService;
	} 
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
}
