<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>세션 생성</title>
</head>
<body>
	<%
		String userId = request.getParameter("id");
		String userPw = request.getParameter("passwd");
		
		//로그인 체크
		if(userId.equals("corona") && userPw.equals("0000")){
			//세션 생성
			session.setAttribute("userId", userId);	//세션 이름, 세션 값
			session.setAttribute("userPw", userPw);
			out.println("세션 설정에 성공했습니다.");
		}else{
			out.println("<script>");
			out.println("alert('아이디나 비밀번호가 일치하지 않습니다.')");
			out.println("history.go(-1)");	//이전 페이지로 이동
			out.println("</script>");
		}
	%>
</body>
</html>