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
	private PreparedStatement pstmt = null;	//sql 처리하는 클래스
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
	
//	회원 목록
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
		//DB 연결
		connDB();
		
		//SQL 처리. select는 exequteQuery()
		String sql = "select * from t_member where memberId = ?";
		Member member = new Member();
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, memId);
			rs = pstmt.executeQuery();	//db에 있는 객체
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
		return member;	//1명의 객체 반환	
	}
	//회원 삭제 메서드
	public void deleteMember(String memId) {
		connDB();
		String sql = "delete from t_member where memberId = ?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, memId);
			//실행 - insert, update, delete에서 사용함.
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			disconnect();
		}
	}
//	회원 수정 메서드
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
//	회원 로그인 체크 - 아이디, 비밀번호 일치: 1,  아이디 불일치 : 0, 비밀번호 불일치 : -1
	public int login(String memberId, String passwd) {
		connDB();
		String sql = "select memberId, passwd from t_member where memberId = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, memberId);
			rs = pstmt.executeQuery();
			if(rs.next()) {//아이디 일치
				String dbPw = rs.getString("passwd");
				if(dbPw.equals(passwd)) {
					return 1;
				}else {
					return -1;
				}
			}else {
				return 0;//아이디 불일치
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return -2;	//DB 오류
	}
//	인증된 memberId의 이름 가져오는 메서드
	public String getLoginNameById(String memberId) {
		connDB();
		String sql = "select * from t_member where memberId = ?";
		String name = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, memberId);
			//쿼리 실행
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
//	아이디 중복 검사 메서드
	public boolean duplicatedID(String memberId) {
		connDB();
		boolean result = false;
		
		String sql = "select decode(count(*), 1, 'true', 'false') result from t_member where memberId = ?";
//		오라클 decode()함수 사용 : id의 개수가 1개면 true, 아니면 false;
//		칼럼 이름 : result
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, memberId);
//			쿼리 실행
			rs = pstmt.executeQuery();
			if(rs.next()) {
				result = rs.getBoolean("result");	//result 칼럼 가져오기
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