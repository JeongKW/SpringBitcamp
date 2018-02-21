package com.bitcamp.web.service;

import com.bitcamp.web.command.Command;
import com.bitcamp.web.command.ResultMap;

public interface MemberService {
	public ResultMap insertMember(Command cmd);
	public ResultMap findMemberById(Command cmd);
	public ResultMap login(Command cmd);
	public ResultMap updateMember(Command cmd);
	public ResultMap deleteMember(Command cmd);
}
