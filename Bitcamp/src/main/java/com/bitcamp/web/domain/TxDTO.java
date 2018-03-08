package com.bitcamp.web.domain;

import org.springframework.stereotype.Component;

import lombok.Data;
@Component
@Data
public class TxDTO {
	private String txKey, count, regdate, total, id, phoneNumber, telecom;
	private FoodDTO food;
	private MobileDTO mobile;
}
