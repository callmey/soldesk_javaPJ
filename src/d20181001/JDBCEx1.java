package d20181001;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCEx1 {
	public static void main(String[] args) {
		// 0. ���� ����
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
		
		// 1. ����̹� �ε�
		try {
			Class.forName(driver);
			
		// 2. Connection ��ü ����
			conn = DriverManager.getConnection(url, user, password);
			
			System.out.println("conn : " + conn);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("����̹� �ε� ����");		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("DBMS ���� ����");
		}
		
		// 3. ����� SQL ���� �ۼ�
		String sql = "SELECT * FROM DEPT";
		
		// 4. ���� ��ü 
		try {
			pstmt = conn.prepareStatement(sql); 
			// �׸��� ����.
			// ��ü�� ��Ƽ� �����Ƿ� �ý��ۿ� ������ ��ġ�Ƿ� try-catch�� ����.
			
			// 5. ����
			// DBMS�� ���� �� ������� �������ִ� ��ü : ResultSet
			rs = pstmt.executeQuery();
			
			// 6. ���ڵ庰�� ���� ó��
			while(rs.next()) {
				int deptno = rs.getInt("deptno"); // Ȥ�� 1.(columnIndex)
				String dname = rs.getString(2);
				String loc = rs.getString("loc");
				
				System.out.println("�μ���ȣ : " + deptno);
				System.out.println("�μ��� : " + dname);
				System.out.println("�μ���ġ : " + loc);
				
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // 7. �ڿ� �ݳ�
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
