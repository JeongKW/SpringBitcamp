<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<style>
	.col-sm-4{
		text-align: right
	}
</style>
<div class="container">
	<h2>글쓰기<br/>
	<small>Title(제목), Content(내용)을 완성하시고 전송을 눌러주세요.</small>
	</h2><br/>
	<!-- 글번호, 제목, 작성자, 작성일 -->
	<form id="form-input">
		<div class="form-group">
			<label for="usr">Title</label> <input name="title" type="text"
				class="form-control" id="usr"><br/> <label for="comment">Content</label>
			<textarea name="content" class="form-control" rows="15"
				id="comment"></textarea>
		</div>
	</form>
	<div class="row">
		<div class="col-sm-8"></div>
		<div class="col-sm-4">
			<div class="btn-group">
				<a id="submit-btn" href="#" class="btn btn-success">전송</a> <a
					id="cancel-btn" href="#" class="btn btn-danger">취소</a>
			</div>
		</div>
	</div>
</div>
<script>
	$('#submit-btn').on('click', function(){
		$('#form-input').attr('action', '${path.ctx}/board/add').attr('method', 'post').submit();
	});
	$('#cancel-btn').on('click', function(){
		app.move("board/list");
	});
</script>
