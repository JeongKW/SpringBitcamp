package com.bitcamp.web.mapperImpl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bitcamp.web.command.Command;
import com.bitcamp.web.domain.TxDTO;
import com.bitcamp.web.mapper.TxMapper;
@Repository
public class TxMapperImpl implements TxMapper{
	@Autowired SqlSessionTemplate sqlSession;
	String ns = "com.bitcamp.web.mapperImpl.TxMapperImpl.";

	@Override
	public void insertTx(Command cmd) {
		sqlSession.insert(ns+"insertTx", cmd);
	}

	@Override
	public void updateTx(Command cmd) {
		
	}

	@Override
	public void deleteTx(Command cmd) {
		
	}

	@Override
	public List<TxDTO> selectAll() {
		return null;
	}

	@Override
	public List<TxDTO> selectByName(Command cmd) {
		return null;
	}

	@Override
	public TxDTO selectById(Command cmd) {
		return sqlSession.selectOne(ns+"selectTxById", cmd);
	}

	@Override
	public int selectCount() {
		return 0;
	}
}
