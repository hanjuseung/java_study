package study.practice.practice29;

public class Monitor {
	//필드
	String made;
	int inch;
	int price;
	String color;
	int maxResolutionX;
	int maxResolutionY;
	
	//생성자
	Monitor(String made,int inch,int price){
		this.made=made;
		this.inch=inch;
		this.price=price;
	}
	
	
	//메소드
	void powerOn() { //전원켜기 메소드
		System.out.println("전원이 켜졌습니다.");
	}
	int upPrice(int x) {
		this.price = this.price+x;
		return price;
	}
	void setXY(int maxResolutionX,int maxResolutionY) { //해상도 입력받기
		this.maxResolutionX=maxResolutionX;
		this.maxResolutionY=maxResolutionY;
	}
	void setColor(String color) {//색상 입력받기
		this.color=color;
		
	}
	void monitorInfo() {
		System.out.println("제조회사 : "+made);
		System.out.println("인치수 : "+inch);
		System.out.println("가격 : "+price);
		System.out.println("색상 : "+color);
		System.out.println("해상도 : "+maxResolutionX+"*"+maxResolutionY);
		System.out.println();
		
	}

}
