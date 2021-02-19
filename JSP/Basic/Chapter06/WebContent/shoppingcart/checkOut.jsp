<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	#container{
		width: 80%;
		margin: 0 auto;
		text-align: center;
	}
</style>
</head>
<body>
	<div id="container">
		<h2>계산 하기</h2>
		<hr />
		<%
			ArrayList<String> productList = (ArrayList)session.getAttribute("productList");
			
			//상품 목록 출력
			for(String product : productList){
				out.println(product + "<br>");
			}
		%>
	
	</div>
</body>
</html>