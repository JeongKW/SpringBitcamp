package com.bitcamp.web.adapter;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class PageAdapter {
	int nowPage, totalCount, totalPage, pageSize, blockSize, startRow, endRow, pageStart, pageEnd, blockPrev, blockNext;
	List<?> list;
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = ((totalCount % pageSize) == 0) ? totalCount/pageSize : totalCount/pageSize + 1;
	}
	public int getNowPage() {
		return nowPage;
	}
	public int getBlockPrev() {
		return blockPrev;
	}
	public void setBlockPrev(int blockPrev) {
		this.blockPrev = (pageStart - 1) < 1 ? 1 : pageStart - 1;
	}
	public int getBlockNext() {
		return blockNext;
	}
	public void setBlockNext(int blockNext) {
		this.blockNext = (pageEnd + 1) > totalPage ? totalPage : pageEnd + 1;
	}
	public void setNowPage(int nowPage) {
		this.nowPage = nowPage;
	}
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = list.size();
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getBlockSize() {
		return blockSize;
	}
	public void setBlockSize(int blockSize) {
		this.blockSize = blockSize;
	}
	public int getStartRow() {
		return startRow;
	}
	public void setStartRow(int startRow) {
		this.startRow = (nowPage - 1) * pageSize;
	}
	public int getEndRow() {
		return endRow;
	}
	public void setEndRow(int endRow) {
		this.endRow = nowPage * pageSize - 1;
	}
	public int getPageStart() {
		return pageStart;
	}
	public void setPageStart(int pageStart) {
		this.pageStart = ((nowPage - 1) / blockSize) * blockSize + 1;
	}
	public int getPageEnd() {
		return pageEnd;
	}
	public void setPageEnd(int pageEnd) {
		this.pageEnd = (pageStart + blockSize - 1) > totalPage ? totalPage : pageStart + blockSize - 1;
	}
	public List<?> getList() {
		return list;
	}
	public void setList(List<?> list) {
		this.list = list;
		setTotalCount(0);
		setTotalPage(0);
		setStartRow(0);
		setEndRow(0);
		setPageStart(0);
		setPageEnd(0);
		setBlockPrev(0);
		setBlockNext(0);
	}
}
