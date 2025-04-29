package study.practice.practice27;

public class Person {

	//필드 (속성을 나타냄)
	String name;
	String gender;
	int age;
	double height;
	double weight;
	String job;
	String bloodType;
	String condition;
	boolean sleep;
	//생성자 
	//생성자 선언하지 않으면? 기본 생성자 자동생성
	//Person(){}
	
	//생성자 : 객체가 생성될때 초기에 해야 할 일
	Person(){ //초기화 기본값
		name = null;
		gender ="남";
		age = 0;
		height =0;
		weight =0;
		job = "무직";
		bloodType = null;
		condition = "좋음";
		sleep = false;
	}

	Person(String name, String gender,int age,double height
			,double weight,String job,String bloodType,String condition
			,boolean sleep){
		//필드변수	매개변수
		this.name = name;
		this.gender = gender; 
		this.age = age;
		this.height =height;
		this.weight =weight;
		this.job=job;
		this.bloodType=bloodType;
		this.condition=condition;
		this.sleep=sleep;
	}
	
	//메소드
	void printPersonInfo(){
		
		System.out.println("이름 : "+name);
		System.out.println("성별 : "+gender);
		System.out.println("나이 : "+age);
		System.out.println("키 : "+height);
		System.out.println("몸무게 : "+weight);
		System.out.println("직업 : "+job);
		System.out.println("혈액형 : "+bloodType);
		System.out.println("건강상태 : "+condition);
		System.out.println("수면여부 : "+sleep);
		System.out.println("수면여부 : "+(sleep ? "자는중" : "안자는중"));
		System.out.println();
	}
}
