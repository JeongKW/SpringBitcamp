package com.bitcamp.web.mapper;

import java.util.List;

import org.springframework.stereotype.Component;

import com.bitcamp.web.command.Command;
import com.bitcamp.web.domain.AdminDTO;

@Component
public interface AdminMapper {
	public void insertAdminDTO(Command cmd);
	public void updateAdminDTO(Command cmd);
	public void deleteAdminDTO(Command cmd);
	public List<AdminDTO> selectAll();
	public List<AdminDTO> selectByName(Command cmd);
	public AdminDTO selectById(Command cmd);
	public int selectCount();
}
