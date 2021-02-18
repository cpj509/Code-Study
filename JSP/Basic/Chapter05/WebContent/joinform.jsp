<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>회원 가입</h3>
	<form action="joinProcess.jsp" method="post">
		<p>
			<label for="userid">아이디: </label>
			<input type="text" id="userid" name="userid" />
		</p>
		<p>
			<label for="passwd">패스워드: </label>
			<input type="password" id="passwd" name="passwd" />
		</p>
		<p>
			<label for="name">이름: </label>
			<input type="text" id="name" name="name" />
		</p>
		<p>
			<label for="phone">연락처: </label>
			<input type="text" id="phone1" name="phone1" maxlength="4" size=4 />
			- <input type="text" id="phone2" name="phone2" maxlength="4" size=4 />
			- <input type="text" id="phone3" name="phone3" maxlength="4" size=4 />
		</p>
		<p>
			<label for="sex">성별: </label>
			<input type="radio" id="sex" name="sex" value="남성" checked="checked"/>남성
			<input type="radio" id="sex" name="sex" value="여성"/>여성
		</p>
		<p>
			<label for="hobby">취미: </label>
			<input type="checkbox" id="hobby1" name="hobby" value="독서" checked="checked"/>독서
			<input type="checkbox" id="hobby2" name="hobby" value="운동"/>운동
			<input type="checkbox" id="hobby3" name="hobby" value="영화"/>영화
		</p>
		<p><input type="submit" value="가입하기" /></p>
		<p><input type="reset" value="다시쓰기" /></p>
		<p>
			<textarea name="comment" rows="3" cols="30"></textarea>
		</p>
	</form>
</body>
</html>