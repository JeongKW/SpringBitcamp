package com.bitcamp.web.service;

import com.bitcamp.web.command.Command;
import com.bitcamp.web.command.ResultMap;

public interface SktelecomService {
	public ResultMap createSktelecom(Command cmd);
	public ResultMap insertSktelecom(Command cmd);
	public ResultMap findSktelecomById(Command cmd);
}
