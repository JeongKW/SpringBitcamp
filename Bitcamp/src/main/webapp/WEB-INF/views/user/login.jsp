<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<style>
.wrapper {
	margin-top: 120px;
	margin-bottom: 80px;
}

.form-signin {
	max-width: 380px;
	padding: 15px 35px 45px;
	margin: 0 auto;
	background-color: #fff;
	border: 1px solid rgba(0, 0, 0, 0.1);
	.
	form-signin-heading
	,
	.checkbox
	{
	margin-bottom
	:
	30px;
}

.checkbox {
	font-weight: normal;
}

.form-control {
	position: relative;
	font-size: 16px;
	height: auto;
	padding: 10px;
	@
	include
	box-sizing(border-box);
	&:
	focus
	{
	z-index
	:
	2;
}

}
input[type="text"] {
	margin-bottom: -1px;
	border-bottom-left-radius: 0;
	border-bottom-right-radius: 0;
}

input[type="password"] {
	margin-bottom: 20px;
	border-top-left-radius: 0;
	border-top-right-radius: 0;
}
}
</style>
<div class="container">
	<div class="wrapper">
		<div class="form-signin">
			<h2 class="form-signin-heading">Login Please</h2>
			<input id="index_input_id" type="text" class="form-control"
				name="username" placeholder="ID" /> <input id="index_input_pw"
				type="password" class="form-control" name="password"
				placeholder="PW" /> <label class="checkbox"> <input
				type="checkbox" value="remember-me" id="rememberMe"
				name="rememberMe"> Remember me
			</label>
			<button id="index_login_btn" class="btn btn-lg btn-primary btn-block">Login</button>
		</div>
	</div>
</div>
<script>
	$('#index_login_btn').on('click', function() {
		var id = $('#index_input_id').val();
		var pw = $('#index_input_pw').val();
		location.href = "${path.ctx}/login/" + id + "/" + pw;
	});
</script>