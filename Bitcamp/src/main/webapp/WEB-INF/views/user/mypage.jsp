<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>Home</title>
	<script src="${js}/jquery-3.3.1.min.js"></script>
</head>
<body>
<div id="wrapper">
	<section>
		<table id="bitcamp_profile">
			<tr>
				<td id="profile_photo" rowspan="5"><img id="profile_img" src="" alt="" /></td>
				<td class="profile_attr">ID</td>
				<td class="profile_info"></td>
				<td class="profile_attr">생년월일</td>
				<td class="profile_info">
					
					
				</td>
			</tr>
			<tr>
				<td class="profile_attr">PW</td>
				<td class="profile_info"></td>
				<td class="profile_attr">h.p</td>
				<td class="profile_info"></td>
			</tr>
			<tr>
				<td class="profile_attr">이름</td>
				<td class="profile_info"></td>
				<td class="profile_attr">이메일</td>
				<td class="profile_info"></td>
			</tr>
			<tr>
				<td class="profile_attr">성별</td>
				<td class="profile_info">
				
				</td>
				<td class="profile_attr">주소</td>
				<td class="profile_info"></td>
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
		<button id="nav_move">이 동</button>
	</section>
</div>
</body>
<script>
	$('#nav_move').on('click', function(){
		location.href = "${context}/nav";
	});
</script>
</html>