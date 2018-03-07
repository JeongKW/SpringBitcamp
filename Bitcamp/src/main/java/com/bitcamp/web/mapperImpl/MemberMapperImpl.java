package com.bitcamp.web.mapperImpl;

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
	@Override
	public void insertMember(Command cmd) {
		sqlSession.insert("insertMember", cmd);
	}
	
	@Override
	public int exist(Command cmd) {
		logger.info("MemberMapperImpl login() ID is {}", cmd.getMember().getId());
		return sqlSession.selectOne("exist", cmd);
	}

	@Override
	public void deleteMember(Command cmd) {
		
	}

	@Override
	public MemberDTO selectMemberById(Command cmd) {
		logger.info("MemberMapperImpl selectMemberById() is {}", cmd.getMember().getId());
		return sqlSession.selectOne("selectMemberById", cmd);
	}

}
