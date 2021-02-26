<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<script type="text/javascript">
	function checkForm() {
		var form = document.loginForm;
		var id = form.userid.value;
		var pwd = form.passwd.value;
		
		if(id == ""){
			alert("아이디를 입력 해 주세요.");
			form.userid.focus();
			return false;
		}
		if(pwd == ""){
			alert("비밀번호를 입력 해 주세요.");
			form.passwd.focus();
			return false;
		}
	}
</script>
<body>
	<form name="loginForm" action="login_process.jsp" method="post" 
	onsubmit="return checkForm()">
		<p>
			<label for="id">아이디 : </label>
			<input type="text" name="userid" />
		</p>
		<p>
			<label for="passwd">비밀번호 : </label>
			<input type="text" name="passwd" />
		</p>
		<p><input type="submit" value="전송" /></p>
	</form>
</body>
</html>