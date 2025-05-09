package study.practice.practice39;

public class OrcWarrior extends Orc {
	protected int amor;

	public OrcWarrior(String name, int hp, int amor) {
		super(name, hp); //부모 클래스 생성자 호출
		this.amor = amor;
	}

	// 메소드 오버라이딩!
	public String toString() {
		String str = String.format("OrcWarrior {이름: %s hp: %d amor: %d}", name, hp, amor);
	return str;
	}
}
