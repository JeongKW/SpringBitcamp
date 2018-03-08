package com.bitcamp.web.service;

import org.springframework.stereotype.Component;

import com.bitcamp.web.command.Command;
import com.bitcamp.web.command.ResultMap;
@Component
public interface FoodService {
	public ResultMap selectFoodById(Command cmd);
}
