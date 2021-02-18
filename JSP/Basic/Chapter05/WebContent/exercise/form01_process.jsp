<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		request.setCharacterEncoding("utf-8");
	
		String name = request.getParameter("name");
		String address = request.getParameter("address");
		String mail = request.getParameter("mail");
	%>
	
	<p>이름 : <%=name %></p>
	<p>주소 : <%=address %></p>
	<p>이메일 : <%=mail %></p>

</body>
</html>