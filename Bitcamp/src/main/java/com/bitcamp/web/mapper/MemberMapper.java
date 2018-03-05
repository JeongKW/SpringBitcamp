package com.bitcamp.web.mapper;

import org.springframework.stereotype.Component;

import com.bitcamp.web.command.Command;
import com.bitcamp.web.command.ResultMap;

@Component
public interface MemberMapper {
	public void insertMember(Command cmd);
	public ResultMap selectMemberById(Command cmd);
	public ResultMap login(Command cmd);
	public void deleteMember(Command cmd);
}
