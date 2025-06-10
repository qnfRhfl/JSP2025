package member;
import java.sql.*;
import java.util.*;

public class MemberDAO {

	Connection conn = null;
	PreparedStatement pstmt;
	
	final String JDBC_DRIVER = "org.h2.Driver";
	final String JDBC_URL = "jdbc:h2:tcp://localhost/~/test";
	
	public void open() {
		try {
			Class.forName (JDBC_DRIVER);
			conn = DriverManager.getConnection(JDBC_URL, "sa", "");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void close() {
		try {
			pstmt.close();
			conn.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public List<Member> getAll() {
		List<Member> memberlist = new ArrayList<>();
		open();
		try {
			pstmt = conn.prepareStatement("SELECT * FROM MEMBERS");
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				Member m = new Member();
				m.setId(rs.getInt("id"));
				m.setUsername(rs.getString("username"));
				m.setCompany(rs.getString("company"));
				m.setBirthday(rs.getDate("birthday"));
				m.setEmail(rs.getString("email"));
			
				memberlist.add(m);
			}
			
		}catch(Exception e) {
			
		}finally {
			close();
		}
		return memberlist;
	}
	
	public void insert(Member m) {
		//새로운 회원을 회원테이블에 집어넣기
		
	}
	
}
