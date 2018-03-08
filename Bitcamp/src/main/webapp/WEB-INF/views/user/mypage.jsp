<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<div class="container">
	<div class="row">
		<table id="bitcamp_profile">
			<tr>
				<td id="profile_photo" rowspan="5"><img id="profile_img"
					src="${path.img}/default_profile.jpg" alt="" /></td>
				<td class="profile_attr">ID</td>
				<td class="profile_info">${user.id}</td>
				<td class="profile_attr">생년월일</td>
				<td class="profile_info"></td>
			</tr>
			<tr>
				<td class="profile_attr">PW</td>
				<td class="profile_info"></td>
				<td class="profile_attr">h.p</td>
				<td class="profile_info">
					<a id="mobile_btn" href="#">개통하러가기</a>
					${tx.phoneNumber}
				</td>
			</tr>
			<tr>
				<td class="profile_attr">이름</td>
				<td class="profile_info">${user.name}</td>
				<td class="profile_attr">이메일</td>
				<td class="profile_info">${user.email}</td>
			</tr>
			<tr>
				<td class="profile_attr">성별</td>
				<td class="profile_info"></td>
				<td class="profile_attr">주소</td>
				<td class="profile_info">${user.addr}</td>
			</tr>
			<tr>
				<td class="profile_attr">계좌번호</td>
				<td class="profile_info"></td>
				<td class="profile_attr"></td>
				<td class="profile_info"></td>
			</tr>
		</table>
		<button id="mypage_ch">수 정</button>
		<button id="mypage_rm">탈 퇴</button>
		<button id="mypage_test">테스트</button>
	</div>
</div>
<script>
	$('#mobile_btn').on('click', function() {
		location.href = "${path.ctx}/mobile/page";
	});
</script>
