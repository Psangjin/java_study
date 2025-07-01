package study.db.v4;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import study.db.v2.DBConnectionManager;

public class DepartmentDAO {
	// DB연결 및 사용시 필요한 객체
	Connection conn;
	PreparedStatement psmt;
	ResultSet rs;

	public DepartmentDTO findDepartmentByDeptno(int deptno) {

		conn = DBConnectionManager.connectDB();
		// 쿼리 준비
		// String query = "select * from student ";
		String query = "select * from department where deptno = ? ";

		DepartmentDTO departmentDTO = null;

		try {
			psmt = conn.prepareStatement(query); // 쿼리실행 준비객체

			psmt.setInt(1, deptno);
			rs = psmt.executeQuery(); // 쿼리 실행 후 결과 저장

			if (rs.next()) { // 읽어온 데이터를 행 단위로 반복하면서 접근
				
				departmentDTO = new DepartmentDTO();
				
				departmentDTO.setDeptno(rs.getInt("deptno"));
				departmentDTO.setDname(rs.getString("dname"));
				departmentDTO.setPart(rs.getInt("part"));
				departmentDTO.setBuild(rs.getString("build"));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		DBConnectionManager.disconnectDB(conn, psmt, rs);

		return departmentDTO;
	}
}
