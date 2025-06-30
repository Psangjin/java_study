package study.practice.practice49;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import study.db.v2.DBConnectionManager;
import study.db.v2.Dept;

public class Practice49 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Professor> pList = findProfessorListByDeptno(201);
		
		for(Professor p : pList) {
			System.out.println(p);
		}

	}

	public static List<Professor> findProfessorListByDeptno(int deptno) {
		// DB연결 및 사용시 필요한 객체
		Connection conn = null; // DB 연결 객체
		PreparedStatement psmt = null; // DB 연결후, sql 명령 실행해주는 객체
		ResultSet rs = null; // sql Select 실행 후 조회 결과가 저장되는 객체

		conn = DBConnectionManager.connectDB();
		// 쿼리 준비
		//String query = "select * from professor where deptno = ?";
		String query = "select profno, name, id, position, pay, deptno "
					+ " from professor where deptno = ?";

		List<Professor> professorList = new ArrayList<Professor>();

		try {
			psmt = conn.prepareStatement(query); // 쿼리실행 준비객체
			
			psmt.setInt(1, deptno);
			rs = psmt.executeQuery(); // 쿼리 실행 후 결과 저장

			while (rs.next()) { // 읽어온 데이터를 행 단위로 반복하면서 접근
				// 해당 행에 컬럼 단위로 데이터 접근
				Professor p = new Professor(rs.getInt("profno"),
											rs.getString("name"),
											rs.getString("id"),
											rs.getString("position"),
											rs.getInt("pay"),
											rs.getInt("deptno") );
				professorList.add(p);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		DBConnectionManager.disconnectDB(conn, psmt, rs);

		return professorList;

	}

}
