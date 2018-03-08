package com.bitcamp.web.mapper;

import java.util.List;

import org.springframework.stereotype.Component;

import com.bitcamp.web.command.Command;
import com.bitcamp.web.domain.MobileDTO;
@Component
public interface MobileMapper {
	public void insertMobile(Command cmd);
	public void updateMobile(Command cmd);
	public void deleteMobile(Command cmd);
	public List<MobileDTO> selectAll();
	public List<MobileDTO> selectByName(Command cmd);
	public MobileDTO selectById(Command cmd);
	public int selectCount();
}
