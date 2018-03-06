package com.bitcamp.web.service;

import org.springframework.stereotype.Component;

import com.bitcamp.web.command.Command;
import com.bitcamp.web.domain.MemberDTO;

@Component
public interface MemberService {
	public void insertMember(Command cmd);
	public MemberDTO findMemberById(Command cmd);
	public boolean exist(Command cmd);
	public void deleteMember(Command cmd);
}
