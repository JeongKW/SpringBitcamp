package com.bitcamp.web.mapper;

import org.springframework.stereotype.Component;

import com.bitcamp.web.command.Command;
import com.bitcamp.web.domain.UserPhoneDTO;

@Component
public interface UserPhoneMapper {
	public void openPhone(Command cmd);
	public UserPhoneDTO findPhoneById(Command cmd);
}
