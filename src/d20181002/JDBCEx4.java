package d20181002;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

// ����ڰ� �Է��� ������ �����ͺ��̽��� �Է�
public class JDBCEx4 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("INSERT INTO MEMBER "); // �� ���ڿ� ���� �߰��ؾ���.
		sb.append("values (MEM_MEMNO_SEQ.nextval, ");
		sb.append("?, ?, ?, ?, sysdate ) ");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�̸� �Է� : ");
		String name = sc.nextLine();
		System.out.println("���̵� �Է� : ");
		String id = sc.nextLine();
		System.out.println("�н����� �Է� : ");
		String pw =sc.nextLine();
		System.out.println("��ȭ��ȣ �Է� : ");
		String tel = sc.nextLine();
		
		//System.out.println(id + " , " + "pw" + " , " + name + " , " + tel);
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:XE";

		String user = "SCOTT";
		String password = "TIGER";

		Connection conn = null;
		PreparedStatement pstmt = null; // ���� �׸� ��ü. Statement�� ���� ��ü
		ResultSet rs = null; // ���̺� ���·� �ް� �����ֱ� ����

		// 2. ����̹� �ε�
		try {
			Class.forName(driver);
			// 3. ���� ��ü ����
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
			// ? ����
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			pstmt.setString(3, name);
			pstmt.setString(4, tel);
			
			//����
			pstmt.executeUpdate(); // select�� ������ ������ ��ɾ� ����� ��
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// 8. �ڿ� �ݳ�
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
