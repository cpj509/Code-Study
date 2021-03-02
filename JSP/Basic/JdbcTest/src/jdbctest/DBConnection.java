package jdbctest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBConnection {
	private static String driverClass = "oracle.jdbc.OracleDriver";
	private static String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private static String username = "HR";	//사용자(DB)
	private static String password = "1234";	//비밀번호
	
	private static Connection conn = null;	//클래스
	private static PreparedStatement pstmt = null;	//인스턴스
	
	public static void main(String[] args) {
		try {
			Class.forName(driverClass);	//드라이버 로딩
			conn = DriverManager.getConnection(url, username, password);
			System.out.println("DB 연결 성공 " + conn);
			
			//학생 추가
			String sql = "INSERT INTO t_student VALUES(104, '그마')";
			pstmt = conn.prepareStatement(sql);	//sql 처리 할 객체 생성(연결)
			pstmt.executeUpdate();	//수행 완료
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}