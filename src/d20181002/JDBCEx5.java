package d20181002;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

// GoF 디자인 패턴 - SingleTon Pattern
// 1. private 한 생성자를 갖는다
// 2. static getInstance() : 자기 자신의 객체를 리턴하는 static한 메소드
// 3. 객체가 null이면 new 하고 그 외에는 return 
public class JDBCEx5 {
	public static void main(String[] args) {
		/*MakeConnection mc1 = MakeConnection.getInstance();
		MakeConnection mc2 = MakeConnection.getInstance();
		
		System.out.println("mc1 : "+ mc1);
		System.out.println("mc2 : "+ mc2);*/
		
		// DB 연결
		Connection conn = MakeConnection.getConnection();
		System.out.println("conn : " + conn);
		
		String id = "hong";
		String pw = "1234";
		String name = "홍길동";
		
		// sql작성
		StringBuffer sb = new StringBuffer();
		sb.append("insert into login ");
		sb.append("values ( ?, ?, ? ) ");
		
		// 문장 객체
		PreparedStatement pstmt = null;
		
		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			pstmt.setString(3, name);
			
			pstmt.executeUpdate(); // select를 제외한 나머지 명령어 사용할 때
			
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
