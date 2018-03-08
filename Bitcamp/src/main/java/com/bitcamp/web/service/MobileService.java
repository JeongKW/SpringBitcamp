package com.bitcamp.web.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.bitcamp.web.command.Command;
import com.bitcamp.web.domain.MobileDTO;
@Component
public interface MobileService {
	public void addMobile(Command cmd);
	public void modifyMobile(Command cmd);
	public void removeMobile(Command cmd);
	public List<MobileDTO> list();
	public List<MobileDTO> findByName(Command cmd);
	public MobileDTO findById(Command cmd);
	public int count();
}
