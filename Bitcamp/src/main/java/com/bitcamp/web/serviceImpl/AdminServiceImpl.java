package com.bitcamp.web.serviceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bitcamp.web.command.Command;
import com.bitcamp.web.domain.AdminDTO;
import com.bitcamp.web.service.AdminService;

@Service
public class AdminServiceImpl implements AdminService{

	@Override
	public void addAdminDTO(Command cmd) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modifyAdminDTO(Command cmd) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAdminDTO(Command cmd) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<AdminDTO> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AdminDTO> findByName(Command cmd) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AdminDTO findById(Command cmd) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return 0;
	}

}
