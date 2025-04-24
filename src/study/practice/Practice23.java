package study.practice;

import java.util.Scanner;

public class Practice23 {

	public static void main(String[] args) {
		
//		prac1();
		prac2();


	}
	public static void prac1() {
			Scanner scanner = new Scanner(System.in);

			int menu1=0; //각 메뉴 몇잔 시켰는지 갯수
			int menu2=0;
			int menu3=0;
			
			while(true) { //반복
				System.out.println("=======메뉴=======");
				System.out.println("1.아메리카노  3500원");
				System.out.println("2.카페라떼   4100원");
				System.out.println("3.바닐라라떼  4300원");
				System.out.println("=================");
				
				System.out.print("메뉴 선택 : ");
				int menu = scanner.nextInt();
				if(menu==1||menu==2||menu==3)	{
				} else {
					System.out.println("잘못 입력하셨습니다.");
					continue; //menu가 1,2,3 이 아닐때
							  //이번 반복문은 수행하지않고 넘어간다.
				}
					
					System.out.print("수량 선택 : ");
					int num = scanner.nextInt();
					if(menu==1) {
						menu1=menu1+num;
					} else if(menu==2) {
						menu2=menu2+num;
					} else {
						menu3=menu3+num;
					}
					
					
					// 무슨 메뉴를 몇잔 시켰는지 기록
					// 무슨 메뉴 
					scanner.nextLine(); //기존에 남아있는 \n 엔터 청소용
					//y/n 정상입력 여부 체크
					String add;
					while(true) {
						System.out.print("추가 주문 하시겠습니까?(y/n) : ");
						add = scanner.nextLine();
						if(!(add.equals("y")||add.equals("n"))) {
							System.out.println("잘못 입력하셨습니다.");
						} else 
							break;
					}
						
					if(add.equals("y")) { //추가주문 입력 y 받았을때
							
					} else if(add.equals("n")) { //추가주문 입력 n 받았을때
						//최종 주문한 메뉴 목록 보여주고 총금액 ~다.
						System.out.println();
						System.out.println("=================");
						if(menu1>0)
							System.out.printf("아메리카노 %d잔 %d원\n",menu1,menu1*3500);
						if(menu2>0)
							System.out.printf("카페라떼 %d잔 %d원\n",menu2,menu2*4100);
						if(menu3>0)
							System.out.printf("아메리카노 %d잔 %d원\n",menu3,menu3*4300);
						System.out.println("=================");
						System.out.printf("총액 : %d원\n",menu1*3500+menu2*4100+menu3*4300);
						break;
					}
		}
	}
	public static void prac2() {
		
		//리팩토링 : 결과의 변경 없이 코드 구조를 재조정
		
		Scanner scanner = new Scanner(System.in);
		String[] menuArr= {"아메리카노", "카페라떼", "바닐라라떼"};
		int[] priceArr= {3500,4100,4300};
		
		int[] countArr = new int[3];  // 0 초기화
		while(true) {
			
			System.out.println("=======메뉴=======");
			for(int i=0; i<menuArr.length; i++) {
				System.out.printf("%d.%s \t%5d원\n",i+1,menuArr[i],priceArr[i]);
			}
			System.out.println("=================");
			
			//메뉴입력
			System.out.print("메뉴 선택 : ");
			int menu = scanner.nextInt();
			if(!(menu>=1 && menu <= menuArr.length))	{
				System.out.println("잘못 입력하셨습니다.");
				continue;
			} 
			
			//수량입력
			System.out.print("수량 선택 : ");
			int num = scanner.nextInt();
			countArr[menu-1] += num; //모든 메뉴에 대해 수량 처리하는 코드가 공통 적용
			
			scanner.nextLine();
			
			String add;
			while(true) {
				System.out.print("추가 주문 하시겠습니까?(y/n) : ");
				add = scanner.nextLine();
				if(!(add.equals("y")||add.equals("n"))) {
					System.out.println("잘못 입력하셨습니다.");
				} else 
					break;
			}
			
			//추가 주문 입력
			if(add.equals("n")) {
				int total=0;
				for(int i=0; i<menuArr.length; i++) {
					if(countArr[i]>0) {
						System.out.printf("%-5s %d잔 : %d원\n",menuArr[i],countArr[i],countArr[i]*priceArr[i]);
						total = total + (countArr[i]*priceArr[i]);
					}
				}
				System.out.println("=================");
				System.out.printf("총액 : %d원",total);
				break;
			}
			
		}
		
		//menuArr[2] priceArr[2] countArr[2]
		
	}
}
