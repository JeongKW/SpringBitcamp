<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<button id="btn">버튼</button>
<script>
	$('#btn').on('click', function(){
		location.href = "${context}/login";
	});
</script>
