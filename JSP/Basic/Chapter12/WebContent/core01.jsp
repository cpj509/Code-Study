<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Core 예제</title>
</head>
<body>
	<!-- 변수 설정 -->
	<c:set var="num" value="13"></c:set>
	<c:if test="${num % 2 == 0 }">
		${num }: 짝수입니다.
	</c:if>
	<c:if test="${num % 2 != 0 }">
		${num }: 홀수입니다.
	</c:if>

</body>
</html>