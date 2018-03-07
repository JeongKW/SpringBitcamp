<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	<div class="container">
		<h2>통신사 개통 홈페이지</h2>
		<p>통신사, 모델을 결정해주세요</p>
		<form id="open_form">
			<div class="form-group">
				<label for="sel1">통신사 리스트 (하나만 골라주세요):</label> <select
					class="form-control" name="telecom" id="telecom">
					<option value="SKT">SKT</option>
					<option value="KT">KT</option>
					<option value="LGU+">LGU+</option>
				</select><br>
				<label for="sel2">모델 리스트 (하나만 골라주세요):</label> <select
					class="form-control" name="seq" id="seq">
					<c:forEach items="${phones}" var="phone">
						<option value="${phone.seq}">${phone.model}</option>
					</c:forEach>
				</select>
			</div>
		</form>
		<button id="open_btn">개통</button>
	</div>
<script>
	$('#open_btn').on('click', function(){
		$('#open_form').attr('action', '${path.ctx}/phone/open').attr('method', 'post').submit();
	});
</script>
</html>
