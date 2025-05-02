package study.practice.practice33;

public class Student {
	//필드
	private String lesson;
	private int studentNumber;
	
	Student(){ //기본 생성자
		
	}
	Student(String lesson,int studentNumber){
		this.lesson=lesson;
		this.studentNumber=studentNumber;
	}
	
	public static void main(String[] args) {
		
		Student s1 = new Student("전자공학과",20250502);
		Student s2 = new Student("컴퓨터공학과",20250503);
		Student s3 = new Student();
		
		s3.setLesson("소프트웨어학과");
		s3.setStudentNumber(20250505);

		s1.printInfo();
		s2.printInfo();
		s3.printInfo();

	}
	
	public String getLesson() { // getter
		return lesson;
	}
	public void setLesson(String lesson) { //setter
		this.lesson = lesson;
	}
	public int getStudentNumber() { // getter
		return studentNumber;
	}
	public void setStudentNumber(int studentNumber) { //setter
		this.studentNumber = studentNumber;
	}
	public void printInfo() {
		System.out.printf("%s %d\n",lesson,studentNumber);
	}

}
