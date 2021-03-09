<%@page import="java.io.File"%>
<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>파일 업로드 처리</title>
</head>
<body>
<%
	String realFolder = "C:/Users/JMP Korea/Documents/Code-Study/JSP/Basic/Chapter10/WebContent/upload";	//절대 경로
	MultipartRequest multi = new MultipartRequest(request, realFolder, 5*1024*1024, "utf-8", new DefaultFileRenamePolicy());
	
	//폼의 요청 name을 가져오기
	Enumeration<String> params = multi.getParameterNames();
	while(params.hasMoreElements()){
		String name = params.nextElement();
		String value = multi.getParameter(name);
		out.println(name + "=" + value + "<br>");
	}
	
	//폼의 요청 file name 가져오기
	Enumeration<String> files = multi.getFileNames();
	while(files.hasMoreElements()){
		String name = files.nextElement();
		String fileName = multi.getFilesystemName(name);
		String original = multi.getOriginalFileName(name);
		String type = multi.getContentType(name);
		File file = multi.getFile(name);
		
		out.println("요청 파라미터 이름 : " + name + "<br>");
		out.println("실제 파일 이름 : " + original + "<br>");
		out.println("저장 파일 이름 : " + fileName + "<br>");
		out.println("파일 컨텐츠 유형 : " + type + "<br>");
		if(file != null){
			out.println("파일 크기 : " + file.length() + "b");
		}
%>
	<p>이미지 보기</p>
	<p><img src="upload/<%=fileName %>" /></p>
<% }%>

</body>
</html>