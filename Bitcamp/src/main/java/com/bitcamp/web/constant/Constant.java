package com.bitcamp.web.constant;

public enum Constant {
	img, js, fonts, css, RESOURCE {
		@Override
		public String toString() {
			return "/resources/";
		}
	}
}
