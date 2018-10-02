package d20181002;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

// 사용자가 입력한 내용을 데이터베이스에 입력
public class JDBCEx4 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("INSERT INTO MEMBER "); // 끝 문자에 공백 추가해야함.
		sb.append("values (MEM_MEMNO_SEQ.nextval, ");
		sb.append("?, ?, ?, ?, sysdate ) ");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("이름 입력 : ");
		String name = sc.nextLine();
		System.out.println("아이디 입력 : ");
		String id = sc.nextLine();
		System.out.println("패스워드 입력 : ");
		String pw =sc.nextLine();
		System.out.println("전화번호 입력 : ");
		String tel = sc.nextLine();
		
		//System.out.println(id + " , " + "pw" + " , " + name + " , " + tel);
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:XE";

		String user = "SCOTT";
		String password = "TIGER";

		Connection conn = null;
		PreparedStatement pstmt = null; // 동적 그릇 객체. Statement는 정적 객체
		ResultSet rs = null; // 테이블 형태로 받고 보여주기 위해

		// 2. 드라이버 로딩
		try {
			Class.forName(driver);
			// 3. 연결 객체 생성
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("conn : " + conn);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			pstmt = conn.prepareStatement(sb.toString());
			// ? 지정
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			pstmt.setString(3, name);
			pstmt.setString(4, tel);
			
			//실행
			pstmt.executeUpdate(); // select를 제외한 나머지 명령어 사용할 때
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// 8. 자원 반납
		finally {
			if (rs != null) {
				try {
					rs.close();
					if (pstmt != null)
						pstmt.close();
					if (conn != null)
						conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
