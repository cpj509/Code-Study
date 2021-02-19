<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");

	//리스트 생성 및 세션 생성
	ArrayList<String> productList = (ArrayList)session.getAttribute("productList");
	if(productList == null){
		productList = new ArrayList<>();
		session.setAttribute("productList", productList);
		//상품 리스트에 세션 부여
	}
	
	String product = request.getParameter("product");
	productList.add(product);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 추가 처리</title>
</head>
<body>
	<script type="text/javascript">
		alert("<%=product %>가 추가 되었습니다.");
		history.go(-1);
	</script>
</body>
</html>