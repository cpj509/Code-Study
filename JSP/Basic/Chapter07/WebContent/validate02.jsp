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
		//아이디나 비밀번호가 공백일 경우 검사
		if(form.userid.value == ""){
			alert("아이디를 입력 해 주세요.");
			form.userid.focus();	//커서를 입력 상자로 이동
			return false;
		}else if(form.passwd.value == ""){
			alert("비밀번호를 입력 해 주세요.");
			form.passwd.focus();
			return false;
		}
		form.submit();	//전송 메서드
	}
</script>
<body>
	<form name="loginForm" action="validate02_process.jsp" method="post">
		<p>
			<label for="id">아이디 : </label>
			<input type="text" name="userid" id="userid" />
		</p>
		<p>
			<label for="passwd">비밀번호 : </label>
			<input type="text" name="passwd" id="passwd" />
		</p>
		<p><input type="button" value="전송" onclick="checkForm()" /></p>
	</form>
</body>
</html>