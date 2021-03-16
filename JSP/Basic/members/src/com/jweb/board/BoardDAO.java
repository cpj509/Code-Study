package com.jweb.board;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class BoardDAO {
	private static String driverClass = "oracle.jdbc.OracleDriver";
	private static String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private static String username = "jweb";
	private static String password = "4321";
	
	private Connection conn = null;
	private PreparedStatement pstmt = null;	//sql ó���ϴ� Ŭ����
	private ResultSet rs = null;
	
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
		if(rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
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
	
//	�� �� �߰�
	public void insertBoard(Board board) {
		connDB();
		String sql = "insert into t_board(bnum, title, content, memberId) values (bSeq.nextval, ?, ?, ?)";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, board.getTitle());
			pstmt.setString(2, board.getContent());
			pstmt.setString(3, board.getMemberId());
			
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			disconnect();
		}
	}
//	�Խñ� ��ü ��� ��� �޼���
	public ArrayList<Board> getListAll(){
		connDB();
		ArrayList<Board> boardList = new ArrayList<Board>();
		String sql = "select * from t_board order by bnum desc";
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				Board board = new Board();
				board.setBnum(rs.getInt("bnum"));
				board.setTitle(rs.getString("title"));
				board.setContent(rs.getString("content"));
				board.setRegDate(rs.getDate("regDate"));
				board.setMemberId(rs.getString("memberId"));
				board.setHit(rs.getInt("hit"));
				boardList.add(board);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			disconnect();
		}	
		return boardList;
	}
//	ȸ�� 1�� �� ���� �޼���
	public Board getOneBoard(int bnum) {
		connDB();
		String sql = "select * from t_board where bnum=?";
		Board board = new Board();
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, bnum);
			rs = pstmt.executeQuery();
			rs.next();
			
			board.setBnum(rs.getInt("bnum"));
			board.setTitle(rs.getString("title"));
			board.setContent(rs.getString("content"));
			board.setRegDate(rs.getDate("regDate"));
			board.setMemberId(rs.getString("memberId"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			disconnect();
		}
		return board;
	}
//	ȸ�� ����
	public void deleteBoard(int bnum) {
		connDB();
		String sql = "delete from t_board where bnum = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, bnum);
			//���� ����
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			disconnect();
		}
		
	}
//	�Խñ� ����
	public void updateBoard(Board board) {
		connDB();
		String sql = "update t_board set title = ?, content = ? where bnum = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, board.getTitle());
			pstmt.setString(2, board.getContent());
			pstmt.setInt(3, board.getBnum());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			disconnect();
		}
		
	}
//	��ȸ�� 1 ����
	public void updateHit(int bnum) {
		connDB();
		String sql = "select hit from t_board where bnum = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, bnum);
			rs = pstmt.executeQuery();
			int hit = 0;
			if(rs.next()) {
				hit = rs.getInt("hit") + 1;
			}
//			update
			sql = "update t_board set hit = ? where bnum = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, hit);
			pstmt.setInt(2, bnum);
			
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			disconnect();
		}
	}
}