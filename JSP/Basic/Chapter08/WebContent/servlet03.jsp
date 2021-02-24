<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>수강 신청</h2>
	<form action="register" method="post">
		<p>아이디 : <input type="text" name="userid" /></p>
		<p>비밀번호 : <input type="password" name="passwd" /></p>
		<p>
			<input type="checkbox" name="subject" value="java" />Java
			<input type="checkbox" name="subject" value="jsp" />JSP
			<input type="checkbox" name="subject" value="spring" />Spring
			<input type="checkbox" name="subject" value="android" />Android
		</p>
		<p>
			<input type="submit" value="신청"/>
			<input type="reset" value="취소" />
		</p>
	</form>
</body>
</html>