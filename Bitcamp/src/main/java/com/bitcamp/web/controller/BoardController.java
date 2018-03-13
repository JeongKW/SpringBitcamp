package com.bitcamp.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.bitcamp.web.adapter.PageAdapter;
import com.bitcamp.web.command.Command;
import com.bitcamp.web.domain.BoardDTO;
import com.bitcamp.web.enums.Files;
import com.bitcamp.web.enums.Table;
import com.bitcamp.web.factory.ShiftFactory;
import com.bitcamp.web.proxy.PageProxy;
import com.bitcamp.web.service.BoardService;

@Controller
@RequestMapping("/board")
public class BoardController {
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	@Autowired ShiftFactory shift;
	@Autowired BoardDTO board;
	@Autowired BoardService service;
	@Autowired Command cmd;
	@Autowired PageAdapter page;
	@RequestMapping("/list")
	public String boardList(Model model, @RequestParam(value = "pageSize", defaultValue = "5") String pageSize, @RequestParam(value = "blockSize", defaultValue = "5") String blockSize, 
			@RequestParam(value = "nowPage", defaultValue = "1") String nowPage) {
		logger.info("list size is {}", service.list().size());
		page.setPageSize(Integer.parseInt(pageSize));
		page.setBlockSize(Integer.parseInt(blockSize));
		page.setNowPage(Integer.parseInt(nowPage));
		page.setList(service.list());
		new PageProxy(model).excute(page);
		return shift.create(Table.board.toString(), Files.list.toString());
	}
	
	@RequestMapping("/detail/{boardSeq}")
	public String boardDetail(Model model, @PathVariable("boardSeq") String boardSeq) {
		logger.info("boardDetail is entered, boardSeq : {}", boardSeq);
		board.setBoardSeq(boardSeq);
		cmd.setBoard(board);
		model.addAttribute("bbsDetail", service.findById(cmd));
		return shift.create(Table.board.toString(), Files.detail.toString());
	}
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String boardAdd(@RequestParam("title") String title, @RequestParam("content") String content) {
		logger.info("BoardController boardAdd() title is {}", title);
		logger.info("BoardController boardAdd() content is {}", content);
		return "";
	}
}
