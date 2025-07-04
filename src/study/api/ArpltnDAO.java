package study.api;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import study.db.v2.DBConnectionManager;

public class ArpltnDAO {

	/*

	CREATE TABLE MINU_DUST_WEEK (
		id NUMBER PRIMARY KEY,
		total_count NUMBER,
		frcst_one_cn VARCHAR2(4000),
		frcst_two_cn VARCHAR2(4000),
		frcst_one_dt VARCHAR2(10),
		frcst_two_dt VARCHAR2(10),
		presnatnDT VARCHAR2(10)
	)

	CREATE SEQUENCE SEQ_MINU_DUST_WEEK_PK
	START WITH 1
	INCREMENT BY 1
	NOCYCLE;
	 */

	// DB연결 및 사용시 필요한 객체
	Connection conn; // DB 연결 객체
	PreparedStatement psmt; // DB 연결후, sql 명령 실행해주는 객체
	ResultSet rs; // sql Select 실행 후 조회 결과가 저장되는 객체


	// insert
	public int saveMinuDustWeek(MinuDustWeekDTO mdwDTO) {

		conn = DBConnectionManager.connectDB();

		// 쿼리 준비
		String query = "INSERT INTO MINU_DUST_WEEK " +
					  " VALUES ( SEQ_MINU_DUST_WEEK_PK.nextval, ?, ?, ?, ?, ?, ? ) ";

		int result = 0;

		try {
			psmt = conn.prepareStatement(query); // 쿼리실행 준비객체

			// 파라미터 세팅
			psmt.setInt(1, mdwDTO.getTotalCount());
			psmt.setString(2, mdwDTO.getFrcstOneCn());
			psmt.setString(3, mdwDTO.getFrcstTwoCn());
			psmt.setString(4, mdwDTO.getFrcstOneDt());
			psmt.setString(5, mdwDTO.getFrcstTwoDt());
			psmt.setString(6, mdwDTO.getPresnatnDt());

			// psmt.executeQuery() : select 시 사용 -> return ResultSet (조회결과 데이터)
			result = psmt.executeUpdate();
			// psmt.executeUpdate() : insert, update, delete 사용 -> return int (적용된 행의 수)

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBConnectionManager.disconnectDB(conn, psmt, rs);
		}

		return result;
	}
}
