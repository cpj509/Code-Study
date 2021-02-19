<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>쿠키 생성 처리</title>
</head>
<body>
	<%
		String userID = request.getParameter("id");
		String userPW = request.getParameter("passwd");
		
		//Login Check
		if(userID.equals("admin") && userPW.equals("0000")){
			Cookie cookieID = new Cookie("userID", "userID");	//이름, 값
			Cookie cookiePW = new Cookie("userPW", "userPW");
			
			//서버 -> 클라이언트로 응답
			response.addCookie(cookieID);
			response.addCookie(cookiePW);
			
			out.println("쿠키 생성에 성공했습니다.");
		}else{
			out.println("쿠키 생성에 실패했습니다.");
		}
	%>

</body>
</html>