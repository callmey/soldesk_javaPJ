package d20181001;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCEx1 {
	public static void main(String[] args) {
		// 0. 변수 설정
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		
		/*
		 * 
		 * cf) MySQL
		 * driver = "com.mysql.jdbc.Driver"
		 * url = "jdbc:mysql://localhost:3306/DBname";
		 * 
		 */
		
		String user = "SCOTT";
		String password = "TIGER";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		// 1. 드라이버 로딩
		try {
			Class.forName(driver);
			
		// 2. Connection 객체 생성
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
		
		// 3. 사용할 SQL 문장 작성
		String sql = "SELECT * FROM DEPT";
		
		// 4. 문장 객체 
		try {
			pstmt = conn.prepareStatement(sql); 
			// 그릇과 같음.
			// 객체로 담아서 보내므로 시스템에 영향을 미치므로 try-catch문 실행.
			
			// 5. 실행
			// DBMS가 실행 후 결과값을 리턴해주는 객체 : ResultSet
			rs = pstmt.executeQuery();
			
			// 6. 레코드별로 로직 처리
			while(rs.next()) {
				int deptno = rs.getInt("deptno"); // 혹은 1.(columnIndex)
				String dname = rs.getString(2);
				String loc = rs.getString("loc");
				
				System.out.println("부서번호 : " + deptno);
				System.out.println("부서명 : " + dname);
				System.out.println("부서위치 : " + loc);
				
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // 7. 자원 반납
		finally {
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
