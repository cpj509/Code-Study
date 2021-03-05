package com.beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;

public class AddrBookDAO {
	private static String driverClass = "oracle.jdbc.OracleDriver";
	private static String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private static String username = "HR";
	private static String password = "1234";
	
	private Connection conn = null;
	private PreparedStatement pstmt = null;	//sql ó���ϴ� Ŭ����
	private ResultSet rs = null;
	
	
//	DB ���� �޼���
	private void connDB() {
		try {
			Class.forName(driverClass);
			conn = DriverManager.getConnection(url, username, password);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void disconnect() {
		if(pstmt != null) {
			try {
				pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
//	�ּ� �߰�
	public void addAddress(AddrBook addrBook) {
		connDB();
		String sql = "INSERT INTO t_address (num, username, tel, email, gender) VALUES (abSeq.nextval, ?, ?, ?, ?)";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, addrBook.getUsername());
			pstmt.setString(2, addrBook.getTel());
			pstmt.setString(3, addrBook.getEmail());
			pstmt.setString(4, addrBook.getGender());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			disconnect();
		}
	}
	
//	�ּ� ���
	public ArrayList<AddrBook> getListAll(){
		connDB();
		ArrayList<AddrBook> addrList = new ArrayList<>();
		String sql = "select * from t_address order by num";
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				AddrBook addrBook = new AddrBook();
				addrBook.setNum(rs.getInt("num"));
				addrBook.setUsername(rs.getString("username"));
				addrBook.setTel(rs.getString("tel"));
				addrBook.setEmail(rs.getString("email"));
				addrBook.setGender(rs.getString("gender"));
				addrBook.setJoinDate(rs.getDate("joinDate"));
				
				
				addrList.add(addrBook);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			disconnect();
		}
		return addrList;
	}
	
//	�ּ� �� ����(1��)
	public AddrBook getOneDB(int num) {
		connDB();
		AddrBook addrBook = new AddrBook();
		String sql = "SELECT * FROM t_address WHERE num = ?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);	//�Է¹�ȣ�� ����
			rs = pstmt.executeQuery();
			rs.next();	//1���� �ڷ�
			addrBook.setNum(rs.getInt("num"));
			addrBook.setUsername(rs.getString("username"));
			addrBook.setTel(rs.getString("tel"));
			addrBook.setEmail(rs.getString("email"));
			addrBook.setGender(rs.getString("gender"));
			addrBook.setJoinDate(rs.getDate("joinDate"));
			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			disconnect();
		}
		return addrBook;
		
	}
	
//	�ּ� ����
	public void removeAddress(int num) {
		connDB();
		String sql = "DELETE FROM t_address WHERE num = ?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			disconnect();
		}
	}
//	�ּ� ����
	public void updateAddress(AddrBook addrBook) {
		connDB();
		String sql = "update t_address set username=?, tel=?, email=?, gender=? where num=?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, addrBook.getUsername());	//
			pstmt.setString(2, addrBook.getTel());
			pstmt.setString(3, addrBook.getEmail());
			pstmt.setString(4, addrBook.getGender());
			pstmt.setInt(5, addrBook.getNum());
			
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			disconnect();
		}
	}
	
//	�α��� üũ
	public boolean checkLogin(String email) {
		connDB();
		String sql = "select email from t_address where email=?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, email);
			rs = pstmt.executeQuery();	//DB�� �ִ� email ��������.
			if(rs.next())
				return true;	//�̸��� ��ġ(������.)
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			disconnect();
		}
		return false;	//�̸��� �� ��ġ(�߸� �Է� �߰ų� �������� ����.)
	}
}