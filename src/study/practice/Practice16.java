package study.practice;

import java.util.Scanner;

public class Practice16 {

	public static void main(String[] args) {
		
//		prac1();
//		prac2();
		prac3();
		
	}
	public static void prac1 () {
		//자연수 5개의 수를 차례대로 입력 받는다.
		//몇번째 수인가요? : 그에 해당하는 수를 출력
		//ex) 10 20 30 50 90
		//몇번째 수인가요? 5
		//결과 : 90
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("자연수 5개 입력 : ");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int num3 = scanner.nextInt();
		int num4 = scanner.nextInt();
		int num5 = scanner.nextInt();
		
		int[] number = {num1,num2,num3,num4,num5};
		System.out.print("몇번째 수인가요? : ");
		int num = scanner.nextInt();
		System.out.printf("결과 : %d\n",number[num-1]);
		
//		int[] numArr = new int [5];
//		System.out.print("5개 수 입력 : ");
//		numArr[0] = scanner.nextInt();
//		numArr[1] = scanner.nextInt();
//		numArr[2] = scanner.nextInt();
//		numArr[3] = scanner.nextInt();
//		numArr[4] = scanner.nextInt();
//		System.out.print("몇번째 입력 : ");
//		int index = scanner.nextInt();
//		System.out.println(numArr[index-1]);
		
//		int[] numArr = new int [5];
//		System.out.print("5개 수 입력 : ");
//		for(int i=0;i<numArr.length;i++) {
//			numArr[i] = scanner.nextInt();
//		}
//		System.out.print("몇번째 입력 : ");
//		int index = scanner.nextInt();
//		System.out.println(numArr[index-1]);
		
		
	}
	public static void prac2 () {
		//+자연수 (정수) 5개의 수를 차례대로 입력 받는다.
		//받은후에 순서를 거꾸로 출력하세요.
		//ex) 1 2 3 4 5
		//결과 : 5 4 3 2 1
		Scanner scanner = new Scanner(System.in);
		System.out.print("자연수 5개 입력 : ");
		int one = scanner.nextInt();
		int two = scanner.nextInt();
		int thr = scanner.nextInt();
		int fo = scanner.nextInt();
		int fiv = scanner.nextInt();
		
		int[] nums = {one,two,thr,fo,fiv};
		for(int i=4;i>=0;i--) {
			System.out.print(nums[i]+" ");
		}
		System.out.println();
//		ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
//		int[] numArr = new int [5];
//		System.out.print("5개 수 입력 : ");
//		for(int i=0;i<numArr.length;i++) { //0 1 2 3 4 입력
//			numArr[i] = scanner.nextInt();
//		}
//		for(int i=4;i>=0;i--) { // 4 3 2 1 0
//			System.out.print(numArr[i]+" ");
//		}

		
		
	}
	public static void prac3 (){
		//4x4 배열을 생성하여, 값을 아래와 같이 저장후 출력 하시오.
		//(*반복문을 사용하면 좀 더 편하게 저장이 가능합니다.)
		int[][] Arr = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}};
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				System.out.print(Arr[i][j]+" ");
				
			}
			System.out.println();
		}
//		mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm
//		int[][] arr = new int [4][4];
//		int num=1;
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j<arr[i].length;j++) {
				//arr[i][j] = (4*i) + (j+1);
//				arr[i][j] = num;
//				num++;
				//i: 0       1       2   ....
				//j: 0 1 2 3 0 1 2 3 0 1  2  3  ...
				//n: 1 2 3 4 5 6 7 8 9 10 11 12 ...
//				System.out.printf("%3d",arr[i][j]);
//			}
//			System.out.println();
//		}
//		mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm
//		int[][] arr = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}};
//		for(int i=0;i<arr.length;i++) { // i:0123 행 인덱스
//			for(int j=0;j<arr[i].length;j++) {
//				System.out.printf("%3d",arr[i][j]); //%3d 3자리 정수 왼쪽 공백
//			}
//			System.out.println();
//		}
		

	}
		
}
