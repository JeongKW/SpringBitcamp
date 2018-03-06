package com.bitcamp.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MobileController {
	private static final Logger logger = LoggerFactory.getLogger(MobileController.class);
	@RequestMapping("/mobile")
	public String mobile(Model model) {
		logger.info("MobileController mobile() is {}", "entered");
		return "public:sktelecom/main.tiles";
	}
}
