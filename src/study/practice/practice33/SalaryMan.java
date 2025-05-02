package study.practice.practice33;

public class SalaryMan {
	int salary; //월 급여액 초기값 1000000
	
	SalaryMan(){
		this.salary=1000000;
	}
	SalaryMan(int salary){
		this.salary=salary;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SalaryMan sm = new SalaryMan();
		sm.getAnnualGross();
		new SalaryMan().getAnnualGross();
		System.out.println(new SalaryMan().getAnnualGross());
		System.out.println(new SalaryMan(2000000).getAnnualGross());
	}
	
	public int getAnnualGross() { //연봉을 반환하는 메소드
		//연봉 : 월급 1년치 + 상여금(보너스 월급 500%)로 계산
		int yearSalary = (salary*12) + (salary*5); 
		return yearSalary;
	}

}
