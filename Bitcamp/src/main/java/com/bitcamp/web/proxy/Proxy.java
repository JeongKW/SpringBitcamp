package com.bitcamp.web.proxy;

import java.util.ArrayList;
import java.util.List;

import org.springframework.ui.Model;

import lombok.Data;
@Data
public abstract class Proxy {
	List<?> list;
	Model model;
	public Proxy(Model model) {
		list = new ArrayList<>();
		this.model = model;
	}
	public abstract void excute(Object o);
}
