package com.bitcamp.web.serviceImpl;

import org.springframework.stereotype.Service;

import com.bitcamp.web.command.Command;
import com.bitcamp.web.domain.MobileDTO;
import com.bitcamp.web.service.MobileService;

@Service
public class MobileServiceImpl implements MobileService{

	@Override
	public void openMobile(Command cmd) {
		
	}

	@Override
	public MobileDTO findMobileById(Command cmd) {
		return null;
	}
	
}
