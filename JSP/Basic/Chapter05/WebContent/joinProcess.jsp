<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>가입 처리</title>
</head>
<body>
	<%
		//한글 인코딩 처리
		request.setCharacterEncoding("utf-8");
		
		//폼의 입력 값을 전달 받음
		String id = request.getParameter("userid");
		String pw = request.getParameter("passwd");
		String name = request.getParameter("name");
		String phone1 = request.getParameter("phone1");
		String phone2 = request.getParameter("phone2");
		String phone3 = request.getParameter("phone3");
		String sex = request.getParameter("sex");
		String[] hobby = request.getParameterValues("hobby");
		String comment = request.getParameter("comment");
		
	
	%>
	
	<p>아이디 : <%=id %></p>
	<p>패스워드 : <%=pw %></p>
	<p>이름 : <%=name %></p>
	<p>연락처 : <%=phone1 %> - <%=phone2 %> - <%=phone3 %></p>
	<p>성별 : <%=sex %></p>
	<p>취미 : <%
				for(int i = 0; i < hobby.length; i++){
					out.println(hobby[i]);
				}
			%></p>
	<p>가입 인사 : <%=comment %></p>

</body>
</html>