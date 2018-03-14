package com.bitcamp.web.adapter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bitcamp.web.command.Command;
import com.bitcamp.web.command.Page;
import com.bitcamp.web.service.BoardService;

@Component
public class PageAdapter {
	@Autowired Command cmd;
	@Autowired BoardService bSerivce;
	public Command attr(Page page) {
		page.setTotalCount(bSerivce.count());
		page.setTotalPage(0);
		page.setStartRow(0);
		page.setEndRow(0);
		page.setPageStart(0);
		page.setPageEnd(0);
		page.setBlockPrev(false);
		page.setBlockNext(false);
		cmd = new Command();
		cmd.setPaging(page);
		return cmd;
	}
}
