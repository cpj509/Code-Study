<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%request.setCharacterEncoding("utf-8"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 목록</title>
<style>
	#container{width: 100%; margin: 0 auto; text-align: center;}
</style>
</head>
<jsp:useBean id="product" class="com.bean.Product"></jsp:useBean>
<body>
	<div id="container">
		<h2>상품 목록</h2>
		<hr />
		<p>1. 선택한 상품은 : ${param.select}</p>
		<p>2. num1 + num2 = ${product.num1 } + ${product.num2 }</p>
	</div>
</body>
</html>