<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>구구단</title>
</head>
<body>
	<h2>구구단</h2>
	<table>
	<%	for(int i = 2; i < 10; i ++){%>
			<tr>
			<% for(int j = 1; j < 10; j++){%>
				<td><%out.println(i + "x" + j + "=" + (i * j));%></td>
			<% }%>
			</tr>
		<%}	%>
	</table>
</body>
</html>