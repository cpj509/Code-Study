<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <h2>param 액션 태그</h2>
    <jsp:forward page="param_data.jsp">
        <jsp:param value="admin" name="id"/>
        <jsp:param value="1234" name="passwd"/>
    </jsp:forward>
</body>
</html>