package study.db.v3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import study.db.v2.DBConnectionManager;
import study.db.v3.Professor;

public class ProfessorDAO {
	// DB연결 및 사용시 필요한 객체
	Connection conn;
	PreparedStatement psmt;
	ResultSet rs;

	public int saveProfessor(Professor professor) {
		
		conn = DBConnectionManager.connectDB();
		// 쿼리 준비
		String query = "insert into professor values ( ?, ?, ?, ?, ?, TO_DATE(?, 'YYYY-MM-DD'), ?, ?, ?, ? )";

		int result = 0;

		try {
			psmt = conn.prepareStatement(query); // 쿼리실행 준비객체

			psmt.setInt(1, professor.getProfno());
			psmt.setString(2, professor.getName());
			psmt.setString(3, professor.getId());
			psmt.setString(4, professor.getPosition());
			psmt.setInt(5, professor.getPay());
			//date <-> timestamp
			//getDate getTimestamp
			
			//LocalDateTime -> timestamp
			//psmt.setTimestamp(6, 
			//		ConvertDateUtil.convertLocalDateTimeToTimestamp(professor.getHiredate()) );
			
			psmt.setString(6, professor.getHiredate());
			
			psmt.setInt(7, professor.getBonus());
			psmt.setInt(8, professor.getDeptno());
			psmt.setString(9, professor.getEmail());
			psmt.setString(10, professor.getHpage());
					
			result = psmt.executeUpdate(); // 쿼리 실행 후 결과 저장

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		DBConnectionManager.disconnectDB(conn, psmt, rs);

		return result;
	}
	
	public Professor findProfessorByProfno(int profno) {
		conn = DBConnectionManager.connectDB();
		// 쿼리 준비
		String query = "select profno, name, id, position, pay, "
				+ " TO_CHAR(hiredate, 'YYYY-MM-DD') hiredate, bonus, deptno, email, hpage "
				+ " from professor where profno = ?";

		Professor professor = null;

		try {
			psmt = conn.prepareStatement(query); // 쿼리실행 준비객체

			psmt.setInt(1, profno);
			rs = psmt.executeQuery(); // 쿼리 실행 후 결과 저장

			if (rs.next()) { // 읽어온 데이터를 행 단위로 반복하면서 접근
				// 해당 행에 컬럼 단위로 데이터 접근
				
				professor = new Professor();
				professor.setProfno(rs.getInt("profno"));
				professor.setName(rs.getString("name"));
				professor.setId(rs.getString("id"));
				professor.setPosition(rs.getString("position"));
				professor.setPay(rs.getInt("pay"));
				
				//rs.getDate("hiredate").toLocalDate()
				//rs.getTimestamp("hiredate");
				
				// sql.date, util.date, localdate, localdateTime, timestamp
				
				//professor.setHiredate(rs.getDate("hiredate"));
				// setHiredate(LocalDateTime)    rs.getDate("hiredate") java.sql.Date
				
				//professor.setHiredate( ConvertDateUtil.convertTimestampToLocalDateTime(rs.getTimestamp("hiredate"))     );
				professor.setHiredate( rs.getString("hiredate") );
				
				professor.setBonus(rs.getInt("bonus"));
				professor.setDeptno(rs.getInt("deptno"));
				professor.setEmail(rs.getString("email"));
				professor.setHpage(rs.getString("hpage"));
				
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		DBConnectionManager.disconnectDB(conn, psmt, rs);

		return professor;
	}
	
	public List<Professor> findProfessorListByDeptno(int deptno) {

		conn = DBConnectionManager.connectDB();
		// 쿼리 준비
		// String query = "select * from professor where deptno = ?";
		String query = "select profno, name, id, position, pay, deptno " + " from professor where deptno = ?";

		List<Professor> professorList = new ArrayList<Professor>();

		try {
			psmt = conn.prepareStatement(query); // 쿼리실행 준비객체

			psmt.setInt(1, deptno);
			rs = psmt.executeQuery(); // 쿼리 실행 후 결과 저장

			while (rs.next()) { // 읽어온 데이터를 행 단위로 반복하면서 접근
				// 해당 행에 컬럼 단위로 데이터 접근
				Professor p = new Professor(rs.getInt("profno"), rs.getString("name"), rs.getString("id"),
						rs.getString("position"), rs.getInt("pay"), rs.getInt("deptno"));
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
