<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("utf-8"); %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="resources/css/style.css" />
</head>
<jsp:useBean id="memDAO" class="com.jweb.member.MemberDAO" scope="application"></jsp:useBean>
<!-- scope="application"은 서버 종료시까지 유지 -->
<body>
<%
	//자바 부분
	//폼에서 넘어온 자료 수집 부분
	String memberId = request.getParameter("memberId");
	String passwd = request.getParameter("passwd");
	
	//로그인 체크 처리
	int result = memDAO.login(memberId, passwd);
	if(result == 1){	//아이디, 비밀번호 일치 -> 세션 발급
		session.setAttribute("sessionId", memberId);
		//out.println("<script>alert('로그인 되었습니다.');location.href='memberList.jsp';</script>");
		response.sendRedirect("memberResult.jsp?msg=2");
	//목록 페이지로 이동
	}else if(result == 0){	//아이디 불일치
		out.println("<script>alert('아이디가 일치하지 않습니다.');");
		out.println("history.go(-1);</script>");
	}else if(result == -1){
		out.println("<script>alert('비밀번호가 일치하지 않습니다.');");
		out.println("history.go(-1);</script>");
	}else{
		out.println("<script>alert('DB 오류.');");
		out.println("history.go(-1);</script>");
	}
%>
</body>
</html>