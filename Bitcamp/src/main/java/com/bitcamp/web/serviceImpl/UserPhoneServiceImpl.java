package com.bitcamp.web.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bitcamp.web.command.Command;
import com.bitcamp.web.domain.UserPhoneDTO;
import com.bitcamp.web.mapper.UserPhoneMapper;
import com.bitcamp.web.service.UserPhoneService;
@Service
public class UserPhoneServiceImpl implements UserPhoneService{
	@Autowired UserPhoneMapper mapper;
	@Override
	public String createPhoneNumber() {
		String phoneNumber = "010";
		for(int i = 0; i < 2; i++) {
			int temp = 0;
			if(i == 0) {
				temp = (int)(Math.random()*10000 + 1000);
				phoneNumber += temp;
			} else {
				temp = (int)(Math.random()*10000 + 1);
				if(temp < 1000) {
					phoneNumber += "0";
				}
				phoneNumber += temp;
			}
		}
		return phoneNumber;
	}

	@Override
	public void openPhone(Command cmd) {
		cmd.getUserPhone().setPhoneNumber(createPhoneNumber());
		mapper.openPhone(cmd);
	}

	@Override
	public UserPhoneDTO findPhoneById(Command cmd) {
		return mapper.findPhoneById(cmd);
	}
	
}
