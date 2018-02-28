package com.bitcamp.web.domain;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class LottoDTO {
	private String randomNumer, lottoNumber, money, count;
	
	@Override
	public String toString() {
		return "로또번호 : {" + lottoNumber + "}\n";
	}
}
