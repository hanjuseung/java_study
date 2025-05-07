package study.collect;

import java.util.ArrayList;

public class Collection01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ArrayList
		String[] arr = new String[3];
		arr[0] = "A";
		arr[1] = "B";
		arr[2] = "C";

		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");			
		}
		System.out.println();
		
		for(String value : arr) {
			System.out.print(value + " ");
		}
		System.out.println();
		
		ArrayList<String> list = new ArrayList<String>();
		
		ArrayList<String> list2 = null;
		//ArrayList<Menu>   Menu[]
		//ArrayList<Order>  Order[]
		
		System.out.println(list.size()); // 출력 : 0
//		System.out.println(list2.size());
		
		list.add("D"); // list에 "D" 추가
		list.add("E"); // list에 "E" 추가
		list.add("F"); // list에 "F" 추가
		list.add("G"); // list에 "G" 추가
		System.out.println(list.size()); // 출력 : 4
		System.out.println(list.get(2)); //list에 index 2자리에 있는 애를 출력 ( F )
		
		for(int i=0; i<list.size();i++) {
			System.out.print(list.get(i)+" "); // 출력 : D E F G
		}
		System.out.println();
		
		list.add(2,"A"); // index 2 인 자리에 "A"를 추가 원래 index 2 의 자리에 있던 애는 index 하나씩 밀림 / D E A F G
		list.set(3,"H"); // index 3 인 자리를 "H"로 변경 / D E A H G
		list.remove(0); // index 0 인 자리 값 삭제 / E A H G
		list.remove("G"); // G 값을 삭제 / E A H
		
		for(String v : list) {
			System.out.print(v+ " ");
		}
		System.out.println();
		
		System.out.println(list.contains("Z")); //list 안에 Z가 있으면 ture 없으면 false
		System.out.println(list.contains("E"));
		
		int[] intArr = new int[10];
		
//		ArrayList<int> intList = new ArrayList<int>();
		ArrayList<Integer> intList = new ArrayList<Integer>();
		//Integer.parseInt(null)
		
		//포장객체 Wrapper Class
		//int -> Integer
		//double -> Double
		//boolean -> Boolean
		
		intList.add(10);
		//intList.add(new Integer(30));
		intList.add(30);
		intList.add(50);
		
		for(int n : intList) {
			System.out.print(n+" ");
		}
		System.out.println();
		
		
	}

}
