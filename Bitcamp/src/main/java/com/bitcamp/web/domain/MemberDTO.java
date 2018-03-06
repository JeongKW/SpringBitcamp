package com.bitcamp.web.domain;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class MemberDTO {
	private String id, pw, name, ssn, email, profile, addr;
	private AccountDTO account;
	private MobileDTO phone;
	private FoodDTO food;
	private AttendDTO attend;
	private LottoDTO lotto;
	
	@Override
	public String toString() {
		return "회원정보 [ID: " + id + ", PW: " + pw + ", 이름: " + name + ", 주민번호(생년원일-첫째번호): " + ssn + ", 이메일: " + email
				+ ", 전화번호: " + phone + ", 프로필사진: " + profile + ", 주소: " + addr + ", Account: " + account + "]";
	}

}
