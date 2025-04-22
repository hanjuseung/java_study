package study.practice;

public class Practice19 {

	public static void main(String[] args) {
		//5x5 사이즈의 2차원 배열에 다음과 같이 값을 저장하고, 출력하는 코드를 작성하시오.
		//규칙 찾아보기.

//		1 2 2 2 2
//		3 1 2 2 2
//		3 3 1 2 2
//		3 3 3 1 2
//		3 3 3 3 1
		
		int[][] Arr = new int [5][5];
		for(int i=0;i<Arr.length;i++) {
			for(int j=0;j<Arr[i].length;j++) {
				if(i<j) {
					Arr[i][j]=2;
				} else if(i==j) {
					Arr[i][j]=1;
				} else 
					Arr[i][j]=3;
				System.out.print(Arr[i][j]+" ");
			}
			System.out.println();
		}
		


	}

}
