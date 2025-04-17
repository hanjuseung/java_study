package study.iter;

public class Iteration02 {

	public static void main(String[] args) {
		// 반복문 while
		
		/*
		while(조건식) {
			실행문
		}
		*/
		
		for(int i=1; i<=5; i++) {
			System.out.println("피곤하다~");
		}
		
		int i=1;	//초기화
		while(i<=5) { //조건식
			
			
			System.out.println("졸리다~"); //실행문
			
			i++; //증감식
		}
		
		System.out.println("===================");
		
		i = 1;
		while(i<=5) {
			System.out.println(i);
			i++;
		}
		
		i = 0;
		while(i<5) {
			i++;
			System.out.println(i);
		}
		
		i=6;
		
		while(i<5) {
			System.out.println("i<5");
		}
		//do-while 조건이 틀려도 한번은 실행함
		do {
			System.out.println("i<5");
		} while(i<5);   //do while은 while 뒤에 ; 필요함
	}

}
