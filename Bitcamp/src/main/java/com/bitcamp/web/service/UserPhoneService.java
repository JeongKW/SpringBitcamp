package com.bitcamp.web.service;

import org.springframework.stereotype.Component;

import com.bitcamp.web.command.Command;
import com.bitcamp.web.domain.UserPhoneDTO;
@Component
public interface UserPhoneService {
	public void openPhone(Command cmd);
	public String createPhoneNumber();
	public UserPhoneDTO findPhoneById(Command cmd);
}
