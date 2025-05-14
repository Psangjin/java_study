package study.practice.practice29;

public class Circle {

	int radius; //반지름
	
	void setRadius(int radius) {
		this.radius = radius;		
	}
	
	double getArea() {
		double area = radius * radius * 3.14;
		return area;
	}
	
}
