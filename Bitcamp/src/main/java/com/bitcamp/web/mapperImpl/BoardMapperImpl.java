package com.bitcamp.web.mapperImpl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bitcamp.web.command.Command;
import com.bitcamp.web.domain.BoardDTO;
import com.bitcamp.web.mapper.BoardMapper;
@Repository
public class BoardMapperImpl implements BoardMapper{
	private static final Logger logger = LoggerFactory.getLogger(BoardMapperImpl.class);
	@Autowired SqlSessionTemplate sqlSession;
	String ns = "com.bitcamp.web.mapperImpl.BoardMapperImpl.";
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
	public List<BoardDTO> selectAll(Command cmd) {
		logger.info("cmd startRow : {}", cmd.getPaging().getStartRow());
		logger.info("cmd endRow : {}", cmd.getPaging().getEndRow());
		return sqlSession.selectList(ns+"selectBoardAll", cmd);
	}

	@Override
	public List<BoardDTO> selectByName(Command cmd) {
		return null;
	}

	@Override
	public BoardDTO selectById(Command cmd) {
		logger.info("cmd boardSeq : {}", cmd.getBoard().getBoardSeq());
		return sqlSession.selectOne(ns+"selectBoardById", cmd);
	}

	@Override
	public int selectCount() {
		return sqlSession.selectOne(ns+"countBoard");
	}

}
