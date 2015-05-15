package com.systop.core.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.systop.core.model.User;
import com.systop.core.service.UserService;

@Controller
@RequestMapping("/userController")
public class UserController {

	private UserService userService;

	/**
	 * @param id
	 * @param request
	 * @return
	 */
	@RequestMapping("/{id}/showUser")
	public String showUser(@PathVariable String id, HttpServletRequest request) {
		User u = userService.getUserById(id);
		request.setAttribute("user", u);
		System.out.println(u.getName());
		System.out.println("*********************");
		this.sayHellow();
		return "showUser";
	}
	
	private void sayHellow() {
		System.out.println("Hello World");
	}
	
	/*get and set*/
	public UserService getUserService() {
		return userService;
	}

	@Autowired
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

}
