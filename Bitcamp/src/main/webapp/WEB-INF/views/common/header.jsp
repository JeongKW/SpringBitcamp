<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<link rel="stylesheet" href="${path.css}/style.css" />
<style>
.navbar-brand {
	padding: 0px;
	margin-right: 40px;
}

#img_logo {
	margin-left: 10px;
	height: 100%;
}
</style>
<nav class="navbar navbar-inverse navbar-fixed-top">
	<div class="container-fluid">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle collapsed"
				data-toggle="collapse" data-target="#navbar" aria-expanded="false"
				aria-controls="navbar">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="#"> <img id="img_logo"
				src="${path.img}/common/Logo.jpg" alt="" />
			</a>
		</div>
		<div id="navbar" class="collapse navbar-collapse">
			<ul class="nav navbar-nav">
				<li><a id="home" href="#"> <span
						class="glyphicon glyphicon-home" aria-hidden="true">&nbsp;HOME
					</span>
				</a></li>
				<!--  HOME END -->
				<li><a id="about" href="#"> <span
						class="glyphicon glyphicon-envelope" aria-hidden="true">&nbsp;MAIL
					</span>
				</a></li>
				<!-- MAIL END -->
				<li><a id="a-login" href="#"> <span
						class="glyphicon glyphicon-user" aria-hidden="true">&nbsp;LOGIN
					</span>
				</a></li>
				<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown" role="button" aria-haspopup="true"
					aria-expanded="false">유틸리티<span class="caret"></span>
				</a>
					<ul id="ul-util">
						<li><a>로또</a></li>
						<li><a>햄버거주문</a></li>
					</ul></li>
			</ul>
		</div>
	</div>
	<!--/.nav-collapse -->
	<!-- LOGIN END -->
</nav>
<script>
	$('#a-login').on('click', function() {
		location.href = "${path.ctx}/login";
	});
	var $ulUtil = $("#ul-util");
	$ulUtil.addClass("dropdown-menu");
	$('.dropdown-menu a').eq(0).on('click', function() {
		location.href = "${path.ctx}/lotto";
	})
	$('.dropdown-menu a').eq(1).on('click', function() {
		location.href = "${path.ctx}/burgerking";
	})
</script>
