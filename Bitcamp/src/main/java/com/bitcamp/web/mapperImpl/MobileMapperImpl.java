package com.bitcamp.web.mapperImpl;

import org.springframework.stereotype.Repository;

import com.bitcamp.web.command.Command;
import com.bitcamp.web.domain.MobileDTO;
import com.bitcamp.web.mapper.MobileMapper;
@Repository
public class MobileMapperImpl implements MobileMapper{

	@Override
	public void openMobile(Command cmd) {
		
	}

	@Override
	public MobileDTO findMobileById(Command cmd) {
		return null;
	}

}
