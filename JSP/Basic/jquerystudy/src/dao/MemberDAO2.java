package dao;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MemberDAO2 {
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
	public void addMember(Member member) {
		connDB();
		String sql = "insert into t_member(memberId, passwd, name, gender) values (?, ?, ?, ?)";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, member.getMemberId());
			pstmt.setString(2, member.getPasswd());
			pstmt.setString(3, member.getName());
			pstmt.setString(4, member.getGender());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			disconnect();
		}
	}
	
//	ȸ�� ���
	public ArrayList<Member> getListAll() {
		connDB();
		ArrayList<Member> memberList = new ArrayList<>();
		String sql = "select * from t_member";
		
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				Member member = new Member();
				member.setMemberId(rs.getString("memberId"));
				member.setName(rs.getString("name"));
				member.setGender(rs.getString("gender"));
				member.setJoinDate(rs.getDate("joinDate"));
				
				memberList.add(member);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			disconnect();
		}	
		return memberList;
	}
	public Member getOneMember(String memId) {
		//DB ����
		connDB();
		
		//SQL ó��. select�� exequteQuery()
		String sql = "select * from t_member where memberId = ?";
		Member member = new Member();
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, memId);
			rs = pstmt.executeQuery();	//db�� �ִ� ��ü
			while(rs.next()) {
				
				member.setMemberId(rs.getString("memberId"));
				member.setPasswd(rs.getString("passwd"));
				member.setName(rs.getString("name"));
				member.setGender(rs.getString("gender"));
				member.setJoinDate(rs.getDate("joinDate"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return member;	//1���� ��ü ��ȯ	
	}
	//ȸ�� ���� �޼���
	public void deleteMember(String memId) {
		connDB();
		String sql = "delete from t_member where memberId = ?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, memId);
			//���� - insert, update, delete���� �����.
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			disconnect();
		}
	}
//	ȸ�� ���� �޼���
	public void updateMember(Member member) {
		connDB();
		String sql = "update t_member set passwd = ?, name = ?, gender = ? where memberId = ?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, member.getPasswd());
			pstmt.setString(2, member.getName());
			pstmt.setString(3, member.getGender());
			pstmt.setString(4, member.getMemberId());
			
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			disconnect();
		}
	}
//	ȸ�� �α��� üũ - ���̵�, ��й�ȣ ��ġ: 1,  ���̵� ����ġ : 0, ��й�ȣ ����ġ : -1
	public int login(String memberId, String passwd) {
		connDB();
		String sql = "select memberId, passwd from t_member where memberId = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, memberId);
			rs = pstmt.executeQuery();
			if(rs.next()) {//���̵� ��ġ
				String dbPw = rs.getString("passwd");
				if(dbPw.equals(passwd)) {
					return 1;
				}else {
					return -1;
				}
			}else {
				return 0;//���̵� ����ġ
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return -2;	//DB ����
	}
//	������ memberId�� �̸� �������� �޼���
	public String getLoginNameById(String memberId) {
		connDB();
		String sql = "select * from t_member where memberId = ?";
		String name = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, memberId);
			//���� ����
			rs = pstmt.executeQuery();
			if(rs.next()) {
				name = rs.getString("name");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			disconnect();
		}
		return name;
	}
//	���̵� �ߺ� �˻� �޼���
	public boolean duplicatedID(String memberId) {
		connDB();
		boolean result = false;
		
		String sql = "select decode(count(*), 1, 'true', 'false') result from t_member where memberId = ?";
//		����Ŭ decode()�Լ� ��� : id�� ������ 1���� true, �ƴϸ� false;
//		Į�� �̸� : result
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, memberId);
//			���� ����
			rs = pstmt.executeQuery();
			if(rs.next()) {
				result = rs.getBoolean("result");	//result Į�� ��������
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			disconnect();
		}
		return result;
	}
}