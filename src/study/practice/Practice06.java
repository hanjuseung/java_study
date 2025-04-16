package study.practice;

import java.util.Scanner;

public class Practice06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		// 1번. 삼각형의 밑변과 높이를 입력받아서 넓이를 출력하세요. (소수점까지 표현)
		// 삼각형의 넓이 = 밑변 * 높이 / 2 ;
		System.out.print("밑변 : ");
		double width = scanner.nextDouble();
		System.out.print("높이 : ");
		double height = scanner.nextDouble();
		System.out.printf("삼각형의 넓이 : %.2f\n",width*height/2);
		
		// 2번. 사다리꼴의 윗변과 밑변과 높이를 입력받아서 넓이를 출력하세요. (소수점까지 표현)
		// 사다리꼴의 넓이 = (윗변 길이 + 밑변 길이) * 높이 / 2;
		System.out.print("윗변 길이 : ");
		double up = scanner.nextDouble();
		System.out.print("밑변 길이 : ");
		double down = scanner.nextDouble();
		System.out.print("높이 : ");
		double height2 = scanner.nextDouble();
		System.out.printf("사다리꼴의 넓이 : %.2f\n",(up+down)*height2/2);

		// 3번. 우리반은 24명입니다. 과자가 100개 있습니다.
		// 모두에게 공정하게 동일한 숫자의 과자를 나누어주면
		// 한 명당 몇 개의 과자를 받게되는지와 나누어주고 나서 몇개의 과자가 남는지 출력하세요.

		int weClass = 24;
		int cookies = 100;
		System.out.printf("한 명당 %d개의 과자를 받음\n",cookies/weClass);
		System.out.printf("남은 과자의 개수 : %d\n",cookies%weClass);
		
		// 4번. 세자리의 정수를 입력 받아서 백의자리, 십의자리, 일의자리를 각각 출력하세요.
		// 158
		// 백의자리 : 1
		// 십의자리 : 5
		// 일의자리 : 8
		System.out.print("세자리의 정수 : ");
		int value = scanner.nextInt();
		System.out.printf("백의자리 : %d\n",value/100);
		int value2 = value/100;
		System.out.printf("십의자리 : %d\n",(value-value2*100)/10);
		System.out.printf("십의자리 : %d\n",value/10%10);
		int value3 = (value-value2*100)/10;
		System.out.printf("일의자리 : %d\n",(value-value2*100)-value3*10);
		//System.out.printf("일의자리 : %d\n",value%100%10);

		// 5번 x와 y 변수 안에 들어있는 서로의 값을 바꾸기
		int x = 10;
		int y = 20;
		System.out.println("x="+x+ " y="+y);
		//x와 y를 바꾼 작업
		int z = x;
		x = y;
		y = z;
		
		System.out.println("x="+x+ " y="+y);
	}

}
