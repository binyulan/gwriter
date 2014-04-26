package com.gwriter.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.gwriter.UserService;
import com.gwriter.domain.User;

@Controller
@RequestMapping("/user")
public class UserController {
	
	public UserController() {
		super();
	}

	@Autowired
	private UserService userService;
	
	@RequestMapping("/register")
	public String register(){
		return "/register";
	}

	@RequestMapping(method=RequestMethod.POST)
	public ModelAndView createUser(User user){
		userService.createUser(user);
		ModelAndView mav = new ModelAndView();
		mav.setViewName("createSuccess");
		mav.addObject("user", user);
		return mav;
	}
}
