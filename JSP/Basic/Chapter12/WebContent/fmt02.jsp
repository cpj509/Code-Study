<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<jsp:useBean id="now" class="java.util.Date"></jsp:useBean>
<body>
<h2>날짜를 다양한 형식으로 표기하기</h2>
<p>현재 날짜 및 시간 : ${now }</p>
<p>날짜 : <fmt:formatDate value="${now }" type="date"/> </p>
<p>시간 : <fmt:formatDate value="${now }" type="time"/> </p>
<p>시간 : <fmt:formatDate value="${now }" pattern="yyyy/MM/dd"/> </p>

<p>==타임존==</p>	
<p><fmt:timeZone value="Europe/London">런던 : <fmt:formatDate value="${now }" type="both"/> </fmt:timeZone> </p>
<p><fmt:timeZone value="America/New_York">뉴욕 : <fmt:formatDate value="${now }" type="both"/> </fmt:timeZone> </p>

</body>
</html>