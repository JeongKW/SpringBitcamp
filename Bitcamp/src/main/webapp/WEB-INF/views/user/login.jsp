<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<div class="container">
	<table id="index_table">
		<tr>
			<td colspan="5">
				<table id="index_login_box">
					<tr>
						<td><input id="index_input_id" type="text" placeholder="ID"
							name="id" /></td>
						<td rowspan="2"><button id="index_login_btn">로그인</button></td>
					</tr>
					<tr>
						<td><input id="index_input_pw" type="password"
							placeholder="PASSWORD" name="pw" /></td>
					</tr>
				</table>
			</td>
		</tr>
	</table>
</div>
<script>
	$('#index_login_btn').on('click', function() {
		var id = $('#index_input_id').val();
		var pw = $('#index_input_pw').val();
		location.href = "${path.ctx}/login/" + id + "/" + pw;
	});
</script>