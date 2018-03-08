package com.bitcamp.web.mapperImpl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.bitcamp.web.command.Command;
import com.bitcamp.web.domain.BoardDTO;
import com.bitcamp.web.mapper.BoardMapper;
@Repository
public class BoardMapperImpl implements BoardMapper{

	@Override
	public void insertBoardDTO(Command cmd) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateBoardDTO(Command cmd) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteBoardDTO(Command cmd) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<BoardDTO> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BoardDTO> selectByName(Command cmd) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BoardDTO selectById(Command cmd) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int selectCount() {
		// TODO Auto-generated method stub
		return 0;
	}

}
