package com.bitcamp.web.command;

import org.springframework.stereotype.Component;

import com.bitcamp.web.domain.AccountDTO;
import com.bitcamp.web.domain.AdminDTO;
import com.bitcamp.web.domain.BoardDTO;
import com.bitcamp.web.domain.FoodDTO;
import com.bitcamp.web.domain.LottoDTO;
import com.bitcamp.web.domain.MemberDTO;
import com.bitcamp.web.domain.MobileDTO;
import com.bitcamp.web.domain.TxDTO;
import com.bitcamp.web.enums.Action;

import lombok.Data;

@Component
@Data
public class Command{
	protected String cmd,dir,page,view,colum,data;
	protected Action action;
//	protected Table table;
	   
	protected MemberDTO member;
	protected AccountDTO account;
	protected LottoDTO lotto;
	protected FoodDTO food;
	protected MobileDTO mobile;
	protected TxDTO tx;
	protected BoardDTO board;
	protected AdminDTO admin;
}
