package chap23_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import chap19_multithread._08_NonSyncShareObj;

public class _01_jdbc_select {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//오라클 드라이버 변수 선언 및 사용 클래스정의
		final String JDBC_DRIVER =
					"oracle.jdbc.driver.OracleDriver";
		//접속할 데이터 베이스 url 지정
		final String DB_URL = "jdbc:oracle:thin:@localhost:1521:xe";
		
		
		//접속할 계정 정보
		final String USER = "c##study";
		final String PASSWORD = "!dkdlxl1234";

		//커넥션 변수 선언
		Connection conn = null;
		
		//쿼리 구문 변수 선언
		Statement statement = null;
		
		try {
			//jdbc 드라이버 클래스 로드
			Class.forName(JDBC_DRIVER);
			
			//데이터베이스 연결
			conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
			
			//실행할 SQL 쿼리 생성
			statement = conn.createStatement();
//			String sql = "SELECT * FROM STUDENT";
//			String sql = "SELECT ST.SNO," 
//					+"	ST.SNAME," 
//					+"	ROUND(AVG(SC.RESULT), 2) AS AVGRE "
//					+"	FROM STUDENT ST"
//					+"	JOIN SCORE SC "
//					+"	ON ST.SNO = SC.SNO "
//					+"	GROUP BY ST.SNO, ST.SNAME";
			
			String sql = "SELECT * FROM STUDENT WHERE SNO = '8003'";
			
			
			//결과를 담아줄 ResultSet 변수 선언
			//select => execute	Query(sql);
			//insert,update, delete => executeUpdate(sql);
			ResultSet resultSet = statement.executeQuery(sql);
			
			//결과 출력
			while(resultSet.next()) {
				String sno = resultSet.getString("sno");
				String sname = resultSet.getString("sname");
				
				System.out.println(" 학번 : " + sno + " 이름 : "+ sname);
			}
			
			
			//다 쓴 객체(자원)들은 해제
			resultSet.close();
			statement.close();
			conn.close();
			
			
			
		}catch(SQLException se) {
			System.out.println(se.getMessage());
		}catch(Exception e) {
			System.out.println(e.getMessage());
		} finally {
			if(statement != null) {
				try {
					statement.close();
				} catch (SQLException se) {
					System.out.println(se.getMessage());
				}
			}
			
			if(conn != null) {
				try {
				conn.close();
				}catch (SQLException se) {
					System.out.println(se.getMessage());
				}
				
			}
		}
		
		
	}

}
