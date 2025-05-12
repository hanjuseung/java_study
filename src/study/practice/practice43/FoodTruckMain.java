package study.practice.practice43;

public class FoodTruckMain {

	public static void main(String[] args) {
		
		FoodTruck ft1 = new FoodTruck("오늘분식","나오늘");
		Food food = new Food("김밥",3000);
		ft1.addMenu(food);
		ft1.addMenu(new Food("떡볶이",5000));
		ft1.addMenu("핫도그",2000);
		
		ft1.doSales();
		
		FoodTruck ft2 = new FoodTruck("내일중식","김중식");
		
		//메뉴
		ft2.doSales();
	}
	
	/*
		푸드트럭
		- 푸드트럭은 여러종류의 음식들을 메뉴로 가지고 있을 수 있다.
		- 각 음식들은 각각의 이름, 가격, 재고를 가지고 있다.
		- 초기에 이름과 가격을 가지고 생성된다.
		- 각 음식별 재고를 설정할 수 있다.
		- 메뉴를 보여주는 기능(메뉴와 함께 주문가능한 재고까지)이 있다.
		- 메뉴중 주문을 할 수 있으며, 주문 시 금액만큼 매출이 증가하고 재고가 떨어진다.
		- 재고가 없는 메뉴는 판매할 수 없다.
		
		-기능 기준 (메뉴보기, 주문하기, 재고관리(메뉴 재고 추가), 마감하기)
		
		- 마감시 남은 재고만큼 매출액이 마이너스된다.
		※마이너스 금액은 각 음식의 가격의 30% 원가
		- 마감시 당일 매출액을 보여주고 종료됩니다.
		
		김밥 1000 재고 50개
		40개 -> 40,000원
		10개 ->마감 -> 3000
		매출 4만 - 폐기손해3천 최종수익 37000원
	 */

}
