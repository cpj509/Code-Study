<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>문자, 숫자 데이터 표현</h3>
	${300}<br>
	${"Hello"}<br>
	${10+1}<br>
	${10+'1'}<br>
	
	<h3>산술 연산자</h3>
	\${7+4} = ${7+4}<br>
	\${7-4} = ${7-4}<br>
	\${7*4} = ${7*4}<br>
	\${7/4} = ${7/4}<br>
	\${7%4} = ${7%4}<br>
	
	<h3>비교 연산자</h3>
	\${10==10} : ${10==10}<br>
	\${10 eq 10} : ${10 eq 10}<br>
	\${"face" eq "face"} : ${"face" eq "face"}<br>
	\${"face" == "face"} : ${"face" == "face"}<br>
	\${10 > 20} : ${10 > 20}<br>
	\${10 gt 20} : ${10 gt 20}<br>
	
	<h3>논리 연산자</h3>
	\${(10 == 10) && (10 < 20)} : ${(10 == 10) && (10 < 20)}<br>
	\${(10 == 10) and (10 < 20)} : ${(10 == 10) and (10 < 20)}<br>
	
	\${(10 == 10) && (10 > 20)} : ${(10 == 10) && (10 > 20)}<br>
	\${(10 == 10) and (10 > 20)} : ${(10 == 10) and (10 > 20)}<br>
	
	\${!(10 > 20)} : ${!(10 > 20)}<br>
	\${not(10 > 20)} : ${not(10 > 20)} 
	
	
</body>
</html>