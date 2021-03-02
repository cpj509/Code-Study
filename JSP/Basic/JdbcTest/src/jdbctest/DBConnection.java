package jdbctest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBConnection {
	private static String driverClass = "oracle.jdbc.OracleDriver";
	private static String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private static String username = "HR";	//�����(DB)
	private static String password = "1234";	//��й�ȣ
	
	private static Connection conn = null;	//Ŭ����
	private static PreparedStatement pstmt = null;	//�ν��Ͻ�
	
	public static void main(String[] args) {
		try {
			Class.forName(driverClass);	//����̹� �ε�
			conn = DriverManager.getConnection(url, username, password);
			System.out.println("DB ���� ���� " + conn);
			
			//�л� �߰�
			String sql = "INSERT INTO t_student VALUES(104, '�׸�')";
			pstmt = conn.prepareStatement(sql);	//sql ó�� �� ��ü ����(����)
			pstmt.executeUpdate();	//���� �Ϸ�
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