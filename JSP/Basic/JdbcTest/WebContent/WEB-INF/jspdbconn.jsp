<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JDBC 테스트</title>
</head>
<body>
	<%
		String driverClass = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String username = "HR";
		String password = "1234";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		
		try{
			Class.forName(driverClass);
			conn = DriverManager.getConnection(url, username, password);
			out.println("DB 연결 성공");
			
			String sql = "INSERT INTO t_student VALUES(201, '그마해')";
			out.println("학생 추가");
			pstmt = conn.prepareStatement(sql);
			pstmt.executeUpdate();
		} catch(Exception e){
			e.printStackTrace();
		}finally{
			if(conn != null){
				conn.close();
			}
		}
	%>

</body>
</html>