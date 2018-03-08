package com.bitcamp.web.mapperImpl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.bitcamp.web.command.Command;
import com.bitcamp.web.domain.FoodDTO;
import com.bitcamp.web.mapper.FoodMapper;
@Repository
public class FoodMapperImpl implements FoodMapper{

	@Override
	public void insertFoodDTO(Command cmd) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateFoodDTO(Command cmd) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteFoodDTO(Command cmd) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<FoodDTO> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<FoodDTO> selectByName(Command cmd) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FoodDTO selectById(Command cmd) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int selectCount() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
