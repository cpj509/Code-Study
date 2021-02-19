<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	#container{
		width: 80%;
		margin: 0 auto;
		text-align: center;
	}
</style>
</head>
<body>
	<div id="container">
	<h2>로그인</h2>
	<hr />
		<form action="selProduct.jsp" method="post">
			<p>
				<input type="text" name="username" />
				<input type="submit" value="로그인" />
			</p>
		</form>
	</div>
</body>
</html>