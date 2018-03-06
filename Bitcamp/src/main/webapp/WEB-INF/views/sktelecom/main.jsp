<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<div class="container">
		<h2>통신사 개통 홈페이지</h2>
		<p>통신사, 모델을 결정해주세요</p>
		<form>
			<div class="form-group">
				<label for="sel1">통신사 리스트 (하나만 골라주세요):</label> <select
					class="form-control" id="telecom">
					<option value="SKT">SKT</option>
					<option value="KT">KT</option>
					<option value="LGU+">LGU+</option>
				</select><br>
				<label for="sel2">모델 리스트 (하나만 골라주세요):</label> <select
					class="form-control" id="model">
					<option value="Galaxy">Galaxy</option>
					<option value="iPhone">iPhone</option>
					<option value="G6">G6</option>
				</select>
			</div>
		</form>
		<button id="skt_create_btn">개통</button>
	</div>
<script>
	$('#skt_create_btn').on('click', function(){
		var telecom = $('#telecom').val();
		var model = $('#model').val();
		location.href = "${path.ctx}/mobile/"+telecom+"/"+model;
	});
</script>
</html>
