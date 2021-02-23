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
		var id = form.userid.value;
		var pwd = form.passwd.value;
		
		var regExPwd = /^[0-9]*$/;	//숫자만 가능
		
		if(id == ""){
			alert("아이디를 입력해주세요.");
			form.userid.focus();
			return false;
		}else if(pwd == ""){
			alert("비밀번호를 입력해주세요.");
			form.passwd.focus();
			return false;
		}else if(!regExPwd.test(pwd)){
			alert("비밀번호는 숫자만 입력 가능합니다.");
			form.userid.fouce();
			return false;
		}
		else if(isNan(pwd)){
			alert("비밀번호는 숫자만 입력 가능합니다.");
			form.userid.fouce();
			return false;
		}
			
		
		
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