package d20181001;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectionTest {
	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		
		String user = "SCOTT";
		
		String password = "TIGER";
		
		
		try {
			Class.forName(driver);
			
			Connection conn = DriverManager.getConnection(url, user, password);  
			// 인터페이스는 new로 할당받을 수 없으며 상속받고있는 클래스를 이용해서 사용해야 함.
			
			System.out.println("conn: " + conn);
			System.out.println("DB에 연결되었습니다.");
			
		} catch (ClassNotFoundException e) { // 드라이버 객체가 없는지
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) { // SQL문 체크
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
