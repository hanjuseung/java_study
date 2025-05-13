package study.practice.practice45;

public class ExcerciseInstanceof {

	public static void main(String[] args) {

		Robot[] arr = { new DanceRobot(), new SingRobot(), new DrawRobot() };
		//arr[0] = 부모타입이지만 객체는 danceRobot을 가지고 있다.
		for (int i = 0; i < arr.length; i++) {
			action(arr[i]); // 앞에 객체이름.action이 아니면 같은 클래스에 있는 action을 부른다
							// 그래서 같은 클래스에 action 메소드 생성하기
		} // main
	}
	public static void action(Robot r) { //
		if(r instanceof DanceRobot) {//  r 이 danceRobot타입과 같으면 
			((DanceRobot) r).dance(); // r 을 danceRobot으로 형변환 시킨다.
		} else if(r instanceof SingRobot) {
			((SingRobot) r).sing();
		} else if(r instanceof DrawRobot) {
			((DrawRobot) r).draw();
		}
	}
	
}

class Robot {}

class DanceRobot extends Robot {
	void dance() {
		System.out.println("춤을 춥니다.");
	}
}

class SingRobot extends Robot {
	void sing() {
		System.out.println("노래를 합니다.");
	}
}

class DrawRobot extends Robot {
	void draw() {
		System.out.println("그림을 그립니다.");
	}
}
