package com.bitcamp.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bitcamp.web.factory.ContextFactory;

@Controller
public class NavController {
	private static final Logger logger = LoggerFactory.getLogger(AuthController.class);
	
	@Autowired ContextFactory contextFactory;
	@RequestMapping("/nav")
	public String nav(Model model) {
		logger.info("NavController nav() {}", "Entered");
		model.addAttribute("context", (String) contextFactory.create());
		model.addAttribute("js", contextFactory.path("js"));
		model.addAttribute("css", contextFactory.path("css"));
		model.addAttribute("img", contextFactory.path("img"));
		return "common/nav";
	}
	@RequestMapping("/burgerking")
	public String burgerking(Model model) {
		return "/burgerking/main";
	}
	@RequestMapping("/bitcamp")
	public String bitcamp(Model model) {
		return "/bitcamp/main";
	}
	@RequestMapping("/kakao")
	public String kakao(Model model) {
		return "/kakao/main";
	}
	@RequestMapping("/lotto")
	public String lotto(Model model) {
		return "/lotto/main";
	}
	@RequestMapping("/sktelecom")
	public String sktelecom(Model model) {
		return "/sktelecom/main";
	}
}
