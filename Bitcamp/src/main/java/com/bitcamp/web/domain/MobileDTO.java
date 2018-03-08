package com.bitcamp.web.domain;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class MobileDTO {
	private String mobileSeq, model, thumbnail;
}
