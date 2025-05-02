package study.practice.practice33;

public class Computer {
	//public final String[] osType = {"윈도우10", "애플 OS X", "안드로이드"};
	public static final String[] OS_TYPE = {"윈도우10", "애플 OS X", "안드로이드"};
	public int memory;
	public int osIndex;
//	public String os;
	
	public Computer(int osIndex,int memory){
		this.osIndex=osIndex;
		this.memory=memory;
		
//		this.os = osType[osIndex];
	}
	
	public void print() {
		//System.out.printf("운영체제: %s, 메인메모리:%d\n",osType[osIndex],memory);
		System.out.printf("운영체제: %s, 메인메모리:%d\n",OS_TYPE[osIndex],memory);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer pc = new Computer(0, 16);
		Computer apple = new Computer(1, 32);
		Computer galaxy = new Computer(2, 16);
		
		pc.print();
		apple.print();
		galaxy.print();
	}

}
