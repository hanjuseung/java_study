package study.cls.cls02;

import java.util.Scanner;

public class IpadMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ipad pad1 = new Ipad();
		pad1.owner = "사삼공";
		
		pad1.powerOn();
		
		Ipad pad2 = new Ipad();
		pad2.owner = "이일삼";
		
		pad2.powerOn();
		
		Scanner scanner = new Scanner(System.in);
		
		Ipad.check();
		
//		pad2.check(); -> Ipad.check();
		
		System.out.println(Ipad.brand);

	}

}
