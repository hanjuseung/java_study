package study.practice;

import java.util.Scanner;

public class Practice21 {

	public static void main(String[] args) {
//		prac1();
//		prac2();
//		prac3();
		prac4();
//		prac5();
//		prac6();

	}
	public static void prac1() {
		
//1. 중첩반복문을 활용하여 아래와 같이 결과가 나타나도록 출력코드를 작성해주세요.
//									i
//		*****	5번 j=1; j<=5; j++;	5
//		****	4번 j=1; j<=4; j++;	4
//		***		3번 j=1; j<=3; j++;	3
//		**		2번 j=1; j<=2; j++;	2
//		*		1번 j=1; j<=1; j++;	1
		
//		*****	5번 j=1; j<=5; j++;	1	j=i
//		****	4번 j=2; j<=4; j++;	2
//		***		3번 j=3; j<=3; j++;	3
//		**		2번 j=4; j<=2; j++;	4
//		*		1번 j=5; j<=1; j++;	5
		
		for(int i=5;i>0;i--) {
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	public static void prac2() {
		
//2. 중첩반복문을 활용하여 아래와 같이 결과가 나타나도록 출력코드를 작성해주세요.
//		*
//		**
//		***
//		****		
		
		for(int i=1;i<5;i++) {
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	public static void prac3() {
		
//3. 입력된 수의 약수를 출력하시오.
//		ex) 입력 : 6
//		1 2 3 6
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("약수 찾을 수 : ");
		int num = scanner.nextInt();
		System.out.print("약수 : ");
//			for(int x=1;x<=num;x++) {
//				for(int y=1;y<=num;y++) {
//					if(x*y==num) {
//						System.out.print(x+" ");
//					}
//				}
//			}
			for(int x=1;x<=num;x++) {
				if(num%x==0) {
					System.out.print(x+" ");
				}
			}
	}
	public static void prac4() {
		
//4. 중첩반복문을 활용하여 아래와 같이 결과가 나타나도록 출력코드를 작성해주세요.
//	 숫자를 입력받고 아래 문양으로 * 출력하기
//		EX) 입력 : 5
//		*
//		**
//		***
//		****
//		*****
//		****
//		***
//		**
//		*
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num = scanner.nextInt();
		for(int i=1;i<num;i++) {
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=num;i>0;i--) {
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	public static void prac5() {
//5. 1+ (1+2)+ (1+2+3)+(1+2+3+4)+...+(1+2+3+...+10) ..결과 계산 최종결과는?
		
		int sum = 0;
		for(int i=10;i>0;i--) {
			for(int j=1;j<=i;j++) {
				sum= sum+j;
			}
		}
		System.out.println(sum);
		
	}
	public static void prac6() {
//6. 1+(-2)+3+(-4)+... , 과 같은 식으로 계속 더해나갔을 때 몇까지 더해야 총합이
//100이상인지 찾으시오. 100 이상이된 시점의 누적합이 얼마인지 + 얼마까지 더해서 100이 넘었는지 찾으세요.
		int i =1;
		int sum = 0;
		for(i=1;sum<100;i++) {
			if(i%2==0) {
				sum= sum-i;
			} else {
				sum= sum+i;
			}
			if(sum>=100) {
				System.out.println(i+"까지 더하면 누적 합 : "+sum);
				break;
			}
		}
		while(true) {
			if(i%2==0) { //짝수
				sum=sum-i;
			} else { //홀수
				sum=sum+i;
			}
			if(sum>=100)
				break;
		}
	}
}
