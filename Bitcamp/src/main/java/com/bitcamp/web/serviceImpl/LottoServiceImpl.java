package com.bitcamp.web.serviceImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bitcamp.web.command.Command;
import com.bitcamp.web.domain.LottoDTO;
import com.bitcamp.web.service.LottoService;
@Service
public class LottoServiceImpl implements LottoService{
	private static final Logger logger = LoggerFactory.getLogger(LottoServiceImpl.class);
	@Autowired LottoDTO lotto;
//	@Override
//	public LottoDTO findLottoCount(LottoDTO param) {
//		if(Integer.parseInt(lotto.getMoney()) < 100000) {
//			lotto.setCount(String.valueOf(Integer.parseInt(lotto.getMoney())/1000));
//		}
//		return lotto;
//	}
//
//	@Override
//	public LottoDTO createLotto() {
//		LottoDTO lotto = new LottoDTO();
//		String temp = "";
//		int[] lottoNums = createLottoNum();
//		Arrays.sort(lottoNums);
//		for(int i = 0; i < lottoNums.length; i++) {
//			temp += (i != (lottoNums.length - 1)) ? lottoNums[i] + "," : lottoNums[i];
//		}
//		lotto.setLottoNumber(temp);
//		logger.info("createLotto is {}", lotto.getLottoNumber());
//		return lotto;
//	}
//
//	@Override
//	public List<LottoDTO> createLottos(LottoDTO param) {
//		List<LottoDTO> list = new ArrayList<>();
//		for(int i = 0; i < Integer.parseInt(findLottoCount(param).getCount()); i++) {
//			list.add(createLotto());
//			logger.info("arraylist elements is {}", list.get(i).getLottoNumber());
//		}
//		logger.info("ArrayList is {}", list);
//		logger.info("Size of ArrayList is {}", list.size());
//		return list;
//	}
//
//	@Override
//	public int[] createLottoNum() {
//		int[] tempNums = new int[6];
//		for(int i = 0; i < tempNums.length; i++) {
//			tempNums[i] = (int)(Math.random()*45 + 1);
//			if(i == 0) {
//				continue;
//			} else {
//				for(int j = 0; j < i; j++) {
//					if(tempNums[j] == tempNums[i]) {
//						i--;
//						break;
//					}
//				}
//			}
//		}
//		return tempNums;
//	}
	@Override
	public void addLotto(Command cmd) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void modifyLotto(Command cmd) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void removeLotto(Command cmd) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public List<LottoDTO> list() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<LottoDTO> findByName(Command cmd) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public LottoDTO findById(Command cmd) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int count() {
		// TODO Auto-generated method stub
		return 0;
	}
}
