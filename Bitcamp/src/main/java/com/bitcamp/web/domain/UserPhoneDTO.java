package com.bitcamp.web.domain;

import org.springframework.stereotype.Component;

import lombok.Data;
@Component
@Data
public class UserPhoneDTO {
	private String phoneid, id, seq, phoneNumber, telecom;
}
