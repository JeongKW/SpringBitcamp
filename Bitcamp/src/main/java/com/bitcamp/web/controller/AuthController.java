package com.bitcamp.web.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.bitcamp.web.factory.ContextFactory;

@Controller
@SessionAttributes("path")
public class AuthController {
	private static final Logger logger = LoggerFactory.getLogger(AuthController.class);
	
	@Autowired ContextFactory contextFactory;
	@RequestMapping("/login")
	public String login(Model model) {
		logger.info("AuthController login() {} ", "Entered");
		return "public:user/login.tiles";
	}
	@RequestMapping("/join")
	public String join(Model model) {
		return "public:user/join.tiles";
	}
}