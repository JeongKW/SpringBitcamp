package com.bitcamp.web.command;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class Path {
	private String ctx, js, img, css, fonts;
}
