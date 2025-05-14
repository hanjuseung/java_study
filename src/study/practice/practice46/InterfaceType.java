package study.practice.practice46;

import java.util.ArrayList;
import java.util.List;

public class InterfaceType {
	public static void main(String[] args) {
// 객체 생성
//		Food jokbal = new Food("족발",19800);
//		Electronics airpot = new Electronics("에어팟",199000);
//		Clothing shirt = new Clothing("셔츠",49900);
// 총합 계산
//		int total=0;
//		Orderable[] arr = {jokbal,airpot,shirt};
//		for(Orderable price : arr) {
//			total += price.discountedPrice();
		
		
		//리스트 사용
		List<Orderable> list = new ArrayList<Orderable>();
		list.add(new Food("족발",19800));
		list.add(new Electronics("에어팟",199000));
		list.add(new Clothing("셔츠",49900));
		
		int total = 0 ;
		for(Orderable od : list) {
			total += od.discountedPrice();
		}
// 결과 출력
		System.out.printf("총합:%d원\n",total);
	}
}

interface Orderable {
	public int discountedPrice();
}

class Food implements Orderable {
	private String name;
	private int price;

	public Food(String name, int price) {
		this.name = name;
		this.price = price;
	}
	/* 1. 오버라이딩을 통해, 음식 할인율을 적용하세요. */

	@Override
	public int discountedPrice() {
		price -= (price/10);
		return price;
	}
}

class Electronics implements Orderable {
	private String name;
	private int price;

	public Electronics(String name, int price) {
		this.name = name;
		this.price = price;
	}
	/* 2. 오버라이딩을 통해, 전자기기 할인율을 적용하세요. */

	@Override
	public int discountedPrice() {
		price -= (price*2)/10;
		return price;
	}
}

class Clothing implements Orderable {
	private String name;
	private int price;

	public Clothing(String name, int price) {
		this.name = name;
		this.price = price;
	}
	/* 3. 오버라이딩을 통해, 의류 할인율을 적용하세요. */

	@Override
	public int discountedPrice() {
		price -= (price*3)/10;
		return price;
	}
}
