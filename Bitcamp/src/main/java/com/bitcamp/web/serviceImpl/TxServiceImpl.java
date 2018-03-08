package com.bitcamp.web.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bitcamp.web.command.Command;
import com.bitcamp.web.domain.TxDTO;
import com.bitcamp.web.mapper.TxMapper;
import com.bitcamp.web.service.TxService;
@Service
public class TxServiceImpl implements TxService{
	@Autowired TxMapper mapper;
	@Override
	public String createPhoneNumber() {
		String phoneNumber = "010";
		for(int i = 0; i < 2; i++) {
			int temp = 0;
			if(i == 0) {
				temp = (int)(Math.random()*10000 + 1000);
				phoneNumber += temp;
			} else {
				temp = (int)(Math.random()*10000 + 1);
				if(temp < 1000) {
					phoneNumber += "0";
				}
				phoneNumber += temp;
			}
		}
		return phoneNumber;
	}

	@Override
	public void addTx(Command cmd) {
		cmd.getTx().setPhoneNumber(createPhoneNumber());
		mapper.insertTx(cmd);
	}

	@Override
	public void modifyTx(Command cmd) {
		
	}

	@Override
	public void removeTx(Command cmd) {
		
	}

	@Override
	public List<TxDTO> list() {
		return null;
	}

	@Override
	public List<TxDTO> findByName(Command cmd) {
		return null;
	}

	@Override
	public TxDTO findById(Command cmd) {
		return mapper.selectById(cmd);
	}

	@Override
	public int count() {
		return 0;
	}
	
}
