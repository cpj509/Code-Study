<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		//과일 리스트를 생성하고 출력 - fruitList
		ArrayList<String> fruitList = new ArrayList<>();
	
		//과일 저장
		fruitList.add("귤");
		fruitList.add("사과");
		fruitList.add("배");
		fruitList.add("포도");
		
		//조회
		out.println(fruitList.get(2));
	%>
	<p>일반 for문 전체 출력</p>
	<%
		for(int i = 0; i < fruitList.size(); i++){
			String fruit = fruitList.get(i);
			out.println(fruit);
		}
	%>
	<p>향상 for문</p>
	<%
		for(String fruit : fruitList){
			out.println(fruit);
		}
	%>

</body>
</html>