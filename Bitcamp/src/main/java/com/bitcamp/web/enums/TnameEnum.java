package com.bitcamp.web.enums;

public enum TnameEnum {
	MEMBER, ATTEND, BANK, MOBILE,
	TNAMES{
		@Override
		public String toString() {
			return MEMBER + "," + ATTEND;
		}
	}
}
