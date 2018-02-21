<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>Home</title>
	<script src="${js}/jquery-3.3.1.min.js"></script>
</head>
<body>
<h1>
	Hello world!  
</h1>
<button id="btn">버튼</button>
</body>
<script>
	$('#btn').on('click', function(){
		alert('제이쿼리가 작동한다 !!');
	});
</script>
</html>
