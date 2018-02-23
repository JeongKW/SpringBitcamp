<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>Home</title>
	<script src="${js}/jquery-3.3.1.min.js"></script>
</head>
<body>
<nav id="nav">
	<ul>
		<li><a id="burgerking" href="#">버거킹</a></li>
		<li><a id="kakao" href="#">카카오뱅크</a></li>
		<li><a id="bitcamp" href="#">비트캠프</a></li>
		<li><a id="sktelecom" href="#">SKT</a></li>
		<li><a id="lotto" href="#">로또</a></li>
		<li><a id="mypage" href="#">마이페이지</a></li>
		<li><a id="logout" href="#">로그아웃</a></li>
	</ul>
</nav>
</body>
<script>
	$('#burgerking').on('click', function(){
		location.href = "${context}/burgerking";
	});
	$('#kakao').on('click', function(){
		location.href = "${context}/kakao";
	});
	$('#bitcamp').on('click', function(){
		location.href = "${context}/bitcamp";
	});
	$('#sktelecom').on('click', function(){
		location.href = "${context}/mobile";
	});
	$('#lotto').on('click', function(){
		location.href = "${context}/lotto";
	});
	$('#mypage').on('click', function(){
		location.href = "${context}/mypage";
	});
</script>
</html>