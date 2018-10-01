package d20181001;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

// EMP ���̺� ��� ������ ��ȸ�غ�����
public class JDBCEx2 {
	public static void main(String[] args) {
		// ���� ����
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		
		String user = "SCOTT";
		String password = "TIGER";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		// ����̹� �ε�
		try {
			Class.forName(driver);
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
				System.out.println("�����ȣ : " + empno);
				System.out.println("����� : " + deptno);
				System.out.println("���� : " + job);
				System.out.println("�Ի��� : " + hiredate);
				System.out.println("COMM: " + comm);
				System.out.println("�Ŵ��� �����ȣ : " + mgr);
				System.out.println("�޿� : " + sal);
				
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
