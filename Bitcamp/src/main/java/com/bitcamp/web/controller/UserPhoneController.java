package com.bitcamp.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.bitcamp.web.command.Command;
import com.bitcamp.web.domain.MemberDTO;
import com.bitcamp.web.domain.UserPhoneDTO;
import com.bitcamp.web.factory.ShiftFactory;
import com.bitcamp.web.service.UserPhoneService;
@SessionAttributes("user")
@Controller
public class UserPhoneController {
	private static final Logger logger = LoggerFactory.getLogger(UserPhoneController.class);
	@Autowired UserPhoneService service;
	@Autowired ShiftFactory shift;
	@Autowired UserPhoneDTO userPhone;
	@Autowired Command cmd;
	@RequestMapping(value = "/phone/open", method = RequestMethod.POST)
	public String open(Model model, @RequestParam("seq") String seq, @RequestParam("telecom") String telecom, @ModelAttribute("user") MemberDTO member) {
		logger.info("UserPhoneController open() is {}", "Entered");
		userPhone.setSeq(seq);
		userPhone.setTelecom(telecom);
		userPhone.setPhoneid(member.getId().concat(seq));
		userPhone.setId(member.getId());
		cmd.setUserPhone(userPhone);
		service.openPhone(cmd);
		model.addAttribute("userphone", service.findPhoneById(cmd));
		return shift.create("user", "mypage");
	}
}
