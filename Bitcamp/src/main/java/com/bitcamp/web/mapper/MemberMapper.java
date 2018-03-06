package com.bitcamp.web.mapper;

import org.springframework.stereotype.Component;

import com.bitcamp.web.command.Command;
import com.bitcamp.web.domain.MemberDTO;

@Component
public interface MemberMapper {
	public void insertMember(Command cmd);
	public MemberDTO selectMemberById(Command cmd);
	public int exist(Command cmd);
	public void deleteMember(Command cmd);
}
