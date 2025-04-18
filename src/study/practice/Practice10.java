package study.practice;

import java.util.Scanner;

public class Practice10 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.print("국어 점수 입력 : ");
		int kor = scanner.nextInt();
		System.out.print("수학 점수 입력 : ");
		int math = scanner.nextInt();
		System.out.print("영어 점수 입력 : ");
		int eng = scanner.nextInt();
		int total = (kor+math+eng); //합계
		double ave = total/(double)3; //평균
		if(ave>=60 && kor>=40 && math>=40 && eng>=40) {
			System.out.printf("국어 : %d\n",kor);
			System.out.printf("수학 : %d\n",math);
			System.out.printf("영어 : %d\n",eng);
			System.out.printf("합계 : %d\n",total);
			System.out.printf("평균 : %.2f\n",ave);
			System.out.println("축하합니다,합격입니다.");
			
		} else { //불합격
			System.out.println("불합격입니다.");
		}
	}

}
