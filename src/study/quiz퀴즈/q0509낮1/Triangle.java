package study.quiz퀴즈.q0509낮1;

public class Triangle extends Shape {
	int base; // 밑변
	int height; // 높이

	/* 2. 삼각형 넓이를 구하도록 area()를 재정의하세요. */
	public double area() {
		return base * height/ 2.0 ;
	}
}
