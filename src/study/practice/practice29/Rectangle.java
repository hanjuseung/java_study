package study.practice.practice29;

public class Rectangle {

	int bottom;
	int height;
	int s;
	
	Rectangle(int bottom,int height){
		this.bottom=bottom;
		this.height=height;
	}
	
	int getArea() {
		s=bottom*height;
		return s;
	}
}
