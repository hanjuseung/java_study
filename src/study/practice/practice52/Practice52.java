package study.practice.practice52;

import java.util.List;

import study.practice.practice52.StudentScoreDTO;
import study.practice.practice52.StudentScoreDAO;

public class Practice52 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<StudentScoreDTO> studentList = StudentScoreDAO.studentHakjum(101);
		for(StudentScoreDTO ss : studentList) {
			System.out.println(ss);
		}
	}

}
