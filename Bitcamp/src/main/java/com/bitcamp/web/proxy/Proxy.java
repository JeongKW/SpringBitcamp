package com.bitcamp.web.proxy;

import org.springframework.ui.Model;

public abstract class Proxy {
	public abstract void excute(Model model, Object o);
}
