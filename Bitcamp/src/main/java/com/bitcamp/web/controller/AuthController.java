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
import com.bitcamp.web.domain.MemberDTO;
import com.bitcamp.web.factory.ShiftFactory;
import com.bitcamp.web.service.MemberService;

@SessionAttributes("user")
@Controller
public class AuthController {
	private static final Logger logger = LoggerFactory.getLogger(AuthController.class);
	@Autowired MemberService mService;
	@Autowired MemberDTO member;
	@Autowired ShiftFactory shift;
	@Autowired Command cmd;
	@RequestMapping("/logout")
	public String logout(SessionStatus status) {
		status.setComplete();
		logger.info("UserController is logout() {}", "Entered");
		return shift.redirect("user", "login");
	}
	
	@RequestMapping("/login/{userid}/{password}")
	public String login(Model model, @PathVariable("userid")String id, @PathVariable("password")String pw) {
		logger.info("UserController is login() ID is {} ", id);
		logger.info("UserController is login() PW is {} ", pw);
		member.setId(id);
		member.setPw(pw);
		cmd.setMember(member);
		String path = shift.create("user", "login");
		if(mService.exist(cmd)) {
			model.addAttribute("user", mService.findById(cmd));
			path = shift.create("user", "mypage");
		}
		return path;
	}
	
	@RequestMapping("/join/{userid}/{password}/{name}")
	public String join(@PathVariable("userid")String id, @PathVariable("password")String pw, @PathVariable("name")String name, Model model) {
		logger.info("UserController join() {}", "Entered");
		member.setId(id);
		member.setPw(pw);
		member.setName(name);
		cmd.setMember(member);
		String path = shift.create("user", "login"); 
		if(mService.exist(cmd)) {
			path = shift.create("user", "join");
		} else {
			mService.addMember(cmd);
		}
		return path;
	}
}