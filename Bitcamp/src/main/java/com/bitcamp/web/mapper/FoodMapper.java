package com.bitcamp.web.mapper;

import java.util.List;

import org.springframework.stereotype.Component;

import com.bitcamp.web.command.Command;
import com.bitcamp.web.domain.FoodDTO;

@Component
public interface FoodMapper {
	public void insertFoodDTO(Command cmd);
	public void updateFoodDTO(Command cmd);
	public void deleteFoodDTO(Command cmd);
	public List<FoodDTO> selectAll();
	public List<FoodDTO> selectByName(Command cmd);
	public FoodDTO selectById(Command cmd);
	public int selectCount();
}
