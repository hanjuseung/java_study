package study.practice.practice50;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import study.db.v2.DBConnectionManager;
import study.practice.practice50.Student;

public class StudentDAO {

	public static List<Student> findStudentList() {

		// DB연결 및 사용시 필요한 객체
		Connection conn = null; // DB 연결 객체
		PreparedStatement psmt = null; // DB 연결후, sql 명령 실행해주는 객체
		ResultSet rs = null; // sql Select 실행 후 조회 결과가 저장되는 객체

		conn = DBConnectionManager.connectDB();

		// 쿼리 준비

		String query = "select studno,name,id,grade,jumin "
				+ " ,birthday, tel,height,weight,deptno1,deptno2,profno from student";

		List<Student> studentList = new ArrayList<Student>();
		try {

			psmt = conn.prepareStatement(query); // 쿼리실행 준비객체

			rs = psmt.executeQuery(); // 쿼리 실행 후 결과 저장

			while (rs.next()) { // 읽어온 데이터를 행 단위로 반복하면서 접근

				Student s = new Student(rs.getInt("STUDNO"), rs.getString("NAME"), rs.getString("ID"),
						rs.getInt("GRADE"), rs.getString("JUMIN"), rs.getDate("BIRTHDAY"), rs.getString("TEL"),
						rs.getInt("HEIGHT"), rs.getInt("WEIGHT"), rs.getInt("DEPTNO1"), rs.getInt("DEPTNO2"),
						rs.getInt("PROFNO"));
				studentList.add(s);

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBConnectionManager.disconnectDB(conn, psmt, rs);
		}

		return studentList;

	}

	public static List<Student> findStudentListByGrade(int grade) {
		// DB연결 및 사용시 필요한 객체
		Connection conn = null; // DB 연결 객체
		PreparedStatement psmt = null; // DB 연결후, sql 명령 실행해주는 객체
		ResultSet rs = null; // sql Select 실행 후 조회 결과가 저장되는 객체

		conn = DBConnectionManager.connectDB();

		// 쿼리 준비

		String query = "select studno,name,id,grade,jumin "
				+ " ,birthday, tel,height,weight,deptno1,deptno2,profno from student" + " where grade = ? ";

		List<Student> studentList = new ArrayList<Student>();
		try {

			psmt = conn.prepareStatement(query); // 쿼리실행 준비객체
			psmt.setInt(1, grade);
			rs = psmt.executeQuery(); // 쿼리 실행 후 결과 저장

			while (rs.next()) { // 읽어온 데이터를 행 단위로 반복하면서 접근

				Student s = new Student(rs.getInt("STUDNO"), rs.getString("NAME"), rs.getString("ID"),
						rs.getInt("GRADE"), rs.getString("JUMIN"), rs.getDate("BIRTHDAY"), rs.getString("TEL"),
						rs.getInt("HEIGHT"), rs.getInt("WEIGHT"), rs.getInt("DEPTNO1"), rs.getInt("DEPTNO2"),
						rs.getInt("PROFNO"));
				studentList.add(s);

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBConnectionManager.disconnectDB(conn, psmt, rs);
		}

		return studentList;
	}
}
