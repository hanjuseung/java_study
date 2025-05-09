package study.practice.practice39;

public class SuperTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 1. Orc 객체를 만들고 정보를 출력하시오. */
		Orc o1 = new Orc("오크",80);
		System.out.println(o1.toString());
		
		/* 2. OrcWarrior 객체를 만들고 정보를 출력하시오. */
		OrcWarrior ow1 = new OrcWarrior("오크 전사",120,3);
		System.out.println(ow1.toString());
	}

}
