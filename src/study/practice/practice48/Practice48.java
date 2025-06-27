package study.practice.practice48;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import study.db.v1.Dept;

public class Practice48 {

	public static void main(String[] args) {
		
//		1. 단일 행을 읽어서 리턴해서 출력하기
		
		ProductDTO productDTO = findProductByPcode(102);
		if(productDTO != null) {
			System.out.printf("%d %s %d \n", 
							productDTO.getP_code(), 
							productDTO.getP_name(), 
							productDTO.getP_price());
		}

//		2. 객체 리스트 단위로 리턴해서 출력하기
		List<ProductDTO> productList = findProductList();
		
		
		if(productList != null && productList.size() > 0) {		
			for(ProductDTO product : productList) {
				System.out.printf("%d %s %d \n", 
						product.getP_code(), 
						product.getP_name(), 
						product.getP_price());
			}
		}
		
		
	}

	
	
	public static ProductDTO findProductByPcode(int p_code) {

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

		String query = "select * from product where p_code = ? ";		

		
		ProductDTO productDTO = null; 
		
		try {

			psmt = conn.prepareStatement(query); // 쿼리실행 준비객체
			 
			//파라미터 세팅
			psmt.setInt(1, p_code); //쿼리에 있는 첫번째 ? 위치에 deptno 를 세팅하겠다
			
			rs = psmt.executeQuery(); // 쿼리 실행 후 결과 저장

			// ResultSet rs 에 담겨져있는 쿼리 수행결과 확인
			if(rs.next()) { // 읽어올 데이터가 1개만 있는 경우?
				
				productDTO = new ProductDTO();
				
				productDTO.setP_code(rs.getInt("p_code"));
				productDTO.setP_name(rs.getString("p_name"));
				productDTO.setP_price(rs.getInt("p_price"));
				
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
		
		
		return productDTO;

	}
	
	
	public static List<ProductDTO> findProductList() {   

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
		String query = "select * from product";

		List<ProductDTO> productList = new ArrayList<ProductDTO>();
		
		try {
			
			psmt = conn.prepareStatement(query); // 쿼리실행 준비객체
			rs = psmt.executeQuery(); // 쿼리 실행 후 결과 저장
			
			// ResultSet rs 에 담겨져있는 쿼리 수행결과 확인
			while (rs.next()) { // 읽어온 데이터를 행 단위로 반복하면서 접근
				// rs.next() 다음 불러올 행 데이터가 있으면 true, 없으면 false

				// 컬럼인덱스 / 컬럼명
				// rs.getInt(1)
				
//				if(deptList == null)
//					deptList = new ArrayList<Dept>();
				
				// 해당 행에 컬럼 단위로 데이터 접근
				ProductDTO productDTO = new ProductDTO(rs.getInt("p_code"), rs.getString("p_name"), rs.getInt("p_price"));
				productList.add(productDTO);
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
		
		
		return productList;
	}
	
}
