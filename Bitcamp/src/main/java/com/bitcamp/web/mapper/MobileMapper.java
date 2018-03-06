package com.bitcamp.web.mapper;

import org.springframework.stereotype.Component;

import com.bitcamp.web.command.Command;
import com.bitcamp.web.domain.MobileDTO;
@Component
public interface MobileMapper {
	public void openMobile(Command cmd);
	public MobileDTO findMobileById(Command cmd);
}
