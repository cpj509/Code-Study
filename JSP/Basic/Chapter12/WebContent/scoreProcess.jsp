<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Core 예제 - 학점 처리</title>
</head>
<body>
	<!-- 변수 설정 -->
	<c:set var="score" value="${param.score}"></c:set>
	<h2>시험 점수 : ${score }</h2>
	<c:choose>
		<c:when test="${score >= 90 and score <= 100 }">
			<h3>A 학점 입니다.</h3>
		</c:when>
		<c:when test="${score >= 80 and score < 90 }">
			<h3>B 학점 입니다.</h3>
		</c:when>
		<c:when test="${score >= 70 and score < 80 }">
			<h3>C 학점 입니다.</h3>
		</c:when>
		<c:when test="${score >= 60 and score < 70 }">
			<h3>D 학점 입니다.</h3>
		</c:when>
		<c:otherwise>
			<h3>F 학점 입니다.</h3>
		</c:otherwise>
	</c:choose>

</body>
</html>