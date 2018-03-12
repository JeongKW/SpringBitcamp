package com.bitcamp.web.proxy;

import java.util.List;

import org.springframework.ui.Model;

public class PageProxy extends Proxy{

	public PageProxy(Model model) {
		super(model);
	}

	@Override
	public void excute(List<?> list) {
		Model m = super.getModel();
		m.addAttribute("bbsList", list);
		m.addAttribute("bbsCount", list.size());
		m.addAttribute("bbsPage", calcEnd(list.size()));
	}
	public int calcEnd(int count) {
		return ((count % 15) == 0) ? count/15 : count/15 + 1;
	}
}
