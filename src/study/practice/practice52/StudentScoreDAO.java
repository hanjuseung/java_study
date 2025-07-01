package study.practice.practice52;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import study.db.v2.DBConnectionManager;
import study.practice.practice52.StudentScoreDTO;

public class StudentScoreDAO {

	public static List<StudentScoreDTO> studentHakjum(int deptno) {
		Connection conn = null; // DB 연결 객체
		PreparedStatement psmt = null; // DB 연결후, sql 명령 실행해주는 객체
		ResultSet rs = null;

		conn = DBConnectionManager.connectDB();

		// 쿼리 준비

		String query = "select st.studno, st.name, s.total, h.grade "
				+ " from student st, score s, hakjum h "
				+ " where st.studno = s.studno"
				+ " AND s.total BETWEEN h.MIN_POINT AND h.MAX_POINT"
				+ " AND deptno1 = ?";

//		TO_CHAR(birthday, 'YYYY-MM-DD') 
		List<StudentScoreDTO> sList = new ArrayList<StudentScoreDTO>();
		try {

			psmt = conn.prepareStatement(query); // 쿼리실행 준비객체
			psmt.setInt(1, deptno);

			rs = psmt.executeQuery(); // 쿼리 실행 후 결과 저장

			while (rs.next()) { // 읽어온 데이터를 행 단위로 반복하면서 접근

				StudentScoreDTO s = new StudentScoreDTO();
				
				s.setStudno(rs.getInt("studno"));
				s.setName(rs.getString("name"));
				s.setTotal(rs.getInt("studno"));
				s.setGrade(rs.getString("grade"));
				
				sList.add(s);
				

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBConnectionManager.disconnectDB(conn, psmt, rs);
		}

		return sList;

	}
}
