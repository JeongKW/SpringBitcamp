package com.bitcamp.web.serviceImpl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bitcamp.web.command.Command;
import com.bitcamp.web.domain.MemberDTO;
import com.bitcamp.web.mapper.MemberMapper;
import com.bitcamp.web.service.MemberService;
@Service
public class MemberServiceImpl implements MemberService{
	private static final Logger logger = LoggerFactory.getLogger(MemberServiceImpl.class);
	@Autowired MemberMapper mapper;
	@Autowired MemberDTO member;

	@Override
	public boolean exist(Command cmd) {
		logger.info("MemberServiceImpl login() ID is {}", cmd.getMember().getId());
		return (mapper.exist(cmd) != 0);
	}

	@Override
	public void addMember(Command cmd) {
		logger.info("MemberServiceImpl addMember() ID is {}", cmd.getMember().getId());
		mapper.insertMember(cmd);
	}

	@Override
	public void modifyMember(Command cmd) {
		
	}

	@Override
	public void removeMember(Command cmd) {
		
	}

	@Override
	public List<MemberDTO> list() {
		return mapper.selectAll();
	}

	@Override
	public List<MemberDTO> findByName(Command cmd) {
		return null;
	}

	@Override
	public MemberDTO findById(Command cmd) {
		logger.info("MemberServiceImpl findById() ID is {}", cmd.getMember().getId());
		return mapper.selectById(cmd);
	}

	@Override
	public int count() {
		return 0;
	}
}
