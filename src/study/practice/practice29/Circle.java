package study.practice.practice29;

public class Circle {

	int r;
	double s;
	
	void setRadius(int r){
		this.r=r;
	}
	
	double getArea(){
		s= r*r*3.14;
		return s;
	}
}