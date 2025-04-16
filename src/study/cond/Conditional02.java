package study.cond;

public class Conditional02 {

	public static void main(String[] args) {
		
		int dice = 5;
		
		if(dice == 5) { // 5 == 1 -> false
			System.out.println("한칸 전진");
		}
		
		if(dice == 5) { // 5 == 1 -> false
			System.out.println("한칸 전진");
		} else {
			System.out.println("1이 아닐때 할 행동1");
			System.out.println("1이 아닐때 할 행동2");
			System.out.println("1이 아닐때 할 행동3");
		}
		if(dice == 1) 
			System.out.println("한칸 전진");
		else 
			System.out.println("1이 아닐때 할 행동1");
			
			
		System.out.println("1이 아닐때 할 행동2");
		System.out.println("1이 아닐때 할 행동3");
		
		/*
			if()
			if()
			if()
		  
		  	if()
		  	else
		  	
		  	if()
		  	else if()
		  	else if()
		  	else if()
		  	else
		  	
		  	if()
		  	else if()
		  	else if()
		  	
		  	else	x
		  	
		  	else if()	x
		 
		 */
		
		if(dice==1) {
			
		} else if(dice==2) {
			
		} else if(dice==3) {
			
		} else {
			
		}
		
		if(dice==1) {
			
		} 
		if(dice==2) {
			
		}
		if(dice==3) {
			
		}
		
		//6000이하 훌륭
		//6000초과 ~ 8000이하 선방
		//8000초과 ~ 12000이하 눈물
		//12000초과 물로배채우기
		
		int menuPrice = 5000;
		
		//구분이 제대로 안되는 케이스 - if만 활용한 케이스
		if(menuPrice <=6000) {
			//훌륭
		}
		if(menuPrice <=8000) {
			//선방
		}
		
		//구분이 제대로 안되는 케이스 -> 구분하도록  - if만 활용한 케이스
		if(menuPrice <=6000) {
			//훌륭
		}
		if(menuPrice > 6000 && menuPrice <=8000) {
			//선방
		}
		if(menuPrice > 8000 && menuPrice <=12000) {
			//눈물
		}
		
		//로직이 잘 된 케이스
		if(menuPrice <=6000) {
			//훌륭
		} else if (menuPrice <=8000) { //가격<=6000 false 확정
			//선방
		} else if (menuPrice <=12000) {
			//눈물
		} else {	//else if (menuPrice >12000)
			//물배
		}
		
		//로직이 잘못된 케이스
		if(menuPrice > 6000) {
			//선방
		} else if (menuPrice > 8000) { //가격<=6000 false 확정
			//눈물
		} else if (menuPrice > 12000) {
			//물배
		} else {	 //가격 <= 6000	
			//훌륭
		}
		
		//로직이 잘못된 케이스 -> 그나마 결과라도 맞게 나오게 (비효율적인 구조/ 잘못된 구조)
		// if 조건문 -> 중첩 사용 가능
		if(menuPrice > 6000) {
			
			//중첩 if
			if(menuPrice > 12000) {
				//물배
			} else if(menuPrice > 8000) {
				//눈물
			} else {
				//선방
			}
			
			if(menuPrice > 12000) {
				//물배
			} else {
				if(menuPrice > 8000) {
					//눈물
				} else {
					//선방
				}
			}
			
		} else if (menuPrice > 8000) { 
			//눈물
		} else if (menuPrice > 12000) {
			//물배
		} else {	 //가격 <= 6000	
			//훌륭
		}
		
		//로직이 맞는 케이스
		if(menuPrice > 12000) {
			//물배
		} else if (menuPrice > 8000) { //가격<=6000 false 확정
			//눈물
		} else if (menuPrice > 6000) {
			//선방
		} else {   //가격 <= 6000	
			//훌륭
		}

	}

}
