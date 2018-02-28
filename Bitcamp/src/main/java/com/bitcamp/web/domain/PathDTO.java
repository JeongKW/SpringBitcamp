package com.bitcamp.web.domain;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class PathDTO {
	private String ctx, js, img, css, fonts;
}
