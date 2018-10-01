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
			// �������̽��� new�� �Ҵ���� �� ������ ��ӹް��ִ� Ŭ������ �̿��ؼ� ����ؾ� ��.
			
			System.out.println("conn: " + conn);
			System.out.println("DB�� ����Ǿ����ϴ�.");
			
		} catch (ClassNotFoundException e) { // ����̹� ��ü�� ������
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) { // SQL�� üũ
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
