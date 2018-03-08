package com.bitcamp.web.serviceImpl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bitcamp.web.command.Command;
import com.bitcamp.web.domain.MobileDTO;
import com.bitcamp.web.mapper.MobileMapper;
import com.bitcamp.web.service.MobileService;

@Service
public class MobileServiceImpl implements MobileService{
	private static final Logger logger = LoggerFactory.getLogger(MobileServiceImpl.class);
	@Autowired MobileMapper mapper;
//	@Override
//	public void openMobile(Command cmd) {
//		mapper.openMobile(cmd);
//	}
//
//	@Override
//	public MobileDTO findMobileById(Command cmd) {
//		return mapper.findMobileById(cmd);
//	}
//
//	@Override
//	public List<MobileDTO> phones() {

//	}
	@Override
	public void addMobile(Command cmd) {
		mapper.insertMobile(cmd);
	}
	@Override
	public void modifyMobile(Command cmd) {
		
	}
	@Override
	public void removeMobile(Command cmd) {
		
	}
	@Override
	public List<MobileDTO> list() {
		logger.info("MobileServiceImpl phones() is {}", "Entered");
		return mapper.selectAll();
	}
	@Override
	public List<MobileDTO> findByName(Command cmd) {
		return null;
	}
	@Override
	public MobileDTO findById(Command cmd) {
		return null;
	}
	@Override
	public int count() {
		return 0;
	}
}
