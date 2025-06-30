package study.practice.practice49;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import study.db.v1.Dept;

public class ProfessorDAO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		public static List<Professor01> professorList() {   

			// OracleDB 연결
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			// DB연결정보
			String db_url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String db_id = "scott";
			String db_pw = "tiger";

			// DB연결 및 사용시 필요한 객체
			Connection conn = null; // DB 연결 객체
			PreparedStatement psmt = null; // DB 연결후, sql 명령 실행해주는 객체
			ResultSet rs = null; // sql Select 실행 후 조회 결과가 저장되는 객체

			// DB 연결
			try {
				conn = DriverManager.getConnection(db_url, db_id, db_pw);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			// 쿼리 준비
			String query = "select * from dept where 1=2";

			//List<Dept> deptList = null;
			List<Professor01> deptList = new ArrayList<Professor01>();
			
			try {
				
				psmt = conn.prepareStatement(query); // 쿼리실행 준비객체
				rs = psmt.executeQuery(); // 쿼리 실행 후 결과 저장
				
				// ResultSet rs 에 담겨져있는 쿼리 수행결과 확인
				while (rs.next()) { // 읽어온 데이터를 행 단위로 반복하면서 접근
					// rs.next() 다음 불러올 행 데이터가 있으면 true, 없으면 false

					// 컬럼인덱스 / 컬럼명
					// rs.getInt(1)
					
//					if(deptList == null)
//						deptList = new ArrayList<Dept>();
					
					// 해당 행에 컬럼 단위로 데이터 접근
					Professor01 professor = new Professor01 (rs.getInt("profno"), rs.getString("name"), rs.getString("id"), rs.getInt("position"), rs.getInt("pay"), rs.getInt("deptno"));
					deptList.add(professor);
				}

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			// DB연결 종료

			try {

				if (rs != null)
					rs.close();

				if (psmt != null)
					psmt.close();

				if (conn != null) {
					conn.close();
				}

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			return professor01List;
		}
	}

}
