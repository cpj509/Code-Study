<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>선언 태그 예제</title>
</head>
<body>
	<!-- 선언문 태그(전역 메서드) -->
	<%!
		int add(int x, int y){
		return x + y;
	}
	
	String sayHello(String name){
		return "Hello~ " + name;
	}
	%>
	
	<%
		out.println("두 수의 합 : " + add(10, 7));
		out.println(sayHello("Elsa"));
	%>
	
	<!-- 표현문 태그 out.println()와 같은 역할. -->
	<%=sayHello("Minsu") %>
		

</body>
</html>