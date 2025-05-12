package study.practice.practice41;

public class Refrigerator {
	
//	냉장고
//	- 어느 브랜드인지
//	- 몇리터 짜리인지
//	- 전원을 켤수 있다
//	- 온도조절을할수있다(온도 up 또는 온도 down)
//	- 문이 몇개인지
	
	String brand; //브랜드이름
	int liter;  //몇리터 짜리 냉장고 용량  160 231 560 
	int doorCount; // 문 갯수 1 2 4 

	boolean isPowerOn; //true 켜짐
	//boolean isPowerOff;//false
	// isPowerOff  //true 꺼짐
	
	int currentTemperature; //현재 온도
	
	int maxTemperature; //냉장고 설정 가능한 최고 온도
	int minTemperature; //냉장고 설정 가능한 최저 온도
	
	IceTray iceTray; //=new IceTray();  냉장고안에 얼음트레이가 있구나
	
	public void powerOn() {
		System.out.println("전원 켜짐");
		isPowerOn = true;
	}
	
	//온도 올려!		// refri.upTemperature()
	// refri.upTemperature()
	// refri.currentTemperature 확인
	public void upTemperature() {
		if(currentTemperature < maxTemperature)
			currentTemperature++; //온도 1도 올리기
	}
	
	// boolean result = refri.upTemperatureReturn();
	// if(result == true) ...
	public boolean upTemperatureReturn() {
		if(currentTemperature < maxTemperature) {
			currentTemperature++; //온도 1도 올리기
			return true;
		}
		return false;
	}
	
	//온도 내려!		// refri.downTemperature()
	public void downTemperature() {
		if(currentTemperature > minTemperature)
			currentTemperature--; //온도 1도 내리기
	}
	
	//온도 조절(매개변수)		
	// refri.controllTemperature(true)
	// refri.controllTemperature(false)
	public void controllTemperature(boolean isUp) {
		if(isUp) {
			currentTemperature++; //온도 1도 올리기
		} else {
			currentTemperature--; //온도 1도 내리기
		}
	}
	
	//몇도를 조절 할거다! 온도조절
	// refri.controllTemperature(1)
	// refri.controllTemperature(3)
	// refri.controllTemperature(-5)
	public void controllTemperature(int temp) {
		if(currentTemperature + temp <= maxTemperature
					&& currentTemperature + temp >= minTemperature) {
			currentTemperature += temp;
		}
	}
	
	//온도 세팅
	// 매개변수로 들어온 온도를 바로 현재 값으로 저장!
	// refri.controllTemperature(1) 1도로 세팅
	// refri.controllTemperature(-3) -3도로 세팅
	public void setCurrentTemperature(int temp) {
		if(temp <= maxTemperature && temp >= minTemperature)
			this.currentTemperature = temp;
	}
	
}


