package com.bitcamp.web.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bitcamp.web.command.Command;
import com.bitcamp.web.domain.BoardDTO;
import com.bitcamp.web.mapper.BoardMapper;
import com.bitcamp.web.service.BoardService;

@Service
public class BoardServiceImpl implements BoardService{
	@Autowired BoardMapper mapper;
	@Override
	public void addBoardDTO(Command cmd) {
		
	}

	@Override
	public void modifyBoardDTO(Command cmd) {
		
	}

	@Override
	public void deleteBoardDTO(Command cmd) {
		
	}

	@Override
	public List<BoardDTO> list() {
		return mapper.selectAll();
	}

	@Override
	public List<BoardDTO> findByName(Command cmd) {
		return null;
	}

	@Override
	public BoardDTO findById(Command cmd) {
		return mapper.selectById(cmd);
	}

	@Override
	public int count() {
		return mapper.selectCount();
	}

}
