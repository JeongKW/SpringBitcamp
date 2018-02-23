<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<!doctype html>
<html lang="ko">
<head>
	<meta charset="utf-8" />
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
	<title>Home</title>
	<script src="${js}/jquery-3.3.1.min.js"></script>
	<script src="${js}/bootstrap.js"></script>
	<link rel="stylesheet" href="${css}/bootstrap.css" />
	<link rel="stylesheet" href="${css}/bootstrap-theme.css" />
</head>
<body>
    <nav class="navbar navbar-inverse navbar-fixed-top">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="#">Project name</a>
        </div>
        <div id="navbar" class="collapse navbar-collapse">
          <ul class="nav navbar-nav">
            <li class="active"><a href="#">Home</a></li>
            <li><a href="#about">About</a></li>
            <li><a href="#contact">Contact</a></li>
          </ul>
        </div><!--/.nav-collapse -->
      </div>
    </nav>
	<header>
		<div id="header">
			<tiles:insertAttribute name="header"/>
		</div>
	</header>
	<section>
		<article id="content">
			<tiles:insertAttribute name="content"/>
		</article>
	</section>
	<footer id="footer">
		<tiles:insertAttribute name="footer"/>
	</footer>
	레이아웃
</body>
</html>