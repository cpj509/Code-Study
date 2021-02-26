package jdbctest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBSelect {
	private static String driverClass = "oracle.jdbc.OracleDriver";
	private static String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private static String username = "HR";	//�����(DB)
	private static String password = "1234";	//��й�ȣ
	
	private static Connection conn = null;	//Ŭ����
	private static PreparedStatement pstmt = null;	//�ν��Ͻ�
	private static ResultSet rs = null;	//DB�� ��ȯ data
	
	public static void main(String[] args) {
		try {
			Class.forName(driverClass);	//����̹� �ε�
			conn = DriverManager.getConnection(url, username, password);
			System.out.println("DB ���� ���� " + conn);
			
			//�л� ��� ��ȸ
			String sql = "SELECT * FROM t_student";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();	//DB�� ��ȯ ���� ������.
			while(rs.next()) {	//�ڷᰡ �ִٸ� ���.
				System.out.println("�й� " + rs.getInt("studentId"));
				System.out.println("�̸� " + rs.getString("studentName"));
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