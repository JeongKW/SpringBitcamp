package com.bitcamp.web.domain;

public class LottoDTO {
	private String lottoNum;

	public String getLottoNum() {
		return lottoNum;
	}

	public void setLottoNum(String lottoNum) {
		this.lottoNum = lottoNum;
	}

	@Override
	public String toString() {
		return "로또번호 : [" + lottoNum + "]";
	}
}
