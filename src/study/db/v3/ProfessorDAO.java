package study.db.v3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import study.db.v2.DBConnectionManager;
import study.db.v3.Professor;

public class ProfessorDAO {

	// DB연결 및 사용시 필요한 객체
	Connection conn; // DB 연결 객체
	PreparedStatement psmt; // DB 연결후, sql 명령 실행해주는 객체
	ResultSet rs; // sql Select 실행 후 조회 결과가 저장되는 객체
	
	public int saveProfessor(Professor professor) {
		conn = DBConnectionManager.connectDB();

		// 쿼리 준비

		String query = "insert into professor values (?,?,?,?,?,TO_DATE(?, 'YYYY-MM-DD'),?,?,?,?)";

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
//			psmt.setTimestamp(6, ConvertDateUtil.convertLocalDateTimeToTimestamp(professor.getHiredate()));
			psmt.setString(6, professor.getHiredate());
		
			psmt.setInt(7, professor.getBonus());
			psmt.setInt(8, professor.getDeptno());
			psmt.setString(9, professor.getEmail());
			psmt.setString(10, professor.getHpage());
			
			
			
			result = psmt.executeUpdate(); // 쿼리 실행 후 결과 저장

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBConnectionManager.disconnectDB(conn, psmt, rs);
		}

		return result;
	}
	
	public Professor findProfessorByProfno(int profno) {
		
		conn = DBConnectionManager.connectDB();

		// 쿼리 준비

		String query = "select profno, name, id, position, pay, TO_CHAR(hiredate, 'YYYY-MM-DD') hiredate, "
				+ " bonus, deptno, email, hpage from Professor where profno = ?";

		Professor professor = null;
		try {

			psmt = conn.prepareStatement(query); // 쿼리실행 준비객체
			psmt.setInt(1, profno); // 쿼리에 있는 첫번째 ? 위치에 deptno 를 세팅하겠다

			rs = psmt.executeQuery(); // 쿼리 실행 후 결과 저장

			// ResultSet rs 에 담겨져있는 쿼리 수행결과 확인
			if (rs.next()) { // 읽어온 데이터를 행 단위로 반복하면서 접근
				
				professor = new Professor();
				professor.setProfno(rs.getInt("profno"));
				professor.setName(rs.getString("name"));
				professor.setId(rs.getString("id"));
				professor.setPosition(rs.getString("position"));
				professor.setPay(rs.getInt("pay"));
				
				//rs.getDate("hiredate").toLocalDate()
				//rs.getTimestamp("hiredate")
				
				// sql.date, util.date, localdate, localdateTime, timestamp
				
				//professor.setHiredate(rs.getDate("hiredate"));
				// setHiredate(LocalDateTime)	rs.getDate("hiredate") java.sql.Date
				
//				professor.setHiredate(ConvertDateUtil.convertTimestampToLocalDateTime(rs.getTimestamp("hiredate")));
				professor.setHiredate(rs.getString("hiredate"));
				
				professor.setBonus(rs.getInt("bonus"));
				professor.setDeptno(rs.getInt("deptno"));
				professor.setEmail(rs.getString("Email"));
				professor.setHpage(rs.getString("Hpage"));
				
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBConnectionManager.disconnectDB(conn, psmt, rs);
		}

		return professor;
	}

	public List<Professor> findProfessorListByDeptno(int deptno) {
		
		conn = DBConnectionManager.connectDB();

		// 쿼리 준비

		String query = "select profno,name,id,position,pay,deptno from Professor where deptno = ?";

		List<Professor> professorList = new ArrayList<Professor>();
		try {

			psmt = conn.prepareStatement(query); // 쿼리실행 준비객체
			psmt.setInt(1, deptno); // 쿼리에 있는 첫번째 ? 위치에 deptno 를 세팅하겠다

			rs = psmt.executeQuery(); // 쿼리 실행 후 결과 저장

			// ResultSet rs 에 담겨져있는 쿼리 수행결과 확인
			while (rs.next()) { // 읽어온 데이터를 행 단위로 반복하면서 접근
				Professor professor = new Professor(rs.getInt("PROFNO"), rs.getString("NAME"), rs.getString("ID"),
						rs.getString("POSITION"), rs.getInt("PAY"), rs.getInt("DEPTNO"));
				professorList.add(professor);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBConnectionManager.disconnectDB(conn, psmt, rs);
		}

		return professorList;

	}
}
