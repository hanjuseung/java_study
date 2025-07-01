package study.practice.practice50;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import study.practice.practice50.Student;
import study.practice.practice50.StudentDAO;



public class Practice50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("***************** 1번 *****************");
		List<Student> studentList = StudentDAO.findStudentList();
		for(Student sd : studentList) {
			System.out.println(sd);
		}
		
		System.out.println("***************** 2번 *****************");
		List<Student> studentList2 = StudentDAO.findStudentListByGrade(3);
		for(Student sd : studentList2) {
			System.out.println(sd);
		}
		System.out.println("***************** 3번 *****************");
		Student saveS = new Student(123, "홍길동", "id", 3 , "jumin","2000-05-31", "tel",180,72,101,201,1001);
		int ss = StudentDAO.saveStudent(saveS);
		if (ss > 0) {
			System.out.println("saveS 잘 저장됐음");
		}
	}
	

}
