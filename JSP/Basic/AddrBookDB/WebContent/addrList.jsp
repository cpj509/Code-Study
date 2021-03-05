<%@page import="com.beans.AddrBook"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/address.css" />
</head>
<body>
<jsp:useBean id="abDAO" class="com.beans.AddrBookDAO" scope="application"></jsp:useBean>
<%
	String sessionId = null;
if(session.getAttribute("sessionId") != null){
	sessionId = (String)session.getAttribute("sessionId");
}else{
	out.println("<script>");
	out.println("alert('로그인이 필요합니다.')");
	out.println("location.href='loginForm.jsp'");	//로그인 페이지로 돌아감
	out.println("</script>");
}
%>
	<div id="container">
		<h2>주소 목록</h2>
		<p><a href="logout.jsp">[로그 아웃]</a></p>
		<table>
			<tr>
				<td>번호</td>
				<td>이름</td>
				<td>성별</td>
				<td>가입일</td>
				<td>회원보기</td>
			</tr>
			<%
				for(int i = 0; i < abDAO.getListAll().size(); i++){
					AddrBook addrBook = abDAO.getListAll().get(i);
			%>
			<tr>
				<td><%=addrBook.getNum() %></td>
				<td><%=addrBook.getUsername() %></td>
				<td><%=addrBook.getGender() %></td>
				<td><%=addrBook.getJoinDate() %></td>
				<td><a href="addrView.jsp?num=<%=addrBook.getNum()%>">
				<input type="button" value="보기"/></a></td>
			</tr>
			<%
				}
			%>
		</table>
	</div>
</body>
</html>