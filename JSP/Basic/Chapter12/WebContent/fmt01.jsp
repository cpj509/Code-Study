<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>format 태그</title>
</head>
<body>
	<p>숫자 : <fmt:formatNumber value="123456"/></p>
	<p><fmt:formatNumber value="123456" type="number"/></p>
	<p><fmt:formatNumber value="123456" groupingUsed="false"/></p>
	<p><fmt:formatNumber value="123456" groupingUsed="true"/></p>
	
	<p>통화 : <fmt:formatNumber value="123456" type="currency"/></p>
	<p><fmt:formatNumber value="123456" type="currency" currencySymbol="$"/></p>
	
	<p>백분율 : <fmt:formatNumber value="0.25" type="percent"/></p>
	<p>소수 자리 수 설정 : <fmt:formatNumber pattern="#,##0.0" value="1234.567"/></p>
	
	

</body>
</html>