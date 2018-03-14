<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<style>
.col-sm-4 {
	text-align: right
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
				class="form-control" id="usr" value="${bbsDetail.title}"><br />
			<label for="comment">Content</label>
			<textarea name="content" class="form-control" rows="15" id="comment">${bbsDetail.content}</textarea>
		</div>
	</form>
	<div class="row">
		<div class="col-sm-8">
			<a id="file-upload" href="#"> <span
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
<script>
	$('#file-upload').on('click', function() {
		app.move("board/fileupload");
	});
</script>