<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div class="container">
	총 게시글 수 : ${page.totalCount}
	<a class="btn btn-default pull-right" id="write-a">글쓰기</a><br />
	<table class="table table-striped">
		<tr>
			<th>글번호</th>
			<th>제목</th>
			<th>작성자</th>
			<th>작성일</th>
		</tr>
		<c:choose>
			<c:when test="${list ne null}">
				<c:forEach var="bbs" items="${list}">
					<tr>
						<td>${bbs.boardSeq}</td>
						<td><a href="#" onclick="app.boardDetail(${bbs.boardSeq}); return false;">${bbs.title}</a></td>
						<td>${bbs.id}</td>
						<td>${bbs.regdate}</td>
					</tr>
				</c:forEach>
			</c:when>
			<c:otherwise>
				<tr>
					<td class="text-center" colspan="4">게시글이 없습니다</td>
				</tr>
			</c:otherwise>
		</c:choose>
	</table>
	<div class="text-center">
		<ul id="page-util" class="pagination">
			<c:if test="${page.blockPrev}">
				<li><a href="#" onclick="app.boardList(${page.pageStart-1}); return false;" aria-label="Previous"> <span
					aria-hidden="true">&laquo;</span>
				</a></li>
			</c:if>
			<c:forEach begin="${page.pageStart}" end="${page.pageEnd}" step="1" varStatus="i">
				<c:choose>
					<c:when test="${page.nowPage eq i.index}">
						<li class="active"><a href="#" onclick="app.boardList(${i.index}); return false;">${i.index}</a></li>
					</c:when>
					<c:otherwise>
						<li><a href="#" onclick="app.boardList(${i.index}); return false;">${i.index}</a></li>
					</c:otherwise>
				</c:choose>
			</c:forEach>
			<c:if test="${page.blockNext}">
				<li><a href="#" onclick="app.boardList(${page.pageEnd+1}); return false;" aria-label="Next"> <span aria-hidden="true">&raquo;</span>
				</a></li>
			</c:if>
		</ul>
	</div>
</div>
<script>
	$('#write-a').on('click', function() {
		app.move("board/write");
	});
</script>