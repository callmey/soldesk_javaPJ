package d20181002;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

// 사용자로부터 입력받은 사원의 사번, 이름, 연봉 조회

public class JDBCEx3 {
	public static void main(String[] args) {
		System.out.println("검색할 사원의 사번 입력 : ");
		Scanner sc = new Scanner(System.in);
		int empno = sc.nextInt();

		// System.out.println("empno : " + empno);
		// 4. SQL 작성 : 선언부에 모아서 쓰는 것이 나중에 관리하기 편함
		StringBuffer sql = new StringBuffer();// sql 문장이 길어지면 간섭이 일어날 수 있으므로 버퍼 이용.
		sql.append("select empno, ename, sal*12 annsal ");
		sql.append("FROM EMP ");
		sql.append("where empno = ? "); // ? -> 매번 바뀌는 값

		// 1. 변수 설정
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:XE";

		String user = "SCOTT";
		String password = "TIGER";

		Connection conn = null;
		PreparedStatement pstmt = null; // 동적 그릇 객체. Statement는 정적 객체
		ResultSet rs = null; // 테이블 형태로 받을 수 있도록 하기 위해

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

		// 5. 문장 객체
		try {
			pstmt = conn.prepareStatement(sql.toString()); // StringBuffer 객체를 문장으로 만들어야 함.
			pstmt.setInt(1, empno);
			// 6. 실행
			rs = pstmt.executeQuery();
			// 7. 레코드별로 처리

			rs.next();
			String ename = rs.getString(2);
			// 연산식은 컬럼 이름이 없으므로 별칭을 주고 받아오기
			int annsal = rs.getInt("annsal");

			System.out.println("-----------------------------");
			System.out.println(empno + "\t" + ename + "\t" + annsal);
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
