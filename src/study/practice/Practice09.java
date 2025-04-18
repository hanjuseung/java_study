package study.practice;

public class Practice09 {

	public static void main(String[] args) {
		
		//1. i가 0~10으로 11번 반복
		for(int i=0;i<11;i++) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		//2. i가 1~9로 9번 반복
		for(int i=1;i<10;i++) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		//3. i가 10~100으로 10번 반복
		for(int i=10;i<101;i=i+10) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		//4. i가 25 50 75 100 해서 4번 반복
		for(int i=25;i<101; i=i+25) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		//5. i가 50 ~ 55로 6번 반복
		int o = 50;
	
		while(true) {
			System.out.print(o + " ");
			o++;
			if(o>55) 
				break;
		}
		
		System.out.println();
		//6. i가 10 ~ 1로 10번 반복
		int i=10;
		while(true) {
			System.out.print(i + " ");
			i--;
			if(i<1) 
				break;
		}
		//7. i가 30 ~ 0으로 5씩 감소하면서 7번 반복
		System.out.println();
		
		int j = 30;
		while(true) {
			System.out.print(j + " ");
			j=j-5;
			if(j<0)
				break;	
		}
		
		System.out.println();
		//8. i가 30 ~ 5으로 5씩 감소하면서 6번 반복
		int k = 30;
		while(true) {
			System.out.print(k + " ");
			k=k-5;
			if(k<5)
				break;	
		}
		
		System.out.println();
		//9. i가 25 ~ 0으로 5씩 감소하면서 6번 반복
		int l = 25;
		while(true) {
			System.out.print(l + " ");
			l=l-5;
			if(l<0)
				break;
		}
	}

}
