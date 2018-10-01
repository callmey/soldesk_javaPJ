package d20181001;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

// EMP 테이블 모든 정보를 조회해보세요
public class JDBCEx2 {
	public static void main(String[] args) {
		// 변수 설정
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		
		String user = "SCOTT";
		String password = "TIGER";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		// 드라이버 로딩
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, password);
			
			System.out.println("conn : " + conn);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("드라이버 로딩 실패");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("DBMS 연결 실패");
		}
		
		String sql = "SELECT * FROM EMP";
		
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				int empno = rs.getInt("EMPNO");
				String ename = rs.getString("ENAME");
				String deptno = rs.getString("DEPTNO");
				String job = rs.getString("job");
				int mgr = rs.getInt("mgr");
				int comm = rs.getInt("COMM");
				String hiredate = rs.getString("HIREDATE");
				int sal = rs.getInt("SAL");
				System.out.println("사원번호 : " + empno);
				System.out.println("사원명 : " + deptno);
				System.out.println("직업 : " + job);
				System.out.println("입사일 : " + hiredate);
				System.out.println("COMM: " + comm);
				System.out.println("매니저 사원번호 : " + mgr);
				System.out.println("급여 : " + sal);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
				try {
					rs.close();
					pstmt.close();
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
