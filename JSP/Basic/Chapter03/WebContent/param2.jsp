<%@page import="java.net.URLEncoder"%>
<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Action Tag</title>
</head>
<body>
    <h2>param 액션 태그</h2>
    <jsp:forward page="param2_data.jsp">
        <jsp:param value='<%=URLEncoder.encode("오늘의 날짜와 시간") %>' name="title"/>
        <jsp:param value="<%=Calendar.getInstance().getTime() %>" name="date"/>
    </jsp:forward>
</body>
</html>