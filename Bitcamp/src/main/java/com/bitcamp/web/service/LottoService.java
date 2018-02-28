package com.bitcamp.web.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.bitcamp.web.domain.LottoDTO;
@Component
public interface LottoService {
	public LottoDTO findLottoCount(LottoDTO param);
	public LottoDTO createLotto();
	public List<LottoDTO> createLottos(LottoDTO param);
}
