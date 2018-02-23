package com.bitcamp.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bitcamp.web.factory.ContextFactory;

@Controller
public class UserController {
	private static final Logger logger = LoggerFactory.getLogger(AuthController.class);
	
	@Autowired ContextFactory contextFactory;
	@RequestMapping("/mypage")
	public String mypage(Model model) {
		logger.info("UserController mypage() {}", "Entered");
		model.addAttribute("context", (String) contextFactory.create());
		model.addAttribute("js", contextFactory.path("js"));
		model.addAttribute("css", contextFactory.path("css"));
		model.addAttribute("img", contextFactory.path("img"));
		return "/user/mypage";
	}
}
