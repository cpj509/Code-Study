<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 세션</title>
</head>
<body>
	<%
		String id = request.getParameter("userid");
		String pwd = request.getParameter("passwd");
		
		//로그인 체크
		if(id.equals("admin") && pwd.equals("admin1234")){
			session.setAttribute("userID", id);	//userID 이름으로 세션 설정
			response.sendRedirect("welcome.jsp");
		}else{
			out.println("<script>");
			out.println("alert('아이디나 비밀번호가 일치하지 않습니다.')");
			out.println("history.go(-1)");
			out.println("</script>");
		}
	%>

</body>
</html>