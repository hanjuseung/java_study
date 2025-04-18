package study.iter;

public class Iteration04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//반복문 중첩
		for(int i=1; i<=3; i++) {
			System.out.println("밖 for문");
			
			for(int j=1; j<=4; j++) {
				System.out.println("내부 for문");
			}
		}
		
		for(int i=1; i<=3; i++) {
			System.out.println("1");
			
			for(int j=1; j<=4; j++) {
				System.out.println("22");
				
				for(int k=1; k<=3; k++) 
					System.out.println("333");
			}
		}
		
		int i=1;
		while(i<=3) {
			System.out.println("11");
			
			int j=1;
			while(j<=4) {
				System.out.println("2222");
				j++;
			}	
			i++;
		}
		
		
		for(i=1; i<=3; i++) {
			System.out.println("i:"+i);
			
			for(int j=1; j<=4; j++) {
				System.out.println("j:"+j);
			}
		}
		
		//청소
		
		//방3개
		//		2번쓸기
		//		3번닦기
		//		1번쓰레기정리
		
		System.out.println("쓸기");
		System.out.println("닦기");
		System.out.println("쓰레기정리");
		
//		for(i=0;i<3;i++) { // i= 1~3 방 3개
//			System.out.printf("%d번 방 청소\n",i+1);
		
		for(i=0;i<3;i++) { // i= 1~3 방 3개
			System.out.printf("%d번 방 청소\n",i+1);
		
			int j=1;
			while(j<=2) {
				System.out.println("쓸기");
				j++;
			}
			for(int k=1; k<=3;k++) {
				System.out.println("닦기");
			}
			System.out.println("쓰레기정리");
		}
	}

}
