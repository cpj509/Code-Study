<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page errorPage="errorPrint2.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Exception 예제</title>
</head>
<body>
	name 파라미터 : <%=request.getParameter("name").toString() %>

</body>
</html>