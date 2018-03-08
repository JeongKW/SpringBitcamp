package com.bitcamp.web.factory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.bitcamp.web.command.Path;
import com.bitcamp.web.enums.Direction;

@Component
public class ContextFactory extends Factory {
	private static final Logger logger = LoggerFactory.getLogger(ContextFactory.class);
	@Autowired Path path;
	@Override
	public Object create() {
		return ((ServletRequestAttributes) RequestContextHolder
				.currentRequestAttributes())
				.getRequest()
				.getContextPath();
	}

	public Path path() {
		logger.info("ContextFactory path()에 리턴되는 경로 값은 {} 이다", create() + "");
		path.setCtx((String) create());
		path.setCss(create() + Direction.RESOURCE.toString() + Direction.css);
		path.setJs(create() + Direction.RESOURCE.toString() + Direction.js);
		path.setImg(create() + Direction.RESOURCE.toString() + Direction.img);
		path.setFonts(create() + Direction.RESOURCE.toString() + Direction.fonts);
		return path;
	}
}