package com.bitcamp.web.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.bitcamp.web.domain.LottoDTO;
import com.bitcamp.web.service.LottoService;

@Controller
@SessionAttributes("path")
public class UserController {
	private static final Logger logger = LoggerFactory.getLogger(AuthController.class);
	@Autowired LottoService service;
	@Autowired LottoDTO lotto;
	@RequestMapping("/burgerking")
	public String mypage(Model model) {
		logger.info("UserController mypage() {}", "Entered");
		return "public:burgerking/main.tiles";
	}
	
	@RequestMapping("/lotto")
	public String lotto(Model model) {
		logger.info("UserController lotto() {}", "Entered");
		return "public:lotto/main.tiles";
	}
	@RequestMapping("/lotto/{money}")
	public String lotto(@PathVariable String money, Model model) {
		logger.info("UserController lotto() {}", "Entered");
		logger.info("Money is ￦{}", money);
		lotto.setMoney(money);
		List<LottoDTO> lottos = service.createLottos(lotto);
		logger.info("Count is {}", lotto.getCount());
		logger.info("LottoNumber is {}", lottos);		
		model.addAttribute("lottos", lottos);
		model.addAttribute("money", money);
		return "public:lotto/main.tiles";
	}
}