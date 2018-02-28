package com.bitcamp.web.serviceImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bitcamp.web.domain.LottoDTO;
import com.bitcamp.web.service.LottoService;
@Service
public class LottoServiceImpl implements LottoService{ //
	private static final Logger logger = LoggerFactory.getLogger(LottoServiceImpl.class);
	@Autowired LottoDTO lotto;
	@Override
	public LottoDTO findLottoCount(LottoDTO param) {
		if(Integer.parseInt(lotto.getMoney()) < 100000) {
			lotto.setCount(String.valueOf(Integer.parseInt(lotto.getMoney())/1000));
		}
		return lotto;
	}

	@Override
	public LottoDTO createLotto() {
		int[] lottoNums = new int[6];
		LottoDTO lotto = new LottoDTO();
		String temp = "";
		for(int i = 0; i < lottoNums.length; i++) {
			lottoNums[i] = (int)(Math.random()*45 + 1);
			if(i == 0) {
				continue;
			} else {
				for(int j = 0; j < i; j++) {
					if(lottoNums[j] == lottoNums[i]) {
						i--;
						break;
					}
				}
			}
		}
		Arrays.sort(lottoNums);
		for(int i = 0; i < lottoNums.length; i++) {
			temp += (i != (lottoNums.length - 1)) ? lottoNums[i] + "," : lottoNums[i];  
		}
		lotto.setLottoNumber(temp);
		logger.info("createLotto is {}", lotto.getLottoNumber());
		return lotto;
	}

	@Override
	public List<LottoDTO> createLottos(LottoDTO param) {
		List<LottoDTO> list = new ArrayList<>();
		for(int i = 0; i < Integer.parseInt(findLottoCount(param).getCount()); i++) {
			list.add(createLotto());
			logger.info("arraylist elements is {}", list.get(i).getLottoNumber());
		}
		logger.info("ArrayList 0 is {}", list.get(0).getLottoNumber());
		logger.info("ArrayList 1 is {}", list.get(1).getLottoNumber());
		logger.info("Size of ArrayList is {}", list.size());
		return list;
	}
}
