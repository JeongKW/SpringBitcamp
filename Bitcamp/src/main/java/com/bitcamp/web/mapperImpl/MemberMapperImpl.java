package com.bitcamp.web.mapperImpl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bitcamp.web.command.Command;
import com.bitcamp.web.domain.MemberDTO;
import com.bitcamp.web.mapper.MemberMapper;
@Repository
public class MemberMapperImpl implements MemberMapper{
	private static final Logger logger = LoggerFactory.getLogger(MemberMapperImpl.class);
	@Autowired MemberDTO member;
	@Autowired SqlSessionTemplate sqlSession;
	String ns = "com.bitcamp.web.mapperImpl.MemberMapperImpl.";
	@Override
	public int exist(Command cmd) {
		logger.info("MemberMapperImpl login() ID is {}", cmd.getMember().getId());
		return sqlSession.selectOne(ns+"exist", cmd);
	}

	@Override
	public void insertMember(Command cmd) {
		sqlSession.insert(ns+"insertMember", cmd);
	}
	@Override
	public void updateMember(Command cmd) {
		
	}
	@Override
	public void deleteMember(Command cmd) {
		
	}
	@Override
	public List<MemberDTO> selectAll() {
		return null;
	}
	@Override
	public List<MemberDTO> selectByName(Command cmd) {
		return null;
	}
	@Override
	public MemberDTO selectById(Command cmd) {
		logger.info("MemberMapperImpl selectById() is {}", cmd.getMember().getId());
		return sqlSession.selectOne(ns+"selectMemberById", cmd);
	}
	@Override
	public int selectCount() {
		return 0;
	}

}
