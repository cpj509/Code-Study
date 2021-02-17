<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		//한글 인코딩 처리.
		request.setCharacterEncoding("utf-8");
		
		//form에서 넘어온 name 매개변수 전달.
		String name = request.getParameter("name");
	%>
	<p>이름 : <%=name %><br>
	요청 정보 길이: <%=request.getContentLength() %><br>
	클라이언트 IP: <%=request.getRemoteAddr() %><br>
	클라이언트 전송 방식: <%=request.getMethod() %><br>
	요청 URI: <%=request.getRequestURI() %><br>
	서버 이름: <%=request.getServerName() %><br>
	서버 포트: <%=request.getServerPort() %><br>
	</p>
	

</body>
</html>