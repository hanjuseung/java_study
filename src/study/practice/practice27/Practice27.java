package study.practice.practice27;

public class Practice27 {

	public static void main(String[] args) {
		//프로그램 시작 지점
		Person p1 = new Person();
		
		p1.name = "일무개";
		p1.gender = "남";
		p1.age = 40;
		p1.height = 173.2;
		p1.weight = 60; //60.0
		p1.job = "선생님";
		p1.bloodType = "O";
		p1.condition = "좋음";
		p1.sleep = true;
		
		System.out.println("이름 : "+p1.name);
		System.out.println("성별 : "+p1.gender);
		System.out.println("나이 : "+p1.age);
		System.out.println("키 : "+p1.height);
		System.out.println("몸무게 : "+p1.weight);
		System.out.println("직업 : "+p1.job);
		System.out.println("혈액형 : "+p1.bloodType);
		System.out.println("건강상태 : "+p1.condition);
		System.out.println("수면여부 : "+p1.sleep);
		System.out.println("수면여부 : "+(p1.sleep ? "자는중" : "안자는중"));
		System.out.println();

		Person p2 = new Person("이무개","남",25,175,60,"학생","O형","good",true);
		
		System.out.println("이름 : "+p2.name);
		System.out.println("성별 : "+p2.gender);
		System.out.println("나이 : "+p2.age);
		System.out.println("키 : "+p2.height);
		System.out.println("몸무게 : "+p2.weight);
		System.out.println("직업 : "+p2.job);
		System.out.println("혈액형 : "+p2.bloodType);
		System.out.println("건강상태 : "+p2.condition);
		System.out.println("수면여부 : "+p2.sleep);
		System.out.println("수면여부 : "+(p2.sleep ? "자는중" : "안자는중"));
		System.out.println();
		
		p1.printPersonInfo();
		p2.printPersonInfo();
		
		Person p3 = new Person();
		p3.printPersonInfo();
		
	}

}
