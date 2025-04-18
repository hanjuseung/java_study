package study.practice;

public class Practice12 {

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
	}

}
