package study.practice.practice49;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Practice49 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Professor> professorList = findProfessorListByDeptno(101);
		for(Professor p : professorList) {
			System.out.println(p.toString());
//			p.getProfno()+" "+ p.getName()+" "+ p.getId()+" "+ p.getProsition()+" "+ p.getPay()+" "+ p.getDeptno()
		}

	}

	public static List<Professor> findProfessorListByDeptno(int deptno) {

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

		String query = "select profno,name,id,position,pay,deptno from Professor where deptno = ?";

		List<Professor> professorList = new ArrayList<Professor>();
		try {

			psmt = conn.prepareStatement(query); // 쿼리실행 준비객체
			psmt.setInt(1, deptno); // 쿼리에 있는 첫번째 ? 위치에 deptno 를 세팅하겠다

			rs = psmt.executeQuery(); // 쿼리 실행 후 결과 저장

			// ResultSet rs 에 담겨져있는 쿼리 수행결과 확인
			while (rs.next()) { // 읽어온 데이터를 행 단위로 반복하면서 접근
				Professor professor = new Professor(rs.getInt("PROFNO"), rs.getString("NAME"), rs.getString("ID"), rs.getString("POSITION"), rs.getInt("PAY"), rs.getInt("DEPTNO"));
				professorList.add(professor);
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

		return professorList;

	}

}
