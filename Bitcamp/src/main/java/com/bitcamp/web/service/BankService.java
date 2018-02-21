package com.bitcamp.web.service;

import com.bitcamp.web.command.Command;
import com.bitcamp.web.command.ResultMap;

public interface BankService {
	public ResultMap createBank(Command cmd);
	public ResultMap createAccount(Command cmd);
	public ResultMap findAccount(Command cmd);
}
