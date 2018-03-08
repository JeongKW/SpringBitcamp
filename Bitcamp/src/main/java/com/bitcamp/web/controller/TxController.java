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
import com.bitcamp.web.domain.MobileDTO;
import com.bitcamp.web.domain.TxDTO;
import com.bitcamp.web.factory.ShiftFactory;
import com.bitcamp.web.service.TxService;
@SessionAttributes("user")
@Controller
public class TxController {
	private static final Logger logger = LoggerFactory.getLogger(TxController.class);
	@Autowired TxService service;
	@Autowired ShiftFactory shift;
	@Autowired TxDTO tx;
	@Autowired MobileDTO mobile;
	@Autowired Command cmd;
	@RequestMapping(value = "/phone/open", method = RequestMethod.POST)
	public String open(Model model, @RequestParam("seq") String seq, @RequestParam("telecom") String telecom, @ModelAttribute("user") MemberDTO member) {
		logger.info("TxController open() is {}", "Entered");
		logger.info("TxController open() seq {}", seq);
		logger.info("TxController open() telecom {}", telecom);
		mobile.setMobileSeq(seq);
		tx.setTelecom(telecom);
		tx.setTxKey(member.getId()+seq);
		cmd.setTx(tx);
		cmd.setMobile(mobile);
		service.addTx(cmd);
		model.addAttribute("tx", service.findById(cmd));
		return shift.create("user", "mypage");
	}
}
