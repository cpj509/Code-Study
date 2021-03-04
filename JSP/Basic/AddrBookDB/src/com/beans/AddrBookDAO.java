package com.beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class AddrBookDAO {
	private static String driverClass = "oracle.jdbc.OracleDriver";
	private static String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private static String username = "HR";
	private static String password = "1234";
	
	private Connection conn = null;
	private PreparedStatement pstmt = null;	//sql 처리하는 클래스
	private ResultSet rs = null;
	
	
//	DB 연결 메서드
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
	
//	주소 추가
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
	
//	주소 목록
	public ArrayList<AddrBook> getListAll(){
		connDB();
		ArrayList<AddrBook> addrList = new ArrayList<>();
		String sql = "select * from t_address";
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
	
//	주소 상세 보기(1명)
	public AddrBook getOneDB(int num) {
		connDB();
		AddrBook addrBook = new AddrBook();
		String sql = "SELECT * FROM t_address WHERE num = ?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);	//입력번호를 세팅
			rs = pstmt.executeQuery();
			rs.next();	//1개의 자료
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
	
//	주소 삭제
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
}
