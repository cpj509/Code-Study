<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="form01_process.jsp" method="post">
		<p>
			<label for="name">이름: </label>
			<input type="text" id="name" name="name" />
		</p>
		<p>
			<label for="address">주소: </label>
			<input type="text" id="address" name="address" />
		</p>
		<p>
			<label for="mail">이메일: </label>
			<input type="email" id="mail" name="mail" />
		</p>
		<p><input type="submit" value="전송" /></p>
	</form>
</body>
</html>