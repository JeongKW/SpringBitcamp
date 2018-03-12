<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!--  -->
<section>
	<article>
			구매 금액 : <input id="money" type="text" name="money" value="${money}" />
			<button id="start_btn">게임시작</button>
	</article>
	<article>
		<div style="height: 40px; width: 300px;">
			<table>
				<tr>
					<th>No.</th>
					<th>로또번호</th>
				</tr>
				<c:forEach var="i" items="${lottos}" step="1" varStatus="status">
				<tr>
					<td>${status.count}</td>
					<td>${i.lottoNumber}</td>
				</tr>
				</c:forEach>
			</table>
		</div>
	</article>
</section>
<script>
	$('#start_btn').on('click', function(){
		var money = $('#money').val();
		location.href = "${path.ctx}/lotto/"+money;
	});
</script>
