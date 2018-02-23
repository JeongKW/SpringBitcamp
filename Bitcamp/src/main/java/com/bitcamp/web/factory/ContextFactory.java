package com.bitcamp.web.factory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.bitcamp.web.constant.Constant;

@Component
public class ContextFactory extends Factory{
	private static final Logger logger = LoggerFactory.getLogger(ContextFactory.class);
	@Override
	public Object create() {
		return ((ServletRequestAttributes) 
				RequestContextHolder
				.currentRequestAttributes())
				.getRequest()
				.getContextPath();
	}
	
	public String path(String tag) {
		logger.info("ContextFactory path()에 넘어온 tag 값은 {} 이다", tag);
		return (String) create() + Constant.RESOURCE.toString() + tag;
	}
	
}
