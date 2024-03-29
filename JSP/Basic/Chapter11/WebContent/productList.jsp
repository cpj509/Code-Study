<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
		<form action="productSel.jsp" method="post">
			<select name="select">
<%-- 			<%
				for(String item : product.getProductList()){
					out.println("<option>" + item + "</option>");
				}
			%> --%>
			<c:forEach var="product2" items="${product.productList }"><!-- usebean's product -> product2 -->
				<option>${product2}</option>
			</c:forEach>	
			</select>
			<input type="submit" value="선택" />
			<input type="reset" value="취소" />
		</form>
	</div>
</body>
</html>