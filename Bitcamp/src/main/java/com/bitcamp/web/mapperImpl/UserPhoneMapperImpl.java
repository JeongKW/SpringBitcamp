package com.bitcamp.web.mapperImpl;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bitcamp.web.command.Command;
import com.bitcamp.web.domain.UserPhoneDTO;
import com.bitcamp.web.mapper.UserPhoneMapper;
@Repository
public class UserPhoneMapperImpl implements UserPhoneMapper{
	@Autowired SqlSessionTemplate sqlSession;
	@Override
	public void openPhone(Command cmd) {
		sqlSession.insert("insertPhone", cmd);
	}
	@Override
	public UserPhoneDTO findPhoneById(Command cmd) {
		return sqlSession.selectOne("selectPhone", cmd);
	}
}
