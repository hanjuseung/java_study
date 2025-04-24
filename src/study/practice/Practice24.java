package study.practice;

import java.util.Random;
import java.util.Scanner;

public class Practice24 {

	public static void main(String[] args) {
		
//		prac1();
//		prac2v1();
//		prac2v2();
//		prac3v1();
//		prac3v2();
		prac4();
		
	}
	public static void prac1() {
		
		//1.
		//두 개의 주사위를 던졌을 때, 두 눈의 합이 6이 되는
		//모든 경우의 수를 출력하는 프로그램을 작성하시오
		for(int i = 1;i<=6;i++) { //첫번째 주사위 값
			for(int j=1;j<=6;j++) { //두번째 주사위 값
				
				if(i+j==6) {
					System.out.println( i +" "+ j);
					
				}
			}
		}
		System.out.println();
		
	}
	public static void prac2v1() {
		
		//로또 번호 6개 랜덤하게 생성하기. ( 1~45 중 )
		//최종 6개의 번호는 6칸의 배열에 저장되어야 한다.
		//로또 번호는 동일한 번호가 중복되어 들어갈 수 없다.
		//1) Math.random() 활용
		//2) int[] lotto = new int[6]; 활용

		//랜덤값 생성
		Random random = new Random();
		//System.out.println(random.nextInt(5)); //0 1 2 3 4
		//System.out.println(random.nextInt(1,5)); // 1 2 3 4  1<=랜덤값<5
		
		//System.out.println((int)(Math.random() * 6) + 1);
		//1~6    (int)(Math.random() * 6) + 1
		//40~60  (int)(Math.random() * 20) + 40
		
		//(int)(Math.random() * 숫자의 갯수) + 시작 숫자
		
		int[] lotto = new int[6]; 
		for(int i=0;i<lotto.length;i++) {
				lotto[i] = random.nextInt(1,46);
				for(int j=0;j<i;j++) {
					if(lotto[i]==lotto[j]) {
						lotto[i] = random.nextInt(1,46);
						j=0;
					}
				}
		}
		for(int i=0;i<lotto.length;i++) {
			System.out.println(lotto[i]);
		}
		
		
//		ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ

/*
		int[] lotto = new int[6];  //로또 6개 값 저장용 배열변수
		
		int num; // 뽑은 숫자 임시 저장
		int index = 0; //배열의 위치를 나타내는 인덱스
		while(true) {
			
			//랜덤값 뽑기
			num = random.nextInt(45)+1;
			
			boolean isDuplicated = false; //중복이냐? true>중복O  false>중복X
			
			for(int i=0;i<index;i++) {
				if(lotto[i]==num) { //내가 뽑은 값이랑 중복된 값이 있는가?
					
					//true 중복된 값이 있다.
					//중복이다 기록
					isDuplicated=true;
					break;
				}
			}
			if(isDuplicated) //만약 중복이면?
				continue;    //뒤에 넘이고 다음으로
			
			//중복 아닐때 수행할 코드
			lotto[index] = num;
			index++; //다음칸으로 이동
			
			//6개 다 채웠으면 끝
			if(index >= lotto.length)
				break;
		}
		//6개 뽑힌 번호 출력
			for(int i=0;i<6;i++) {
				System.out.println(lotto[i]+" ");
			}
		*/
	}
	public static void prac2v2() {
		
		Random random = new Random();
		int[] lotto = new int[6];  //로또 6개 값 저장용 배열변수
		
		int num; // 뽑은 숫자 임시 저장
		int index = 0; //배열의 위치를 나타내는 인덱스
		
		//6개의 로또번호 뽑는 과정
		for(int i=0;i<6;i++) {
			lotto[i] = random.nextInt(45)+1; //1~45
			for(int j=0;j<i;j++) {
				if(lotto[i]==lotto[j]) {
					i--;
				}
			}
		}
		//6개 뽑힌 번호 출력
		for(int i=0;i<6;i++) {
			System.out.println(lotto[i]+" ");
		}
	}
	public static void prac3v1() {
		
		Scanner scanner = new Scanner(System.in);
		//각 반의 배열 생성
		int[] class1 = new int[5];
		int[] class2 = new int[5];
		int[] class3 = new int[5];
		double[] total = new double[3];
		
		//각 반의 점수 입력 받기
		System.out.print("1반 점수 : ");
		for(int i=0;i<class1.length;i++) {
			class1[i] = scanner.nextInt();
		}
		System.out.print("2반 점수 : ");
		for(int i=0;i<class2.length;i++) {
			class2[i] = scanner.nextInt();
		}
		System.out.print("3반 점수 : ");
		for(int i=0;i<class3.length;i++) {
			class3[i] = scanner.nextInt();
		}
		
		//각 반의 점수 합산
		for(int i=0; i<class1.length;i++) {
			total[0] = total[0]+class1[i];
		}
		for(int i=0; i<class2.length;i++) {
			total[1] = total[1]+class2[i];
		}
		for(int i=0; i<class3.length;i++) {
			total[2] = total[2]+class3[i];
		}

		System.out.printf("1반 평균 : %.1f\n",total[0]/5);
		System.out.printf("2반 평균 : %.1f\n",total[1]/5);
		System.out.printf("3반 평균 : %.1f\n",total[2]/5);
		System.out.printf("전체 평균 : %.1f\n",(total[0]+total[1]+total[2])/15);
		
	}
	public static void prac3v2() {
		
		//2차원 배열
		Scanner scanner = new Scanner(System.in);
		
		int[][] classs = new int[3][5];

		for(int i=0;i<classs.length;i++) {  // i : 0 1 2
			System.out.printf("%d반 : ",i+1);
			for(int j=0;j<classs[i].length;j++) {  // j : 0 1 2 3 4
				classs[i][j] = scanner.nextInt();
			}
		}
		
		int total = 0; //전체 총합
		int classTotal = 0; //한 반의 총합
		for(int i=0;i<classs.length;i++) {  // i : 0 1 2
				classTotal = 0;
			for(int j=0;j<classs[i].length;j++) {  // j : 0 1 2 3 4
				classTotal = classTotal + classs[i][j];
			}
			System.out.printf("%d반 평균 : %.1f\n",i+1,classTotal/5.0);
			total += classTotal;
		}
		System.out.printf("전체 평균 : %.1f\n",total/15.0);
	}
	public static void prac4() {
		
		//4. 주어진 2차원 배열보다 행과 열이 1씩 큰 배열을 선언하여,
		//각 행의 합과 각 열의 합, 마지막에는 전체의 합이 출력되도록 프로그램을 작성하시오.
		
		// 주어진 배열
		// 10 20 30
		// 20 30 40
		// 30 40 50
		
		//최종결과
		// 10 20 30 60
		// 20 30 40 90
		// 30 40 50 120
		// 60 90 120 270
		
		Scanner scanner = new Scanner(System.in);
		int[][] arr2 = {{10, 20, 30},{20, 30, 40},{30, 40, 50}};
		int[][] arr= new int [4][4];
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0; j<arr[i].length-1;j++) {
				arr[i][j]= arr2[i][j];  //같은 인덱스 위치에 복사
				arr[3][j] += arr[i][j]; //열의 마지막 행에 더하기
				arr[i][3] += arr[i][j]; //행의 마지막 열에 더하기
				arr[3][3] += arr[i][j]; //마지막 행 마지막 열에 더하기
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0; j<arr[i].length;j++) {
				System.out.printf("%3d ",arr[i][j] );
			}
			System.out.println();
		}
	}


}
