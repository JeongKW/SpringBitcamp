package com.bitcamp.web.proxy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;

import com.bitcamp.web.adapter.PageAdapter;
import com.bitcamp.web.command.Command;
import com.bitcamp.web.command.Page;
import com.bitcamp.web.service.BoardService;
@Component
public class PageProxy extends Proxy{
	@Autowired PageAdapter adapter;
	@Autowired Command cmd;
	@Autowired BoardService bService;
	@Autowired Page page;

	@Override
	public void excute(Model model, Object o) {
		cmd = adapter.attr((Page) o);
		model.addAttribute("page", cmd.getPaging());
		model.addAttribute("list", bService.list(cmd));
	}
}
