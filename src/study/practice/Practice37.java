package study.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Practice37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1번 알파벳 갯수
		String str = "Returns a completion of the value and message";
		str = str.toLowerCase(); // 문자열을 소문자로 변경해서 저장
		str = str.replace(" ", "");
		String[] strArr = str.split(""); //문자열 한글자씩 나누어 배열에 저장
		
	
		HashSet<String> chr2 = new HashSet<String>(); //중복 저장하지 않음
		for(String a : strArr) { //strArr 배열을 Hash set에 저장(저장하는 과정 중 반복 제거)
			chr2.add(a);
		}
		System.out.println("문자열 자체의 길이 : " + str.length());
		System.out.println("알파벳 갯수 : " + chr2.size()); // 중복 제거 후 chr2의 사이즈(알파벳 갯수) 출력 
		
//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		
		
		
		//2번 알파벳 몇글자
		String[] chr2Arr = new String[chr2.size()];
		
		HashMap<String, Integer> map = new HashMap<String,Integer>();
		for (int i=0;i<strArr.length;i++) {
			String b = strArr[i];
				map.put(b,0);
		}
		for (int i=0;i<strArr.length;i++) {
			String b = strArr[i];
			if(map.containsKey(b))
				map.put(b, map.get(b)+1);
		}
		for(String key :map.keySet()) {
			System.out.println(key + "의 갯수 : "+map.get(key));
		}
		
	}
}
