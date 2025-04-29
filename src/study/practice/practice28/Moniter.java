package study.practice.practice28;

public class Moniter {
	
	//필드
	String made;
	String model;
	int inch;
	
	//생성자

	Moniter(String made,String model,int inch){

		this.made = made;
		this.model = model;
		this.inch = inch;
	}
	
	//메소드
	void moniterSpec() {
		System.out.print("제조사:"+made+" ");
		System.out.print("모델명:"+model+" ");
		System.out.print("인치:"+inch+"인치");
		System.out.println();
	}
	

}
