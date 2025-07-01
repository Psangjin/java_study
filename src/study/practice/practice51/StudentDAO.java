package study.practice.practice50;

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
	
	
	//insert update delete -> return int (적용된 행 수)
	public int saveStudent(StudentDTO student) {
		
		conn = DBConnectionManager.connectDB();
		// 쿼리 준비
		String query = "INSERT INTO student "
					+ " VALUES ( ?, ?, ?, ?, ?, TO_DATE(?, 'YYYY-MM-DD'), ?, ?, ?, ?, ?, ? ) " ;
		
		int result = 0;

		try {
			psmt = conn.prepareStatement(query); // 쿼리실행 준비객체

			psmt.setInt(1, student.getStudno());
			psmt.setString(2, student.getName());
			psmt.setString(3, student.getId());
			psmt.setInt(4, student.getGrade());
			psmt.setString(5, student.getJumin());
			
			psmt.setString(6, student.getBirthday());
			psmt.setString(7, student.getTel());
			psmt.setInt(8, student.getHeight());
			psmt.setInt(9, student.getWeight());
			psmt.setInt(10, student.getDeptno1());
			
			//student.getDeptno2()  : null
			//psmt.setInt(11, student.getDeptno2());
			if(student.getDeptno2() == null)
				psmt.setNull(11, Types.INTEGER);
			else
				psmt.setInt(11, student.getDeptno2());
			
			psmt.setInt(12, student.profno);
			
			
			result = psmt.executeUpdate(); 
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		DBConnectionManager.disconnectDB(conn, psmt, rs);

		return result;
	}
	
}

















