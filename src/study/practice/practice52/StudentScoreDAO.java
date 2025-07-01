package study.practice.practice52;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;

import study.db.v2.DBConnectionManager;
import study.db.v3.ConvertDateUtil;
import study.db.v3.Professor;

public class StudentScoreDAO {

	// DB연결 및 사용시 필요한 객체
	Connection conn;
	PreparedStatement psmt;
	ResultSet rs;

	public List<StudentScoreDTO> findStudentScoreListByDeptno(int deptno) {

		conn = DBConnectionManager.connectDB();
		// 쿼리 준비
		String query = " select st.studno, st.name, sc.total, hj.grade "
				+ " from student st, score sc, hakjum hj "
				+ " where st.studno = sc.studno "
				+ " AND sc.total BETWEEN hj.min_point AND hj.max_point "
				+ " AND st.deptno1 = ? " ;

		List<StudentScoreDTO> sList = new ArrayList<StudentScoreDTO>();

		try {
			psmt = conn.prepareStatement(query); // 쿼리실행 준비객체

			psmt.setInt(1, deptno);
			rs = psmt.executeQuery(); // 쿼리 실행 후 결과 저장

			while(rs.next()) { // 읽어온 데이터를 행 단위로 반복하면서 접근
				// 해당 행에 컬럼 단위로 데이터 접근
				StudentScoreDTO s = new StudentScoreDTO();

				s.setStudno(rs.getInt("studno"));
				s.setName(rs.getString("name"));
				s.setTotal(rs.getInt("total"));
				s.setGrade(rs.getString("grade"));
				
				sList.add(s);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		DBConnectionManager.disconnectDB(conn, psmt, rs);

		return sList;
	}


}
