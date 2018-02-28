package com.bitcamp.web.factory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import com.bitcamp.web.domain.PathDTO;
import com.bitcamp.web.constant.Constant;

@Component
public class ContextFactory extends Factory {
	private static final Logger logger = LoggerFactory.getLogger(ContextFactory.class);
	@Autowired PathDTO path;
	@Override
	public Object create() {
		return ((ServletRequestAttributes) RequestContextHolder
				.currentRequestAttributes())
				.getRequest()
				.getContextPath();
	}

	public PathDTO path() {
		logger.info("ContextFactory path()에 리턴되는 경로 값은 {} 이다", create() + "");
		path.setCtx((String) create());
		path.setCss(create() + Constant.RESOURCE.toString() + Constant.css);
		path.setJs(create() + Constant.RESOURCE.toString() + Constant.js);
		path.setImg(create() + Constant.RESOURCE.toString() + Constant.img);
		path.setFonts(create() + Constant.RESOURCE.toString() + Constant.fonts);
		return path;
	}
}