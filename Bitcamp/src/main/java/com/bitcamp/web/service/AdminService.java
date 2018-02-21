package com.bitcamp.web.service;

import com.bitcamp.web.command.Command;
import com.bitcamp.web.command.ResultMap;

public interface AdminService {
	public ResultMap createTable(Command cmd);
}
