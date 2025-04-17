package study.iter;

public class Iteration01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("안녕하세요~");
		
		
		//반복문
		/*
		for(초기화; 조건식; 증감식){
		 	실행문
		 }
		 */
		System.out.println("=====for문=====");
		for(int i=1; i<=10; i++) {
			System.out.println("안녕하세요~");
			
		}
		
		// i: 1~10 <= 10 -> 10번 반복
		
		// 조건식 : i < 15  -> 14번 반복
		// i: 1 ~ 14  -> 14번
		
		int i = 7;
		for(i=7;i != 13; i=i+1) {
			System.out.println("반갑습니다~");
		}
		
		//실제 반복되는 값을 실행에 활용하는 용도
		
		//1~7일 동안 반복 학습 출력
		System.out.println("자바 복습 1일차");
		
		for(i=0;i<7;i++) {
			System.out.printf("자바 복습 %d일차\n",i+1);
		}
		
		// 1 ~ 50 까지 합
		// int num = 1 + 2 + 3 + 4 + ... + 50;
		int num = 0;
		for(int k=1;k<=50; k++) {
			num= num+k;
		}
		System.out.println(num);
		
		for(int k=2;k<20;k=k*2) {
			System.out.println(k);
		}
		
		for(int k=400; k>100; k=k-50) {
			System.out.print(k+ " ");
		}
		System.out.println("\n=========================");
		for(int k=100; k>=90; k--) {
			System.out.print(k+ " ");
		}
	}

}
