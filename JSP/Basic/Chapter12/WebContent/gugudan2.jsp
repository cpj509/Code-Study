<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>구구단</title>
</head>
<body>
	<h2>구구단</h2>
	<table>
		<c:forEach var="i" begin="2" end="9" step="2">	<!-- step은 i + step의 값 -->
		<tr>
			<c:forEach var="j" begin="1" end="9">
				<td>${i } x ${j } = ${i * j }</td>
			</c:forEach>
		</tr>
		</c:forEach>
	</table>
</body>
</html>