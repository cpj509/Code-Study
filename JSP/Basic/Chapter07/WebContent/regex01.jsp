<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form name="Member" action="joinProcess.jsp" method="post">
		<p>
			<label for="id">아이디 : </label>
			<input type="text" name="userid" />
		</p>
		<p>
			<label for="passwd">비밀번호 : </label>
			<input type="text" name="passwd" />
		</p>
		<p>
			<label for="name">이름 : </label>
			<input type="text" name="name" />
		</p>
		<p>
			<label for="phone">연락처 : </label>
			<select name="phone1">
				<option value="010">010</option>
				<option value="011">011</option>
				<option value="016">016</option>
				<option value="019">019</option>
			</select>
			- <input type="text" maxlength="4" size="4" name="phone2" />
			- <input type="text" maxlength="4" size="4" name="phone3" />
		</p>
		<p><input type="button" value="가입하기" onclick="checkMember()" /></p>
	</form>
	
	<script type="text/javascript" src="js/regex.js"></script>
</body>
</html>