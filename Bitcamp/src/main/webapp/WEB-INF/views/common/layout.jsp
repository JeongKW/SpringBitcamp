<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<!doctype html>
<html lang="ko">
<head>
   <meta charset="utf-8" />
   <meta http-equiv="X-UA-Compatible" content="IE=edge">
   <meta name="viewport" content="width=device-width, initial-scale=1">
   <title>Home</title>
   <script src="${path.js}/jquery-3.3.1.min.js"></script>
   <script src="${path.js}/bootstrap.js"></script>
   <link rel="stylesheet" href="${path.css}/bootstrap.css" />
   <link rel="stylesheet" href="${path.css}/bootstrap-theme.css" />
   <link rel="stylesheet" href="${path.css}/style.css" />
</head>
<body>
   <header>
      <div id="header">
       <tiles:insertAttribute name="header"/>
      </div>
   </header>
   <section >
      <article id="content">
         <tiles:insertAttribute name="content"/>
      </article>
      
   </section>
   <footer>
      <div style="margin-bottom: 20px">
         <tiles:insertAttribute name="footer"/>    
      </div>
   </footer>
</body>
 
</html>