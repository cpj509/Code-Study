<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function validCheck() {
		var form = document.loginForm;
		
		if(form.userid.value == ""){
			alert("아이디를 입력해주세요.");
			form.userid.focus();
			return false;
		}else if(form.passwd.value == ""){
			alert("비밀번호를 입력해주세요.");
			form.passwd.focus();
			return false;
		}
		
		/* if(form.passwd.value.includes(form.userid.value)){
			alert("비밀번호는 ID를 포함할 수 없습니다.");
			form.passwd.focus();
			return false;
		} */
		form.submit();
		
	}
</script>
</head>
<body>
	<form name="loginForm" action="validation_process.jsp" method="post">
		<p>
			<label for="id">아이디 : </label>
			<input type="text" name="userid" />
		</p>
		<p>
			<label for="passwd">비밀번호 : </label>
			<input type="text" name="passwd" />
		</p>
		<p><input type="button" value="전송" onclick="validCheck()" /></p>
	</form>
</body>
</html>