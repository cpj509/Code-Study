<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>처리 결과 메시지</title>
</head>
<jsp:useBean id="memDAO" class="com.jweb.member.MemberDAO" scope="application"></jsp:useBean>
<%
	String sessionId = null;
	if(session.getAttribute("sessionId") != null){
		sessionId = (String)session.getAttribute("sessionId");
	}
	
	String name = memDAO.getLoginNameById(sessionId);
%>
<body>
	<jsp:include page="menu.jsp"></jsp:include>
	<div id="container">
		<div id="title">
			<h1>회원 정보</h1>
		</div>
		<div class="msg">
			<!-- 자바 코드 -->
			<%
				//msg 받기
				String msg = request.getParameter("msg");
			
				if(msg != null){
					if(msg.equals("0"))
						out.println("<h1>회원 정보가 수정되었습니다.</h1>");
					else if(msg.equals("1"))
						out.println("<h1>회원 가입을 축하합니다.</h1>");
					else if(msg.equals("2"))
						out.println("<h1>" + name + "님 환영합니다.</h1>");
				}else{
					out.println("<h1>회원 정보가 삭제되었습니다.</h1>");
				}
			%>
		</div>
	</div>
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>