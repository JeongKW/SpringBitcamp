package com.bitcamp.web.domain;

import org.springframework.stereotype.Component;

import lombok.Data;
@Component
@Data
public class AccountDTO {
	private String customNum, accountNum, money;

}
