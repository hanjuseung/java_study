package study.practice;

import java.util.Scanner;

public class Practice11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//반복문 한개
		for(int i=0;i<5;i++) {
			System.out.println("12345");
		}
		
		for(int i=1;i<6;i++) {
			System.out.printf("%d%d%d%d%d\n",i,i,i,i,i);
			
		}
		
		System.out.println(" ");
		
		//반복문 두개
		for(int i=1;i<6;i++) {
			System.out.println(" ");
			for(int j=1;j<6;j++) {
				System.out.print(j);
			}
		}
		
		for(int i=1;i<6;i++) {
			System.out.println(" ");
			for(int j=1;j<6;j++) {
				System.out.print(i);
			}
		}
		
//*****************************************************************
		
		System.out.println(" ");
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("년도를 입력하세요 : ");
		int year = scanner.nextInt();
		if(year % 4 == 0) {
			if(year % 100 == 0) {
				if(year %400 == 0) {
					System.out.println("윤년입니다");
				} else {System.out.println("윤년이 아닙니다.");}	
			} else {System.out.println("윤년입니다.");}
		} else {System.out.println("윤년이 아닙니다.");}
	}

}
