package com.bitcamp.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.bitcamp.web.enums.Files;
import com.bitcamp.web.enums.Table;
import com.bitcamp.web.factory.ShiftFactory;

@Controller
@RequestMapping("/board")
public class BoardController {
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	@Autowired ShiftFactory shift;
	@RequestMapping("/list")
	public String boardList() {
		return shift.create(Table.board.toString(), Files.list.toString());
	}
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String boardAdd(@RequestParam("title") String title, @RequestParam("content") String content) {
		logger.info("BoardController boardAdd() title is {}", title);
		logger.info("BoardController boardAdd() content is {}", content);
		return "";
	}
}
