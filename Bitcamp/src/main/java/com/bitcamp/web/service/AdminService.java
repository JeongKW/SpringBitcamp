package com.bitcamp.web.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.bitcamp.web.command.Command;
import com.bitcamp.web.domain.AdminDTO;
@Component
public interface AdminService {
	public void addAdminDTO(Command cmd);
	public void modifyAdminDTO(Command cmd);
	public void deleteAdminDTO(Command cmd);
	public List<AdminDTO> list();
	public List<AdminDTO> findByName(Command cmd);
	public AdminDTO findById(Command cmd);
	public int count();
}
