package study.practice.practice29;

public class Triangle {

	int width;
	int height;
	int s;
	
	
	void setSize(int width,int height) {
		this.width=width;
		this.height=height;
	}
	
	double getArea() {
		s=(width*height)/2;
		return s;
		
	}
}
