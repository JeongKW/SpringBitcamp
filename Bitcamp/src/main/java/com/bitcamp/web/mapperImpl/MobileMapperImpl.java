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
	@Override
	public void openMobile(Command cmd) {
		
	}

	@Override
	public MobileDTO findMobileById(Command cmd) {
		return null;
	}

	@Override
	public List<MobileDTO> phones() {
		return sqlSession.selectList("list");
	}

}
