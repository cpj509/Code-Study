<%@page import="java.util.Enumeration"%>
<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	table{width: 300px;}
	th, td{
		border: 1px solid #ccc;
		padding: 10px;
	}
</style>
</head>
<%
		String realFolder = "C:/Users/JMP Korea/Documents/Code-Study/JSP/Basic/Chapter10/WebContent/upload";
		MultipartRequest multi = new MultipartRequest(request, realFolder, 5*1024*1024, "utf-8", new DefaultFileRenamePolicy());
		
		//폼 일반 데이터 가져오기
		String name1 = multi.getParameter("name1");
		String title1 = multi.getParameter("title1");
		String name2 = multi.getParameter("name2");
		String title2 = multi.getParameter("title2");
		String name3 = multi.getParameter("name3");
		String title3 = multi.getParameter("title3");
		
		//폼의 파일 데이터 가져오기
		Enumeration<String> files = multi.getFileNames();
		
		//폼의 파일 데이터 가져오기(스택 구조 (입력)3, 2, 1 -> (출력)1, 2, 3)
		String file3 = files.nextElement();
		String filename3 = multi.getFilesystemName(file3);
		
		String file2 = files.nextElement();
		String filename2 = multi.getFilesystemName(file2);
				
		String file1 = files.nextElement();
		String filename1 = multi.getFilesystemName(file1);
	%>
<body>
	<h2>파일의 정보</h2>
	<table>
		<tr>
			<th>이 름</th>
			<th>제 목</th>
			<th>파 일</th>
		</tr>
		<%
			out.print("<tr><td>" + name1 + "</td>");
			out.print("<td>" + title1 + "</td>");
			out.print("<td>" + filename1 + "</td>");
			
			out.print("<tr><td>" + name2 + "</td>");
			out.print("<td>" + title2 + "</td>");
			out.print("<td>" + filename2 + "</td>");
			
			out.print("<tr><td>" + name3 + "</td>");
			out.print("<td>" + title3 + "</td>");
			out.print("<td>" + filename3 + "</td>");
		%>
	</table>
</body>
</html>