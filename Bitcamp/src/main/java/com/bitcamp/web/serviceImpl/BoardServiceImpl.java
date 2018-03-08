package com.bitcamp.web.serviceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bitcamp.web.command.Command;
import com.bitcamp.web.domain.BoardDTO;
import com.bitcamp.web.service.BoardService;

@Service
public class BoardServiceImpl implements BoardService{

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
		return null;
	}

	@Override
	public List<BoardDTO> findByName(Command cmd) {
		return null;
	}

	@Override
	public BoardDTO findById(Command cmd) {
		return null;
	}

	@Override
	public int count() {
		return 0;
	}

}
