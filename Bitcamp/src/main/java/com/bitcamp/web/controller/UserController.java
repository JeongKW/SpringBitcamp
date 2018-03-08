package com.bitcamp.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bitcamp.web.domain.LottoDTO;
import com.bitcamp.web.factory.ShiftFactory;
import com.bitcamp.web.service.LottoService;

@Controller
public class UserController {
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	@Autowired LottoService service;
	@Autowired LottoDTO lotto;
	@Autowired ShiftFactory shift;
	
	@RequestMapping("/lotto/{money}")
	public String lotto(@PathVariable String money, Model model) {
		logger.info("UserController lotto() {}", "Entered");
		logger.info("Money is ￦{}", money);
		lotto.setMoney(money);
//		model.addAttribute("lottos", service.createLottos(lotto));
		logger.info("Count is {}", lotto.getCount());
		model.addAttribute("money", money);
		return shift.create("lotto", "main");
	}
	
}