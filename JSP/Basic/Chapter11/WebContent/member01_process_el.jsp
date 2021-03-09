<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%request.setCharacterEncoding("utf-8"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 가입 처리</title>
<style>
	#container{
		width: 100%;
		margin: 0 auto;
		text-align: center;
	}
	table{
		width: 400px;
		margin: 0 auto;
	}
	table, td{
		border: 1px solid #ccc;
		border-collapse: collapse;
		padding: 10px;
	}
	
</style>
</head>
<body>
	<div id="container">
		<h2>회원 정보</h2>
		<hr />
		<table>
			<tr>
				<td>아이디</td>
				<td>비밀번호</td>
				<td>이름</td>
			</tr>
			<tr>
				<td>${param.id}</td>
				<%-- <td><%=request.getParameter("id") %></td> --%>
				<td>${param.passwd}</td>
				<%-- <td><%=request.getParameter("passwd") %></td> --%>
				<td>${param.name}</td>
				<%-- <td><%=request.getParameter("name") %></td> --%>
			</tr>
		</table>
	</div>
</body>
</html>