package study.practice.practice50;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import study.db.v2.DBConnectionManager;
import study.db.v3.ConvertDateUtil;
import study.db.v3.Professor;

public class StudentDAO {

	// DB연결 및 사용시 필요한 객체
	Connection conn;
	PreparedStatement psmt;
	ResultSet rs;
	
	
	//전체 조회
	public List<StudentDTO> findStudentList(){
		conn = DBConnectionManager.connectDB();
		// 쿼리 준비
		//String query = "select * from student ";
		String query = "select studno, name, id, grade, jumin, "
					+ " TO_CHAR(birthday, 'YYYY-MM-DD') birthday , tel, height, "
					+ " weight, deptno1, deptno2, profno "
				    + " from student ";

		List<StudentDTO> studentList = new ArrayList<StudentDTO>();

		try {
			psmt = conn.prepareStatement(query); // 쿼리실행 준비객체

			rs = psmt.executeQuery(); // 쿼리 실행 후 결과 저장

			while (rs.next()) { // 읽어온 데이터를 행 단위로 반복하면서 접근
				// 해당 행에 컬럼 단위로 데이터 접근
				StudentDTO s = new StudentDTO();
				
				s.setStudno(rs.getInt("studno"));
				s.setName(rs.getString("name"));
				s.setId(rs.getString("id"));
				s.setGrade(rs.getInt("grade"));
				s.setJumin(rs.getString("jumin"));
				
				//s.setBirthday( ConvertDateUtil.convertTimestampToLocalDateTime(rs.getTimestamp("birthday")));
				s.setBirthday( rs.getString("birthday"));
				
				s.setTel(rs.getString("tel"));
				s.setHeight(rs.getInt("height"));
				s.setWeight(rs.getInt("weight"));
				s.setDeptno1(rs.getInt("deptno1"));
				s.setDeptno2(rs.getInt("deptno2"));
				s.setProfno(rs.getInt("profno"));
				
				studentList.add(s);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		DBConnectionManager.disconnectDB(conn, psmt, rs);

		return studentList;
	}

	//학년(grade)을 받아서 해당 학년 student 데이터를 조회하는 메소드
	public List<StudentDTO> findStudentListByGrade(int grade){
		
		conn = DBConnectionManager.connectDB();
		// 쿼리 준비
		//String query = "select * from student ";
		String query = "select studno, name, id, grade, jumin, "
					+ " TO_CHAR(birthday, 'YYYY-MM-DD') birthday , tel, height, "
					+ " weight, deptno1, deptno2, profno "
				    + " from student "
					+ " where grade = ? ";

		List<StudentDTO> studentList = new ArrayList<StudentDTO>();

		try {
			psmt = conn.prepareStatement(query); // 쿼리실행 준비객체

			psmt.setInt(1, grade);
			rs = psmt.executeQuery(); // 쿼리 실행 후 결과 저장

			while (rs.next()) { // 읽어온 데이터를 행 단위로 반복하면서 접근
				// 해당 행에 컬럼 단위로 데이터 접근
				StudentDTO s = new StudentDTO();
				
				s.setStudno(rs.getInt("studno"));
				s.setName(rs.getString("name"));
				s.setId(rs.getString("id"));
				s.setGrade(rs.getInt("grade"));
				s.setJumin(rs.getString("jumin"));
				
				//s.setBirthday( ConvertDateUtil.convertTimestampToLocalDateTime(rs.getTimestamp("birthday")));
				s.setBirthday( rs.getString("birthday"));
				
				s.setTel(rs.getString("tel"));
				s.setHeight(rs.getInt("height"));
				s.setWeight(rs.getInt("weight"));
				s.setDeptno1(rs.getInt("deptno1"));
				s.setDeptno2(rs.getInt("deptno2"));
				s.setProfno(rs.getInt("profno"));
				
				studentList.add(s);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		DBConnectionManager.disconnectDB(conn, psmt, rs);

		return studentList;
		
	}
}

















