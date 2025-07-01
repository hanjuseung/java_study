package study.practice.practice50;

import java.util.List;

public class Practice51 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StudentDAO studentDAO = new StudentDAO();

		Student studentDTO = new Student();

		studentDTO.setStudno(9998);
		studentDTO.setName("name");
		studentDTO.setId("asdnwd");
		studentDTO.setGrade(3);
		studentDTO.setJumin("0011112234567");
		studentDTO.setBirthday("2000-05-31");
		studentDTO.setTel("031)123-1234");
		studentDTO.setHeight(190);
		studentDTO.setWeight(90);
		studentDTO.setDeptno1(101);
		studentDTO.setDeptno2(201);
		studentDTO.setProfno(9611);

		Student studentDTO2 = new Student();

		studentDTO2.setStudno(9998);
		studentDTO2.setName("name");
		studentDTO2.setId("asdnwd");
		studentDTO2.setGrade(3);
		studentDTO2.setJumin("0011112234567");
		studentDTO2.setBirthday("2000-05-31");
		studentDTO2.setTel("031)123-1234");
		studentDTO2.setHeight(190);
		studentDTO2.setWeight(90);
		studentDTO2.setDeptno1(101);
		studentDTO2.setDeptno2(null);
		studentDTO2.setProfno(9611);

		int result = studentDAO.saveStudent(studentDTO2);
		if (result > 0)
			System.out.println("저장성공");

	}
}
