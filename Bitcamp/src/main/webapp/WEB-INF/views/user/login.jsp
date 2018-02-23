<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>Home</title>
	<script src="${js}/jquery-3.3.1.min.js"></script>
</head>
<body>
<div id="wrapper">
<header id="index_header">
	<h1>BIT CAMP SAMPLE PROJECT</h1>
</header>
	<section>
		<article>
			<table id="index_table">
				<tr>
					<td colspan="5">
						
							<table id="index_login_box">
								<tr>
									<td><input id="index_input_id" type="text" placeholder="ID" name="id" /></td>
									<td rowspan="2"><button id="index_login_btn">로그인</button></td>
								</tr>
								<tr>
									<td>
									<input id="index_input_pw" type="password" placeholder="PASSWORD" name="pw" />
									<input type="hidden" name="cmd" value="login"/>
									<input type="hidden" name="page" value="mypage"/>
									</td>
								</tr>
							</table>
						
						<a id="go_admin_link" href="#">관리자모드</a>
						<a id="go_join_link" href="#">회원가입</a>
						<a id="go_jdbc_link" href="#">JDBC Test</a>
					</td>
				</tr>
			</table>
		</article>
	</section>
</div>
</body>
<script>
	$('#index_login_btn').on('click', function(){
		location.href = "${context}/mypage";
	});
</script>
</html>