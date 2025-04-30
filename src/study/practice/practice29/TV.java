package study.practice.practice29;

public class TV {
	//필드
	String made;
	int year;
	int inch;
	
	//생성자
	TV(String made, int year, int inch){
		this.made=made;
		this.year=year;
		this.inch=inch;
	}
	
	//메소드
	void show(){
		System.out.println(made+"제품 "+year+"년형 "+inch+"인치 TV");
	}
}
