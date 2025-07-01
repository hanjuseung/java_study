package study.practice.practice50;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



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
	}
	

}
