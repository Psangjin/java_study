package study.quiz퀴즈.q0509낮2;

public class Fridge {
	String brand;
	int litter;
	boolean power;
	boolean attemperation;
	int door;
	public void explanation( ) {
		System.out.printf("어느 브랜드인지: %s \n" , brand);
		System.out.printf("몇리터 짜리인지: %d \n" , litter);
		System.out.printf("전원을 켤수 있다: %s \n" , power);
		System.out.printf("온도조절을 할 수 있다: %s \n" ,attemperation );
		System.out.printf("문이 몇개인지: %s \n" , door);
		
	}
}
