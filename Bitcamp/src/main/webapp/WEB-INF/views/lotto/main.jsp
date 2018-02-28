<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<section>
	<article>
			구매 금액 : <input id="money" type="text" name="money" placeholder="게임당 1000원 최대 5게임" />
			<button id="start_btn">게임시작</button>
	</article>
	<article>
		
	</article>
</section>
<script>
	$('#start_btn').on('click', function(){
		var money = $('#money').val();
		location.href = "${path.ctx}/lotto/"+money;
	});
</script>
