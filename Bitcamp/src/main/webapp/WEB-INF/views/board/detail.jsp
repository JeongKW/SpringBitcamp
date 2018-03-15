<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<style>
.col-sm-4 {
	text-align: right
}

.white-popup {
	position: relative;
	background: #FFF;
	padding: 20px;
	width: auto;
	max-width: 500px;
	margin: 20px auto;
}
.upload-img{
	width: auto;
	height: auto;
	max-width: 200px;
	max-height: 200px
}
</style>
<div class="container">
	<h2>
		글 내용<br />
	</h2>
	<br />
	<!-- 글번호, 제목, 작성자, 작성일 -->
	<form id="form-input">
		<div class="form-group">
			<label for="usr">Title</label> <input name="title" type="text"
				class="form-control" id="usr" value="${bbsDetail.title}"><br>
			<c:if test="${uploadImg ne null}">
				<label for="a-popup"><img class="upload-img" src="${path.img}/${uploadImg}"></label><br>
			</c:if>
			<label for="comment">Content</label>
			<textarea name="content" class="form-control" rows="15" id="comment">${bbsDetail.content}</textarea>
		</div>
	</form>
	<div class="row">
		<div class="col-sm-8">
			<a id="a-popup" class="popup-form" href="#test-form"> <span
				class="glyphicon glyphicon-folder-open" aria-hidden="true"></span>
			</a>
		</div>
		<div class="col-sm-4">
			<div class="btn-group">
				<a id="modify-btn" href="#" class="btn btn-success">수정</a> <a
					id="list-btn" href="#" class="btn btn-danger">목록</a>
			</div>
		</div>
	</div>
</div>

<div class="container white-popup">
	<form id="test-form" action="${path.ctx}/board/fileupload/${bbsDetail}"
		class="white-popup mfp-hide" method="post"
		enctype="multipart/form-data">
		<div class="row">
			<div class="text-center">
				<h4 style="color: purple; font-size: 40px">File Upload</h4>
			</div>
			<div class="text-center">
				<span class="glyphicon glyphicon-sort fa-5x"
					style="font-size: 20px;"></span>
			</div>
			<br />
		</div>
		<div class="row" style="padding-left: 40px; padding-right: 40px">
			<div class="form-group">
				<input type="file" name="file" class=""
					style="border: 1px solid gray; width: 100%"><br>
			</div>
		</div>
		<div class="row">
			<div class="btn-group pull-right" style="margin-right: 40px">
				<input class="btn btn-danger" type="reset" value="취소"> <input
					class="btn btn-primary" type="submit" value="확인">
			</div>
		</div>
	</form>
</div>

<script>
	$(document).ready(function() {
		$('.popup-form').magnificPopup({
			type : 'inline',
			preloader : false,
			focus : '#name',

			callbacks : {
				beforeOpen : function() {
					if ($(window).width() < 700) {
						this.st.focus = false;
					} else {
						this.st.focus = '#name';
					}
				}
			}
		});
	});
</script>