package d20181002;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

// ����ڷκ��� �Է¹��� ����� ���, �̸�, ���� ��ȸ

public class JDBCEx3 {
	public static void main(String[] args) {
		System.out.println("�˻��� ����� ��� �Է� : ");
		Scanner sc = new Scanner(System.in);
		int empno = sc.nextInt();

		// System.out.println("empno : " + empno);
		// 4. SQL �ۼ� : ����ο� ��Ƽ� ���� ���� ���߿� �����ϱ� ����
		StringBuffer sql = new StringBuffer();// sql ������ ������� ������ �Ͼ �� �����Ƿ� ���� �̿�.
		sql.append("select empno, ename, sal*12 annsal ");
		sql.append("FROM EMP ");
		sql.append("where empno = ? "); // ? -> �Ź� �ٲ�� ��

		// 1. ���� ����
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:XE";

		String user = "SCOTT";
		String password = "TIGER";

		Connection conn = null;
		PreparedStatement pstmt = null; // ���� �׸� ��ü. Statement�� ���� ��ü
		ResultSet rs = null; // ���̺� ���·� ���� �� �ֵ��� �ϱ� ����

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

		// 5. ���� ��ü
		try {
			pstmt = conn.prepareStatement(sql.toString()); // StringBuffer ��ü�� �������� ������ ��.
			pstmt.setInt(1, empno);
			// 6. ����
			rs = pstmt.executeQuery();
			// 7. ���ڵ庰�� ó��

			rs.next();
			String ename = rs.getString(2);
			// ������� �÷� �̸��� �����Ƿ� ��Ī�� �ְ� �޾ƿ���
			int annsal = rs.getInt("annsal");

			System.out.println("-----------------------------");
			System.out.println(empno + "\t" + ename + "\t" + annsal);
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
