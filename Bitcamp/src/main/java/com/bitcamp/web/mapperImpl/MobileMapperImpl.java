package com.bitcamp.web.mapperImpl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bitcamp.web.command.Command;
import com.bitcamp.web.domain.MobileDTO;
import com.bitcamp.web.mapper.MobileMapper;
@Repository
public class MobileMapperImpl implements MobileMapper{
	@Autowired SqlSessionTemplate sqlSession;
	String ns = "com.bitcamp.web.mapperImpl.MobileMapperImpl.";
	@Override
	public void insertMobile(Command cmd) {
		
	}

	@Override
	public void updateMobile(Command cmd) {
		
	}

	@Override
	public void deleteMobile(Command cmd) {
		
	}

	@Override
	public List<MobileDTO> selectAll() {
		return sqlSession.selectList(ns+"selectMobileAll");
	}

	@Override
	public List<MobileDTO> selectByName(Command cmd) {
		return null;
	}

	@Override
	public MobileDTO selectById(Command cmd) {
		return null;
	}

	@Override
	public int selectCount() {
		return 0;
	}

}
