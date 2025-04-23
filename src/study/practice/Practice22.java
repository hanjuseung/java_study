package study.practice;

public class Practice22 {

	public static void main(String[] args) {
		
//		prac1();
		prac2();
//		prac3();
//		prac4();
		
	}

	public static void prac1() {
		
		//1번
		int[][] arr = new int [4][4];
		int num=1;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j] = num;
				num++;
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
	public static void prac2() {
		
		//2번
		int[][] arr = new int [4][4];
		int num=1;
		
		//배열에 값을 넣는 반복문
		for(int j=0;j<arr.length;j++) {
			for(int i=0;i<arr[j].length;i++) {
				arr[i][j] = num;
				num++;
				System.out.print(arr[i][j]+" ");
				
			}
			System.out.println();
		}
		
		//배열을 출력하는 반복문
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j<arr[i].length;j++) {
//				System.out.print(arr[i][j]+" ");
//			}
//			System.out.println();
//		}
//		System.out.println();
	}
	public static void prac3() {
		
		//3번
		int[][] arr = new int [4][4];
		int num=16;
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				arr[i][j] = num;
				num--;
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
	public static void prac4() {
		
		//4번
		int[][] arr = new int [4][4];
		int num =16;
		
		//배열에 값을 넣는 반복문
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[j][i] = num;
				num--;
			}
		}
		
		//배열을 출력하는 반복문
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
