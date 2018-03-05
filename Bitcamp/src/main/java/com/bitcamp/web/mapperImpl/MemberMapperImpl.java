package com.bitcamp.web.mapperImpl;

import org.springframework.stereotype.Repository;

import com.bitcamp.web.command.Command;
import com.bitcamp.web.command.ResultMap;
import com.bitcamp.web.mapper.MemberMapper;
@Repository
public class MemberMapperImpl implements MemberMapper{

	@Override
	public void insertMember(Command cmd) {
		
	}

	@Override
	public ResultMap selectMemberById(Command cmd) {
		return null;
	}

	@Override
	public ResultMap login(Command cmd) {
		return null;
	}

	@Override
	public void deleteMember(Command cmd) {
		
	}

}
