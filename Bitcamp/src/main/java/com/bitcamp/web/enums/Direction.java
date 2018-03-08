package com.bitcamp.web.enums;

public enum Direction {
	img, js, fonts, css, RESOURCE {
		@Override
		public String toString() {
			return "/resources/";
		}
	}
}
