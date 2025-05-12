package study.practice.practice41;

public class GasRange {
	/*
	가스렌지
	- 화구가 몇인지
	- 어디 브랜드인지
	- 가격이 얼마인지
	- 불을 켠다
	- 불을 끈다
	- 불세기를 조절한다.
	*/
	
	int craterCount; //화구갯수 2 3 4 
	String brand;
	int price;
	
	
	int currentFireLevel; //현재 불세기 단계 (0~10) 
	
	//불을켠다
	public void fireOn() {
		currentFireLevel = 5;
	}
	
	//불은끈다.
	public void fireOff() {
		//isPowerOn = false;
		currentFireLevel = 0;
	}
	
	//불세기를 조절한다.
	public void setCurrentFireLevel(int currentFireLevel) {
		//if(불최소단계 >  currentFireLevel  불최대단계 < currentFireLevel)
		this.currentFireLevel = currentFireLevel;
	}
}
