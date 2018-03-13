package com.bitcamp.web.proxy;

import org.springframework.ui.Model;

import com.bitcamp.web.adapter.PageAdapter;

public class PageProxy extends Proxy{
	public PageProxy(Model model) {
		super(model);
	}

	@Override
	public void excute(Object o) {
		super.getModel().addAttribute("page", (PageAdapter) o);
	}
}
