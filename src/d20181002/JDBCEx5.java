package d20181002;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

// GoF ������ ���� - SingleTon Pattern
// 1. private �� �����ڸ� ���´�
// 2. static getInstance() : �ڱ� �ڽ��� ��ü�� �����ϴ� static�� �޼ҵ�
// 3. ��ü�� null�̸� new �ϰ� �� �ܿ��� return 
public class JDBCEx5 {
	public static void main(String[] args) {
		/*MakeConnection mc1 = MakeConnection.getInstance();
		MakeConnection mc2 = MakeConnection.getInstance();
		
		System.out.println("mc1 : "+ mc1);
		System.out.println("mc2 : "+ mc2);*/
		
		// DB ����
		Connection conn = MakeConnection.getConnection();
		System.out.println("conn : " + conn);
		
		String id = "hong";
		String pw = "1234";
		String name = "ȫ�浿";
		
		// sql�ۼ�
		StringBuffer sb = new StringBuffer();
		sb.append("insert into login ");
		sb.append("values ( ?, ?, ? ) ");
		
		// ���� ��ü
		PreparedStatement pstmt = null;
		
		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			pstmt.setString(3, name);
			
			pstmt.executeUpdate(); // select�� ������ ������ ��ɾ� ����� ��
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		
		
	}
}
