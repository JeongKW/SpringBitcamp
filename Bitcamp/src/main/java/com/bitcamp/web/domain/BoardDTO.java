package com.bitcamp.web.domain;

import org.springframework.stereotype.Component;

import lombok.Data;
@Component
@Data
public class BoardDTO {
	private String boardSeq, title, content, regdate, id;
}
