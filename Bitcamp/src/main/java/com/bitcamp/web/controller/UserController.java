package com.bitcamp.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.bitcamp.web.command.Command;
import com.bitcamp.web.domain.LottoDTO;
import com.bitcamp.web.domain.MemberDTO;
import com.bitcamp.web.service.LottoService;
import com.bitcamp.web.service.MemberService;

@Controller
@SessionAttributes("user")
public class UserController {
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	@Autowired LottoService service;
	@Autowired MemberService mService;
	@Autowired Command cmd;
	@Autowired LottoDTO lotto;
	@Autowired MemberDTO member;
	@RequestMapping("/login/{userid}/{password}")
	public String login(Model model, @PathVariable("userid")String id, @PathVariable("password")String pw) {
		logger.info("UserController is login() ID is {} ", id);
		logger.info("UserController is login() PW is {} ", pw);
		member.setId(id);
		member.setPw(pw);
		cmd.setMember(member);
		String path = "public:user/login.tiles";
		if(mService.exist(cmd)) {
			model.addAttribute("user", mService.findMemberById(cmd));
			path = "public:user/mypage.tiles";
		}
		return path;
	}
	@RequestMapping("/mypage")
	public String mypage(Model model) {
		return "public:user/mypage.tiles";
	}
	@RequestMapping("/burgerking")
	public String bugerking(Model model) {
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
		model.addAttribute("lottos", service.createLottos(lotto));
		logger.info("Count is {}", lotto.getCount());
		model.addAttribute("money", money);
		return "public:lotto/main.tiles";
	}
	@RequestMapping("/logout")
	public String logout(SessionStatus status) {
		status.setComplete();
		logger.info("UserController is logout() {}", "Entered");
		return "redirect:/login";
	}
	@RequestMapping("/join/{userid}/{password}/{name}")
	public String join(@PathVariable("userid")String id, @PathVariable("password")String pw, @PathVariable("name")String name, Model model) {
		logger.info("UserController join() {}", "Entered");
		member.setId(id);
		member.setPw(pw);
		member.setName(name);
		cmd.setMember(member);
		String path = "public:user/login.tiles"; 
		if(mService.exist(cmd)) {
			path = "public:user/join.tiles";
		} else {
			mService.insertMember(cmd);
		}
		return path;
	}
}