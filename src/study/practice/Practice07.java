package study.practice;

import java.util.Scanner;

public class Practice07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.print("출생년도를 입력하세요 : ");
		int year = scanner.nextInt();
		
		System.out.print("주민번호 뒷자리 첫번째 숫자를 입력하세요 : ");
		int first = scanner.nextInt();
		
		//비교 연산 ~ 로직 ~
		
		//2000년생 26살
		//2025 - 2000 = 25 + 1 = 26
		//나이계산 기준년도(2025) - 입력한년도(2000) + 1 => 나이
		//          2026 - 입력한년도 => 나이
		int age = (2025-year)+1;  //2025년도 기준 나이 계산
		
		//내가 짠 코드
//		if(year < 2000 && first == 1) {
//			System.out.printf("결과 : %d살 남자입니다.\n",age);
//		} else if (year < 2000 && first == 2) {
//			System.out.printf("결과 : %d살 여자입니다.\n",age);
//		} else if (year >= 2000 && first == 3) {
//			System.out.prin tf("결과 : %d살 남자입니다.\n",age);
//		} else if (year >= 2000 && first == 4) {
//			System.out.printf("결과 : %d살 여자입니다.\n",age);
//		} else  
//			System.out.println("잘못된 입력 입니다.");
		
		
		//년도 + 뒷자리가 잘못된 케이스는 구별하지 못하는 상태
//		if(first == 1) {
//			System.out.println(age+"살 남자");
//		} else if (first == 2) {
//			System.out.println(age+"살 여자");
//		} else if (first == 3) {
//			System.out.println(age+"살 남자");
//		} else if (first == 4) {
//			System.out.println(age+"살 여자");
//		} else {
//			System.out.println("잘못된 입력");
//		}
		
//		
		
		if ((( first == 1 || first == 2 ) && year < 2000)
				|| 
			(( first == 3 || first == 4) && year >= 2000)) {
				//입력은 정상
			
				if(first ==1 || first ==3) {
					System.out.println(age+"살 남자");
				}
				if(first ==2 ||first ==4) {
					System.out.println(age+"살 여자");
				}
				
				
			} else {
				System.out.println("잘못된 입력입니다");
			}
	}
}
