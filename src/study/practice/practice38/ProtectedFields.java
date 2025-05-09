package study.practice.practice38;

public class ProtectedFields {

	public static void main(String[] args) {

		// 객체 생성
		Basketball b = new Basketball();
		Soccer s = new Soccer();
		PingPong p = new PingPong();

		// 객체 필드 초기화
		b.name = "농구";
		s.name = "축구";
		p.name = "탁구";
		
		//부모타입 변수 = 자식 객체
		Sports sp1 = new Sports();
		Sports sp2 = new Basketball();
		Sports sp3 = p;
		

		// 부모 타입(업 캐스팅)으로 배열 생성
		Sports[] sportsArr = { b, s, p };

		// 모든 운동 설명 출력
		for (int i = 0; i < sportsArr.length; i++) {
		Sports tmp = sportsArr[i];
		tmp.description();
		}
	}

}
