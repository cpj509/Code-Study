<%@page import="com.jweb.member.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상세 보기</title>
<link rel="stylesheet" href="resources/css/style.css" />
</head>
<jsp:useBean id="memDAO" class="com.jweb.member.MemberDAO" scope="application"></jsp:useBean>
<%
	String memId = request.getParameter("memberId");
	Member member = memDAO.getOneMember(memId);
%>
<script type="text/javascript">
	function checkForm(){
		var form = document.updateForm;
		var pw1 = form.passwd.value;
		var pw2 = form.passwd_confirm.value;
		if(pw1 != pw2){
			alert("비밀번호를 동일하게 입력 해 주세요.");
			form.passwd_confirm.select();
			return false;
		}
		//form.submit();
	}
</script>
<body>
	<jsp:include page="menu.jsp"></jsp:include>
	<div id="container">
		<div class="title">
			<h1>수정 하기</h1>
		</div>
	</div>
	<form action="updateProcess.jsp?memberId=<%=member.getMemberId() %>" method="post" name="updateForm" onsubmit="return checkForm()">
		<table>
			<tr>
				<td>아이디</td>
				<td><input type="text" name="memberId" value="<%=member.getMemberId() %>" disabled="disabled"/></td>
			</tr>
			<tr>
				<td>비밀번호</td>
				<td><input type="text" name="passwd" value="<%=member.getPasswd() %>"/></td>
			</tr>
			<tr>
				<td>비밀번호 확인</td>
				<td><input type="text" name="passwd_confirm" value="<%=member.getPasswd() %>" placeholder="password confirm"/></td>
			</tr>
			<tr>
				<td>이 름</td>
				<td><input type="text" name="name" value="<%=member.getName() %>"/></td>
			</tr>
			<tr>
				<td>성 별</td>
				<td>
					<%if(member.getGender() == null){ %>
					<input type="radio" name="gender" value="남"/>남
					<input type="radio" name="gender" value="여" />여
					<%} else{%>
					<%if(member.getGender().equals("남")) {%>
					<input type="radio" name="gender" value="남" checked="checked"/>남
					<input type="radio" name="gender" value="여" />여
					<%} else {%>
					<input type="radio" name="gender" value="남" />남
					<input type="radio" name="gender" value="여" checked="checked"/>여
					<%} 
					}%>				
				</td>
			</tr>
			<tr>
				<td>가입일</td>
				<td><input type="text" name="memberId" value="<%=member.getJoinDate() %>" disabled="disabled"/></td>
			</tr>
			<tr>
				<td colspan="2">
					<a href="memberList.jsp"><input type="button" value="목록" /></a>
					<input type="submit" value="저장" />
					<input type="reset" value="취소"/>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>