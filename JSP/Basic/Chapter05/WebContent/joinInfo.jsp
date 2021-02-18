<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>name과 value 가져오기</title>
<style type="text/css">
	table, th, td{
		border-collapse: collapse;
		border-color: #ccc;	
	}
</style>
</head>
<body>
	<table border="1">
		<tr>
			<th>요청 파라미터 이름</th>
			<th>요청 파라미터 값</th>
		</tr>
		<%
			request.setCharacterEncoding("utf-8");
		
			Enumeration<String> paramNames = request.getParameterNames();
			while(paramNames.hasMoreElements()){
				String name = paramNames.nextElement();	//name을 얻어옴
				String value = request.getParameter(name);	//name을 매개로 값을 가져옴
				
				
				//hobby 배열을 생성 -> getParameterValues() 사용(if~else 조건)
				if(name.equals("hobby")){
					String[] hobby = request.getParameterValues("hobby");
					for(int i = 0; i < hobby.length; i++){
						out.println("<tr><td>" + name + "</td>");
						out.println("<td>" + hobby[i] + "</td></tr>");
					}
				}else{
					out.println("<tr><td>" + name + "</td>");
					out.println("<td>" + value + "</td></tr>");
				}
				
				/* out.println("<tr><td>" + name + "</td>");
				out.println("<td>" + value + "</td></tr>"); */
			}
		%>
	</table>

</body>
</html>