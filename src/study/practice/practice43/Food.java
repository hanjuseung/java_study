package study.practice.practice43;

public class Food {
	String name; //이름
	int price;	 //가격
	int stock;   //재고
	
	public Food(String name, int price) {
		this.name = name;
		this.price = price;
		stock =5; //음식 재고 초기화
	}
	
	public String toString() {
		return String.format("이름:%s 가격:%d원",name,price);
	}
	public String getFoodInfo() {
		return String.format("이름:%s 가격:%d원 재고:%d개",name,price,stock);
	}
	
	//재고 설정하는 메소드
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	//재고 갯수 조정
	public void modifyStock(int count) {
		
		//재고3개 5개 주문상황
		//1)주문 불가
		//2)최대 갯수까지만 처리
		if(stock + count < 0) {
			
		}
		this.stock += count;
	}
	
}
