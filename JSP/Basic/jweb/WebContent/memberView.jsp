<%@page import="com.jweb.member.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상세 보기</title>
<link rel="stylesheet" href="resources/css/style.css" />
</head>
<body>
	<jsp:include page="menu.jsp"></jsp:include>
	<div id="container">
		<div class="title">
			<h1>상세 보기</h1>
		</div>
	</div>
	<form action="memberUpdate.do?memberId=${member.memberId }" method="post">
		<table>
			<tr>
				<td>아이디</td>
				<td><input type="text" name="memberId" value="${member.memberId }" disabled="disabled"/></td>
			</tr>
			<tr>
				<td>비밀번호</td>
				<td><input type="text" name="passwd" value="${member.passwd }" disabled="disabled"/></td>
			</tr>
			<tr>
				<td>비밀번호 확인</td>
				<td><input type="text" name="passwd_confirm" disabled="disabled"/></td>
			</tr>
			<tr>
				<td>이 름</td>
				<td><input type="text" name="name" value="${member.name }" disabled="disabled"/></td>
			</tr>
			<tr>
				<td>성 별</td>
				<td>
					<c:if test="">
					<input type="radio" name="gender" value="남" checked="checked" disabled="disabled"/>남
					<input type="radio" name="gender" value="여" disabled="disabled"/>여
					</c:if>
					<c:if test="">
					<input type="radio" name="gender" value="남" disabled="disabled"/>남
					<input type="radio" name="gender" value="여" checked="checked" disabled="disabled"/>여
					</c:if>		
				</td>
			</tr>
			<tr>
				<td>가입일</td>
				<td><input type="text" name="memberId" value="${member.joinDate }" disabled="disabled"/></td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="button" value="수정" onclick="checkForm()"/>
					<a onclick="return confirm('정말로 탈퇴하시겠습니까?')" href="memberDelete.do?memberId=${member.memberId }"><input type="button" value="탈퇴"/></a>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>