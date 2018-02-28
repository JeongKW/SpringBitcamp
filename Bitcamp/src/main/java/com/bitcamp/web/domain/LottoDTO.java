package com.bitcamp.web.domain;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class LottoDTO {
	private String randomNumer, lottoNumber, money, count;
}
