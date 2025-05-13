package study.practice.practice44;

public class Practice44 {
	public static void main(String[] args) {
		Unit[] arr = {new Marine(),new Tank()};
		
		for(Unit unit : arr) {
			unit.stop();
			unit.move(150,200);
		}
	}
}

class Unit {
	int x, y; // 현재 위치
	void move(int x, int y) { /* */ } //지정된 위치로 이동
	void stop() { 
		x = x;
		y = y;
		System.out.println("멈춘다");
	} //현재 위치에 정지
}

class Marine extends Unit { // 보병
	
	void move(int x, int y) { /*걸어서 간다*/
		System.out.println("걸어서 이동");
	} //지정된 위치로 이동
	void stimPack() { /* .*/} //스팀팩을 사용한다
}

class Tank extends Unit { // 탱크
	
	void move(int x, int y) { /*바퀴굴려서 간다*/ 
		System.out.println("바퀴 굴려서 이동");
	} //지정된 위치로 이동
	void changeMode() { /* . */} //공격모드를 변환한다
}

class Dropship extends Unit { // 수송선

	void move(int x, int y) { /*날아서 간다*/ 
		System.out.println("날아서 이동");
	} //지정된 위치로 이동
	void load() { /* .*/ } //선택된 대상을 태운다
	void unload() { /* .*/ } //선택된 대상을 내린다
}
