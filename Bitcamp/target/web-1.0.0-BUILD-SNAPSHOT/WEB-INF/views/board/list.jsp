<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div class="container">
	총 게시글 수 : ${bbsCount}
	<a class="btn btn-default pull-right" id="write-a">글쓰기</a><br />
	<table class="table table-striped">
		<tr>
			<th>글번호</th>
			<th>제목</th>
			<th>작성자</th>
			<th>작성일</th>
		</tr>
		<c:choose>
			<c:when test="${bbsList ne null}">
				<c:forEach var="bbs" items="${bbsList}" varStatus="bbsno">
					<tr>
						<td>${bbsno.count}</td>
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
		<ul class="pagination">
			<!-- <li><a href="#" aria-label="Previous"> <span
					aria-hidden="true">&laquo;</span>
			</a></li> -->
			<c:forEach begin="1" end="${bbsPage}" step="1" varStatus="i">
				<li><a href="#">${i.index}</a></li>
			</c:forEach>
			<!-- <li><a href="#" aria-label="Next"> <span aria-hidden="true">&raquo;</span>
			</a></li> -->
		</ul>
	</div>
</div>
<script>
	$('#write-a').on('click', function() {
		app.move("board/write");
	});
</script>