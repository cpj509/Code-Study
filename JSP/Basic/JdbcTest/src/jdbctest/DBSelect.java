package jdbctest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBSelect {
	private static String driverClass = "oracle.jdbc.OracleDriver";
	private static String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private static String username = "HR";	//사용자(DB)
	private static String password = "1234";	//비밀번호
	
	private static Connection conn = null;	//클래스
	private static PreparedStatement pstmt = null;	//인스턴스
	private static ResultSet rs = null;	//DB의 반환 data
	
	public static void main(String[] args) {
		try {
			Class.forName(driverClass);	//드라이버 로딩
			conn = DriverManager.getConnection(url, username, password);
			System.out.println("DB 연결 성공 " + conn);
			
			//학생 목록 조회
			String sql = "SELECT * FROM t_student";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();	//DB의 반환 값을 가져옴.
			while(rs.next()) {	//자료가 있다면 출력.
				System.out.println("학번 " + rs.getInt("studentId"));
				System.out.println("이름 " + rs.getString("studentName"));
			}
			
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