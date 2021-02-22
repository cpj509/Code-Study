<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<script type="text/javascript">
	function checkForm(){
		var form = document.loginForm;	//폼 변수 설정
		alert("아이디 : " + form.userid.value + "\n" + "패스워드 : " + form.passwd.value);
	}
</script>
<body>
	<form name="loginForm" action="session_process.jsp" method="post">
		<p>
			<label for="id">아이디 : </label>
			<input type="text" name="userid" />
		</p>
		<p>
			<label for="passwd">비밀번호 : </label>
			<input type="text" name="passwd" />
		</p>
		<p><input type="button" value="전송" onclick="checkForm()" /></p>
	</form>
</body>
</html>